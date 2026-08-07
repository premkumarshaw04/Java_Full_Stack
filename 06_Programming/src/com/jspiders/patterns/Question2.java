package com.jspiders.patterns;

public class Question2 {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
//row wise printing same values.
//output:

//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 
 