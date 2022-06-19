package com.example.lab_work_smd_section_bscs_6c.SeharedPreferanceExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class ShearedPrefExampleOne extends AppCompatActivity {
    TextView textView;
    ListView listView;
     SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheared_pref_example_one2);
        sharedPreferences=getSharedPreferences("Myfile",MODE_PRIVATE);//MODE_PRIVATE=0
        textView=findViewById(R.id.txtmypref);
        listView=findViewById(R.id.mylistpref);
    }

    public void Save_My_Preferance(View view) {
        SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putInt("A1",101);
        editor.putString("A2","Hareem Ali Malik");
        editor.putString("A3","Afanan");
        editor.putString("A4","Talha");
        editor.putString("A5","Arslan");
        editor.putString("A6","Minahil");
        editor.putString("A7","Maha");
        editor.putString("A8","Osamna");
        editor.putString("A9","Rameen");
        editor.putString("A10","Azeem");
        editor.putString("A11","Fatima");







        editor.commit();
        Snackbar.make(view,"Data Saved",Snackbar.LENGTH_LONG).show();
    }

    public void Show_My_Preferace(View view) {
/*
        int value1= sharedPreferences.getInt("A1",0);
        String value2= sharedPreferences.getString("A2","No Value");
        textView.setText(String.valueOf(value1)+" "+value2);
*/
        if (sharedPreferences.contains("A1")) {
            String v1 = sharedPreferences.getString("A2", "Hareem Ali Malik");
            String v2 = sharedPreferences.getString("A3", "");
            String v3 = sharedPreferences.getString("A4", "");
            String v4 = sharedPreferences.getString("A5", "");
            String v5 = sharedPreferences.getString("A6", "");
            String v6 = sharedPreferences.getString("A7", "");
            String v7 = sharedPreferences.getString("A8", "");
            String v8 = sharedPreferences.getString("A9", "");
            String v9 = sharedPreferences.getString("A10", "");
            String v10 = sharedPreferences.getString("A11", "");
            ArrayList<String> MyNameList = new ArrayList<String>();
            MyNameList.add(v1);
            MyNameList.add(v2);
            MyNameList.add(v3);
            MyNameList.add(v4);
            MyNameList.add(v5);
            MyNameList.add(v6);
            MyNameList.add(v7);
            MyNameList.add(v8);
            MyNameList.add(v9);
            MyNameList.add(v10);

            ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MyNameList);
            listView.setAdapter(myAdapter);
        }

    }
}