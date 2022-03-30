package com.example.lab_work_smd_section_bscs_6c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        MySecondFunction();
    }

    private void MySecondFunction() {
        MyRefClass mynewobject= new MyRefClass();
        mynewobject.myNewFunction();
    }
}