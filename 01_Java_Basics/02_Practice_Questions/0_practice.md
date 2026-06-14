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


### 1. `System.out.print` vs `System.out.println`

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

### 2. `sc.close()`

`sc.close()` **closes the Scanner** — meaning it tells Java **"I'm done reading input, release the resources"**.

When you open a `Scanner`, it uses some memory and system resources in the background. If you don't close it, those resources stay occupied even after your program is done with them. Calling `sc.close()` **frees them up cleanly**.

> 💡 Think of it like turning off a tap after you're done using water — the program works fine without it, but it's good practice to close what you open.

---

### 3. `Scanner sc = new Scanner(System.in);`

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
