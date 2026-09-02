//Ouestion 1: Create any list type collection and add String type data,
//iterate all the elements in forward and backward direction.


package com.jspiders.intervieQuestions;
import java.util.*;

public class Question1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Virat");
		al.add("MSD");
		al.add("Rohit");
		al.add("Raina");
		al.add("Jadeja");
		al.add("Rohit"); //List accepts duplicate values also
		
		System.out.println("Forward Direction");
		for(int i = 0;i<al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
		
		System.out.println("Backward Direction");
		for(int i = al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
	}
}

//Output:

//Forward Direction
//Virat
//MSD
//Rohit
//Raina
//Jadeja
//
//Backward Direction
//Rohit
//Jadeja
//Raina
//Rohit
//MSD
//Virat