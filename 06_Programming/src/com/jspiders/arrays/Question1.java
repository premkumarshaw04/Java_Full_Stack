//Write a program to print the even elements of the array.
package com.jspiders.arrays;

public class Question1 {
	public static void main(String[] args) {
		int a[] = {10,15,20,25,30};
		for(int i = 0;i<=a.length-1;i++) {
			if(a[i]%2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
