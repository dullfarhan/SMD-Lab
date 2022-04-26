package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivityContactList extends AppCompatActivity {
    ListView listView;
    DbTools dbTools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_contact_list);
//       dbTools= new DbTools(getApplicationContext());
//       listView= findViewById(R.id.listlist);
//        ArrayList<HashMap<String,String>> contactList= dbTools.getallContacts();
//        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),contactList,R.layout.activity_contact_entery
//        ,new String[]{"_id","firstNmae","secondName"},
//                new int[]{R.id.textViewID,R.id.textViewFirstName,R.id.textViewLastName});
//        listView.setAdapter(adapter);
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(MainActivityContactList.this,EditContactEntery.class);
//                intent.putExtra("id",String.valueOf(1+i));
//            }
//        });
    }

    public void addContact(View view) {
        Intent intent = new Intent(this,NewContactActivity.class);
        startActivity(intent);
    }
}