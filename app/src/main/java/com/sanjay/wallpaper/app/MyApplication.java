package com.sanjay.wallpaper.app;

import android.app.Application;
import android.content.Context;


import com.sanjay.wallpaper.utils.ConnectivityReceiver;
import com.sanjay.wallpaper.utils.SessionManager;
import com.snatik.storage.Storage;


public class MyApplication extends Application {

    private static MyApplication instance;

    public MyApplication() {
        instance = this;
    }

    public static synchronized MyApplication getInstance() {
        return instance;
    }
    public static Context getContext() {
        return instance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }

    public static SessionManager session;
    @Override
    public void onCreate() {
        super.onCreate();
        // init
        Storage storage = new Storage(getApplicationContext());
        session = new SessionManager(this);




//        if (LeakCanary.isInAnalyzerProcess(this)) {
//            // This process is dedicated to LeakCanary for heap analysis.
//            // You should not init your app in this process.
//            return;
//        }
//        LeakCanary.install(this);
//        // Normal app init code...

    }

}
