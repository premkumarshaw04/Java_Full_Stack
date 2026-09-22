package youtube;

import java.util.Scanner;
//Single catch Block
public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Divisor: ");
        int dividend = sc.nextInt();
        System.out.println("Enter Dividend: ");
        int divisor = sc.nextInt();
        try{
            int result = dividend / divisor;
            System.out.println("Your Answer is: "+result);
        }
        catch (ArithmeticException e){
//            System.out.println(e.getMessage());
            System.err.println("Divisor can not be zero....");
        }
    }
}
