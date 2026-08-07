package com.jspiders.patterns;

public class Question6 {
	public static void main(String[] args) {
		int x = 1;
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.printf("%3d",x);
				//we are taking 3 digit space to print every number
				x++;
			}
			System.out.println();
		}
	}
}

//output:

//1  2  3  4  5
//6  7  8  9 10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25