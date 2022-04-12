package com.example.lab_work_smd_section_bscs_6c.task4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class chatRecycleViewadapter extends RecyclerView.Adapter<chatRecycleViewadapter.ViewHolder> {
    ArrayList<ChatClass> cityList=new ArrayList<>();
    public chatRecycleViewadapter(ArrayList<ChatClass> cityList) {
        this.cityList = cityList;
    }


    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.imageandtextlistview,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChatClass list =cityList.get(position);
        holder.textViewName.setText(list.getName());
        holder.textViewMsg.setText(list.getMessage());
        holder.imageView.setImageResource(list.getImage());

    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName,textViewMsg;
        ImageView imageView;
        TextView likes,city,visitors;
        public ViewHolder(@NonNull View view) {
            super(view);
            textViewName= view.findViewById(R.id.imageandtextname);
            textViewMsg = view.findViewById(R.id.iamgeandtextmsg);
            imageView= view.findViewById(R.id.imgandtextimg);


        }
    }
}
