package com.example.lab_work_smd_section_bscs_6c.listViewExamples.ImageAndTextExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class ImageAndTextMainActivity extends AppCompatActivity {
    ListView listView;
    String[] Name={"Raameen","Fatiam","Hassan","Hareem","Marukh","umair","abdullah","abdullah^Squre"};
    String[] Text={"Muje boohk lagi","Laptop krarab ha",
            "meri key karahab ha","kahain phirna nhi chia",
            "sir kuch bhi","10 20 peh kahatam","helloe",
            "mids aa gai haon"};
    int Image[]= {R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,
            R.drawable.planetsvg,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_and_text_main);
        listView= findViewById(R.id.imageandtextlist);
        myAdapterImageandText adapter = new myAdapterImageandText(this,Name,Text,Image);
        listView.setAdapter(adapter);
    }

}