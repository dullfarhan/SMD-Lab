package com.example.lab_work_smd_section_bscs_6c.filehandelingExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.snackbar.Snackbar;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileHandelingExampleOne extends AppCompatActivity {
    EditText editText;
    TextView textView;
    String FILE_NAME="MyTextFile";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handeling_example_one);
        editText= findViewById(R.id.edtwritedata);
        textView= findViewById(R.id.txtfileshowdata);
    }

    public void save_text_into_file(View view) {
        String writeData= editText.getText().toString();
        try {
            FileOutputStream FOS= openFileOutput(FILE_NAME, Context.MODE_APPEND);
            FOS.write(writeData.getBytes());
            editText.setText("");
            Snackbar.make(view,"Data Saved",Snackbar.LENGTH_LONG).show();
            FOS.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void show_data_from_file(View view) {
        String readData="";
        try {
            FileInputStream FIS=openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(FIS);
            BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
            String value = bufferedReader.readLine();
            if (value==null){
                Toast.makeText(this, "file is Empty", Toast.LENGTH_SHORT).show();
            }
            else {
                while (value != null){
                    readData= readData+value;
                    value=bufferedReader.readLine();
                }
                bufferedReader.close();
                inputStreamReader.close();
                FIS.close();
            }
            textView.setText(readData);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}