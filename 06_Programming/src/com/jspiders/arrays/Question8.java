//Reverse the given Array without extra space.
package com.jspiders.arrays;

import java.util.Arrays;

public class Question8 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(reverse(arr)));
	}
	
	public static int[] reverse(int arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}
}
