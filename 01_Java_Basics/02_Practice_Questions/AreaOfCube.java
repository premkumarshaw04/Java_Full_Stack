import java.util.Scanner;

public class AreaOfCube {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the Cube: ");
        double side = sc.nextDouble();

        double area = 6 * side * side;

        System.out.println("Surface Area of Cube: " + area);

        sc.close();
    }
}

// Example Output: 

// Enter the side of the cube: 4
// Surface Area of Cube = 96.0
