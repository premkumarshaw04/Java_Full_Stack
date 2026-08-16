//Find the smallest Elements present in array.
//Approach 2: Using Sort method
package com.jspiders.arrays;

import java.util.Arrays;

public class Question4b {
	public static void main(String[] args) {
		int arr[] = {20,10,50,30};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //Printing the array.
		System.out.println(arr[0]);
		
		
		//Another way is Using Stream API
//		System.out.println(Arrays.stream(arr).min().getAsInt());
	}
}
