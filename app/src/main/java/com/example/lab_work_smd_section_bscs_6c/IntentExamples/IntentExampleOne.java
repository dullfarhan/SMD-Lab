package com.example.lab_work_smd_section_bscs_6c.IntentExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.lab_work_smd_section_bscs_6c.R;

public class IntentExampleOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example1);
    }

    public void Go_To_Second_Activity(View view) {
        Intent intent = new Intent(this, IntentExampleSecondActivity.class);
        intent.putExtra("K1",56);
        intent.putExtra("K2",36);

        startActivity(intent);
    }
}