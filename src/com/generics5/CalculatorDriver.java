package com.generics5;


public class CalculatorDriver {

    public static void main(String[] args) {

        NumericCalculator<Integer> calculator1 =
                new NumericCalculator<>(10);

        NumericCalculator<Double> calculator2 =
                new NumericCalculator<>(12.5);

        NumericCalculator<Float> calculator3 =
                new NumericCalculator<>(5.5f);

        calculator1.display();

        System.out.println();

        calculator2.display();

        System.out.println();

        calculator3.display();

        // This will cause a compilation error:
        // NumericCalculator<String> calculator4 =
        //         new NumericCalculator<>("Java");
    }
}
