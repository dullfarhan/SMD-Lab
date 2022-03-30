package com.example.lab_work_smd_section_bscs_6c.RecyclerViewExample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    ArrayList<Mobiles> mobilesList=new ArrayList<>();

    public MyRecyclerViewAdapter(ArrayList<Mobiles> mobilesList) {
        this.mobilesList = mobilesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.mobile_row,parent,false);
        
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mobiles mobiles =mobilesList.get(position);
    holder.Name.setText(mobiles.getName());
        holder.Company.setText(mobiles.getCompany());
        holder.Price.setText(mobiles.getPrice());
    }

    @Override
    public int getItemCount() {
        return mobilesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView Name,Company,Price;
        public ViewHolder(@NonNull View view) {
            super(view);
            Name= view.findViewById(R.id.textmname);
            Company= view.findViewById(R.id.textmcompany);
            Price= view.findViewById(R.id.textmprice);
                        
           
        }
    }
}
