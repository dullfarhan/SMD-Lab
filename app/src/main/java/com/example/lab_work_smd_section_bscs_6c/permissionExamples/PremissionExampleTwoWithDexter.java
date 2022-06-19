package com.example.lab_work_smd_section_bscs_6c.permissionExamples;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import com.example.lab_work_smd_section_bscs_6c.R;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.DexterBuilder;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.DexterError;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.PermissionRequestErrorListener;
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
                            showSettingDialog();

                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
                        permissionToken.continuePermissionRequest();
                    }
                }).withErrorListener(new PermissionRequestErrorListener() {
            @Override
            public void onError(DexterError dexterError) {
                Toast.makeText(PremissionExampleTwoWithDexter.this, "Error accoured", Toast.LENGTH_SHORT).show();
            }
        }).onSameThread();
    }

    private void showSettingDialog() {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("per");
                builder.setMessage("This application needs permission to use spacfic feure u can gaarnt this per mission ");
        builder.setPositiveButton("go to settong", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent=new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                Uri uri = Uri.fromParts("Package",getPackageName(),null);
                intent.setData(uri);
                startActivityForResult(intent,101);

            }
        });
    }
}