package task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class Student_Activity_Two extends AppCompatActivity {
String name,phone,cnic,cgpa;
TextView nameView,phoneView,cnicView,cgpaView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_two);
        Intent intent= getIntent();
        name=intent.getStringExtra("Name");
        cgpa=intent.getStringExtra("Cgpa");
        phone=intent.getStringExtra("Phone");
        cnic= intent.getStringExtra("Cnic");

        nameView= findViewById(R.id.showName);
        cnicView= findViewById(R.id.showCinic);
        phoneView= findViewById(R.id.showPhone);
        cgpaView= findViewById(R.id.showCgpa);

        nameView.setText(name);
        phoneView.setText(phone);
        cnicView.setText(cnic);
        cgpaView.setText(cgpa);
        

    }
}