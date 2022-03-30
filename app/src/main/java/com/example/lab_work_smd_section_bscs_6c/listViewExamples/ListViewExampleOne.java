package com.example.lab_work_smd_section_bscs_6c.listViewExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class ListViewExampleOne extends AppCompatActivity {
    ImageView imageView;
    String[] MyClassNames={"Ali","dullfarhan","umair","Ossama","Rameen","Tahreem","Mrrukh"};
    Integer[] MyImages={R.drawable.a1,R.drawable.a2,R.drawable.a3};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example_one2);
        listView= findViewById(R.id.lstnames);
        ArrayAdapter adapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,MyClassNames);
        listView.setAdapter(adapter);
        imageView=findViewById(R.id.imagelistview);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position>=0 && position<3){
                    imageView.setImageResource(MyImages[position]);
                }
            }
        });
    }
}