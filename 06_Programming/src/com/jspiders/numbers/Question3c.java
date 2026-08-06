//Question 3: Check the number is even or odd.
//c.check using Switch case statement

package com.jspiders.numbers;

public class Question3c {
	public static void main(String[] args) {
		int n = 13;
		
		switch(n%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
	}
}
