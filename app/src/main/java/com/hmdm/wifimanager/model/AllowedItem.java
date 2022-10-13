package com.hmdm.wifimanager.model;

public class AllowedItem {
       public String ssid;
       public String bssid;
       public String password;
       public boolean wrong = false;

    public AllowedItem() {}

    public AllowedItem(String ssid, String bssid, String password) {
        this.ssid = ssid;
        this.bssid = bssid;
        this.password = password;
    }
}
