package com.juzhen.securitydemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class UnsafeReceiver02 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("juzhen", "UnsafeReceiver02 onReceive " + intent.toString());
    }
}
