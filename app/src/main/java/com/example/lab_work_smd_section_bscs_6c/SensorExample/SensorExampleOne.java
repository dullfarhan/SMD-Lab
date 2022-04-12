package com.example.lab_work_smd_section_bscs_6c.SensorExample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;

public class SensorExampleOne extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    boolean color = false;
    View view;
    long lastTimeUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_example_one);
        lastTimeUpdate = System.currentTimeMillis();
        view = findViewById(R.id.txtSensorValue);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            getMyAccelerometerValues(sensorEvent);
        }

    }

    private void getMyAccelerometerValues(SensorEvent sensorEvent) {
        float[] values = sensorEvent.values;
        float x = values[0];
        float y = values[1];
        float z = values[2];
        float accleration = ((x * x + y * y + z * z) / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH));
        long actualTIme = sensorEvent.timestamp;
        if (accleration >= 0.2) {
            if (actualTIme - lastTimeUpdate < 150) {
                return;
            }
            lastTimeUpdate = actualTIme;
            Toast.makeText(this, "Device Was Moved", Toast.LENGTH_SHORT).show();
            if (color){
                view.setBackgroundColor(Color.RED);

            }
            else view.setBackgroundColor(Color.BLUE);
            color=!color;
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        sensorManager
                .registerListener(this
                        ,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
                        ,SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}