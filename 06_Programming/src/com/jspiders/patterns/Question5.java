package com.jspiders.patterns;

public class Question5 {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print((j%2)+" ");
			}
			System.out.println();
		}
	}
}
//When column is odd print 1
//when column is even print 0
//output:

//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 
//1 0 1 0 1 