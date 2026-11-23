package com.generics1;

public class StorageDriver {
	
	public static void main(String[] args) {
		
		Storage<String> nameStorage = new Storage<>();
		nameStorage.store("JAVA Programming");
		
		Storage<Integer> numberStorage = new Storage<>();
		numberStorage.store(500);
		
		Storage<Double> priceStorage = new Storage<>();
	    priceStorage.store(2499.50);

	    System.out.println("Stored Name: " + nameStorage.retrieve());

	    System.out.println("Stored Number: " + numberStorage.retrieve());

	    System.out.println("Stored Price: " + priceStorage.retrieve());
		
	}

}
