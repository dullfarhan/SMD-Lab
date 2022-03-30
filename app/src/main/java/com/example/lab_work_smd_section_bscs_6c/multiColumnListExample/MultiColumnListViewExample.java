package com.example.lab_work_smd_section_bscs_6c.multiColumnListExample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MultiColumnListViewExample extends AppCompatActivity {
    ListView listView;
    Activity activity;
    public ArrayList<HashMap<String,String>> list;
    public static final String FIRST_COLUMN="First";
    public static final String SECOND_COLUMN="Second";
    public static final String THIRD_COLUMN="Third";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listView=findViewById(R.id.multilst);
        setContentView(R.layout.activity_multi_column_list_view_example);
        LoadData();
        myAdpter adapter = new myAdpter(this,list);
        listView.setAdapter(adapter);
    }

    private void LoadData() {
        list=new ArrayList<HashMap<String,String>>();
        HashMap<String,String>hashMap1 = new HashMap<String,String>();
        hashMap1.put(FIRST_COLUMN,"Rameen");
        hashMap1.put(SECOND_COLUMN,"Zoha");
        hashMap1.put(THIRD_COLUMN,"Izza");
        list.add(hashMap1);

        HashMap<String,String>hashmap2 = new HashMap<String,String>();
        hashmap2.put(FIRST_COLUMN,"Ftimaa");
        hashmap2.put(SECOND_COLUMN,"Hira");
        hashmap2.put(THIRD_COLUMN,"Marukh");
        list.add(hashmap2);

        HashMap<String,String>hashmap3 = new HashMap<String,String>();
        hashmap3.put(FIRST_COLUMN,"Ftimaa");
        hashmap3.put(SECOND_COLUMN,"Hira");
        hashmap3.put(THIRD_COLUMN,"Marukh");
        list.add(hashmap3);

        HashMap<String,String>hashmap4 = new HashMap<String,String>();
        hashmap4.put(FIRST_COLUMN,"Ftimaa");
        hashmap4.put(SECOND_COLUMN,"Hira");
        hashmap4.put(THIRD_COLUMN,"Marukh");
        list.add(hashmap4);

    }
}