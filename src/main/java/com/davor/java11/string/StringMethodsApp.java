package com.davor.java11.string;

import java.util.List;
import java.util.stream.Collectors;

public class StringMethodsApp {

    public static List<String> method1() {
        String string1 = "  Baeldung helps \n \n    developers \n explore Java.   ";

        return string1.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        method1();
    }
}
