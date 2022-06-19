package com.example.lab_work_smd_section_bscs_6c.BroadcastExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class AirplaneModeRecriver extends AppCompatActivity {
    AirplaneModeChange airplaneModeChange = new AirplaneModeChange();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airplane_mode_recriver);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(airplaneModeChange,intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(airplaneModeChange);
    }
}