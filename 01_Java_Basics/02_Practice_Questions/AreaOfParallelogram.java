import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the Height: ");
        double height = sc.nextDouble();

        double area = base * height;

        System.out.println("Area of Parallelogram = " + area);

        sc.close();
    }
}

// Example Output: 

// Enter the base: 10
// Enter the height: 5
// Area of Parallelogram = 50.0