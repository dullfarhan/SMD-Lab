package com.example.lab_work_smd_section_bscs_6c.cardView;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.example.lab_work_smd_section_bscs_6c.databinding.ActivityScrollingMainBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class ScrollingActivityMain extends AppCompatActivity {
    public List<myModel> my_ModelList;
    public myCardViewAdapter adapter;
    public RecyclerView recyclerView;
    private ActivityScrollingMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());

        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        recyclerView= findViewById(R.id.my_cardrecyclerView);
        my_ModelList= new ArrayList<>();
        adapter= new myCardViewAdapter(this, my_ModelList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
        Insert();
    }
    public void Insert(){
        int []myImages=new int[]
                {
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                        R.drawable.planetsvg,
                };
        myModel my_model = new myModel("first Item",40,myImages[0]);
        my_ModelList.add(my_model);
        my_ModelList.add(my_model);
        my_ModelList.add(my_model);
        my_ModelList.add(my_model);
        my_ModelList.add(my_model);




        adapter.notifyDataSetChanged();
    }
}