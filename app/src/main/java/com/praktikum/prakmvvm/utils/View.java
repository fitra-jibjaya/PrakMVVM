package com.praktikum.prakmvvm.utils;

import android.content.Context;
import android.widget.Toast;

public class View {
    public static void toast(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
