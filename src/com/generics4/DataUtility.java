package com.generics4;


public class DataUtility {

    // Generic method with return type
    public <T> T getData(T value) {
        return value;
    }

    // Generic method with two different parameters
    public <T, U> void displayData(T first, U second) {

        System.out.println("First Data: " + first);
        System.out.println("Second Data: " + second);
    }
}
