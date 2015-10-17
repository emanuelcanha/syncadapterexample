package com.emanuelrc.syncexample.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by emanuelcanha on 03/08/15.
 */
public class AuthenticatorService extends Service {
   private Authenticator authenticator;

    @Override
    public void onCreate() {
        authenticator = new Authenticator(this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return authenticator.getIBinder();
    }
}
