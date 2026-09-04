//Question9: Sort Laptop Object based on Price in Ascending Order.
//Options: You can use ArrayList and TreeSet.

//Second Approach : Using TreeSet
package com.jspiders.intervieQuestions;

import java.util.TreeSet;

public class Question9a {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell", 55000);
        Laptop l2 = new Laptop("HP", 45000);
        Laptop l3 = new Laptop("Lenovo", 65000);
        Laptop l4 = new Laptop("Asus", 40000);
        Laptop l5 = new Laptop("Acer", 50000);

        TreeSet<Laptop> ts = new TreeSet<Laptop>();

        ts.add(l1);
        ts.add(l2);
        ts.add(l3);
        ts.add(l4);
        ts.add(l5);

        for (Laptop l : ts) {
            System.out.println(l);
        }
    }
}
//Output:
//Asus 40000.0
//HP 45000.0
//Acer 50000.0
//Dell 55000.0
//Lenovo 65000.0


//No Collections.sort() needed.
//TreeSet automatically uses: compareTo() to maintain the sorted order.


//TreeSet uses compareTo() not only for sorting, but also to determine 
//whether two objects are considered duplicates.
//
//For example, if you add:
//	
//Laptop l6 = new Laptop("MacBook", 45000);
//
//then because HP is also 45000, your compareTo() returns 0.
//
//So TreeSet may treat them as duplicates and keep only one.
//
//That's an important difference from ArrayList.