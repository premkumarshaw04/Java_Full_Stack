//Approach 1: Using Loops
package com.jspiders.binarySearch;

public class BinarySearch1 {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80};
		int target = 60;
		int index = binarySearch(a, target);
		
		if(index == -1) System.out.println("Not Found....");
		else System.out.println("Found in "+index+" index");
	}

	private static int binarySearch(int[] a, int target) {
		int low = 0, high = a.length-1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(target == a[mid]) return mid;
			else if(target > a[mid]) low = mid+1;
			else high = mid-1; //target < a[mid]
		}
		
		return -1;
	}
}


//+++++++++++++++++++++++++++++++++++++++++++++++++++++
//Recommended Improvement (Integer Overflow Prevention)
//In Java, calculating mid using (low + high) / 2 can cause 32-bit signed integer overflow if 
//the sum of low and high exceeds 2,147,483,647 (relevant for very large arrays with billions of elements).
//
//To make it production-grade, update that line to:
//int mid = low + (high - low) / 2;