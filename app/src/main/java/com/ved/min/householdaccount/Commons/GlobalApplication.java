package com.ved.min.householdaccount.Commons;

import android.app.Application;
import android.os.Handler;
import android.util.Log;

public class GlobalApplication extends Application {

    final String TAG = "APP";

    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "Application on created.");
    }
}
