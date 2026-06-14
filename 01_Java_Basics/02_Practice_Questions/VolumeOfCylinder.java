import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter teh radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double volume = 3.14159 * radius * radius * height;

        System.out.println("Volume od Cylinder = " + volume);

        sc.close();
    }
}

// Example Output:

// Enter the radius: 3
// Enter the height: 5
// Volume of Cylinder = 141.37155