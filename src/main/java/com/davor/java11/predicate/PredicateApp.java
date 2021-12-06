package com.davor.java11.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateApp {

    private static List<String> methodNotPredicate() {
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");

        return sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        methodNotPredicate();
    }
}
