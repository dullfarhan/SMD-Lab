package com.example.lab_work_smd_section_bscs_6c.StartActivityForResultExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class SAFR_SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safr_second);
        Intent intent= getIntent();
        int value1= intent.getIntExtra("V1",0);
        int value2= intent.getIntExtra("V2",0);
        int newValue= value1+value2+5;
        intent.putExtra("V3",newValue);
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
    }
}