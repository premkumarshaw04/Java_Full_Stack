//Question2 : Create a Collection which maintains Unique Data and
// i. Print the elements, here Order not necessary.
// ii. Print the elements, here Order is necessary.

package com.jspiders.intervieQuestions;
import java.util.*;

public class Question2 {
	public static void main(String[] args) {
		//i. Print the elements, here Order not necessary.
		HashSet h1 = new HashSet();//Set will not accept Duplicate data.
		h1.add("Virat");
		h1.add("Rohit");
		h1.add("Virat");
		h1.add("MSD");
		//for each loop:
		for(Object o1: h1) {
			System.out.println(o1);
		}
		
		System.out.println("=========================");
		
		
	}
}
