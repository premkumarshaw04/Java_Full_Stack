package com.jspiders.patterns;

public class Question3 {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
//column wise printing same values.
//output:

//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5
 