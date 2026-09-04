//Question9: Sort Laptop Object based on Price in Ascending Order.
//Options: You can use ArrayList and TreeSet.

package com.jspiders.intervieQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell", 55000);
        Laptop l2 = new Laptop("HP", 45000);
        Laptop l3 = new Laptop("Lenovo", 65000);
        Laptop l4 = new Laptop("Asus", 40000);
        Laptop l5 = new Laptop("Acer", 50000);

        ArrayList<Laptop> al = new ArrayList<Laptop>();

        al.add(l1);
        al.add(l2);
        al.add(l3);
        al.add(l4);
        al.add(l5);

        Collections.sort(al);

        for (Laptop l : al) {
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
