package com.example.lab_work_smd_section_bscs_6c.SQLiteExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.util.HashMap;

public class NewContactActivity extends AppCompatActivity {
    EditText firstName, secondName,phoneNumber,emailAddress,homeAddress;
    Button button;
    DbTools dbTools;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contact);
        firstName=findViewById(R.id.edtfirstname);
        secondName=findViewById(R.id.edtsecondname);
        phoneNumber=findViewById((R.id.edtphonenumber));
        emailAddress=findViewById(R.id.edtemail);
        homeAddress=findViewById(R.id.edthomeaddress);
        dbTools = new DbTools(getApplicationContext());
        button= findViewById(R.id.btnsave);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("TAG","Button clICKED");
                HashMap<String,String> contact=new HashMap<String,String>();
                contact.put("firstName", firstName.getText().toString());
                contact.put("secondName", secondName.getText().toString());
                contact.put("phoneNumber",phoneNumber.getText().toString());
                contact.put("emailAddress",emailAddress.getText().toString());
                contact.put("homeAddress",homeAddress.getText().toString());
//        contact.put("firstName",firstname.getText().toString());
                dbTools.AddContact(contact);
            }
        });
    }


}