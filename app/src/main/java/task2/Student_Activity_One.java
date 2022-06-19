package task2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Dictionary;
import java.util.Hashtable;

public class Student_Activity_One extends AppCompatActivity {
    EditText editName,editCnic,editPhone,editCgpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_one);
        editName= findViewById(R.id.editName);
        editCnic= findViewById(R.id.editCnic);
        editPhone= findViewById(R.id.editPhone);
        editCgpa= findViewById(R.id.editCGPA);

    }

    public void send_data(View view) {
       // System.out.println("helloass");
        Intent intent= new Intent(this,Student_Activity_Two.class);
       intent.putExtra("Name",editName.getText().toString());

        intent.putExtra("Cgpa",editCgpa.getText().toString());
        intent.putExtra("Phone",editPhone.getText().toString());
        intent.putExtra("Cnic",editCnic.getText().toString());
        startActivity(intent);


    }
}