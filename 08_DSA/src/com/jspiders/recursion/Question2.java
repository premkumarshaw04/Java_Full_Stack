//Question2 : WAP to print "Hi", 4 times using recursion.
package com.jspiders.recursion;

public class Question2 {
	public static void main(String[] args) {
		int n = 4;
		print(n);
	}
	public static void print(int n) {
		if(n == 0) return; //Base Condition
		
		System.out.println("Hi");
		print(n-1);//function call(Recusrion)
	}
}
