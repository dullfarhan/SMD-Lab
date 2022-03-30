package com.example.lab_work_smd_section_bscs_6c.AlertDilogExample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.snackbar.Snackbar;

public class AlertDilogExampleOne extends AppCompatActivity {
    TextView textViewDilog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dilog_example_one);
        textViewDilog= findViewById(R.id.txtAlertDilog);
    }

    public void Show_Alert_dilog(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setMessage("Are You Sure")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Snackbar.make(view,"OK button Pressed",Snackbar.LENGTH_LONG).show();
            }
        }).setNegativeButton("Cancle",null);
        AlertDialog alert = builder.create();
        alert.show();
    }
}