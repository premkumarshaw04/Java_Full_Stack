# Naming Convention for java files:

Use **`PascalCase`** for file names and class names.

- No spaces.
- Start every word with a capital letter.

✅ `AreaOfCircle.java`  
✅ `VolumeOfCylinder.java`  
❌ `area_of_circle.java`  
❌ `Area of Circle.java`  
❌ `program1.java`

---

# 1. Area of Circle:

```java
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        double area = 3.14159 * radius * radius;
        System.out.println("Area of circle = " + area);

        sc.close();
    }
}

// Example Output: 

// Enter the radius: 5
// Area of Circle = 78.53975
```
---

# Quick Clarifications on the above code:


### i. `System.out.print` vs `System.out.println`

| | `System.out.print` | `System.out.println` |
|--|-------------------|----------------------|
| **What it does** | Prints text and **stays on the same line** | Prints text and **moves to the next line** |
| **"ln" meaning** | — | `ln` = **line** — adds a newline at the end |

```java
System.out.print("Enter the radius: ");
// cursor stays here → user types on the SAME line
// Output: Enter the radius: _

System.out.println("Area of circle = " + area);
// cursor moves to NEXT line after printing
// Output: Area of circle = 78.53975
//         ← cursor is here now
```

---

### ii. `sc.close()`

`sc.close()` **closes the Scanner** — meaning it tells Java **"I'm done reading input, release the resources"**.

When you open a `Scanner`, it uses some memory and system resources in the background. If you don't close it, those resources stay occupied even after your program is done with them. Calling `sc.close()` **frees them up cleanly**.

> 💡 Think of it like turning off a tap after you're done using water — the program works fine without it, but it's good practice to close what you open.

---

### iii. `Scanner sc = new Scanner(System.in);`

This line **creates a Scanner object** that reads input from the **keyboard** (`System.in`).

Breaking it down part by part:

| Part | Meaning |
|------|---------|
| `Scanner` | A class from `java.util` that can read input |
| `sc` | The variable name — you can name it anything |
| `new Scanner(...)` | Creates a new Scanner object |
| `System.in` | Refers to the **keyboard** (standard input stream) |

> 💡 After this line, `sc` is ready to read whatever the user types — using methods like `sc.nextInt()`, `sc.nextDouble()`, `sc.nextLine()` etc.

---

# 2. Area Of Triangle

```java

import java.util.Scanner;;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of Triangle = " + area);

        sc.close();
    }
}

// Enter the base: 10
// Enter the height: 5
// Area of Triangle = 25.0
```
---

# 3. Area Of Cube

```java
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
```

---

# 4. Volume Of Cylinder: 

```java
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
```

---

# 5. Volume Of Cone

```java
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

```

---

# 6. Total Surface Area of Cylinder

```java
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
```

---

# 7. Total Surface Area Of Cone

```
// TSA=πr(r+l)

// where:
// r = radius
// l = slant height
```

```java
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

```

---

# 8. Area of a Parallelogram

```
Formula:

A = bh

where:
b = base
h = height
```

```java
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
```

---

# 9. Square and Cube of a number

```java
import java.util.Scanner;

public class SquareAndCubeOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int square = number * number;
        int cube = number * number * number;

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);

        sc.close();
    }
}

// Example Output: 

// Enter a number: 5
// Square = 25
// Cube = 125

```