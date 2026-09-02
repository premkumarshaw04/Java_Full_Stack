//Question 4: Create a collection which sorts the data.
//descendingSet() method will just give the output in reverse, we are
//not sorting in descending order, we are just printing.

package com.jspiders.intervieQuestions;
import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add("Virat");
		t1.add("Rohit");
		t1.add("Virat");
		t1.add("MSD");
		System.out.println("Ascending Order.....");
		for(Object o1: t1) {
			System.out.println(o1);
		}
		
		System.out.println("=======================");
		
		System.out.println("Descending Order.....");
		for(Object o1:t1.descendingSet()) {
			System.out.println(o1);
		}
	}
}

//Output:
//Ascending Order.....
//MSD
//Rohit
//Virat
//=======================
//Descending Order.....
//Virat
//Rohit
//MSD
