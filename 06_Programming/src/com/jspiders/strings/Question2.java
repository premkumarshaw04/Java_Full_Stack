//Write a program to count Alphabets, digits and special characters present in a String.

//ASCII value: [A-Z] => [65 - 90]
//ASCII value: [A-Z] => [97 - 122]
//ASCII value: [0-9] => [48 - 57]

package com.jspiders.strings;

public class Question2 {
	public static void main(String[] args) {
		String s = "abc@#123";
		int ac = 0, dc = 0, sc = 0;
		for(int i = 0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z')) {
				ac++;
			}
			else if(ch >= '0' && ch <= '9') {
				dc++;
			}
			else {
				sc++;
			}
		}
		System.out.println("No of Alphabets: " + ac);
		System.out.println("No of Digits: " + dc);
		System.out.println("No of Special Characters: " + sc);
	}
}
