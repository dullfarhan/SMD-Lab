package com.example.lab_work_smd_section_bscs_6c.permissionExamples;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.DexterBuilder;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;

import java.util.List;

public class PremissionExampleTwoWithDexter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premission_example_two_with_dexter);

    }

    public void CheckMyPermission(View view) {
        Check_My_Permissions();
    }

    private void Check_My_Permissions() {
        Dexter.withContext(this)
                .withPermissions(Manifest.permission.INTERNET,
                        Manifest.permission.CAMERA,
                        Manifest.permission.ACCESS_FINE_LOCATION)
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
                        if (multiplePermissionsReport.areAllPermissionsGranted()){
                            Toast.makeText(PremissionExampleTwoWithDexter.this,
                                    "All Premission Granted",
                                    Toast.LENGTH_SHORT)
                                    .show();

                        }
                        if (multiplePermissionsReport.isAnyPermissionPermanentlyDenied()){
                            Toast.makeText(PremissionExampleTwoWithDexter.this, "Grant this per mission", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {

                    }
                });
    }
}