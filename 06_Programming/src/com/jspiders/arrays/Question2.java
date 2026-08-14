//Sum of Odd elements of Array

package com.jspiders.arrays;

public class Question2 {
	public static void main(String[] args) {
		int a[] = {10,20,33,40,45};
		int sum = 0;
		for(int i = 0;i<=a.length-1;i++) {
			if(a[i] % 2 != 0) {
				sum = sum + a[i];
			}
		}
		System.out.println(sum);
	}
}
