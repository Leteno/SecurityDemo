package com.juzhen.secuirtydemo2.sender;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CallUnsafeReceiver01 {
    public static void call(Context context) {
        Log.d("juzhen", "CallUnsafeReceiver01 call UnsafeReceiver01");
        Intent intent = new Intent();
        intent.setPackage("com.juzhen.securitydemo");
        intent.setAction("securitydemo.unsafereceiver01");
        context.sendBroadcast(intent);
    }
}
