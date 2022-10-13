package com.hmdm.wifimanager;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import static android.net.wifi.WifiManager.WIFI_STATE_DISABLED;
import static android.net.wifi.WifiManager.WIFI_STATE_DISABLING;
import static android.net.wifi.WifiManager.WIFI_STATE_ENABLED;
import static android.net.wifi.WifiManager.WIFI_STATE_ENABLING;
import static android.net.wifi.WifiManager.WIFI_STATE_UNKNOWN;

public class Utils {
        public static String getSSIDWithoutQuotes(String ssid) {
        if (ssid != null && ssid.length() > 2 && ssid.charAt(0) == '"' && ssid.charAt(ssid.length() - 1) == '"')
            return ssid.substring(1, ssid.length() - 1);

        return ssid;
    }

    public static void hideKeyboardFrom(Context context, View view) {
        if (context != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
            if (inputMethodManager != null)
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static String formatWiFiState(int state) {
        switch (state) {
            case WIFI_STATE_DISABLING:
                return "WIFI_STATE_DISABLING";
            case WIFI_STATE_DISABLED:
                return "WIFI_STATE_DISABLED";
            case WIFI_STATE_ENABLING:
                return "WIFI_STATE_ENABLING";
            case WIFI_STATE_ENABLED:
                return "WIFI_STATE_ENABLED";
            case WIFI_STATE_UNKNOWN:
                return "WIFI_STATE_UNKNOWN";
            default:
                return String.valueOf(state);
        }
    }
}
