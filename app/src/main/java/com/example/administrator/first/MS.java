package com.example.administrator.first;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MS extends Service {
    public MS() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
         super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }
}
