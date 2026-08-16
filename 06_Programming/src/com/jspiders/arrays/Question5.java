//Print the prime elements present in the arrays.
package com.jspiders.arrays;

public class Question5 {
	public static void main(String[] args) {
		int arr[] = {2,4,5,8,9,7,13};
		for(int i = 0;i<=arr.length-1;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2;i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
