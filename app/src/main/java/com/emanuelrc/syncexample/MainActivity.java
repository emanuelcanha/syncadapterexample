package com.emanuelrc.syncexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.emanuelrc.syncexample.sync.SyncAdapter;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SyncAdapter.initializeSyncAdapter(this);
    }

    public void onSyncClicked (View v) {
        SyncAdapter.syncImmediately(this);
    }
}
