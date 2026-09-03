//Question 5: Sort the elements in Ascending and descending keeping the duplicates.

package com.jspiders.intervieQuestions;

import java.util.ArrayList; //or import java.util.*;
import java.util.Collections;

public class Question5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Red");
		al.add("Yellow");
		al.add("Red");
		al.add("Green");
		al.add("Blue");
		al.add("Orange");
		Collections.sort(al);
		
		System.out.println("Ascending Order");
		for(Object o1:al) {
			System.out.println(o1);
		}
		
		System.out.println("====================================");
		
		System.out.println("Descending Order");
		Collections.sort(al,Collections.reverseOrder());
		for(Object o2: al) {
			System.out.println(o2);
		}
		
	}
}

//Output:
//Ascending Order
//Blue
//Green
//Orange
//Red
//Red
//Yellow
//====================================
//Descending Order
//Yellow
//Red
//Red
//Orange
//Green
//Blue
