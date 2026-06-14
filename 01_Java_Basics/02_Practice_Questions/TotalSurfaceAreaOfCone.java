import java.util.Scanner;

public class TotalSurfaceAreaOfCone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the slant height: ");
        double slantHeight = sc.nextDouble();

        double totalSurfaceArea = 3.14159 * radius * (radius + slantHeight);//TSA=πr(r+l)

        System.out.println("Total Surface Area of cone: " + totalSurfaceArea);

        sc.close();
    }
}

// Example Output: 

// Enter the radius: 3
// Enter the slant height: 5
// Total Surface Area of Cone = 75.39816
