//Write a program to print the factors or Divisors for the given number using recursion.
//i/p : 10
//o/p : 1,2,5,10

package com.jspiders.recursion;

public class Question10 {
	public static void main(String[] args) {
		int n = 10;
		int i = 1;
		printFactors(n, i);
	}
	private static void printFactors(int n, int i) {
		if(i > n/2) { //Base Condition
			System.out.println(n);
			return;
		}
		
		if(n%i == 0) System.out.println(i);
		
		printFactors(n, i+1);
	}
}
