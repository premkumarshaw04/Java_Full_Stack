import java.util.Scanner;

public class TotalSurfaceAreaOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double TotalSurfaceArea = 2 * 3.14159 * radius * (radius + height);//TSA = 2πr(r+h)

        System.out.println("Total Surface Area of Cylinder: " + TotalSurfaceArea);

        sc.close();
    }
}

// Example Output:

// Enter the radius: 3
// Enter the height: 5
// Total Surface Area of Cylinder = 150.79632