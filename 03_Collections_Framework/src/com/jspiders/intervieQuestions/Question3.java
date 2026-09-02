//Question3: Print the element of set in Forward and backward direction.

package com.jspiders.intervieQuestions;
import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		//For Printing in Forward Direction
		HashSet h1 = new HashSet();
		h1.add("Virat");
		h1.add("Rohit");
		h1.add("Virat");
		h1.add("MSD");
		
		for(Object o1:h1) {
			System.out.println(o1);
		}
		
		System.out.println("====================");
		
		//For Printing in Backward Direction 
		//Convert HashSet into ArrayList
		ArrayList al = new ArrayList(h1);
		for(int i = al.size()-1;i>=0;i--) {
			System.out.println(al.get(i));
		}
	}
}

//Output:
//Rohit
//Virat
//MSD
//====================
//MSD
//Virat
//Rohit