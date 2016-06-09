package com.myapps.stockhawk.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.myapps.stockhawk.R;
import com.myapps.stockhawk.ui.MyStocksActivity;

/**
 * Created by hemal on 26/4/16.
 */
public class NoStockFoundBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, context.getString(R.string.not_found),Toast.LENGTH_SHORT).show();
    }
}
