package com.example.lab_work_smd_section_bscs_6c.FirebaseExample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FirebaseExampleOne extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    RecyclerView recyclerView;
    ArrayList<Student> studentList;
    FirebaseAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_example_one);

        recyclerView=findViewById(R.id.firebaserecyclerview1);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        studentList=new ArrayList<>();
        database=FirebaseDatabase.getInstance("https://lab-work-smd-section-bsc-9cc69-default-rtdb.firebaseio.com/");
        reference= database.getReference("Student");
        LoadDataFromFirebase();
//        reference.
//        reference.setValue("hammad");
//        reference.child("FAST NUCES").child("FAST CFD").child("BSCS").setValue("1000");
//        reference.child("FAST NUCES").child("FAST CFD").child("BSSE").setValue("200");
    }
    public void LoadDataFromFirebase(){
        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot datasnapshot) {
                for(DataSnapshot snapshot: datasnapshot.getChildren()){
                    Student student =new Student();
                    student.setName(snapshot.child("Name").getValue().toString());
                    student.setUrl(snapshot.child("Picture").getValue().toString());
                    studentList.add(student);
                }
                adapter =new FirebaseAdapter(studentList,getApplicationContext());
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}