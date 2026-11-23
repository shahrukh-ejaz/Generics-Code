package com.generics4;


public class DataDriver {

    public static void main(String[] args) {

        DataUtility utility = new DataUtility();

        String city = utility.getData("Bangalore");
        Integer pinCode = utility.getData(560001);

        System.out.println("Returned City: " + city);
        System.out.println("Returned PIN: " + pinCode);

        System.out.println();

        utility.displayData("Order ID", 501);
        utility.displayData("Payment Amount", 2499.50);
    }
}
