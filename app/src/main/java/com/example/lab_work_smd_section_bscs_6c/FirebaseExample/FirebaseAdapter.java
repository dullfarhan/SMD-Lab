package com.example.lab_work_smd_section_bscs_6c.FirebaseExample;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;

public class FirebaseAdapter extends RecyclerView.Adapter<FirebaseAdapter.ViewHolder> {


    public FirebaseAdapter(ArrayList<Student> studentList, Context context) {

        this.studentList = studentList;
        this.context = context;
    }

    ArrayList<Student> studentList;
    Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.message_items,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(studentList.get(position).getName());
        Glide.with(context).load(studentList.get(position).getUrl()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.firebaseimageview);
            textView = itemView.findViewById(R.id.firebasetextview);

        }
    }
}
