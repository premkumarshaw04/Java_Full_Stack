//Question 5: WAP to print all even numbers present in between 1 to 100.

package com.jspiders.numbers;

public class Question5 {
	public static void main(String[] args) {
		//Way 1 || There will be 100 iterations
//		for(int i = 1;i<=100;i++) {
//			if(i%2 == 0) System.out.println(i);
//		}
		
		//Way 2 | here only 50 iterations
		for(int i = 2;i<=100;i+=2) {
			if(i%2==0) System.out.println(i);
		}
	}
}
