//Write a program to print the sum of first n natural number.

package com.jspiders.recursion;

public class Question5 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println(sum(n));
	}
	private static int sum(int n) {
		if(n == 0) return 0;//base condition
		
		return n+sum(n-1);
	}
}
