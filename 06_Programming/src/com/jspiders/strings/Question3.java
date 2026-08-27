//Count how many consonants and vowels are present in a String.

//These are the two static methods present in character class:
//boolean isAlphabetic(char)
//boolean isDigit(char)


package com.jspiders.strings;

public class Question3 {
	public static void main(String[] args) {
		String s = "abcDE";
		int cc = 0, vc = 0;
		s = s.toLowerCase();
		
		for(int i = 0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) { //if the character is an alphabet
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
		}
		System.out.println("No of Consonants: "+cc);
		System.out.println("No of Vowels: "+vc);
	}
}
