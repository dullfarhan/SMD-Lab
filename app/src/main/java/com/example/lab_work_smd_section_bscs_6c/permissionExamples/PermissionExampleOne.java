package com.example.lab_work_smd_section_bscs_6c.permissionExamples;

import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.CAMERA;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.snackbar.Snackbar;

public class PermissionExampleOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_example_one);
    }

    public void check_permission(View view) {
        if (!CheckPermission()){
            Snackbar.make(view,"Please Take Permission",Snackbar.LENGTH_LONG).show();
        }
        else {
            Snackbar.make(view,"Permission Already Granted",Snackbar.LENGTH_LONG).show();
        }

    }

    private boolean CheckPermission() {
        int r1= ContextCompat.checkSelfPermission(this,CAMERA);
        int r2 =ContextCompat.checkSelfPermission(this,ACCESS_FINE_LOCATION);

    return r1== PackageManager.PERMISSION_GRANTED&& r2==PackageManager.PERMISSION_GRANTED;
    }

    public void Request_Permission(View view) {
        if (!CheckPermission()) {
            RequestPermission();
        }
        else{
            Snackbar.make(view," Already Granted Permission",Snackbar.LENGTH_LONG).show();

        }
        }

    private void RequestPermission() {
        ActivityCompat.requestPermissions(this,new String[]{ACCESS_FINE_LOCATION,CAMERA},101);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==101&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Premission Granted", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "User Denied", Toast.LENGTH_SHORT).show();
        }
    }
}
