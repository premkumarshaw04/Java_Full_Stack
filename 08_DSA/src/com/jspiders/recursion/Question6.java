//Write a program to find the factorial of a number using recursion.
package com.jspiders.recursion;

public class Question6 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(factorial(n));
	}
	private static int factorial(int n) {
		if(n == 1 || n == 0) return 1; //Base Condition
		
		return n * factorial(n-1);
	}
}
