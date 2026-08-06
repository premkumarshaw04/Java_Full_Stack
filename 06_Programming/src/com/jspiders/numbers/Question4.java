//Question 4: Check the given year is leap year or not.
package com.jspiders.numbers;

public class Question4 {
	public static void main(String[] args) {
		int y = 2024;
		if(y%4==0 && y%100!=0) System.out.println("Leap Year");
		else if(y%400 == 0) System.out.println("Leap Year");
		else System.out.println("Not a Leap Year");
	}
}
