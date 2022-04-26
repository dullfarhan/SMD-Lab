package com.example.lab_work_smd_section_bscs_6c.SensorExample;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lab_work_smd_section_bscs_6c.R;

public class PromixityMainActivity extends AppCompatActivity {
    TextView textView;
    SensorManager sensorManager;
    Sensor sensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promixity_main);
        textView=findViewById(R.id.txtpromxity);
        sensorManager= (SensorManager) getSystemService(this.SENSOR_SERVICE);
        sensor= sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if (sensor==null){
            textView.setText("NO sensor");
        }
        else {
        sensorManager.registerListener(proxmityEventListener,sensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        }

    SensorEventListener proxmityEventListener = new SensorEventListener(){
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType()==sensor.TYPE_PROXIMITY){
            if (sensorEvent.values[0]==0){
                textView.setText("Object is near");
            }
            else {
                textView.setText("Object is away");

            }
        }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {

        }
    };
}