package com.example.lab_work_smd_section_bscs_6c.multiColumnListExample;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;
import java.util.HashMap;

public class myAdpter extends BaseAdapter {
    ListView listView;
    Activity activity;
    public ArrayList<HashMap<String,String>> list;
    public static final String FIRST_COLUMN="First";
    public static final String SECOND_COLUMN="Second";
    public static final String THIRD_COLUMN="Third";

    public myAdpter(Activity activity, ArrayList<HashMap<String, String>> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater= activity.getLayoutInflater();
        ViewHolder viewHolder = new ViewHolder();
        if (view==null) {
            view=layoutInflater.inflate(R.layout.multicolumnlistview,null);
            viewHolder.textView1= view.findViewById(R.id.txtlist1);
            viewHolder.textView2= view.findViewById(R.id.txtlist2);
            viewHolder.textView3= view.findViewById(R.id.txtlist3);
            view.setTag(viewHolder);

        }
        else {
            viewHolder= (ViewHolder) view.getTag();
        }
        HashMap<String,String> hashMap =new HashMap<>();
        hashMap=list.get(i);
        viewHolder.textView1.setText(hashMap.get(FIRST_COLUMN));
        viewHolder.textView2.setText(hashMap.get(SECOND_COLUMN));
        viewHolder.textView3.setText(hashMap.get(THIRD_COLUMN));
        return view;

    }
    private class ViewHolder{
        TextView textView1,textView2,textView3;
    }
}

