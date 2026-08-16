//Find the smallest Elements present in array.
package com.jspiders.arrays;

public class Question4a {
	public static void main(String[] args) {
		int arr[] = {20,10,50,30};
		int small = arr[0];
		for(int i = 1;i<=arr.length-1;i++) {
			if(arr[i] < small) small = arr[i];
			
			//another way
//			small = Math.min(small, arr[i]);
		}
		System.out.println(small);
	}
}
