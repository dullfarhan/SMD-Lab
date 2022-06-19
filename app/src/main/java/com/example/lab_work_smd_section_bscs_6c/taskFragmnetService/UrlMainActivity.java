package com.example.lab_work_smd_section_bscs_6c.taskFragmnetService;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class UrlMainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url_main);
        editText= findViewById(R.id.editurl1);


    }

    public void getLinks(View view) {
        Intent intent= new Intent(this,DownloadImageService.class);
        intent.putExtra("url",editText.getText());
        startService(intent);
    }
}