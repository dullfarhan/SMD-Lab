package com.example.lab_work_smd_section_bscs_6c.task3CityList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample.Mobiles;
import com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample.MyRecyclerViewAdapter;

import java.util.ArrayList;

public class adapterCityList extends RecyclerView.Adapter<adapterCityList.ViewHolder> {
    ArrayList<task3CityClass> cityList=new ArrayList<>();
    public adapterCityList(ArrayList<task3CityClass> cityList) {
        this.cityList = cityList;
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.taskcitylist,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapterCityList.ViewHolder holder, int position) {
        task3CityClass list =cityList.get(position);
        holder.likes.setText(list.getLikes());
        holder.city.setText(list.getCity());
        holder.visitors.setText(list.getVisitors());
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView likes,city,visitors;
        public ViewHolder(@NonNull View view) {
            super(view);
            likes= view.findViewById(R.id.likestextview);
            city= view.findViewById(R.id.citytextview);
            visitors= view.findViewById(R.id.visitorstxtview);


        }
    }
}
