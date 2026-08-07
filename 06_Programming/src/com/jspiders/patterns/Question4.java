package com.jspiders.patterns;

public class Question4 {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.print((i%2)+" ");
			}
			System.out.println();
		}
	}
}
//When row is odd print 1
//when row is even print 0
//output:

//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
//0 0 0 0 0 
//1 1 1 1 1 
 