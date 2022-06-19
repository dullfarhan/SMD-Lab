package com.example.lab_work_smd_section_bscs_6c.BroadcastExample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.widget.Toast;

public class AirplaneModeChange extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        if (isAirplaneModeOn(context.getApplicationContext())){
            Toast.makeText(context, "AirplaneMode is on", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "AirplaneMode is off", Toast.LENGTH_SHORT).show();

        }
    }


    public boolean isAirplaneModeOn(Context context) {
        return Settings.System.getInt(
                context.getContentResolver(),
                Settings.Global.AIRPLANE_MODE_ON,
                0) != 0;

    }

}
