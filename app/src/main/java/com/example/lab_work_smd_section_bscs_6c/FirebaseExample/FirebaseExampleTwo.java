package com.example.lab_work_smd_section_bscs_6c.FirebaseExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseExampleTwo extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_firebase_example_one);
        database=FirebaseDatabase.getInstance("https://lab-work-smd-section-bsc-9cc69-default-rtdb.firebaseio.com/");
        reference= database.getReference("Student");
        reference.setValue("Hammad Shahid");
    }
}