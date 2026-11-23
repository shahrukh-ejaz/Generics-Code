package com.generics2;


public class ProductDriver {

    public static void main(String[] args) {

        ProductInfo<String, Double> product1 =
                new ProductInfo<>("Laptop", 65000.50);

        ProductInfo<String, Integer> product2 =
                new ProductInfo<>("Keyboard", 1500);

        product1.display();

        System.out.println();

        product2.display();
    }
}
