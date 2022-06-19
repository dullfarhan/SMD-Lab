package com.example.lab_work_smd_section_bscs_6c.RESTAPIExample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.List;

public class MyRestAdapter extends RecyclerView.Adapter<MyRestAdapter.ViewHolder> {
    TextView Name,Content;
    Context context;
    public List<MyRestApiModel> list;

    public MyRestAdapter(Context context, List<MyRestApiModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
           View view =  inflater.inflate(R.layout.myrestlayout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Name.setText(list.get(position).getTitle());
        holder.Content.setText(list.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Name,Content;
        Context context;
        public List<MyRestApiModel> list;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Name= itemView.findViewById(R.id.restxtname);
            Content= itemView.findViewById(R.id.resttextcontent);
        }
    }
}
