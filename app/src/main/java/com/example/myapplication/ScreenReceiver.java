package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();

        if (action.equals(Intent.ACTION_SCREEN_ON)) {
            System.out.println("螢幕開啟");
        } else if (action.equals(Intent.ACTION_SCREEN_OFF)) {
            System.out.println("螢幕關閉");
        }
    }
}
