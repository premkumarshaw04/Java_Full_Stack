//Print the Array Elements using recursion.
package com.jspiders.recursion;

public class Question8 {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int i = 0;
		print(a, i);
	}
	private static void print(int[] a, int i) {
		if(i > a.length-1) return;
		
		System.out.println(a[i]);
		
		print(a, i+1);
	}
}
