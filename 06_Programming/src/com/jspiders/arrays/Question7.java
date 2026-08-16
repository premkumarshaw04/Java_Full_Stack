//Swapping two numbers:
package com.jspiders.arrays;

public class Question7 {
	public static void main(String[] args) {
		//Swap two numbers using temp variable===
//		int a = 10;
//		int b = 20;
//		int temp;
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println(a);//20
//		System.out.println(b);//10
		//========================================
		
		//Without using temp varaible=============
//		int a = 10;
//		int b = 20;
//		a = a+b;
//		b = a-b;
//		a = a-b;
//		
//		System.out.println(a);//20
//		System.out.println(b);//10
		//========================================
		
		//Without Using temp variable and Arithmatic Operation
		int a = 10;
		int b = 20;
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a);//20
		System.out.println(b);//10
	}
}
