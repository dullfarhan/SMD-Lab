package com.example.lab_work_smd_section_bscs_6c.IntentExamples;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class intentActavityOpengallry extends AppCompatActivity {
    Bitmap bitmap ;
ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_actavity_opengallry);
        imgview = findViewById(R.id.imgintentopengallery);
    }

    public void open_gallaey(View view) {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent,101);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==101&& resultCode==RESULT_OK){

            try {
                InputStream inputstream =    getContentResolver().openInputStream(data.getData()) ;
                if (bitmap!=null){
                    bitmap.recycle();
                }
                bitmap= BitmapFactory.decodeStream(inputstream);
                imgview.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}