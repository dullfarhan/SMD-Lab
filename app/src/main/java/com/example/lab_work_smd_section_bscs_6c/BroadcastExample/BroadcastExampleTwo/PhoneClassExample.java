package com.example.lab_work_smd_section_bscs_6c.BroadcastExample.BroadcastExampleTwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class PhoneClassExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_class_example);
        Intent intent =new Intent(this,MyPhoneReciver.class);

        MyPhoneReciver myPhoneReciver= new MyPhoneReciver();
        myPhoneReciver.onReceive(this,intent);
        sendBroadcast(intent);
    }

}