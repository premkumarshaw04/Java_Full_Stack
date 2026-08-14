//Find the biggest element in the array
//1St Approach
package com.jspiders.arrays;

public class Question3a {
	public static void main(String[] args) {
		int a[] = {10,20,50,30};
		int big = a[0];
		for(int i = 1;i<=a.length-1;i++) {
			if(a[i] > big) big = a[i];
		}
		System.out.println(big);
	}
}
