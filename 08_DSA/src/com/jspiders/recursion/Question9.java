//Print the array elements in backward direction using recursion.
package com.jspiders.recursion;

public class Question9 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int i = a.length-1;
		print(a, i);
	}
	private static void print(int a[], int i) {
		if(i < 0) return;
		
		System.out.println(a[i]);
		print(a, i-1);
	}
}
