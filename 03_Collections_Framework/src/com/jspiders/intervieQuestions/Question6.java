//Question 6: Sort the elements in Descending Order.

package com.jspiders.intervieQuestions;

import java.util.*;
public class Question6 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet(Collections.reverseOrder());
		t1.add(10);
		t1.add(1);
		t1.add(32);
		t1.add(4);
		t1.add(54);
		for(Object o1: t1) {
			System.out.println(o1);
		}
		
		System.out.println("========================");
		//descendingSet will give the opposite of the previous ArrayList order
		for(Object o2:t1.descendingSet()) {
			System.out.println(o2);
		}
	}
}
