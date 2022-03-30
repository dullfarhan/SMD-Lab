package com.example.lab_work_smd_section_bscs_6c.AsusncTaskClassExample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

public class WebContentExample extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_content_example);
        textView=findViewById(R.id.multilinetxtwebexample);
    }

    public void Downlaod_Webcontent(View view) {
    WebContentDownload obj = new WebContentDownload();
     try {
         String ReceivedData = obj.execute("https://www.wikipedia.org/").get();
         Log.d("TAG","Bac in Mian");
         textView.setText(ReceivedData);

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public class WebContentDownload extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {
            try {
                Log.d("TAG","doInBackgraound in progress");
                URL url= new URL(strings[0]);
                HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
                InputStream inputStream= connection.getInputStream();
                InputStreamReader reader = new InputStreamReader(inputStream);
                int data= reader.read();
                String webcontent="";

                while (data != -1){

                    char ch = (char) data;
//                    Log.d("TAG","You are in While "+ch);

                    webcontent+=ch;
                    data= reader.read();

                }
                return webcontent;
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
