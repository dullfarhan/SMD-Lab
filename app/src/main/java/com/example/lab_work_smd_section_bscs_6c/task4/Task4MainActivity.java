package com.example.lab_work_smd_section_bscs_6c.task4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class Task4MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ChatClass> list=new ArrayList<>();
    chatRecycleViewadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);
        adapter= new chatRecycleViewadapter(list);
        recyclerView=findViewById(R.id.cityrecyclerlistview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        insert();

    }

    private void insert() {
        ChatClass chat= new ChatClass();
        String[] Name={"Raameen","Fatiam","Hassan","Hareem","Marukh","umair","abdullah","abdullah^Squre"};
        String[] Text={"Muje boohk lagi","Laptop krarab ha",
                "meri key karahab ha","kahain phirna nhi chia",
                "sir kuch bhi","10 20 peh kahatam","helloe",
                "mids aa gai haon"};
        int Image[]= {R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,
                R.drawable.planetsvg,};


        for (int i=0;i<Name.length;i++){
            chat=new ChatClass(Name[i],Text[i],Image[i]);
            list.add(chat);
        }


    }
}