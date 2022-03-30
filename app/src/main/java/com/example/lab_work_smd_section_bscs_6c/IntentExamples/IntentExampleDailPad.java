package com.example.lab_work_smd_section_bscs_6c.IntentExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.lab_work_smd_section_bscs_6c.R;

public class IntentExampleDailPad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_example_dail_pad);
    }

    public void Open_Dailpad(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.dullfarhan.netlify.app"));
        startActivity(intent);

    }
}