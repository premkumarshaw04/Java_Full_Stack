//find n^p using recursion.
package com.jspiders.recursion;

public class Question7 {
	public static void main(String[] args) {
		int n = 2, p = 4;
		System.out.println(power(n,p));
	}
	
	private static int power(int n, int p) {
		if(p == 0) return 1;
		
		return n * power(n, p-1);
	}
}
