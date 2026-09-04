//Question9: Sort Laptop Object based on Price in Ascending Order.
//Options: You can use ArrayList and TreeSet.

package com.jspiders.intervieQuestions;

public class Laptop implements Comparable<Laptop> {

    String brand;
    double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + price;
    }

    //The important part is:
    @Override
    public int compareTo(Laptop o) {
        return Double.compare(this.price, o.price);
    }
    //Compare the price of the current Laptop with the price of another Laptop.
}