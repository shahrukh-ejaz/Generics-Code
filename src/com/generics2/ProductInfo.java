package com.generics2;


public class ProductInfo<T, U> {

    private T productName;
    private U productPrice;

    public ProductInfo(T productName, U productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public T getProductName() {
        return productName;
    }

    public U getProductPrice() {
        return productPrice;
    }

    public void display() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + productPrice);
    }
}
