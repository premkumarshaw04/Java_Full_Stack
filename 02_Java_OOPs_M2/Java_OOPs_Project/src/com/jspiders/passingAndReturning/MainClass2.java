package com.jspiders.passingAndReturning;

public class MainClass2 {
	public static void main(String[] args) {
		Bike b1 = BikeUtility.createBike();
		BikeUtility.showBikeDetails(b1);
		System.out.println("--------------------");
		Bike b2 = BikeUtility.createBike();
		BikeUtility.showBikeDetails(b2);
		System.out.println("--------------------");
		Bike b3 = BikeUtility.createBike();
		BikeUtility.showBikeDetails(b3);
	}
}
//Output: 
//Enter CC: 
//350
//Enter Mileage: 
//14
//CC: 350
//Mileage: 14.0
//--------------------
//Enter CC: 
//450
//Enter Mileage: 
//10
//CC: 450
//Mileage: 10.0
//--------------------
//Enter CC: 
//440
//Enter Mileage: 
//25
//CC: 440
//Mileage: 25.0
