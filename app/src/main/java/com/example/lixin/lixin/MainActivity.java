package com.example.lixin.lixin;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MainActivity{


    public static void showDialog(Activity activity) {
        new SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure?")
                .setContentText("Won't be able to recover this file!")
                .setConfirmText("Yes,delete it!")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog
                                .setTitleText("Deleted!")
                                .setContentText("Your imaginary file has been deleted!")
                                .setConfirmText("OK")
                                .setConfirmClickListener(null)
                                .changeAlertType(SweetAlertDialog.SUCCESS_TYPE);
                    }
                })
                .show();
    }
}
