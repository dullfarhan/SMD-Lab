package com.example.lab_work_smd_section_bscs_6c.servisExample.BoundServiceExample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.provider.MediaStore;

import androidx.annotation.Nullable;

import com.example.lab_work_smd_section_bscs_6c.R;

public class MyBoundService extends Service {
    public Binder myBinder= new MyBinder();
    public MediaPlayer mediaPlayer;
    public MyBoundService(){

    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public class MyBinder extends Binder
    {
        MyBoundService getServiceMethod(){
            return MyBoundService.this;
        }

    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer= MediaPlayer.create(this, R.raw.small);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
    public void play(){
        mediaPlayer.start();
    }
    public void pause(){
        mediaPlayer.pause();
    }
    public boolean isPlaying(){
        return mediaPlayer.isPlaying();
    }
}
