import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3.0) * 3.14159 * radius * radius * height;

        System.out.println("Volume Of Cone = " + volume);

        sc.close();
    }
}

// Example Output: 

// Enter the radius: 3
// Enter the height: 5
// Volume of Cone = 47.12385
