package com.example.lab_work_smd_section_bscs_6c.static_fargmanet_Example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab_work_smd_section_bscs_6c.R;

public class myConstactsMainActivity extends AppCompatActivity implements ContactsFragment.ListSelectionListener {
    public static String[] contactsArray, contactDetailArray;
    DetailFragment detailFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_constacts_main);
        contactsArray = getResources().getStringArray(R.array.contacts_array);
        contactDetailArray = getResources().getStringArray(R.array.details_array);
        detailFragment= (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailfragment);
    }

    @Override
    public void onSelection(int position) {
        if (detailFragment.getShownIndex()!=position){
            detailFragment.contactIndex(position);
        }
    }
}