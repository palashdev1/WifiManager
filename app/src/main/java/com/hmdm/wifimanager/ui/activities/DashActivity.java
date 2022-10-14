package com.hmdm.wifimanager.ui.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;

import com.hmdm.wifimanager.R;

import java.util.List;

public class DashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
        /*WifiConfiguration wifiConf = null;
        @SuppressLint("WifiManagerLeak") WifiManager wifiManager = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        List<WifiConfiguration> configuredNetworks = wifiManager.getConfiguredNetworks();
        for (WifiConfiguration conf : configuredNetworks){
            if (conf.networkId == connectionInfo.getNetworkId()){
                wifiConf = conf;
                Log.d("MyTags", conf.toString());
                break;
            }
        }*/

        Context context = this.getApplicationContext();
        WifiManager wm = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        String ip = Formatter.formatIpAddress(wm.getConnectionInfo().getIpAddress());
        //String speed = Formatter.formatIpAddress(wm.getConnectionInfo().getLinkSpeed());
        //Log.d("MyTags", speed.toString());
    }
}