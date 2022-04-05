package com.example.lab_work_smd_section_bscs_6c.task3CityList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class cityListActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<task3CityClass> list=new ArrayList<>();
    adapterCityList adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list);
        adapter= new adapterCityList(list);
        recyclerView=findViewById(R.id.cityrecyclerlistview);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    insert();

    }

    private void insert() {
        String cityList[]=getResources().getStringArray(R.array.city);
        String likesList[]=getResources().getStringArray(R.array.likes);
        String visitorsList[]=getResources().getStringArray(R.array.visitors);
        task3CityClass city= new task3CityClass();

        for (int i=0;i<cityList.length;i++){
            city=new task3CityClass (cityList[i],likesList[i],visitorsList[i]);
            list.add(city);
        }


    }
}