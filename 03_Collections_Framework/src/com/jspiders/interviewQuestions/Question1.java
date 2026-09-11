//Question1: Create an ArrayList and add 3 Student objects and sort them based on name in ascending order.
//But if the names are same, then sort them based on marks.

package com.jspiders.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;
	int marks;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return name+ " - " + marks;
	}
}

//+++++++++++++++++++++++++++++++++++++++++++++++++

class Name implements Comparator<Student>{
	
	@Override 
	public int compare(Student o1, Student o2) {
		int result = o1.name.compareTo(o2.name);
		
		//If the names are same, it sorts by marks
		if(result == 0) {
			return o1.marks - o2.marks;
		}
		
		return result;
	}
}

//+++++++++++++++++++++++++++++++++++++++++++++++++

public class Question1{
	public static void main(String[] args) {
		Student s1 = new Student("Rahul", 80);
		Student s2 = new Student("Arpita", 100);
		Student s3 = new Student("Rahul", 95);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Collections.sort(al, new Name());
		
		for(Student s: al) {
			System.out.println(s);
		}
	}
}
