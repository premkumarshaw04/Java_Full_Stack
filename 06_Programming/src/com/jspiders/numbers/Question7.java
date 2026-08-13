//Find the factors or the divisors for the given numbers.

//For every number factor starts from 1 always.
//The number itself is the last factor for every number.

//Approach 1 : Not recommended
//package com.jspiders.numbers;
//public class Question7 {
//	public static void main(String[] args) {
//		int n = 50;
//		for(int i =1;i<=n;i++) {
//			if(n % i == 0) {
//				System.out.println(i);
//			}
//		}
//	}
//}

//++++++++++++++++++++++++++++++++++++++++++++++++

//Approach 2 : Best Approach 
package com.jspiders.numbers;
public class Question7 {
	public static void main(String[] args) {
		int n = 20;
		for(int i =1;i<=n/2;i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);//for the numeber itself.
	}
}
