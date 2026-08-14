//Find the biggest element in the array
//3rd Approach : Using Stream API
package com.jspiders.arrays;

import java.util.Arrays;

public class Question3c {
	public static void main(String[] args) {
		int a[] = {10,20,50,30};
		
		System.out.println(Arrays.stream(a).max().getAsInt());
//		Arrays.stream(a) => iterating on the a array using the stream method
	}
}
