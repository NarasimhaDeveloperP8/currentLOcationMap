package com.example.currentlocationmap.Services.BodcastReciverEx;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class BrodCastReciverClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Toast.makeText(context,"Boot Completed",Toast.LENGTH_LONG).show();
        }
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){

            Toast.makeText(context,"Connectivity Change",Toast.LENGTH_LONG).show();
        }

    }
}
