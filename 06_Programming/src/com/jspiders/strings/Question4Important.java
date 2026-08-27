//Define a method to reverse the given String.


//APPROACH-1 | NOT RECOMMENDED ++++++++++++++++++++++++++++++++
//package com.jspiders.strings;
//public class Question4Important {
//	public static void main(String[] args) {
//		String s = "abcd";
//		System.out.println(reverse(s));
//	}
//
//	private static String reverse(String s) {
//		String rev = "";
//		for(int i = s.length()-1;i>=0;i--) {
//			char ch = s.charAt(i);
//			rev = rev + ch;
//		}
//		return rev;
//	}
//}



//APPROACH-2 | [Best Approach] RECOMMENDED ++++++++++++++++++++++++++++++++

/*
String is immutable in Nature, So we can not change it or we can not perform
swap operation, So first convert the String into Character Array.
Then perform the Operation
and then again after Operation convert the character Array into String again.
*/

package com.jspiders.strings;
public class Question4Important{
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(reverse(s));
	}
	private static String reverse(String s) {
		//Converting String into Char
		char ch[] = s.toCharArray();
		
		//Reversing Operation
		int i = 0, j = ch.length-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		//Again Converting from character array to String, by calling String Class Constructor
		return new String(ch);
	}
}



//APPROACH-3| NOT RECOMMENDED +++++++++++++++++++++++++++++++++++

/*There is no Direct reverse() method in String Class. But we have reverse 
method in String Buffere and String Builder class 

Steps:
1. Convert String into String Buffer
2. Perform reverse Operation
3. Convert the reversed String Buffer into String.
*/


//package com.jspiders.strings;
//public class Question4Important{
//	public static void main(String[] args) {
//		String s = "abcde";
//		System.out.println(reverse(s));
//	}
//	private static String reverse(String s) {
//		return new StringBuffer(s).reverse().toString();
//	}
//}
