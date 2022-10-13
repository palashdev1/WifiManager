package com.hmdm.wifimanager.model;

import java.util.ArrayList;

public class MDMConfig {
    public boolean allAllowed;
    public boolean freeAllowed;
    public ArrayList<AllowedItem> allowed;

    public MDMConfig() {
        allAllowed = true;
        freeAllowed = true;
        allowed = new ArrayList<>();
    }
}
