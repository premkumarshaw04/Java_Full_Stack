package com.jspiders.passingAndReturning;

import java.util.Scanner;

public class BikeUtility {
	static void showBikeDetails(Bike b) {
		if(b != null) {
			System.out.println("CC: "+ b.cc);
			System.out.println("Mileage: " + b.mileage);
		}
	}
	
	static Bike createBike() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter CC: ");
		int cc = sc.nextInt();
		System.out.println("Enter Mileage: ");
		double mileage = sc.nextDouble();
		
		Bike b = new Bike(cc, mileage);//Creating the object
		return b;//returning the object
	}
}


//MainClass2