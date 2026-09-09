//Write a Program to print n to 1 values using Recursion.
// n = 4 
//o/p: 4,3,2,1

package com.jspiders.recursion;

public class Question3 {
	public static void main(String[] args) {
		int n = 4;
		print(n);
	}
	private static void print(int n) {
		if(n == 0) return;//Base Condition
		
		System.out.println(n);
		
		print(--n);
	}
	
}
