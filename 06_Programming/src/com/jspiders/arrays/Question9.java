//WAP to find the missing element in the array.

package com.jspiders.arrays;

public class Question9 {
	public static void main(String[] args) {
		int a[] = {2,5,1,0,3};
		int n = a.length;
		//Natural Sum
		int natSum = n*(n+1)/2;//for this formula to work properly, the array elements should start from 0
		int sum = 0;
		for(int i = 0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		System.out.println(natSum - sum);//Missing element is 4
	}
}
