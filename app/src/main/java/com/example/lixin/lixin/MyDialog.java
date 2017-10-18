package com.example.lixin.lixin;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class MyDialog {

//    确认后切换对话框样式：
    public static void changeDialog(Activity activity,String title,String content,String confirm) {
        new SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setConfirmText(confirm)
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
//    显示确定取消按钮及事件绑定：
    public static void Quxiaodialog(final Activity activity,String title,String content,String confirm,String cancel){
        new SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setCancelText(confirm)
                .setConfirmText(cancel)
                .showCancelButton(true)
                .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.cancel();
                    }
                })
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        Toast.makeText(activity, "删除成功", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();

    }
//    自定义头部图像：
    public static void CustomPicture(Activity activity){
        new SweetAlertDialog(activity, SweetAlertDialog.CUSTOM_IMAGE_TYPE)
                .setTitleText("Sweet!")
                .setContentText("Here's a custom image.")
                .setCustomImage(R.drawable.ic_launcher)
                .show();
    }
//    显示成功完成样式：
    public static void SuccedDialog(Activity activity,String title,String content){
        new SweetAlertDialog(activity, SweetAlertDialog.SUCCESS_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }
//    显示警告样式：
    public static void warningDialog(Activity activity,String title,String content,String confirm){
        new SweetAlertDialog(activity, SweetAlertDialog.WARNING_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .setConfirmText(confirm)
                .show();
    }
//    显示异常样式：
    public static void abnormalDialog(Activity activity,String title,String content){
        new SweetAlertDialog(activity, SweetAlertDialog.ERROR_TYPE)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }
//   普通 显示标题 和 内容
    public static void showDialog(Activity activity,String title,String content){
        new SweetAlertDialog(activity)
                .setTitleText(title)
                .setContentText(content)
                .show();
    }
}


