package com.davor.java11.collection;

import java.util.Arrays;
import java.util.List;

public class CollectionToArrayApp {

    private static String[] method1() {
        List<String> sampleList = Arrays.asList("Java", "Python");
        String[] sampleArray = sampleList.toArray(String[]::new);

        return sampleArray;
    }

    public static void main(String[] args) {
        method1();
    }
}
