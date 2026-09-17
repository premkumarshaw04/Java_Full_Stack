//Time Complexity: O(n^2)
package com.jspiders.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = {5,4,1,2};
		for(int i = 0;i<=a.length-1;i++) {
			//assuming current index as a min index element
			int min_ind = i;
			//to find Smallest elements index
			for(int j = i+1;j<=a.length-1;j++) {
				if(a[j] < a[min_ind]) {
					min_ind = j;
				}
			}
			
			//Swapping smallest element and curr element
			int temp = a[min_ind];
			a[min_ind] = a[i];
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
