package com.example.lab_work_smd_section_bscs_6c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class myReciverBoradcastApplication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_reciver_boradcast_application);
        IntentFilter intentFilter =
                new IntentFilter("com.example.mysenderbroadcastapplication.ACTION_SEND");
    }
    public class ReciverBoradcast extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if ("com.example.mysenderbroadcastapplication.ACTION_SEND".equals(intent.getAction())){
                String extra =intent.getStringExtra("com.example.mysenderbroadcastapplication.EXTRA");
                Toast.makeText(context, "Recier Application"+extra, Toast.LENGTH_SHORT).show();
            }
        }
    }
}