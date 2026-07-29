//Question 2. Find the smallest number among four numbers.

package com.jspiders.numbers;

public class Question2 {
	public static void main(String[] args) {
		int a = 20, b = 5, c = 30, d = 40;
		int small = a;
		if(b < small) small = b;
		if(c < small) small = c;
		if(d < small) small = d;
		System.out.println(small);
	}
}
