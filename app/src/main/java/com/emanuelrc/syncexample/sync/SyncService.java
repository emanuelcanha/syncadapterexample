package com.emanuelrc.syncexample.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by emanuelcanha on 03/08/15.
 */
public class SyncService extends Service {
    private static final Object sSyncAdapterLock = new Object();
    private static SyncAdapter sGDriveSyncAdapter = null;

    @Override
    public void onCreate() {
        synchronized (sSyncAdapterLock) {
            if (sGDriveSyncAdapter == null) {
                sGDriveSyncAdapter = new SyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return sGDriveSyncAdapter.getSyncAdapterBinder();
    }
}
