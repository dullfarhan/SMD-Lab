package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.HashMap;

public class EditContactEntery extends AppCompatActivity {
    DbTools dbTools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact_entery);
        dbTools=new DbTools(getApplicationContext());
        Intent intent= getIntent();
        String id = intent.getExtras().getString("id");
        HashMap<String,String>singleRecord=dbTools.getSingleContact(id);
    }
}