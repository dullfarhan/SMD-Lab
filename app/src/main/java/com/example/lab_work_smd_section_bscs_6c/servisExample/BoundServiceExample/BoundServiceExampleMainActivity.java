package com.example.lab_work_smd_section_bscs_6c.servisExample.BoundServiceExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;

public class BoundServiceExampleMainActivity extends AppCompatActivity {
    MyBoundService myBoundServiceMediaPlayerSerivce;
    public boolean myBoundService = false;



    public final ServiceConnection myServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MyBoundService.MyBinder myBinder= (MyBoundService.MyBinder) iBinder;
            myBoundServiceMediaPlayerSerivce= myBinder.getServiceMethod();
            myBoundService=true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound_service_example_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Intent intent = new Intent(this,MyBoundService.class);
        bindService(intent,myServiceConnection,BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (myBoundService==true){
            unbindService(myServiceConnection);
        }
    }

    public void play_pause(View view) {
        if (myBoundService== true){

            if (myBoundServiceMediaPlayerSerivce.isPlaying()){
                Log.d("aa", "play_pause: ");
                myBoundServiceMediaPlayerSerivce.pause();
            }

            else {
            myBoundServiceMediaPlayerSerivce.play();
            }
            }
        }

    }
