package com.jspiders.strings;

//Approach : 1 | Not Recommended +++++++++++++++++++++++++++++++++++++++++++

//public class Question5Important {
//	public static void main(String[] args) {
//		String s = "Naman";
//		s = s.toLowerCase();
//		if(s.equals(reverse(s))) System.out.println("Palindrome");
//		else System.out.println("Not Palindrome");
//	}
//
//	public static String reverse(String s) {
//		String rev = "";
//		for(int i = s.length()-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}
//		return rev;
//	}
//}


//Approach : 2 | BEST APPROACH +++++++++++++++++++++++++++++++++++++++++++++

public class Question5Important {
	public static void main(String[] args) {
		String s = "Naman";
		s = s.toLowerCase();
		if(isPalindrome(s)) System.out.println("Palindrome");
		else System.out.println("Not Palindrome");
	}

	private static boolean isPalindrome(String s) {
		int i = 0, j = s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
}

//Approach : 3 +++++++++++++++++++++++++++++++++++++++++++++

//public class Question5Important {
//	public static void main(String[] args) {
//		String s = "Naman";
//		s = s.toLowerCase();
//		if(isPalindrome(s)) System.out.println("Palindrome");
//		else System.out.println("Not Palindrome");
//	}
//
//	private static boolean isPalindrome(String s) {
//		return s.equals(new StringBuffer(s).reverse().toString());
//	}
//	
//}
