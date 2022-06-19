package com.example.lab_work_smd_section_bscs_6c.taskFragmnetService;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class ImageFaragmentMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        Configuration config = getResources().getConfiguration();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_faragment_main);

        ImageFragment   imageFragment1= new ImageFragment();
        ImageFragment   imageFragment2= new ImageFragment();
        ImageFragment   imageFragment3= new ImageFragment();
        ImageFragment   imageFragment4= new ImageFragment();
        ImageFragment   imageFragment5= new ImageFragment();
        ImageFragment   imageFragment6 = new ImageFragment();

        FT.replace(R.id.frame1,imageFragment1);
        FT.replace(R.id.frame2,imageFragment2);
        FT.replace(R.id.frame3,imageFragment3);
        FT.replace(R.id.frame4,imageFragment4);
        FT.replace(R.id.frame5,imageFragment5);
        FT.replace(R.id.frame6,imageFragment6);
        FT.commit();

    }
}