package com.davor.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysData {

    private static Scanner scanner = new Scanner(System.in);

    public static void createArray() {
        int[] myIntArray = new int[10];
        myIntArray[5] = 100;
        System.out.println(myIntArray[5]);
        printArray(myIntArray);
    }

    public static void createArray2() {
        int[] myIntArray = {1,2,3,4,5,6,7,8,9,20};
        System.out.println(myIntArray[5]);
        printArray(myIntArray);
    }

    public static void createArrayScanner() {
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + "integers");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(i + " " + array[i]);
        }
    }

    public static void main(String[]args) {
        createArray();
        createArray2();
        createArrayScanner();
    }
}
