package com.example.lab_work_smd_section_bscs_6c.CommunicationBwFragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class CMMainActivity extends AppCompatActivity implements ButtonPressListener.onButtonPressListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmmain);
    }

    @Override
    public void onButtonPressed(String Message) {
        fargment2 frag2= (fargment2) getSupportFragmentManager().findFragmentById(R.id.frag_2);
        frag2.OnFragmentInteraction(Message);
    }
}