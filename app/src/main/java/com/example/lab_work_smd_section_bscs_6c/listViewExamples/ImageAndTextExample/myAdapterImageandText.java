package com.example.lab_work_smd_section_bscs_6c.listViewExamples.ImageAndTextExample;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lab_work_smd_section_bscs_6c.R;

public class myAdapterImageandText extends ArrayAdapter<String> {
    Activity activity;
    String[] Name;
    String[] Text;
    int[] Image;

    public myAdapterImageandText(Activity activity, String[] name,
                                 String[] text, int[] image) {
        super(activity, R.layout.imageandtextlistview,text);

        this.activity = activity;
        Name = name;
        Text = text;
        Image = image;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//         super.getView(position, convertView, parent);
        LayoutInflater inflater= activity.getLayoutInflater();
        View viewHolder= inflater.inflate(R.layout.imageandtextlistview,null);
        TextView textViewName,textViewMsg;
        ImageView imageView;
        textViewName= viewHolder.findViewById(R.id.imageandtextname);
        textViewMsg = viewHolder.findViewById(R.id.iamgeandtextmsg);
        imageView= viewHolder.findViewById(R.id.imgandtextimg);
        textViewName.setText(Name[position]);
        textViewMsg.setText(Text[position]);
        imageView.setImageResource(Image[position]);
        return viewHolder;
    }
}
