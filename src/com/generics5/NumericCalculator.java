package com.generics5;


public class NumericCalculator<T extends Number> {

    private T number;

    public NumericCalculator(T number) {
        this.number = number;
    }

    public double calculateSquare() {

        double value = number.doubleValue();

        return value * value;
    }

    public void display() {

        System.out.println("Number: " + number);

        System.out.println("Square: " + calculateSquare());
    }
}
