//Find the biggest element in the array
//2nd Approach : Using Sort Method
package com.jspiders.arrays;

import java.util.Arrays;

public class Question3b {
	public static void main(String[] args) {
		int a[] = {10,20,50,30};
		Arrays.sort(a);//Sorting the Array
		
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a));//printing the Array
		
		System.out.println(a[a.length-1]);//Printing the biggest Element
	}
}
