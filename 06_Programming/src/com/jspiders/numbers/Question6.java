//Sum of all odd numbers from 1 to 50.
package com.jspiders.numbers;

public class Question6 {
	public static void main(String[] args) {
		int sum = 0;
		//Way 1 : 50 iterations
//		for(int i = 1;i<=50;i++) {
//			if(i%2!=0) sum = sum+i;
//		}
//		System.out.println(sum);
		
		//Way 2: 25 (n/2) iterations only
		for(int i = 1;i<=50;i+=2) {
			if(i%2!=0) sum = sum+i;
		}
		System.out.println(sum);
	}
}

