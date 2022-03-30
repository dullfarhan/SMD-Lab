package com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class RecyclerViewMainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Mobiles> mobilelist=new ArrayList<>();
    MyRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_main);
        adapter= new MyRecyclerViewAdapter(mobilelist);
        recyclerView=findViewById(R.id.myrecyclerView);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        insert();
    }
    public void insert(){
        Mobiles mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);
        mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);mobiles= new Mobiles("Note5","Samsung", "5000");
        mobilelist.add(mobiles);
        adapter.notifyDataSetChanged();

    }
}