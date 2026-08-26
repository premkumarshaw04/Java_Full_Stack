//Question 1: WAP to print vowels present in a String.

//indexOf() method returns -1 if that particular character is not present in the String.
package com.jspiders.strings;

public class Question1 {
	public static void main(String[] args) {
		String s = "abcDEF";
		for(int i = 0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);//Taking each character one by one
			if(("aeiouAEIOU").indexOf(ch)!=-1) {
				System.out.println(ch);
			}
		}
	}
}
