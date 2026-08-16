//Count how many Palindrome elements present in the array.
package com.jspiders.arrays;

public class Question6 {
	public static void main(String[] args) {
		int arr[] = {23,44,97,88,36,22};
		int count = 0;
		for(int i = 0;i<=arr.length-1;i++) {
			if(isPalindrome(arr[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPalindrome(int n) {
		int rev = 0;
		int temp = n;
		while(n > 0) {
			int digit = n%10;
			rev = rev*10+digit;
			n = n/10;
		}
		return rev == temp;
	}
}
