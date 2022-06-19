package com.example.lab_work_smd_section_bscs_6c.IntentExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class IntentExampleSecondActivity extends AppCompatActivity {
    TextView txtFirstValue,txtsecondValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example_second);
       txtFirstValue.findViewById(R.id.intVal);
//        txtsecondValue.findViewById(R.id.txtintentsecondValue);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent=getIntent();
//        String firstValue = intent.getStringExtra("K1");
        int[] firstValue = intent.getIntArrayExtra("K2");

        String secondValue = intent.getStringExtra("K2");
     txtFirstValue.setText(String.valueOf(firstValue));
//        txtsecondValue.setText(secondValue);

    }
}