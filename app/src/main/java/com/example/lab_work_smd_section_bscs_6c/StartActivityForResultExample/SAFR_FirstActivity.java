package com.example.lab_work_smd_section_bscs_6c.StartActivityForResultExample;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class SAFR_FirstActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safr_first2);
        textView=findViewById(R.id.txtsafr);
    }

    public void Open_Second_Activity(View view) {
        Intent intent = new Intent(this,SAFR_SecondActivity.class);
        intent.putExtra("V1",5);
        intent.putExtra("V2",10);
        myResult.launch(intent);

    }
    ActivityResultLauncher<Intent>myResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {
                            if (result.getResultCode()==RESULT_OK){
                                Intent intent= result.getData();
                                int newValue=intent.getIntExtra("V3",0);
                                textView.setText(String.valueOf(newValue));
                            }
                        }
                    });
}