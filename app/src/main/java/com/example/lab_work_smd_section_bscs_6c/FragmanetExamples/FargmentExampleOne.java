package com.example.lab_work_smd_section_bscs_6c.FragmanetExamples;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.media.audiofx.DynamicsProcessing;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class FargmentExampleOne extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fargment_example_one);
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Configuration config = getResources().getConfiguration();

        if (config.orientation == Configuration.ORIENTATION_PORTRAIT) {
            PM_Fragment pm_fragment = new PM_Fragment();
            FT.replace(android.R.id.content, pm_fragment);
        } else {
            LM_Fragment lm_fragment = new LM_Fragment();
            FT.replace(android.R.id.content, lm_fragment);
        }
        FT.commit();
    }
}