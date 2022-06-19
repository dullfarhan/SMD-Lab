package com.example.lab_work_smd_section_bscs_6c.BroadcastExample.BroadcastExampleTwo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class MyPhoneReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle extra = new Bundle();
        if (extra!=null){
            String state = extra.getString(TelephonyManager.EXTRA_STATE);
//            Toast.makeText(context,"Calling",)
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
//                String phoneNumber = extra.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
//                log.d("TAG","sdsd")
            }

        }
        try{
            String state = extra.getString(TelephonyManager.EXTRA_STATE);
//            String phoneNumber = extra.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
            if (state.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                String phoneNumber = extra.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Toast.makeText(context, "Incomming calll", Toast.LENGTH_SHORT).show();
                Toast.makeText(context, "Pinging Number is ="+phoneNumber, Toast.LENGTH_SHORT).show();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
