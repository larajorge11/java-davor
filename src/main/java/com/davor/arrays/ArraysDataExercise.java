package com.davor.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysDataExercise {

    private static Scanner scanner = new Scanner(System.in);

    private static Integer[] sortIntegers(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
        return array;
    }

    private static void printArray(Integer[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Array Element: " + i + " Value: " + array[i]);
        }
    }

    private static Integer[] getIntegers(int number) {
        System.out.println("Please insert number ");
        Integer[] value = new Integer[number];
        for (int i=0; i<value.length; i++) {
            value[i] = scanner.nextInt();
        }

        return value;
    }

    public static void main(String[] args) {
        //Integer[] arrayData = {106, 26, 81, 5, 15};
        Integer[] arrayData = getIntegers(5);
        Integer[] arrayDataSort = sortIntegers(arrayData);
        printArray(arrayDataSort);
    }
}
