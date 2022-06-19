package com.example.lab_work_smd_section_bscs_6c.listViewExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class myListViewExample extends AppCompatActivity {
    ListView mylistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list_view_example);
        String[] list =getResources().getStringArray(R.array.myArray);
        mylistView=findViewById(R.id.mylistview);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        mylistView.setAdapter(adapter);
    }
}