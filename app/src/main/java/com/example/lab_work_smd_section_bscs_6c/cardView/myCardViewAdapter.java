package com.example.lab_work_smd_section_bscs_6c.cardView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.List;

public class myCardViewAdapter extends RecyclerView.Adapter<myCardViewAdapter.ViewHoldere>{
    Context context;
    List<myModel> modelList;

    public myCardViewAdapter(Context context, List<myModel> modelList) {
        this.context = context;
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ViewHoldere onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card,parent,false);

        return new ViewHoldere(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoldere holder, int position) {
        myModel my_model= modelList.get(position);
        holder.Name.setText(my_model.getName());
        holder.totalDownload.setText(String.valueOf(my_model.getTotalDownlaods()));
        Glide.with(context).load(my_model.getThumbnails()).into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public  class ViewHoldere extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView Name,totalDownload;
        public ViewHoldere(@NonNull View itemView) {
            super(itemView);
            Name= itemView.findViewById(R.id.mycardtxt1);
            totalDownload=itemView.findViewById(R.id.mycardtxt2);
            thumbnail = itemView.findViewById(R.id.mycardimgeview);
        }
    }
}
