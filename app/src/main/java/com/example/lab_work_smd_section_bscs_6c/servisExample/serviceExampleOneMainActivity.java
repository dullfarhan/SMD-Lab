package com.example.lab_work_smd_section_bscs_6c.servisExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab_work_smd_section_bscs_6c.R;

public class serviceExampleOneMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_example_one_main);
    }

    public void StartService(View view) {
        Intent intent= new Intent(this,MyServiceExampleOne.class);
        startService(intent);
    }

    public void StopService(View view) {
        Intent intent= new Intent(this,MyServiceExampleOne.class);
        stopService(intent);
    }


}