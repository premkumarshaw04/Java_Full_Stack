//Write a program to print 1 to n values using recursion.
//i/p : 4
//o/p: 1,2,3,4

//Back Tracking Approach
package com.jspiders.recursion;

public class Question4 {
	public static void main(String[] args) {
		int n = 4;
		print(n);
	}
	public static void print(int n) {
		if(n == 0) return;
		
		print(n-1);
		
		System.out.println(n);
	}
}
