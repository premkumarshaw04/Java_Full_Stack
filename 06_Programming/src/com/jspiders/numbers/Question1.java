//Question 1. Find the biggest number among three numbers.

package com.jspiders.numbers;

public class Question1 {
	public static void main(String[] args) {
		int a = 20, b = 50, c = 30;
		int big = a;
		if(b > big) big = b;
		if(c > big) big = c;
		System.out.println(big);
	}
}
