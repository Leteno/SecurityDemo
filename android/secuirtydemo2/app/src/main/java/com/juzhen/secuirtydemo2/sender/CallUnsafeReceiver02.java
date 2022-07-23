package com.juzhen.secuirtydemo2.sender;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CallUnsafeReceiver02 {
    public static void call(Context context) {
        Log.d("juzhen", "CallUnsafeReceiver02 call UnsafeReceiver02");
        Intent intent = new Intent();
        intent.setPackage("com.juzhen.securitydemo");
        intent.setAction("securitydemo.UnsafeReceiver02");
        context.sendBroadcast(intent);
    }
}
