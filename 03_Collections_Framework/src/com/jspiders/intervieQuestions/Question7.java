//Question 7: Sort ArrayList in descending order while removing the duplicates.

package com.jspiders.intervieQuestions;
import java.util.*;

public class Question7 {
	public static void main(String[] args) {
		
		//Solution 1-----------------------------------
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Red");
//		al.add("Yellow");
//		al.add("Red");
//		al.add("Green");
//		al.add("Blue");
//		al.add("Orange");
//		System.out.println("Descending Order");
//		
//		Collections.sort(al, Collections.reverseOrder());
//		
//		LinkedHashSet l1 = new LinkedHashSet(al);
//		for(Object o1: l1) {
//			System.out.println(o1);
//		}
		
		
		//Solution 2-----------------------------------
		ArrayList al = new ArrayList();
		al.add("Red");
		al.add("Yellow");
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Orange");
		System.out.println("Descending Order");
		
		TreeSet t1 = new TreeSet(Collections.reverseOrder());
		t1.addAll(al);
		
		for(Object o1:t1) {
			System.out.println(o1);
		}
		
	}
}

//Output:
//Descending Order
//Yellow
//Red
//Orange
//Green
//Blue
