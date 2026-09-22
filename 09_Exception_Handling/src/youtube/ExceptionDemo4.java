package youtube;

import java.util.Scanner;

//Throw keyword
public class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age < 18){
            throw new RuntimeException("Sorry you are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote...");
        }
    }
}
