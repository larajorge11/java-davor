package com.davor.java11.var;

import java.util.HashMap;
import java.util.Map;

public class VarApp {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        var mapLocal = new HashMap<String, String>();

        mapLocal.put("key1", "Davor");
    }
}
