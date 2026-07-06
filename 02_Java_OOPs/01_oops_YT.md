# OOPs (Object Oriented Programming) in Java

## Resurce Used : **Anuj Kumar Sharma |** [Video Link](https://youtu.be/a199KZGMNxk?si=yhqIvsqNoDlZ31UL)
---

## 1. Java is a Case-Sensitive Language

### What does it mean?
Java treats uppercase and lowercase letters as **different**. So `Hello`, `hello`, and `HELLO` are three completely different things in Java.

### Examples:
```java
int age = 25;
int Age = 30;  // This is a DIFFERENT variable than 'age'
```

```java
// 'String' is valid (capital S)
String name = "Anuj";

// 'string' is INVALID — Java won't recognize it
string name = "Anuj";  // ❌ ERROR
```

### What happens when you violate this rule?
You get a **compile-time error** — Java will refuse to run your program.

```java
Public class Hello {   // ❌ ERROR — 'Public' should be 'public'
    Static void main() { }  // ❌ ERROR — 'Static' should be 'static'
}
```

> 💡 **Remember:** Java keywords like `public`, `static`, `void`, `class` are always **lowercase**.

---

## 2. Every File Needs a Public Class

### Why?
When you run a Java program, the **Java Virtual Machine (JVM)** needs a clear entry point — a starting place. It looks for a `public class` to find that entry point.

- The `public` keyword means the class is **accessible from anywhere**, including the JVM itself.
- Without a public class, the JVM won't know where to start.

```java
// ✅ Correct — public class exists
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
```

---

## 3. File Name and Class Name Must Be the Same

The name of your `.java` file **must exactly match** the name of the `public class` inside it — including capitalization.

```
File name  →  Hello.java
Class name →  public class Hello ✅

File name  →  hello.java
Class name →  public class Hello ❌  (mismatch — will cause error)
```

> 💡 **Why?** The Java compiler uses the file name to locate the class. If they don't match, it can't find or compile it.

---

## 4. Every File Can Have Only One Public Class

A single `.java` file can contain **multiple classes**, but **only one of them can be `public`** — and that public class must have the same name as the file.

```java
// File: Main.java

public class Main {         // ✅ Only one public class allowed
    // main code here
}

class Helper {              // ✅ Non-public classes are fine
    // helper code
}

class Utility {             // ✅ This is also fine
    // utility code
}
```

---

## 5. Semicolon at the End of Every Statement

Every **statement** in Java must end with a semicolon `;`. A statement is a single instruction you give to Java.

```java
System.out.println("Hello");   // ✅ correct
int x = 10;                    // ✅ correct

System.out.println("Hello")   // ❌ Missing semicolon — compile error
```

> 💡 Think of a semicolon like a **full stop (.)** at the end of a sentence.

---

## 6. What is a Keyword?

A **keyword** is a special word that Java has already reserved for its own use. You **cannot** use these words as variable names, class names, or identifiers.

### Examples of Java Keywords:
| Keyword | Purpose |
|--------|---------|
| `public` | Access modifier — accessible from anywhere |
| `class` | Used to define a class |
| `static` | Belongs to the class, not an object |
| `void` | Method returns no value |
| `int` | Integer data type |
| `if`, `else` | Conditional logic |
| `for`, `while` | Loops |
| `return` | Return a value from a method |
| `new` | Create a new object |
| `null` | Represents no value |

```java
int class = 5;   // ❌ ERROR — 'class' is a keyword, can't use as variable name
int marks = 5;   // ✅ Fine
```

> Java has **50+ reserved keywords**. You'll learn them naturally as you progress.

---

## 7. The First Program — Line by Line Explanation

```java
public class one {

    public static void main(String[] args) {
        System.out.println("Anuj");
    }
}
```

### Breaking it down:

| Part | Meaning |
|------|---------|
| `public` | Access modifier. This class/method is accessible from everywhere. |
| `class` | Keyword to define a class. Everything in Java lives inside a class. |
| `one` | The name of this class. (Note: by convention, class names start with a capital letter — `One`) |
| `static` | This method belongs to the class itself, not to any object. JVM can call it without creating an object. |
| `void` | This method does **not return** any value. |
| `main` | The name of the method. `main` is special — it is the **entry point** of every Java program. JVM always looks for `main` to start execution. |
| `String[] args` | An array of `String` values passed as **command-line arguments**. `args` is the variable name; you can rename it, but `String[]` must stay. |
| `System.out.println("Anuj")` | Prints the text `Anuj` to the console followed by a new line. `System` is a class, `out` is an output stream, `println` is the method. |

---

## 8. Variables

### What is a Variable?
A **variable** is a named container that stores a value in memory. That value can change during the program.

```java
int age = 21;        // 'age' stores the value 21
String name = "Anuj"; // 'name' stores "Anuj"
age = 22;            // value changed — that's why it's called a 'variable'
```

### What is an Identifier?
An **identifier** is simply the **name** you give to anything in Java — a variable, class, method, etc.

```java
int age = 21;
//  ^^^
// 'age' is the identifier (the name)
```

### Difference Between Variable and Identifier:

| | Variable | Identifier |
|--|---------|-----------|
| **What it is** | A storage location with a name and value | Just the name/label itself |
| **Has value?** | Yes | No — it's just the name |
| **Example** | `int age = 21` | `age` is the identifier |

> 💡 **Simple way to remember:** Every variable has an identifier, but not every identifier is a variable (e.g., class names and method names are also identifiers).

---

### Variable Naming Rules in Java

#### ✅ Rules you MUST follow:
- Can contain **letters, digits, underscore `_`, and dollar sign `$`**
- Must **start with a letter, `_`, or `$`** — never a digit
- Cannot use **keywords** as names (`int`, `class`, `static`, etc.)
- No **spaces** allowed in names

#### ✅ Valid examples:
```java
int age = 25;
int _count = 10;
int $price = 100;
int myAge = 21;
int age2 = 30;
```

#### ❌ Invalid examples:
```java
int 2age = 25;      // ❌ starts with a digit
int my age = 25;    // ❌ space not allowed
int class = 10;     // ❌ 'class' is a keyword
int my-name = 5;    // ❌ hyphen not allowed
```

#### ✅ Best Practices (Conventions):
- Use **camelCase** for variables: `myAge`, `firstName`, `totalMarks`
- Use **UPPER_CASE** for constants: `MAX_SIZE`, `PI`
- Make names **meaningful**: `age` is better than `a`

---

## 9. Data Types

### What is a Data Type?
A data type tells Java **what kind of data** a variable will store and **how much memory** to allocate for it.

---

### Primitive vs Non-Primitive Data Types

#### Primitive Data Types:
- Built directly into Java
- Store **simple/single values**
- There are exactly **8 primitive types**

| Type | Description |
|------|-------------|
| `byte` | Very small integer |
| `short` | Small integer |
| `int` | Standard integer |
| `long` | Large integer |
| `float` | Decimal number (single precision) |
| `double` | Decimal number (double precision) |
| `char` | A single character |
| `boolean` | True or false |

#### Non-Primitive Data Types:
- Also called **Reference Types** — they store a **reference (address)** to the actual data in memory, not the value directly
- Created by the programmer or provided by Java libraries
- Examples: `String`, `Arrays`, `Classes`, `Interfaces`

```java
// Primitive
int age = 21;
boolean isStudent = true;

// Non-Primitive
String name = "Anuj";
int[] marks = {90, 85, 78};
```

---

### All Data Types Explained in Detail

#### 1. `byte`
- Stores very small whole numbers
- Size: **1 byte (8 bits)**
- Range: **-128 to 127**

```java
byte b = 100;
byte b2 = -50;
```

---

#### 2. `short`
- Stores small whole numbers
- Size: **2 bytes (16 bits)**
- Range: **-32,768 to 32,767**

```java
short s = 30000;
```

---

#### 3. `int`
- Most commonly used integer type
- Size: **4 bytes (32 bits)**
- Range: **-2,147,483,648 to 2,147,483,647** (approx. ±2.1 billion)

```java
int age = 21;
int population = 1400000000;
```

---

#### 4. `long`
- For very large whole numbers
- Size: **8 bytes (64 bits)**
- Range: **-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807**
- ⚠️ **Must add `L` at the end** of the value

```java
long bigNumber = 9876543210L;  // 'L' is required
```

---

#### 5. `float`
- Stores decimal numbers (less precise)
- Size: **4 bytes (32 bits)**
- Range: approx. **±3.4 × 10⁻³⁸ to ±3.4 × 10³⁸** (up to ~7 decimal digits of precision)
- ⚠️ **Must add `f` at the end** of the value

```java
float price = 99.99f;   // 'f' is required
float pi = 3.14f;
```

---

#### 6. `double`
- Stores decimal numbers (more precise — default for decimals)
- Size: **8 bytes (64 bits)**
- Range: approx. **±1.7 × 10⁻³⁰⁸ to ±1.7 × 10³⁰⁸** (up to ~15 decimal digits of precision)
- No suffix needed (Java treats decimal numbers as `double` by default)

```java
double salary = 75000.50;
double pi = 3.141592653589793;
```

---

#### 7. `char`
- Stores a **single character**
- Size: **2 bytes (16 bits)** — uses Unicode, so it supports international characters
- ⚠️ **A `char` value is always written in single quotes `' '`**

```java
char grade = 'A';
char letter = 'z';
char symbol = '@';

// ❌ Wrong — double quotes make it a String, not a char
char x = "A";   // ERROR
```

---

#### 8. `boolean`
- Stores only two values: `true` or `false`
- Size: **1 bit** (technically, JVM-dependent, but logically 1 bit)

```java
boolean isLoggedIn = true;
boolean hasError = false;
```

---

#### 9. `String` (Non-Primitive)
- Stores a **sequence of characters** (text)
- ⚠️ **A `String` value is always written in double quotes `" "`**
- `String` starts with a capital `S` because it's a **class**, not a primitive type

```java
String name = "Anuj";
String city = "Delhi";

// ❌ Wrong — single quotes are for char only
String name = 'Anuj';   // ERROR
```

> 💡 **Quick rule to remember:**
> - `char` → **single** character → **single quotes** → `'A'`
> - `String` → **multiple characters (text)** → **double quotes** → `"Anuj"`

---

### Special Suffixes Summary

| Data Type | Suffix Required | Example |
|-----------|----------------|---------|
| `long` | `L` (uppercase recommended) | `9876543210L` |
| `float` | `f` or `F` | `3.14f` |
| `double` | None (default) | `3.14` |
| `char` | Single quotes `' '` | `'A'` |
| `String` | Double quotes `" "` | `"Hello"` |

---

### Bits and Bytes — The Concept

- A **bit** is the smallest unit of data in a computer. It can be either `0` or `1`.
- A **byte** = **8 bits**
- Memory sizes: 1 Byte → 1 KB = 1024 Bytes → 1 MB = 1024 KB → 1 GB = 1024 MB

#### Most Significant Bit (MSB) and Least Significant Bit (LSB):
- In a binary number like `10110010`:
  - The **leftmost bit** is the **MSB** (Most Significant Bit) — it has the **highest value/weight**
  - The **rightmost bit** is the **LSB** (Least Significant Bit) — it has the **lowest value/weight**

```
Binary:  1  0  1  1  0  0  1  0
         ↑                    ↑
        MSB                  LSB
```

> 💡 In **signed** data types, the MSB is used as the **sign bit** — `0` means positive, `1` means negative. That is why `byte` (8 bits) goes from -128 to 127 instead of 0 to 255.

---

### Memory Size of All Data Types

| Data Type | Memory Size |
|-----------|------------|
| `byte` | 1 byte (8 bits) |
| `short` | 2 bytes (16 bits) |
| `int` | 4 bytes (32 bits) |
| `long` | 8 bytes (64 bits) |
| `float` | 4 bytes (32 bits) |
| `double` | 8 bytes (64 bits) |
| `char` | 2 bytes (16 bits) |
| `boolean` | ~1 bit (JVM dependent) |

---

### Range of All Data Types

| Data Type | Minimum Value | Maximum Value |
|-----------|--------------|--------------|
| `byte` | -128 | 127 |
| `short` | -32,768 | 32,767 |
| `int` | -2,147,483,648 | 2,147,483,647 |
| `long` | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |
| `float` | ~-3.4 × 10³⁸ | ~3.4 × 10³⁸ |
| `double` | ~-1.7 × 10³⁰⁸ | ~1.7 × 10³⁰⁸ |
| `char` | 0 (`\u0000`) | 65,535 (`\uFFFF`) |
| `boolean` | `false` | `true` |

#### How is the range calculated?
For an **n-bit signed** type:
- Minimum = **-2^(n-1)**
- Maximum = **2^(n-1) - 1**

For `int` (32 bits):
- Min = -2³¹ = -2,147,483,648
- Max = 2³¹ - 1 = 2,147,483,647

> 💡 The -1 in maximum is because one value (0) is used in the positive range.

---

## 10. Operators

### What is an Operator?
An **operator** is a symbol that performs an **operation** on one or more values (called operands).

```java
int result = 10 + 5;
//               ↑
//           operator (+)
```

---

### Types of Operators in Java

---

#### 1. Arithmetic Operators
Used to perform **basic math operations**.

| Operator | Name | Example | Result |
|----------|------|---------|--------|
| `+` | Addition | `10 + 3` | `13` |
| `-` | Subtraction | `10 - 3` | `7` |
| `*` | Multiplication | `10 * 3` | `30` |
| `/` | Division | `10 / 3` | `3` (integer division) |
| `%` | Modulus (remainder) | `10 % 3` | `1` |
| `++` | Increment (add 1) | `a++` or `++a` | value increases by 1 |
| `--` | Decrement (subtract 1) | `a--` or `--a` | value decreases by 1 |

```java
int a = 10, b = 3;

System.out.println(a + b);   // 13
System.out.println(a - b);   // 7
System.out.println(a * b);   // 30
System.out.println(a / b);   // 3  (decimal part dropped in int division)
System.out.println(a % b);   // 1  (10 = 3×3 + 1, remainder is 1)

int x = 5;
x++;                          // x is now 6
x--;                          // x is now 5 again
```

> 💡 **Pre vs Post Increment:**
> - `++a` — increment first, then use the value
> - `a++` — use the value first, then increment

```java
int a = 5;
System.out.println(++a);  // prints 6 (incremented first)
System.out.println(a++);  // prints 6 (prints first, then becomes 7)
System.out.println(a);    // prints 7
```

---

#### 2. Relational (Comparison) Operators
Used to **compare** two values. Always returns `true` or `false`.

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |
| `>` | Greater than | `5 > 3` | `true` |
| `<` | Less than | `5 < 3` | `false` |
| `>=` | Greater than or equal | `5 >= 5` | `true` |
| `<=` | Less than or equal | `4 <= 5` | `true` |

```java
int a = 10, b = 20;
System.out.println(a > b);   // false
System.out.println(a < b);   // true
System.out.println(a == b);  // false
System.out.println(a != b);  // true
```

---

#### 3. Logical Operators
Used to combine **multiple conditions**. Returns `true` or `false`.

| Operator | Name | Meaning | Example |
|----------|------|---------|---------|
| `&&` | AND | Both conditions must be true | `(a > 5 && b < 20)` |
| `\|\|` | OR | At least one condition must be true | `(a > 5 \|\| b > 100)` |
| `!` | NOT | Reverses the condition | `!(a > 5)` |

```java
int a = 10, b = 15;

System.out.println(a > 5 && b > 10);   // true  (both true)
System.out.println(a > 5 && b > 20);   // false (second is false)
System.out.println(a > 5 || b > 20);   // true  (first is true)
System.out.println(!(a > 5));          // false (reverses true → false)
```

---

#### 4. Assignment Operators
Used to **assign values** to variables.

| Operator | Example | Equivalent to |
|----------|---------|--------------|
| `=` | `a = 10` | assign 10 to a |
| `+=` | `a += 5` | `a = a + 5` |
| `-=` | `a -= 5` | `a = a - 5` |
| `*=` | `a *= 5` | `a = a * 5` |
| `/=` | `a /= 5` | `a = a / 5` |
| `%=` | `a %= 5` | `a = a % 5` |

```java
int a = 10;
a += 5;   // a is now 15
a -= 3;   // a is now 12
a *= 2;   // a is now 24
a /= 4;   // a is now 6
```

---

#### 5. Bitwise Operators
Operate directly on **bits** (binary level). Used in low-level programming.

| Operator | Name | Example |
|----------|------|---------|
| `&` | Bitwise AND | `5 & 3` → `1` |
| `\|` | Bitwise OR | `5 \| 3` → `7` |
| `^` | Bitwise XOR | `5 ^ 3` → `6` |
| `~` | Bitwise NOT | `~5` → `-6` |
| `<<` | Left shift | `5 << 1` → `10` |
| `>>` | Right shift | `5 >> 1` → `2` |

---

#### 6. Ternary Operator
A **short form of if-else**. Takes 3 operands.

```java
// Syntax: condition ? valueIfTrue : valueIfFalse

int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println(max);   // 20
```

---

### Type Casting

**Type casting** means converting a value from one data type to another.

---

#### 1. Widening Casting (Implicit / Automatic)
Converting a **smaller type to a larger type** — Java does this automatically because no data is lost.

```
byte → short → int → long → float → double
```

```java
int i = 100;
double d = i;   // automatic — int to double
System.out.println(d);   // 100.0
```

---

#### 2. Narrowing Casting (Explicit / Manual)
Converting a **larger type to a smaller type** — you must do this manually using `(type)` because data might be lost.

```java
double d = 99.99;
int i = (int) d;         // manually cast double to int
System.out.println(i);   // 99  (decimal part is lost!)
```

```java
long l = 12345678L;
int i = (int) l;         // manually cast long to int
System.out.println(i);   // 12345678 (safe here, but risky if value is too large)
```

> ⚠️ **Be careful with narrowing casting** — if the value is too large for the target type, data will be lost or corrupted.

---

---

## 11. Taking User Input — Scanner Class

### What is the Scanner Class?
`Scanner` is a **built-in Java class** that allows your program to **read input from the user** (via keyboard), from a file, or from a string. It is like giving your program a pair of ears — it listens to what the user types.

### Where does it come from?
`Scanner` is part of the **`java.util` package** — a collection of utility classes that Java provides. Since it is not automatically available, you need to **import it** at the top of your file before using it.

---

### How to Use Scanner — Full Example

```java
import java.util.Scanner;   // Step 1: Import the Scanner class

public class InputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Step 2: Create a Scanner object

        System.out.println("Enter your name:");
        String name = sc.nextLine();           // Step 3: Take input

        System.out.println("Hello, " + name);
    }
}
```

---

### Line-by-Line Explanation

#### `import java.util.Scanner;`
- `import` → keyword that tells Java to bring in an external class
- `java.util` → the **package** (folder/library) where Scanner lives
- `Scanner` → the specific class we want to use
- Without this line, Java won't know what `Scanner` means and will throw an error

---

#### `Scanner sc = new Scanner(System.in);`

Let's break this down word by word:

| Part | Meaning |
|------|---------|
| `Scanner` | The **data type** — we are creating a variable of type Scanner |
| `sc` | The **name (identifier)** of our Scanner object — you can name it anything (`input`, `reader`, etc.) |
| `=` | Assignment operator — assigning the new Scanner object to `sc` |
| `new` | Keyword that **creates a new object** in memory |
| `Scanner(...)` | **Constructor** — it sets up/initializes the Scanner object |
| `System.in` | Tells the Scanner to read input from the **keyboard** (standard input stream). `System` is a class, `in` is its input stream. |

> 💡 **Simple way to remember:** `Scanner sc = new Scanner(System.in)` means — *"Create a new Scanner and connect it to the keyboard, and call it `sc`."*

---

### All Scanner Methods — What They Do

Once you have your `Scanner sc` object, you can use these methods to read different types of input:

| Method | What it reads | Example |
|--------|--------------|---------|
| `sc.nextInt()` | Reads an **integer** | `int age = sc.nextInt();` |
| `sc.nextDouble()` | Reads a **double** (decimal) | `double price = sc.nextDouble();` |
| `sc.nextFloat()` | Reads a **float** | `float temp = sc.nextFloat();` |
| `sc.nextLong()` | Reads a **long** integer | `long big = sc.nextLong();` |
| `sc.nextBoolean()` | Reads a **boolean** (`true`/`false`) | `boolean flag = sc.nextBoolean();` |
| `sc.next()` | Reads a **single word** (stops at space) | `String word = sc.next();` |
| `sc.nextLine()` | Reads an **entire line** including spaces | `String line = sc.nextLine();` |

```java
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();           // reads integer

        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble();     // reads decimal number

        sc.nextLine();                    // ⚠️ clears leftover newline (important!)

        System.out.print("Enter your full name: ");
        String name = sc.nextLine();      // reads full line with spaces

        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}
```

> ⚠️ **Important Tip:** After using `nextInt()`, `nextDouble()`, etc., always call `sc.nextLine()` once before using `sc.nextLine()` for a string. This is because `nextInt()` leaves a leftover newline character `\n` in the buffer, which `nextLine()` mistakenly reads as an empty input.

---

## 12. Conditional Statements

### What are Conditional Statements?
Conditional statements allow your program to **make decisions** — execute different blocks of code based on whether a condition is `true` or `false`.

---

### Conditional (Comparison) Operators

These operators **compare two values** and return `true` or `false`:

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `>` | Greater than | `10 > 5` | `true` |
| `<` | Less than | `10 < 5` | `false` |
| `>=` | Greater than or equal to | `10 >= 10` | `true` |
| `<=` | Less than or equal to | `9 <= 10` | `true` |
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not equal to | `5 != 3` | `true` |

> ⚠️ **Common mistake:** `=` is for **assignment** (`a = 5`) and `==` is for **comparison** (`a == 5`). Don't confuse them!

---

### `if`, `else if`, and `else`

#### Syntax:
```java
if (condition1) {
    // runs if condition1 is true
} else if (condition2) {
    // runs if condition1 is false AND condition2 is true
} else {
    // runs if ALL above conditions are false
}
```

---

#### How it works:
1. Java checks `if` first
2. If `if` is false, it checks `else if`
3. If all conditions are false, it runs the `else` block
4. **Only one block runs** — once a match is found, the rest are skipped

```java
import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F — Please study harder!");
        }
    }
}
```

---

#### Nested `if` (if inside if):
```java
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry allowed");
    } else {
        System.out.println("No ID — Entry denied");
    }
} else {
    System.out.println("Underage — Entry denied");
}
```

---

## 13. Switch Case

### What is Switch Case?
`switch` is a conditional statement used when you want to **compare one variable against multiple fixed values**. Instead of writing many `if-else` blocks, you write cleaner `case` blocks.

---

### How is Switch Different from if-else?

This is the key difference:

- **`if-else`** checks conditions **one by one from top to bottom** — even if the match is at the end, it goes through every condition above it.
- **`switch`** uses the value and **directly jumps** to the matching `case` — it does not check every condition. This makes it faster and cleaner when you have many fixed values to compare.

```
if-else  → checks condition 1... condition 2... condition 3... (sequential)
switch   → sees value → jumps directly to matching case (direct jump)
```

---

### Why Use Switch if We Already Have if-else?

| | `if-else` | `switch` |
|--|----------|---------|
| Best for | Range-based checks (`marks >= 90`) | Exact value checks (`day == 2`) |
| Readability | Gets messy with many conditions | Clean and easy to read |
| Performance | Checks each condition one by one | Jumps directly to match |
| Flexibility | Works with any condition/expression | Works with fixed values only |

> 💡 Use `switch` when you're comparing **one variable to many specific values**. Use `if-else` when you need **ranges or complex conditions**.

---

### Syntax of Switch Case

```java
switch (variable) {
    case value1:
        // code for value1
        break;
    case value2:
        // code for value2
        break;
    default:
        // code if no case matches
}
```

---

### Significance of `break` and `default`

#### `break`:
- After a matching case runs, `break` **exits the switch block**
- Without `break`, Java continues executing the **next case too** — this is called **fall-through** and is usually a bug

```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");   // ✅ This runs
        break;                           // exits here
    case 3:
        System.out.println("Wednesday"); // skipped because of break above
        break;
}
```

**Without `break` (fall-through problem):**
```java
int day = 2;

switch (day) {
    case 1:
        System.out.println("Monday");
    case 2:
        System.out.println("Tuesday");   // runs ✅
    case 3:
        System.out.println("Wednesday"); // ALSO runs ❌ (no break above)
}
// Output: Tuesday
//         Wednesday   ← unwanted!
```

#### `default`:
- Runs when **no case matches** the given value
- It is like the `else` in an `if-else` chain
- It is optional, but always good practice to include it

```java
int day = 9;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day!");   // runs because 9 matches nothing
}
```

---

### Example: Grading System Using Switch Case

```java
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade (A/B/C/D/F): ");
        String grade = sc.next().toUpperCase();  // convert to uppercase to handle 'a','b' etc.

        switch (grade) {
            case "A":
                System.out.println("Excellent! Marks: 90-100");
                break;
            case "B":
                System.out.println("Good! Marks: 75-89");
                break;
            case "C":
                System.out.println("Average. Marks: 60-74");
                break;
            case "D":
                System.out.println("Below Average. Marks: 40-59");
                break;
            case "F":
                System.out.println("Failed. Marks: Below 40");
                break;
            default:
                System.out.println("Invalid grade entered!");
        }
    }
}
```

---

### Switch vs if-else: Which is Better for Grading?

#### Grading with `if-else` (using marks as numbers):
```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else if (marks >= 40) {
    System.out.println("Grade D");
} else {
    System.out.println("Grade F");
}
```

#### Verdict:

| Situation | Better Choice | Why |
|-----------|--------------|-----|
| Input is a **number with ranges** (marks >= 90) | ✅ `if-else` | `switch` cannot handle ranges — only exact values |
| Input is a **fixed letter/value** (grade = "A") | ✅ `switch` | Cleaner, faster, more readable |

> 💡 **Key Insight:** For a grading system based on **marks (numbers with ranges)**, `if-else` is the better and only correct choice because `switch` does not support range conditions like `marks >= 90`. But if the input is already a **letter grade** ("A", "B", "C"), then `switch` is cleaner and more efficient.

---

## 14. Loops

### What is a Loop?
A loop is used to **execute a block of code repeatedly** as long as a condition is true. Instead of writing the same line 100 times, you write it once inside a loop.

---

### Types of Loops in Java

---

### 1. `for` Loop

#### When to use:
Use a `for` loop when you **know exactly how many times** the loop should run.

> **Scenario:** Print numbers 1 to 10. Print a table of 5. Iterate through an array of fixed size.

#### Syntax:
```java
for (initialization; condition; update) {
    // code to repeat
}
```

| Part | Meaning |
|------|---------|
| `initialization` | Runs once at start — sets up the counter variable |
| `condition` | Checked before every iteration — loop runs while this is `true` |
| `update` | Runs after every iteration — usually increments/decrements the counter |

#### Example:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}

// Output:
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5
```

---

### 2. `while` Loop

#### When to use:
Use a `while` loop when you **don't know how many times** the loop will run — it keeps running as long as a condition is `true`.

> **Scenario:** Keep asking user for a password until they enter the correct one. Read data until the file ends. Wait until a certain condition becomes false.

#### Syntax:
```java
while (condition) {
    // code to repeat
}
```

#### Example:
```java
int i = 1;

while (i <= 5) {
    System.out.println("Count: " + i);
    i++;   // important! without this, loop runs forever (infinite loop)
}

// Output:
// Count: 1
// Count: 2
// Count: 3
// Count: 4
// Count: 5
```

#### Real-world scenario example:
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
String password = "";

while (!password.equals("java123")) {
    System.out.print("Enter password: ");
    password = sc.nextLine();
}

System.out.println("Access granted!");
// Loop keeps running until correct password is entered
```

---

### 3. `do-while` Loop

#### When to use:
Use a `do-while` loop when you want the loop to **run at least once**, regardless of the condition. The condition is checked **after** the first run.

> **Scenario:** Show a menu to the user at least once. Ask user for input at least once before validating.

#### Syntax:
```java
do {
    // code to repeat
} while (condition);
```

> 💡 **Key difference from `while`:** In a `while` loop, if the condition is false from the start, the loop body never runs. In a `do-while` loop, the body runs **at least once** no matter what.

#### Example:
```java
int i = 1;

do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);

// Output:
// Count: 1 ... Count: 5
```

#### Showing the "at least once" behavior:
```java
int i = 10;

// while loop — body never runs because condition is false from start
while (i < 5) {
    System.out.println("while: " + i);  // never printed
}

// do-while — body runs once even though condition is false
do {
    System.out.println("do-while: " + i);  // prints "do-while: 10"
} while (i < 5);
```

---

### 4. `for-each` Loop (Enhanced for Loop)

#### When to use:
Use `for-each` when you want to **iterate over every element of an array or collection** and you don't need the index.

> **Scenario:** Print all elements of an array. Process each item in a list. Simple traversal without needing position.

#### Syntax:
```java
for (dataType variable : arrayOrCollection) {
    // use variable
}
```

#### Example:
```java
int[] marks = {85, 90, 78, 92, 88};

for (int mark : marks) {
    System.out.println(mark);
}

// Output:
// 85
// 90
// 78
// 92
// 88
```

---

### Loop Comparison — When to Use Which

| Loop | Use when... |
|------|------------|
| `for` | You **know** the number of iterations (e.g., 1 to 10) |
| `while` | You **don't know** iterations — depends on a condition |
| `do-while` | You need the loop to run **at least once** |
| `for-each` | You're **traversing** an array/collection without needing the index |

---

### `break` and `continue` Statements

#### `break`
- **Immediately exits** the loop — no more iterations happen
- Use when you've found what you need and want to stop

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;   // exits loop when i equals 5
    }
    System.out.println(i);
}

// Output: 1  2  3  4
// (stops before printing 5)
```

#### `continue`
- **Skips the current iteration** and jumps to the next one
- The loop does NOT stop — it just skips this round

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;   // skips when i equals 5
    }
    System.out.println(i);
}

// Output: 1  2  3  4  6  7  8  9  10
// (5 is skipped, loop continues)
```

> 💡 **Simple way to remember:**
> - `break` → **stop the whole loop**
> - `continue` → **skip this round, keep going**

---

## 15. Arrays

### What is an Array?
An **array** is a container that stores **multiple values of the same data type** in a single variable, in a fixed-size ordered sequence.

Instead of creating 5 separate variables:
```java
int mark1 = 85;
int mark2 = 90;
int mark3 = 78;
// ...messy and hard to manage
```

You use one array:
```java
int[] marks = {85, 90, 78, 92, 88};   // clean and manageable
```

Each value in the array is called an **element**, and each element has a position called an **index**, starting from **0**.

```
Index:   0    1    2    3    4
Value:  85   90   78   92   88
```

---

### Different Ways to Declare an Array in Java

#### Method 1: Declare and initialize together (shorthand)
```java
int[] marks = {85, 90, 78, 92, 88};
// Size is automatically set to 5
```

#### Method 2: Declare with size, assign values later
```java
int[] marks = new int[5];   // creates array of size 5, all values default to 0
marks[0] = 85;
marks[1] = 90;
marks[2] = 78;
```

#### Method 3: Declare first, initialize later
```java
int[] marks;                        // declared
marks = new int[]{85, 90, 78};      // initialized later
```

#### Method 4: Array bracket after variable name (older style, still valid)
```java
int marks[] = new int[5];   // brackets after variable name — valid but less preferred
```

---

### Destructuring: `int marks[] = new int[5];`

Let's break this line down word by word:

| Part | Meaning |
|------|---------|
| `int` | The **data type** of each element — this array will only hold integers |
| `marks` | The **name (identifier)** of the array |
| `[]` | Square brackets declare this as an **array** (not a simple variable) |
| `=` | Assignment operator |
| `new` | Keyword that **creates a new object/array in memory** |
| `int` | Specifies that elements stored are of type `int` |
| `[5]` | The **size** of the array — it can hold exactly 5 elements (index 0 to 4) |

> 💡 Once the size of an array is set using `new int[5]`, **it cannot be changed**. Arrays in Java are fixed in size.

---

### Accessing Elements of an Array

You access elements using their **index** inside square brackets `[]`.

```java
int[] marks = {85, 90, 78, 92, 88};

System.out.println(marks[0]);   // 85 — first element
System.out.println(marks[2]);   // 78 — third element
System.out.println(marks[4]);   // 88 — last element

// Modify an element
marks[1] = 95;
System.out.println(marks[1]);   // 95 — updated value
```

> ⚠️ Accessing an index that doesn't exist (e.g., `marks[5]` in an array of size 5) causes an **ArrayIndexOutOfBoundsException** — a runtime error.

---

### All Important Array Methods / Properties in Java

Java provides useful tools via the `Arrays` class (from `java.util.Arrays`) and built-in properties:

#### `array.length` — Get size of array
```java
int[] marks = {85, 90, 78};
System.out.println(marks.length);   // 3
```

#### `Arrays.sort()` — Sort array in ascending order
```java
import java.util.Arrays;

int[] marks = {90, 78, 85, 92};
Arrays.sort(marks);
System.out.println(Arrays.toString(marks));   // [78, 85, 90, 92]
```

#### `Arrays.toString()` — Convert array to readable string
```java
int[] marks = {85, 90, 78};
System.out.println(Arrays.toString(marks));   // [85, 90, 78]
// Without this, printing array directly gives something like: [I@1b6d3586
```

#### `Arrays.fill()` — Fill all elements with a value
```java
int[] arr = new int[5];
Arrays.fill(arr, 7);
System.out.println(Arrays.toString(arr));   // [7, 7, 7, 7, 7]
```

#### `Arrays.copyOf()` — Copy array with a new size
```java
int[] original = {1, 2, 3, 4, 5};
int[] copy = Arrays.copyOf(original, 3);   // copy first 3 elements
System.out.println(Arrays.toString(copy)); // [1, 2, 3]
```

#### `Arrays.equals()` — Check if two arrays are equal
```java
int[] a = {1, 2, 3};
int[] b = {1, 2, 3};
System.out.println(Arrays.equals(a, b));   // true
```

---

### Taking Array Elements as User Input

```java
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements? ");
        int n = sc.nextInt();             // Step 1: take the size from user

        int[] arr = new int[n];           // Step 2: create array of that size

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {    // Step 3: loop from index 0 to n-1
            arr[i] = sc.nextInt();        // Step 4: store each input into array
        }

        // Print the array
        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
```

**Line-by-line explanation:**
- `int n = sc.nextInt()` → user tells us how big the array should be
- `int[] arr = new int[n]` → array is created with that size
- `for (int i = 0; i < n; i++)` → loop runs from index `0` to `n-1` (last valid index)
- `arr[i] = sc.nextInt()` → each iteration stores one input into that index position

---

## 16. Matrix — 2D Arrays

### What is a 2D Array?
A **2D array** is an array of arrays — think of it as a **table with rows and columns**, like a grid or matrix.

```
     Col0  Col1  Col2
Row0 [  1    2    3  ]
Row1 [  4    5    6  ]
Row2 [  7    8    9  ]
```

---

### All Possible Ways to Declare a 2D Array

#### Method 1: Declare and initialize together
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

#### Method 2: Declare with size, assign later
```java
int[][] matrix = new int[3][3];   // 3 rows, 3 columns — all values default to 0
matrix[0][0] = 1;
matrix[0][1] = 2;
// and so on...
```

#### Method 3: Declare first, initialize later
```java
int[][] matrix;
matrix = new int[][]{{1, 2}, {3, 4}};
```

#### Method 4: Jagged array (rows with different lengths)
```java
int[][] jagged = new int[3][];   // 3 rows, column size not fixed
jagged[0] = new int[2];         // row 0 has 2 columns
jagged[1] = new int[4];         // row 1 has 4 columns
jagged[2] = new int[3];         // row 2 has 3 columns
```

---

### Accessing Elements in a 2D Array

You access elements using **two indices**: `[row][column]` — both starting from 0.

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[0][0]);   // 1 — row 0, col 0
System.out.println(matrix[1][2]);   // 6 — row 1, col 2
System.out.println(matrix[2][1]);   // 8 — row 2, col 1
```

#### Printing the entire 2D array using nested loops:
```java
for (int i = 0; i < matrix.length; i++) {          // loop over rows
    for (int j = 0; j < matrix[i].length; j++) {   // loop over columns in each row
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();   // new line after each row
}

// Output:
// 1 2 3
// 4 5 6
// 7 8 9
```

> 💡 `matrix.length` gives number of **rows**. `matrix[i].length` gives number of **columns** in row `i`.

---

## 17. Methods

### What are Methods?
A **method** is a block of code with a name that performs a specific task. You define it once and can **call (use) it** as many times as you want — from anywhere in the program.

Think of a method like a **machine**: you give it input (parameters), it does its job, and optionally gives back an output (return value).

---

### Benefits of Using Methods

| Benefit | Explanation |
|---------|-------------|
| **Reusability** | Write once, use multiple times — no copy-pasting code |
| **Readability** | Code is organized into named blocks — easier to understand |
| **Maintainability** | Fix a bug in one place instead of everywhere |
| **Modularity** | Break a big problem into smaller, manageable pieces |

---

### Example: Full Program — Method that Returns Average of Two Values

```java
public class AverageCalculator {

    // Method definition
    public static double findAverage(int a, int b) {
        double avg = (a + b) / 2.0;
        return avg;
    }

    public static void main(String[] args) {
        double result = findAverage(80, 90);
        System.out.println("Average: " + result);   // Average: 85.0
    }
}
```

### Line-by-line explanation:

| Part | Meaning |
|------|---------|
| `public` | Access modifier — this method can be called from anywhere |
| `static` | Method belongs to the class itself (explained in detail below) |
| `double` | **Return type** — this method will return a `double` value |
| `findAverage` | The **name** of the method |
| `(int a, int b)` | **Parameters** — the inputs the method accepts; `a` and `b` are local variables inside the method |
| `double avg = (a + b) / 2.0` | Calculates the average; `2.0` used instead of `2` to get a decimal result |
| `return avg` | Sends the value back to wherever the method was called |
| `findAverage(80, 90)` | **Calling** the method with arguments `80` and `90` |
| `double result = ...` | Stores the returned value into `result` |

---

### Why Do We Use `static` in Methods?

This is a very important concept. Let's understand it clearly.

#### What does `static` mean?
`static` means the method or variable **belongs to the class itself**, not to any specific object created from the class.

---

#### The Rule:
- **Static methods** can only directly access **static variables** and call **static methods**
- **Non-static variables** (instance variables) are tied to an **object** — they can only be accessed through an object

---

#### Why do we add `static` to methods called from `main`?

Because `main` itself is `static`:
```java
public static void main(String[] args) { ... }
```

The JVM calls `main` **without creating any object**. So from inside `main`, you can only directly call other `static` methods. If `findAverage` were not `static`, Java would say: *"I can't call that — it belongs to an object, and no object has been created."*

---

#### Static vs Non-Static — The Full Picture:

```java
public class Example {

    static int staticVar = 10;      // belongs to the CLASS
    int instanceVar = 20;           // belongs to an OBJECT

    // Static method — can access staticVar directly
    public static void staticMethod() {
        System.out.println(staticVar);      // ✅ fine
        // System.out.println(instanceVar); // ❌ ERROR — no object exists here
    }

    // Non-static method — can access both
    public void nonStaticMethod() {
        System.out.println(staticVar);      // ✅ fine
        System.out.println(instanceVar);    // ✅ fine — called on an object
    }

    public static void main(String[] args) {

        staticMethod();   // ✅ can call directly — both are static

        // To access non-static method or variable, create an object first:
        Example obj = new Example();
        obj.nonStaticMethod();              // ✅ called through object
        System.out.println(obj.instanceVar); // ✅ accessed through object
    }
}
```

> 💡 **Simple way to remember:**
> - `static` → **shared by the class** — exists without any object
> - non-static (instance) → **owned by an object** — needs an object to exist first
> - `main` is static → so it can directly call only static things. For non-static things, create an object first.

---

## 18. Exception Handling

### What is an Exception?
An **exception** is an **unexpected error** that occurs while a program is running — it disrupts the normal flow of execution.

Examples:
- Trying to access `arr[5]` when array only has 3 elements
- Dividing a number by zero
- Trying to open a file that doesn't exist

---

### What is Exception Handling?
**Exception handling** is a mechanism to **catch and manage these runtime errors gracefully** — so your program doesn't crash and can continue or show a helpful message instead.

---

### Why Use Exception Handling?

| Without Exception Handling | With Exception Handling |
|---------------------------|------------------------|
| Program crashes immediately | Program handles the error and continues |
| User sees a scary error dump | User sees a clean, helpful message |
| Lines after the error never run | Remaining code still executes |
| Hard to debug in production | You can log the exact error message |

---

### Real-World Applications

- **Banking app:** If a transaction fails, show "Transaction failed, please try again" instead of crashing
- **File upload:** If file not found, show "File missing" instead of crashing the server
- **Login system:** If database is down, show "Service unavailable" instead of dumping an error
- **API calls:** If network fails, retry or show a user-friendly message

---

### How to Perform Exception Handling — `try-catch`

#### Syntax:
```java
try {
    // code that might throw an exception
} catch (ExceptionType e) {
    // code that runs if exception occurs
}
```

---

### Full Code Explained — Line by Line

```java
public class one {

    public static void main(String[] args) {

        // -----------------------------------------------
        // WITHOUT exception handling:

        // int arr[] = new int[3];
        // System.out.println(arr[4]);         // ❌ crashes here — index 4 doesn't exist
        // System.out.println("The next line"); // ❌ NEVER printed — program already crashed
        // -----------------------------------------------

        // WITH exception handling:
        int arr[] = new int[3];    // array of size 3 — valid indices: 0, 1, 2

        try {
            System.out.println(arr[4]);   // ❌ index 4 doesn't exist — exception thrown here
        } catch (Exception e) {
            System.out.println("got an error here");         // friendly message
            System.out.println(e.getLocalizedMessage());     // prints exact error description
        }

        System.out.println("The next line");   // ✅ THIS IS PRINTED — program didn't crash
    }
}
```

#### Line-by-line breakdown:

| Line | Meaning |
|------|---------|
| `int arr[] = new int[3]` | Creates an integer array of size 3. Valid indices: 0, 1, 2 |
| `try { ... }` | This block **watches** for exceptions. Code inside is "tried" — if anything goes wrong, execution jumps to `catch` immediately |
| `System.out.println(arr[4])` | Tries to access index 4 — which doesn't exist. This **throws** an `ArrayIndexOutOfBoundsException` |
| `catch (Exception e)` | **Catches** the exception. `Exception` is the type (parent of all exceptions). `e` is the variable that holds the error details |
| `e.getLocalizedMessage()` | Returns a human-readable description of what went wrong |
| `System.out.println("The next line")` | This line is **outside** `try-catch`, so it runs normally after the exception is handled |

---

### Output

#### Without exception handling (commented code):
```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
    at one.main(one.java:6)
// Program crashes — "The next line" is NEVER printed
```

#### With exception handling:
```
got an error here
Index 4 out of bounds for length 3
The next line
```

> 💡 Notice how "The next line" **IS printed** when exception handling is used — the program gracefully handled the error and continued execution.

---

### `try-catch-finally` (Bonus)

There is also a `finally` block — it **always runs** whether an exception occurred or not. Useful for cleanup (closing files, database connections, etc.).

```java
try {
    System.out.println(arr[4]);
} catch (Exception e) {
    System.out.println("Error: " + e.getLocalizedMessage());
} finally {
    System.out.println("This always runs — cleanup code goes here");
}
```

---

## 19. Why Learn OOPs After Already Knowing a Programming Language?

You already know how to write code — variables, loops, conditions, methods. So why OOPs?

Because knowing a language's **syntax** is not the same as knowing how to **structure and design** a program properly.

Here's why OOPs is necessary even after learning basics:

| Problem Without OOPs | How OOPs Solves It |
|----------------------|--------------------|
| Code becomes messy as the project grows | OOPs organizes code into classes — clean and structured |
| Same code written again and again | **Inheritance** lets you reuse existing code |
| Hard to manage data and functions separately | OOPs bundles related data + behaviour together in one class |
| Changing one thing breaks other things | **Encapsulation** protects data — changes are isolated |
| Hard to model real-world problems in code | OOPs maps directly to real-world entities (Person, Car, Bank) |
| Difficult to work in teams | Each team member can work on separate classes independently |

> 💡 **Think of it this way:** Basic programming teaches you the **tools** (hammer, nails). OOPs teaches you **how to build a house** using those tools. One without the other is incomplete.

---

## 20. What is OOPs?

**OOPs (Object-Oriented Programming)** is a programming approach where you design your program around **objects** — just like the real world is made up of objects (a car, a person, a bank account).

Each object has:
- **Properties** (data) — what it *is* (name, age, color)
- **Behaviour** (methods) — what it *does* (walk, talk, drive)

### Why Do We Need It?
- To write code that is **closer to how the real world works**
- To make large programs **manageable, reusable, and maintainable**
- To prevent data from being accidentally modified (**security**)
- To build systems where adding new features doesn't break old code

### Advantages of OOPs:

| Advantage | Meaning |
|-----------|---------|
| **Modularity** | Code is divided into classes — each class handles one responsibility |
| **Reusability** | A class written once can be used in multiple places (via inheritance) |
| **Encapsulation** | Data is hidden and protected inside a class |
| **Abstraction** | You show only what's necessary, hide the complexity |
| **Polymorphism** | One thing behaves differently in different situations |
| **Scalability** | Easy to add new features without disturbing existing code |
| **Maintainability** | Bugs are easier to find and fix when code is organized in classes |

### Real-World Use Cases of OOPs:

| Application | How OOPs is Used |
|-------------|-----------------|
| **Banking App** | `Account` class with properties (balance, owner) and methods (deposit, withdraw) |
| **E-Commerce** | `Product`, `Cart`, `User`, `Order` — each is a class with its own data and behaviour |
| **Game Development** | `Player`, `Enemy`, `Weapon` classes — each object has health, speed, attack |
| **Hospital System** | `Doctor`, `Patient`, `Appointment` classes — all interconnected |
| **Social Media** | `User`, `Post`, `Comment`, `Like` — everything is an object |

---

## 21. What are Packages in Java?

A **package** is a **folder/container** that groups related classes together. It helps organize your code, especially when a project has many files.

### Why Do We Use Packages?

- **Organization** — keeps related classes in one place (just like folders on your computer)
- **Avoid naming conflicts** — two classes can have the same name if they are in different packages
- **Access control** — packages help control which classes can access which other classes
- **Reusability** — you can import and use packages across different projects

### Types of Packages:

| Type | Example | Meaning |
|------|---------|---------|
| **Built-in (Java provided)** | `java.util`, `java.io`, `java.lang` | Packages that Java gives you out of the box |
| **User-defined** | `com.myapp.models` | Packages you create to organize your own code |

```java
// Importing a built-in package
import java.util.Scanner;   // importing Scanner class from java.util package

// Declaring your own package at the top of a file
package com.myapp.models;  // this file belongs to the 'models' package

public class Person {
    // ...
}
```

> 💡 `java.lang` is the only package that is **automatically imported** in every Java program. That's why you can use `System.out.println` without importing anything.

---

## 22. What is the `void` Keyword?

`void` is a **return type** used in front of a method to indicate that the method **does not return any value**. It just performs a task and finishes.

### What does "return" mean?
When a method finishes its work, it can optionally **send back a result** to the place where it was called. That result is called a **return value**.

- If a method **returns something** → you specify the data type (`int`, `String`, `double`, etc.)
- If a method **returns nothing** → you write `void`

```java
// This method returns an int value
public static int add(int a, int b) {
    return a + b;   // sends back the result
}

// This method returns nothing — just prints
public static void greet(String name) {
    System.out.println("Hello, " + name);
    // no return statement needed
}
```

```java
int result = add(5, 3);    // ✅ stores the returned value
greet("Anuj");             // ✅ just runs — nothing to store
```

> 💡 **Simple way to remember:** `void` = *"This method does a job but doesn't hand anything back."* Like a worker who completes a task but doesn't give you a report — they just do the work.

---

## 23. Classes and Objects

### What is a Class?
A **class** is a **blueprint or template**. It defines what properties and behaviours an entity will have — but it doesn't store actual data itself.

> Think of a class like an **architectural plan of a house**. The plan describes how many rooms, doors, and windows there will be — but it's not a real house. The real house is built from the plan.

### What is an Object?
An **object** is a **real instance** created from a class. When you create an object, actual memory is allocated and it holds real data.

> Continuing the analogy — the **actual house built from the plan** is the object. You can build many houses (objects) from the same plan (class).

### Why Do We Need Them?

- To model real-world entities in code
- To bundle **related data and behaviour** together in one unit
- To create **multiple independent instances** from one blueprint
- To make code **reusable, clean, and organized**

### Real-World Use Cases:

| Real World | Class | Objects (Instances) |
|------------|-------|-------------------|
| People | `Person` | `p1 = Anuj`, `p2 = Prem` |
| Cars | `Car` | `car1 = Tesla`, `car2 = BMW` |
| Bank Accounts | `Account` | `acc1`, `acc2`, `acc3` |
| Students | `Student` | `s1`, `s2`, `s3` ... |

---

### Code Example — Explained:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p1 = new Person();   // object of Person class
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person();
        p2.age = 25;
        p2.name = "Prem";

        System.out.println(p1.age + " " + p1.name);   // 24 Anuj
        System.out.println(p2.age + " " + p2.name);   // 25 Prem
    }
}

class Person {   // Class Person — the blueprint
    String name;
    int age;
}
```

#### Line-by-line explanation:

| Line | Meaning |
|------|---------|
| `class Person` | Defines the blueprint — a Person has a `name` and `age` |
| `String name; int age;` | **Properties** — every Person object will have these fields (empty by default) |
| `Person p1 = new Person()` | Creates a new object `p1` of type `Person` in memory |
| `p1.age = 24` | Sets the `age` property of `p1` specifically to `24` |
| `p1.name = "Anuj"` | Sets the `name` property of `p1` to `"Anuj"` |
| `Person p2 = new Person()` | Creates a **completely separate** object `p2` — independent of `p1` |
| `p2.age = 25` | `p2` has its own `age` — changing this does NOT affect `p1.age` |

> 💡 **Key point:** `p1` and `p2` are two **independent objects** from the same `Person` class. They each have their own copy of `name` and `age`. Changing `p2.age` does not affect `p1.age` — just like two houses built from the same plan are still separate buildings.

You can create **as many objects** as you want from the same class:
```java
Person p3 = new Person();
Person p4 = new Person();
// each is a separate individual with their own data
```

---

## 24. Properties and Behaviour of a Class

Every class in OOPs has two things:

| Concept | What it is | Example (Person class) |
|---------|-----------|----------------------|
| **Properties** | Variables/data that describe the object — what it *has* | `name`, `age` |
| **Behaviour** | Methods that define what the object can *do* | `walk()`, `eat()`, `talk()` |

### Code Example — Explained:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person();
        p2.age = 25;
        p2.name = "Prem";

        System.out.println(p1.age + " " + p1.name);   // 24 Anuj
        System.out.println(p2.age + " " + p2.name);   // 25 Prem

        // Accessing the methods (behaviour)
        p1.eat();    // Anuj is eating
        p2.walk();   // Prem is walking
    }
}

class Person {
    // Properties — what a person HAS
    String name;
    int age;

    // Behaviour — what a person DOES
    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}
```

#### Key points:
- `p1.eat()` — calls the `eat()` method **on** the `p1` object. Inside the method, `name` automatically refers to `p1.name` which is `"Anuj"` → prints `"Anuj is eating."`
- `p2.walk()` — calls `walk()` **on** `p2`. Inside, `name` refers to `p2.name` which is `"Prem"` → prints `"Prem is walking."`
- The methods are defined **once** in the class but behave differently for each object because each object has its own `name`

---

# Four Pillars of OOPs

OOPs stands on **4 pillars**. Every concept in OOPs connects back to one of these.

---

## 1. Encapsulation
**"Hide your data, expose controlled access."**

Wrapping data (variables) and methods together inside a class, and making variables `private` so no one can directly touch them from outside. Access is only given through getters and setters.

```java
class BankAccount {
    private double balance;          // hidden
    public double getBalance() {     // controlled access
        return balance;
    }
}
```

> Real world: Your ATM card gives you controlled access to your bank balance — you can't directly open the bank's database and change your balance.

---

## 2. Inheritance
**"Child gets what parent has."**

One class (child) acquires the properties and methods of another class (parent) using the `extends` keyword. Avoids rewriting common code.

```java
class Animal {
    void eat() { System.out.println("eating..."); }
}
class Dog extends Animal {
    void bark() { System.out.println("barking..."); }
}
// Dog can eat() + bark() both
```

> Real world: A child inherits traits from parents — but also has their own unique qualities.

---

## 3. Polymorphism
**"One name, many forms."**

The same method name behaves differently depending on how it is used — different parameters (overloading) or different objects (overriding).

```java
void walk() { ... }          // walks normally
void walk(int steps) { ... } // walks specific steps
// same name — different behaviour
```

> Real world: A person can "drive" a car, "drive" a bike, or "drive" a bus — same word, different actions.

---

## 4. Abstraction
**"Show what is necessary, hide how it works."**

Exposing only the **essential features** of an object and hiding the internal implementation details. The user knows *what* something does, not *how* it does it.

```java
// You call this:
car.start();
// You don't need to know about fuel injection, engine ignition, spark plugs...
```

> Real world: You press the TV remote button — you don't know (or care) about the electronics inside. You just get the result.

---

## Quick Summary

| Pillar | One Line | Keyword |
|--------|----------|---------|
| **Encapsulation** | Hide data, control access | `private` + getters/setters |
| **Inheritance** | Child reuses parent's code | `extends` |
| **Polymorphism** | Same name, different behaviour | Overloading / Overriding |
| **Abstraction** | Hide complexity, show only essentials | `abstract`, `interface` |

---

*End of Notes — Four Pillars of OOPs*

---

## 25. Polymorphism

### What is Polymorphism?
**Polymorphism** means **"many forms"** (Greek: *poly* = many, *morphism* = forms).

In Java, it means **one method name can behave in different ways** depending on how it is used — different inputs, different objects, different situations.

### Why Do We Use It?
- To make code **flexible and reusable** — one method name for multiple use cases
- To write **cleaner code** — no need for `walkWithSteps()`, `walkWithoutSteps()` etc.
- To model real-world behaviour — a person can "walk" in many ways

### Real-World Applications:

| Real World | Polymorphism in action |
|------------|----------------------|
| A **person** can walk normally, walk fast, or walk a specific number of steps | Same `walk()` method, different parameters |
| A **payment system** can pay by card, UPI, or cash | Same `pay()` method, different implementations |
| A **shape** can calculate area — circle uses πr², rectangle uses l×b | Same `area()` method, different formulas per shape |
| A **notification** can be email, SMS, or push | Same `send()` method, different behaviour |

---

### Simple Example of Polymorphism:

```java
class Calculator {

    // Same method name 'add' — but different parameters (different forms)
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 3));          // 8
        System.out.println(calc.add(5, 3, 2));       // 10
        System.out.println(calc.add(2.5, 1.5));      // 4.0
    }
}
```

> The method name `add` is the same, but it works differently based on the arguments passed. **That is polymorphism.**

---

### Types of Polymorphism

>Both **Method Overloading and Method Overriding** are primarily examples of **Polymorphism** in Object-Oriented Programming (OOP).  
>Method Overloading → Compile-time Polymorphism (Static Polymorphism)  
>Method Overriding → Run-time Polymorphism (Dynamic Polymorphism)

---

### 1. Compile-Time Polymorphism (Method Overloading)

#### What is it?
When a class has **multiple methods with the same name but different parameters** (different number of arguments, or different data types). Java decides **at compile time** which version of the method to call.

Also called **Static Polymorphism** because the decision is made before the program runs.

#### How Java decides which method to call:
- Different **number** of parameters
- Different **data types** of parameters
- Different **order** of parameter types

```java
class Person {
    String name;

    void walk() {
        System.out.println(name + " is walking.");
    }

    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps.");
    }

    void walk(int steps, String direction) {
        System.out.println(name + " walked " + steps + " steps towards " + direction);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Anuj";

        p.walk();                      // Anuj is walking.
        p.walk(20);                    // Anuj walked 20 steps.
        p.walk(10, "North");           // Anuj walked 10 steps towards North
    }
}
```

> Java sees the method call at **compile time**, looks at the arguments, and picks the right version. No confusion.

---

### 2. Runtime Polymorphism (Method Overriding)

#### What is it?
When a **child class provides its own version** of a method that already exists in the **parent class**. Java decides **at runtime** (while the program is running) which version to call — the parent's or the child's.

Also called **Dynamic Polymorphism** because the decision happens while the program is executing.

> This requires **Inheritance** (parent-child relationship between classes) — which you'll learn in detail soon. For now, understand the concept.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");   // overrides parent's version
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");   // overrides parent's version
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();   // Dog barks   (decided at runtime — object is Dog)
        a2.sound();   // Cat meows   (decided at runtime — object is Cat)
    }
}
```

> Even though the variable type is `Animal`, Java looks at the **actual object** (`Dog` or `Cat`) at **runtime** and calls the correct version of `sound()`.

---

### Difference Between Compile-Time and Runtime Polymorphism

| | Compile-Time (Overloading) | Runtime (Overriding) |
|--|--------------------------|---------------------|
| **Also called** | Static polymorphism | Dynamic polymorphism |
| **When decided** | At compile time (before running) | At runtime (while running) |
| **How** | Same method name, different parameters | Child class redefines parent's method |
| **Requires inheritance?** | ❌ No | ✅ Yes |
| **Keyword used** | None | `@Override` (optional but recommended) |
| **Example** | `walk()` and `walk(int steps)` | `Dog` overrides `Animal`'s `sound()` |

---

### Polymorphism Example From Your Code — Explained:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person();
        p2.age = 25;
        p2.name = "Prem";

        System.out.println(p1.age + " " + p1.name);   // 24 Anuj
        System.out.println(p2.age + " " + p2.name);   // 25 Prem

        p1.eat();        // Anuj is eating.
        p2.walk();       // Prem is walking.
        p2.walk(20);     // Prem walked 20 steps   ← POLYMORPHISM in action
    }
}

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    // Overloaded version of walk — takes number of steps as argument
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
}
```

#### What's happening here:

| Method Call | Which method runs | Why |
|-------------|-----------------|-----|
| `p2.walk()` | `void walk()` | No arguments — matches the no-parameter version |
| `p2.walk(20)` | `void walk(int steps)` | One `int` argument — matches the overloaded version with `steps` |

This is **compile-time polymorphism (method overloading)** — both methods are named `walk`, but Java picks the right one based on the argument passed.

> 💡 `p2.walk()` prints `"Prem is walking."` and `p2.walk(20)` prints `"Prem walked 20 steps"` — **same method name, two different behaviours.** That is exactly what polymorphism means.

---
# Constructors & Static Keyword

---

## Constructors

### What is a Constructor?
A **constructor** is a special method that is **automatically called when you create an object** using `new`. Its job is to **initialize the object** — set up its properties right at the moment it is born.

```java
Person p1 = new Person();   // ← constructor is called HERE
```

### What does it do?
- Allocates memory for the object
- Sets initial values for the object's properties
- Runs automatically — you don't call it manually

### Why Do We Need Constructors?
Without a constructor, every time you create an object you'd have to manually set every property one by one. Constructors let you **set everything up in one shot** at the time of creation.

```java
// Without constructor — manual setup (messy)
Person p = new Person();
p.name = "Anuj";
p.age = 24;
p.city = "Delhi";

// With parameterised constructor — clean, one line
Person p = new Person("Anuj", 24, "Delhi");
```

### Advantages of Using Constructors:

| Advantage | Meaning |
|-----------|---------|
| **Auto-initialization** | Properties are set the moment object is created |
| **Cleaner code** | No need to set each property manually after creation |
| **Forced setup** | You can make sure required data is always provided |
| **Multiple setups** | Different constructors for different ways of creating an object |

---

### Rules of a Constructor:
- The constructor name **must be the same as the class name**
- It has **no return type** — not even `void`
- It is called **automatically** when `new` is used
- A class can have **multiple constructors** (different parameters)

---

### Types of Constructors

---

#### 1. Default Constructor
A constructor that takes **no arguments**. If you don't write any constructor in your class, Java automatically provides one (invisible). But you can also write your own default constructor to add some logic (like printing a message or setting default values).

```java
class Car {
    String brand;
    int speed;

    // Default constructor — no parameters
    Car() {
        brand = "Unknown";
        speed = 0;
        System.out.println("A Car object is created with default values.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();   // default constructor called
        System.out.println(c1.brand);   // Unknown
        System.out.println(c1.speed);   // 0
    }
}
```

> 💡 **Important:** If you don't write any constructor at all, Java silently gives you a default one. But the moment you write even one constructor yourself, Java stops providing the automatic one.

---

#### 2. Parameterised Constructor
A constructor that **accepts arguments** so you can pass values at the time of object creation.

```java
class Car {
    String brand;
    int speed;

    // Parameterised constructor
    Car(String newBrand, int newSpeed) {
        brand = newBrand;
        speed = newSpeed;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 200);   // values passed at creation
        Car c2 = new Car("BMW", 250);

        System.out.println(c1.brand + " - " + c1.speed);  // Tesla - 200
        System.out.println(c2.brand + " - " + c2.speed);  // BMW - 250
    }
}
```

---

#### 3. Copy Constructor
A constructor that **creates a new object as a copy of an existing object**. Java doesn't provide this automatically — you write it yourself.

```java
class Car {
    String brand;
    int speed;

    Car(String newBrand, int newSpeed) {
        brand = newBrand;
        speed = newSpeed;
    }

    // Copy constructor — takes another Car object as argument
    Car(Car other) {
        brand = other.brand;
        speed = other.speed;
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", 200);
        Car c2 = new Car(c1);   // c2 is a copy of c1

        System.out.println(c2.brand + " - " + c2.speed);  // Tesla - 200

        // They are independent — changing c2 does NOT affect c1
        c2.brand = "Audi";
        System.out.println(c1.brand);   // Tesla (unchanged)
        System.out.println(c2.brand);   // Audi
    }
}
```

---

### Full Example Using All Three Constructors:

```java
public class Main {
    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();
        System.out.println(s1.name + " - " + s1.marks);   // Unknown - 0

        // Using parameterised constructor
        Student s2 = new Student("Anuj", 95);
        System.out.println(s2.name + " - " + s2.marks);   // Anuj - 95

        // Using copy constructor
        Student s3 = new Student(s2);
        System.out.println(s3.name + " - " + s3.marks);   // Anuj - 95

        // s3 is independent of s2
        s3.name = "Prem";
        System.out.println(s2.name);   // Anuj (unchanged)
        System.out.println(s3.name);   // Prem
    }
}

class Student {
    String name;
    int marks;

    // 1. Default Constructor
    Student() {
        name = "Unknown";
        marks = 0;
        System.out.println("Default constructor called");
    }

    // 2. Parameterised Constructor
    Student(String newName, int newMarks) {
        name = newName;
        marks = newMarks;
        System.out.println("Parameterised constructor called");
    }

    // 3. Copy Constructor
    Student(Student other) {
        name = other.name;
        marks = other.marks;
        System.out.println("Copy constructor called");
    }
}
```

**Output:**
```
Default constructor called
Unknown - 0
Parameterised constructor called
Anuj - 95
Copy constructor called
Anuj - 95
Anuj
Prem
```

---

### Your Code Example — Explained Line by Line:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p1 = new Person();             // default constructor called
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person(21, "Shiva");  // parameterised constructor called

        p1.eat();        // Anuj is eating
        p2.walk();       // Shiva is walking
        p2.walk(20);     // Shiva walked 20 steps

        System.out.println(Person.count);  // 2
    }
}

class Person {
    String name;
    int age;

    static int count;   // belongs to the CLASS, not any object

    public Person() {   // Default Constructor
        count++;
        System.out.println("Creating an Object");
    }

    public Person(int newAge, String newName) {   // Parameterised Constructor
        name = newName;
        age = newAge;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
}
```

#### Line-by-line breakdown:

| Line | Meaning |
|------|---------|
| `Person p1 = new Person()` | Creates object `p1` — **default constructor** is called. `count` becomes 1. Prints `"Creating an Object"` |
| `p1.age = 24; p1.name = "Anuj"` | Properties set manually after creation (because default constructor didn't accept parameters) |
| `Person p2 = new Person(21, "Shiva")` | Creates object `p2` — **parameterised constructor** is called. `name` and `age` are set immediately. Note: `count++` is NOT in this constructor, so count stays at 1 |
| `static int count` | `count` belongs to the **class** not to any object — shared across all objects (explained in detail below) |
| `count++` | Every time the default constructor runs, the shared `count` goes up by 1 |
| `Person.count` | Accessed using the **class name** directly (not `p1.count`) — because it's a class-level (static) property |
| `System.out.println(Person.count)` | Prints `1` — only `p1` used the default constructor. `p2` used the parameterised one which didn't increment count |

> 💡 **Note:** In the output, `count` will be `1` (not `2`) because only the default constructor increments count, and only `p1` used the default constructor. `p2` used the parameterised one.

---

## Static Keyword

### What is `static`?
`static` is a keyword that makes a variable or method belong to the **class itself** rather than to any specific object.

- A **normal (non-static) variable** → each object gets its **own separate copy**
- A **static variable** → there is only **one shared copy** for the entire class — all objects share it

### What does it do?
- For **variables**: creates one shared variable at the class level — not duplicated per object
- For **methods**: the method can be called **without creating any object** — directly using the class name

### Why Do We Use It?
- When a value should be **shared across all objects** (e.g., a counter of how many objects were created)
- When a method doesn't need any object data to do its job (e.g., `Math.sqrt()`)
- To **save memory** — static variables exist only once, no matter how many objects exist

### Advantages:

| Advantage | Meaning |
|-----------|---------|
| **Memory efficient** | Only one copy exists regardless of how many objects are created |
| **Shared data** | All objects see the same value — useful for counters, config values |
| **No object needed** | Static methods/variables can be used directly via class name |
| **Utility methods** | Perfect for helper methods that don't need object state |

---

### Properties of Objects vs Properties of Class

This is the core concept behind `static`. Let's understand it clearly with an example:

```java
class Person {
    String name;       // object property — each person has their OWN name
    int age;           // object property — each person has their OWN age

    static int count;  // class property  — ONE count shared by ALL persons
}
```

```java
Person p1 = new Person();
p1.name = "Anuj";
p1.age = 24;

Person p2 = new Person();
p2.name = "Prem";
p2.age = 25;
```

**Memory picture:**

```
p1 object          p2 object         Person CLASS
-----------        -----------        ------------
name = "Anuj"      name = "Prem"      count = 2
age  = 24          age  = 25
```

- `name` and `age` are **separate for each object** — `p1` has its own, `p2` has its own
- `count` is **one value shared by all** — it lives at the class level, not inside any object

---

### Full Example — Static vs Non-Static:

```java
class Counter {
    String label;       // non-static — each object has its own label
    static int count;   // static — ONE shared count for ALL objects

    Counter(String label) {
        this.label = label;
        count++;   // every new object increments the SHARED count
    }

    static void showCount() {   // static method — no object needed to call this
        System.out.println("Total objects created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {

        Counter c1 = new Counter("First");
        Counter c2 = new Counter("Second");
        Counter c3 = new Counter("Third");

        System.out.println(c1.label);   // First  (own property)
        System.out.println(c2.label);   // Second (own property)

        // Accessing static variable — use CLASS name, not object name
        System.out.println(Counter.count);   // 3

        // Accessing static method — no object needed
        Counter.showCount();   // Total objects created: 3
    }
}
```

> ⚠️ You can technically write `c1.count` to access a static variable, but this is **bad practice** and misleading — it looks like `count` belongs to `c1` alone. Always use `ClassName.staticVariable` → `Counter.count`

---

### Static Method — No Object Needed

```java
class MathHelper {
    static int square(int n) {
        return n * n;
    }
}

public class Main {
    public static void main(String[] args) {
        // No object created — called directly using class name
        int result = MathHelper.square(5);
        System.out.println(result);   // 25
    }
}
```

> 💡 This is exactly how `Math.sqrt()`, `Math.abs()`, `Arrays.sort()` work in Java — they are all **static methods** of their classes. You never write `new Math()` — you just call `Math.sqrt(25)` directly.

---

### Quick Summary — Static vs Non-Static

| | Non-Static (Instance) | Static |
|--|----------------------|--------|
| **Belongs to** | Each individual object | The class itself |
| **Memory** | Separate copy per object | One shared copy |
| **Access** | Through object: `p1.name` | Through class: `Person.count` |
| **Needs object?** | ✅ Yes | ❌ No |
| **Use case** | Data unique to each object | Shared data, utility methods, counters |

---

*End of Notes — Constructors & Static Keyword*

---

# ☕ Java Notes — `this` Keyword

---

## `this` Keyword

### What is `this`?
`this` is a **reference variable** that refers to the **current object** — the object on which a method or constructor is being called right now.

Think of it like saying **"myself"** in real life. When you say *"my name is Anuj"* — the word *"my"* refers to yourself. In Java, `this` is that *"my"* — it refers to the current object.

---

### What Does It Do?
`this` has three main uses in Java:

1. **Distinguish between instance variables and parameters** when they have the same name
2. **Call one constructor from another constructor** using `this()`
3. **Pass the current object** as an argument to another method (less common, but valid)

---

### Why Do We Need It?

The most common problem is in constructors or methods where the **parameter name is the same as the instance variable name**. Java gets confused about which `name` you mean — the one coming in as argument, or the one that belongs to the object.

```java
class Person {
    String name;   // instance variable

    Person(String name) {   // parameter — same name!
        name = name;        // ❌ This does NOTHING useful
                            // Java thinks you're assigning the parameter to itself
                            // The instance variable 'name' never gets updated
    }
}
```

With `this`:
```java
class Person {
    String name;

    Person(String name) {
        this.name = name;   // ✅ 'this.name' = instance variable of THIS object
                            // 'name' = the parameter coming in
    }
}
```

> 💡 **`this.name`** means *"the `name` property that belongs to this current object"*
> **`name`** (without `this`) means *"the local parameter named `name`"*

---

### Advantages of Using `this`:

| Advantage | Meaning |
|-----------|---------|
| **No naming conflict** | You can use the same name for parameters and instance variables — code reads more naturally |
| **Clarity** | Makes it explicit that you're referring to the current object's property |
| **Constructor chaining** | Call one constructor from another to avoid repeating code using `this()` |
| **Cleaner code** | No need to invent ugly parameter names like `newName`, `newAge` just to avoid conflict |

---

### Use 1 — Resolving Name Conflict (`this.variable`)

```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;   // this.name → instance variable | name → parameter
        this.age = age;     // this.age  → instance variable | age  → parameter
    }

    void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
        // 'this' here is optional when there's no conflict, but makes it clear
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 21);
        s1.display();   // Name: Anuj, Age: 21
    }
}
```

---

### Use 2 — Constructor Chaining (`this()`)

`this()` is used to **call one constructor from another constructor** inside the same class. This avoids repeating the same code across multiple constructors.

```java
class Person {
    String name;
    int age;
    static int count;

    // Default constructor
    Person() {
        count++;
        System.out.println("Object is being created. Count: " + count);
    }

    // Parameterised constructor
    Person(int age, String name) {
        this();   // calls the default constructor first
                  // so count++ and the print happen here too
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();            // default constructor
        Person p2 = new Person(21, "Anuj");  // parameterised → also calls default via this()

        System.out.println(Person.count);    // 2
    }
}
```

**Output:**
```
Object is being created. Count: 1
Object is being created. Count: 2
```

> ⚠️ `this()` must always be the **very first line** inside a constructor. You cannot write anything before it.

---

### Your Code — Explained Line by Line:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p1 = new Person();              // default constructor called
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person(21, "Shiva");   // parameterised constructor called
                                               // which internally calls default constructor via this()

        p1.eat();
        p2.walk();
        p2.walk(20);

        System.out.println(Person.count);      // 2
    }
}

class Person {
    String name;
    int age;

    static int count;

    public Person() {                 // Default Constructor
        count++;
        System.out.println("Creating an Object");
    }

    public Person(int age, String name) {   // Parameterised Constructor
        this();     // calls the default constructor above
                    // so count++ runs here too → count becomes 2

        // name = name;   ❌ Can't do this — Java treats it as assigning parameter to itself
        // age = age;     ❌ Same problem — instance variable never gets set

        this.name = name;   // ✅ 'this.name' = instance variable, 'name' = parameter
        this.age = age;     // ✅ 'this.age'  = instance variable, 'age'  = parameter
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
}
```

#### Line-by-line breakdown:

| Line | Meaning |
|------|---------|
| `Person p1 = new Person()` | Default constructor runs → `count++` → count = 1, prints `"Creating an Object"` |
| `p1.age = 24; p1.name = "Anuj"` | Properties set manually since default constructor took no arguments |
| `Person p2 = new Person(21, "Shiva")` | Parameterised constructor runs |
| `this()` inside parameterised constructor | **Calls the default constructor first** → `count++` → count = 2, prints `"Creating an Object"` again |
| `// name = name` | ❌ This is **assigning the parameter to itself** — the instance variable `name` of the object never changes. This is the classic naming conflict bug. |
| `this.name = name` | ✅ `this.name` clearly means the object's own `name` property. `name` (right side) is the incoming parameter `"Shiva"` |
| `this.age = age` | ✅ Same — object's `age` property gets the value `21` from the parameter |
| `Person.count` | Accessed via class name — it's static (shared). Value is `2` because both `p1` and `p2` triggered `count++` (p2 triggered it through `this()`) |

**Output of the full program:**
```
Creating an Object
Creating an Object
Anuj is eating.
Shiva is walking.
Shiva walked 20 steps
2
```

---

### Quick Summary — All Uses of `this`

| Use | Syntax | Purpose |
|-----|--------|---------|
| Refer to current object's variable | `this.name` | Distinguish instance variable from parameter with same name |
| Call another constructor | `this()` or `this(args)` | Constructor chaining — avoid repeating code |
| Pass current object | `someMethod(this)` | Pass the current object as an argument to another method |

---

*End of Notes — `this` Keyword*

---

# Inheritance, `extends` & `super`

---

## Inheritance

### What is Inheritance?
**Inheritance** is an OOPs concept where one class **acquires the properties and behaviours of another class**. The class that gives its properties is called the **Parent class (Superclass)**, and the class that receives them is called the **Child class (Subclass)**.

In simple terms — the child class **inherits** everything the parent has, and can also add its own extra stuff on top.

> 💡 **Real life analogy:** A child inherits certain traits from their parents — eyes, height, surname. But the child also has their own unique personality. Same idea in Java — child class gets parent's properties + methods, and can add its own too.

---

### Advantages of Using Inheritance:

| Advantage | Meaning |
|-----------|---------|
| **Code Reusability** | Write common code once in the parent — all child classes automatically get it. No copy-pasting. |
| **Less Redundancy** | No need to rewrite the same properties/methods in every class |
| **Easy Maintenance** | Fix a bug in the parent class — all child classes get the fix automatically |
| **Extensibility** | Child class can add new features without touching the parent class |
| **Polymorphism support** | Inheritance is the foundation for runtime polymorphism (method overriding) |

---

# Types of Inheritance

---

## Types of Inheritance in Java

Java supports **5 types of inheritance**. But before jumping in — one important rule:

> ⚠️ **Java does NOT support Multiple Inheritance through classes** (one child, two parents). This is intentional — to avoid confusion and ambiguity. However, Java achieves it through **Interfaces** (covered later).

---

## 1. Single Inheritance

**One parent → One child.**

The simplest form. One class extends exactly one other class.

```
Person
  └── Developer
```

```java
class Person {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Developer extends Person {
    void code() {
        System.out.println(name + " is coding.");
    }
}

public class Main {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Anuj";
        d.eat();    // inherited from Person → Anuj is eating.
        d.code();   // Developer's own → Anuj is coding.
    }
}
```

---

## 2. Multilevel Inheritance

**A chain — child becomes parent of another child.**

Class A → Class B → Class C. B inherits from A, and C inherits from B. C gets everything from both A and B.

```
Person
  └── Developer
        └── SeniorDeveloper
```

```java
class Person {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Developer extends Person {
    void code() {
        System.out.println(name + " is coding.");
    }
}

class SeniorDeveloper extends Developer {
    void reviewCode() {
        System.out.println(name + " is reviewing code.");
    }
}

public class Main {
    public static void main(String[] args) {
        SeniorDeveloper sd = new SeniorDeveloper();
        sd.name = "Anuj";

        sd.eat();          // from Person        → Anuj is eating.
        sd.code();         // from Developer     → Anuj is coding.
        sd.reviewCode();   // own method         → Anuj is reviewing code.
    }
}
```

> 💡 `SeniorDeveloper` didn't define `eat()` or `code()` — it got them through the chain. This is the **property lookup flow** from inheritance — goes up the chain until found.

---

## 3. Hierarchical Inheritance

**One parent → Multiple children.**

One parent class is extended by more than one child class. Each child gets the parent's properties independently.

```
     Person
    /      \
Doctor   Teacher
```

```java
class Person {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Doctor extends Person {
    void treatPatient() {
        System.out.println("Dr. " + name + " is treating a patient.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println(name + " is teaching.");
    }
}

public class Main {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.name = "Ramesh";
        d.eat();             // from Person  → Ramesh is eating.
        d.treatPatient();    // own method   → Dr. Ramesh is treating a patient.

        Teacher t = new Teacher();
        t.name = "Suresh";
        t.eat();             // from Person  → Suresh is eating.
        t.teach();           // own method   → Suresh is teaching.
    }
}
```

> 💡 `Doctor` and `Teacher` are **independent** of each other — they just share the same parent. Changes in one child don't affect the other.

---

## 4. Multiple Inheritance (Through Interfaces Only)

**One child → Two or more parents.**

As mentioned, Java **does not allow** this with classes. If two parent classes have a method with the same name, Java wouldn't know which one to use — this is called the **Diamond Problem**.

```
// ❌ NOT allowed in Java:
class A { void hello() { } }
class B { void hello() { } }
class C extends A, B { }   // ERROR — which hello() to use?
```

Java solves this with **Interfaces** — a class can `implement` multiple interfaces.

```
  Flyable    Swimmable
      \        /
        Duck
```

```java
interface Flyable {
    void fly();   // no body — just declares the behaviour
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    String name;

    Duck(String name) {
        this.name = name;
    }

    public void fly() {
        System.out.println(name + " is flying.");
    }

    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        d.fly();    // Donald is flying.
        d.swim();   // Donald is swimming.
    }
}
```

> 💡 Interfaces will be covered in detail later. For now just understand — **multiple inheritance in Java = interfaces**, not classes.

---

## 5. Hybrid Inheritance (Through Interfaces Only)

**A combination of two or more types of inheritance.**

For example — Multilevel + Multiple together. Again, only possible through interfaces in Java, not through classes.

```
       Person
         |
      Developer         (Single/Multilevel)
      /       \
Freelancer   FullTimer   (Hierarchical)
```

```java
interface Billable {
    void sendInvoice();
}

interface Salaried {
    void receiveSalary();
}

class Person {
    String name;
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Developer extends Person {
    void code() {
        System.out.println(name + " is coding.");
    }
}

class Freelancer extends Developer implements Billable {
    Freelancer(String name) {
        this.name = name;
    }

    public void sendInvoice() {
        System.out.println(name + " sent an invoice.");
    }
}

class FullTimer extends Developer implements Salaried {
    FullTimer(String name) {
        this.name = name;
    }

    public void receiveSalary() {
        System.out.println(name + " received salary.");
    }
}

public class Main {
    public static void main(String[] args) {
        Freelancer f = new Freelancer("Anuj");
        f.eat();           // from Person       → Anuj is eating.
        f.code();          // from Developer    → Anuj is coding.
        f.sendInvoice();   // own + interface   → Anuj sent an invoice.

        FullTimer ft = new FullTimer("Prem");
        ft.eat();              // from Person       → Prem is eating.
        ft.code();             // from Developer    → Prem is coding.
        ft.receiveSalary();    // own + interface   → Prem received salary.
    }
}
```

---

## Quick Summary

| Type | Structure | Supported Via |
|------|-----------|--------------|
| **Single** | One parent → One child | Classes ✅ |
| **Multilevel** | A → B → C (chain) | Classes ✅ |
| **Hierarchical** | One parent → Many children | Classes ✅ |
| **Multiple** | One child → Two parents | Interfaces only ✅ |
| **Hybrid** | Mix of above types | Interfaces only ✅ |

> ⚠️ **Remember:** Multiple and Hybrid inheritance using **classes** is **not allowed** in Java. Only through **interfaces**.

---

*End of Notes — Types of Inheritance*

---

### Real World Use Cases:

| Real World | Parent Class | Child Classes |
|------------|-------------|--------------|
| Vehicles | `Vehicle` (speed, fuel, move()) | `Car`, `Bike`, `Truck` |
| People | `Person` (name, age, eat(), walk()) | `Developer`, `Doctor`, `Teacher` |
| Animals | `Animal` (sound(), eat()) | `Dog`, `Cat`, `Bird` |
| Bank Accounts | `Account` (balance, deposit(), withdraw()) | `SavingsAccount`, `CurrentAccount` |
| E-Commerce | `User` (name, email, login()) | `Buyer`, `Seller`, `Admin` |

---

### Real World Example:

Imagine you're building a school system. Every person in the school has a `name`, `age`, and can `eat()` and `walk()`. Instead of writing these in every class — you put them in a `Person` parent class and let `Student`, `Teacher`, `Principal` inherit from it. Each child adds only what makes them unique.

```
Person  →  name, age, eat(), walk()
   ├── Student   → rollNumber, study()
   ├── Teacher   → subject, teach()
   └── Principal → school, manage()
```

---

### Coding Example:

```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);   // calls Animal's constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Bruno");
        d.eat();    // inherited from Animal — Bruno is eating.
        d.sleep();  // inherited from Animal — Bruno is sleeping.
        d.bark();   // Dog's own method  — Bruno is barking.

        Cat c = new Cat("Kitty");
        c.eat();    // inherited — Kitty is eating.
        c.meow();   // Cat's own — Kitty is meowing.
    }
}
```

> `Dog` and `Cat` didn't define `eat()` or `sleep()` — they got them **for free** from `Animal` through inheritance.

---

## `extends` Keyword

### What is `extends`?
`extends` is the keyword used in Java to **establish an inheritance relationship** between two classes.

```java
class Child extends Parent {
    // Child now has everything Parent has
}
```

- The class written **before** `extends` → Child class
- The class written **after** `extends` → Parent class

```java
class Developer extends Person {
    // Developer is the child
    // Person is the parent
    // Developer inherits all properties and methods of Person
}
```

### What does it do?
- Gives the child class **access to all non-private** properties and methods of the parent
- Creates an **"is-a" relationship** — `Developer` IS-A `Person`, `Dog` IS-A `Animal`
- Java supports **single inheritance** through `extends` — one class can extend only one parent class at a time

---

## `super` Keyword

### What is `super`?
`super` is a reference variable that refers to the **immediate parent class** of the current child class. Just like `this` refers to the current object, `super` refers to the parent.

### What does it do?
- **Call the parent's constructor** → `super()` or `super(args)`
- **Access parent's method** → `super.methodName()`
- **Access parent's variable** → `super.variableName` (when child has a variable with the same name)

### Why Do We Use It?
When a child class is created, the **parent must be initialized first**. `super()` ensures the parent constructor runs and sets up the parent's part of the object before the child adds its own stuff.

### Advantages:

| Advantage | Meaning |
|-----------|---------|
| **Parent initialization** | Ensures parent's constructor runs and its properties are set up |
| **Avoid code duplication** | Reuse parent's constructor logic instead of rewriting it |
| **Access overridden methods** | Call parent's version of a method even when the child has overridden it |
| **Clear and explicit** | Makes it obvious you're referring to the parent |

---

### How `super` Works in Inheritance — Constructor Flow:

When you create a child object, Java **always initializes the parent first**. If you don't write `super()` yourself, Java **automatically inserts** `super()` (calls the parent's default constructor) as the first line of the child's constructor.

If the parent doesn't have a default constructor (only a parameterised one), you **must explicitly call** `super(args)` yourself — otherwise Java will give a compile error.

```java
class Person {
    String name;
    int age;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class Developer extends Person {
    Developer(int age, String name) {
        super(age, name);   // MUST call — Person has no default constructor
                            // passes age and name up to Person's constructor
        // after this line, name and age are already set by Person's constructor
    }
}
```

---

### Property Lookup Flow in Inheritance

When you access a property or method on a child object, Java searches in this order:

```
Child Object
     ↓  (not found here?)
Child Class
     ↓  (not found here?)
Parent Class
     ↓  (not found here?)
Grandparent Class
     ↓  (not found here?)
... up the chain ...
     ↓
Object Class (topmost class in Java — every class extends this)
     ↓
Not found anywhere → Compile Error
```

**Example:**
```java
class A {
    void hello() {
        System.out.println("Hello from A");
    }
}

class B extends A {
    // no hello() here
}

class C extends B {
    // no hello() here either
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.hello();   // Java looks in C → not found
                       // looks in B → not found
                       // looks in A → FOUND ✅
                       // prints: Hello from A
    }
}
```

---

### Your Code — Explained Line by Line:

```java
public class mainClass {
    public static void main(String[] args) {

        Person p2 = new Person(21, "Shiva");
        p2.eat();

        Developer d1 = new Developer(25, "Anuj");
        d1.walk();
    }
}

class Developer extends Person {   // Developer IS-A Person (child class)

    public Developer(int age, String name) {
        super(age, name);   // calls Person's parameterised constructor
                            // Person sets this.name and this.age
    }

    // Method Overriding — Developer has its own version of walk()
    // This is also Runtime Polymorphism
    void walk() {
        System.out.println("Developer " + name + " is walking.");
    }
}

class Person {   // Parent Class
    String name;
    int age;

    static int count;

    public Person() {   // Default Constructor
        count++;
        System.out.println("Creating an Object");
    }

    public Person(int age, String name) {   // Parameterised Constructor
        this.name = name;
        this.age = age;
    }

    void walk() {
        System.out.println(name + " is walking.");
    }
    void eat() {
        System.out.println(name + " is eating.");
    }
    void walk(int steps) {
        System.out.println(name + " walked " + steps + " steps");
    }
    void doWork() {
        System.out.println("Person is working.");
    }
}
```

#### Line-by-line breakdown:

| Line | Meaning |
|------|---------|
| `class Developer extends Person` | `Developer` is the child class. It inherits all properties (`name`, `age`) and methods (`walk()`, `eat()`, `doWork()`) from `Person` |
| `Person p2 = new Person(21, "Shiva")` | Creates a `Person` object. Parameterised constructor runs → `name = "Shiva"`, `age = 21` |
| `p2.eat()` | Calls `eat()` on `p2` → prints `"Shiva is eating."` |
| `Developer d1 = new Developer(25, "Anuj")` | Creates a `Developer` object. `Developer`'s constructor runs first |
| `super(age, name)` | Inside Developer's constructor — calls `Person`'s parameterised constructor with `25` and `"Anuj"`. Person sets `this.name = "Anuj"` and `this.age = 25` |
| `d1.walk()` | Java looks for `walk()` in `Developer` → **FOUND** (Developer has its own `walk()`) → prints `"Developer Anuj is walking."` |
| Developer's `walk()` | This **overrides** Person's `walk()`. Only `Developer` objects use this version — `Person` objects still use their own `walk()`. This is **Runtime Polymorphism** |
| `name` used inside Developer's `walk()` | `name` is not defined in `Developer` — Java goes up to `Person` and finds it there. This is the **property lookup flow** in action |

---

### Output:
```
Shiva is eating.
Developer Anuj is walking.
```

### Why does `d1.walk()` print "Developer Anuj is walking." and not "Anuj is walking."?
Because `Developer` has its **own `walk()` method** that overrides `Person`'s `walk()`. When Java sees `d1.walk()` and `d1` is a `Developer` object, it finds `walk()` in `Developer` first — so it uses that version, never going up to `Person`'s `walk()`.

> 💡 **This is Runtime Polymorphism** — both `Person` and `Developer` have a `walk()` method, but Java decides **at runtime** which one to call based on the actual object type.

---

### Summary — Inheritance, `extends`, `super` in One Picture:

```
Person (Parent)
├── name, age           ← properties
├── walk(), eat()       ← methods
└── Person(int, String) ← constructor

        ↓  extends

Developer (Child)
├── inherits: name, age, eat(), walk(int), doWork()
├── own walk() → overrides Person's walk()
└── Developer(int, String) → calls super(age, name) to init parent
```

---

*End of Notes — Inheritance, `extends` & `super`*

---

# Packages, Access Modifiers & Encapsulation

---

## Packages

### What is a Package?
A **package** is a way to **group related classes and interfaces together** under one namespace. Think of it like a **folder system** for your Java files — instead of dumping every `.java` file in one place, you organize them into meaningful groups.

```
com.school
   ├── models
   │     ├── Student.java
   │     └── Teacher.java
   ├── services
   │     └── FeeService.java
   └── utils
         └── Calculator.java
```

---

### What Does it Do?
- Groups related classes in one place
- Prevents **naming conflicts** — two classes in different packages can have the same name
- Controls **who can access what** using access modifiers
- Makes large projects **easy to navigate and maintain**

---

### Benefits of Using Packages:

| Benefit | Meaning |
|---------|---------|
| **Organization** | Related classes stay together — easy to find and manage |
| **No naming conflicts** | `com.school.models.Person` and `com.hospital.models.Person` can both exist |
| **Access control** | Package-level visibility — classes only expose what they want to |
| **Reusability** | Package your classes once, import and use anywhere |
| **Modularity** | Different teams can work on different packages independently |

---

### Packages vs Folders — The Differences:

People often confuse packages with folders because packages look like folder paths. But they are different:

| | Folders | Packages |
|--|---------|---------|
| **What it is** | A file system concept — stores files on disk | A Java concept — groups classes logically |
| **Purpose** | Store any type of file | Organize Java classes specifically |
| **Java awareness** | Java doesn't care about folders directly | Java reads the `package` declaration inside the file |
| **Naming** | Can have spaces, special characters | Must follow Java naming rules — lowercase, no spaces |
| **Declaration** | No declaration needed | Must declare at top of file: `package com.school.models;` |
| **Access control** | No | Yes — packages control visibility of classes |

> 💡 Packages and folders work **together** — the folder structure on disk must **match** the package declaration inside the file. But a folder alone is just storage; a package is a Java-recognized grouping with access rules.

---

### Full Program Using Packages:

**Folder structure:**
```
src/
 └── com/
      └── school/
            ├── models/
            │     └── Student.java
            └── Main.java
```

**File: `com/school/models/Student.java`**
```java
package com.school.models;   // declares this class belongs to this package

public class Student {
    public String name;
    public int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}
```

**File: `com/school/Main.java`**
```java
package com.school;

import com.school.models.Student;   // importing Student from another package

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anuj", 95);
        s1.display();   // Name: Anuj, Marks: 95
    }
}
```

**Line-by-line explanation:**

| Line | Meaning |
|------|---------|
| `package com.school.models` | Declares that `Student` belongs to this package. Must be the first line of the file. |
| `public class Student` | `public` means this class is accessible from other packages |
| `import com.school.models.Student` | Brings the `Student` class into `Main` so we can use it |
| `Student s1 = new Student(...)` | Creates a Student object — works because we imported it |

---

### Can We Call a Function From Another Package?

**Yes, absolutely.** That is one of the main points of packages — reusability across the project.

To use a class or method from another package:
1. The class must be `public`
2. The method must be `public`
3. You must `import` it in your file

```java
// In package: com.school.utils
package com.school.utils;

public class MathHelper {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }
}
```

```java
// In package: com.school
package com.school;

import com.school.utils.MathHelper;   // import the class from another package

public class Main {
    public static void main(String[] args) {
        int sum = MathHelper.add(10, 20);          // calling method from another package
        double avg = MathHelper.average(10, 20);

        System.out.println("Sum: " + sum);         // Sum: 30
        System.out.println("Average: " + avg);     // Average: 15.0
    }
}
```

**Benefit of doing this:**
- You write utility/helper logic once in one package
- Any other class in any other package can import and use it
- No code duplication — one change fixes it everywhere

---

## Access Modifiers

### What are Access Modifiers?
**Access modifiers** are keywords that control **who can access a class, variable, method, or constructor**. They define the **visibility** and **scope** of your code.

Think of them like **permission levels** on a file:
- Some things are public — anyone can see
- Some things are private — only you can see
- Some things are in between

---

### Types of Access Modifiers in Java

---

### 1. `public`
**Accessible from everywhere** — same class, same package, different package, anywhere.

```java
package com.school.models;

public class Student {
    public String name;       // anyone can access this

    public void display() {   // anyone can call this
        System.out.println("Name: " + name);
    }
}
```

```java
// From a completely different package — still works
import com.school.models.Student;

Student s = new Student();
s.name = "Anuj";     // ✅ accessible — it's public
s.display();         // ✅ accessible — it's public
```

---

### 2. `private`
**Accessible only within the same class** — nothing outside can touch it, not even a subclass.

```java
class BankAccount {
    private double balance;   // only BankAccount class can access this

    private void deductFee() {   // only BankAccount can call this
        balance -= 10;
    }

    public void deposit(double amount) {
        balance += amount;   // ✅ inside the same class — can access private
    }

    public double getBalance() {
        return balance;      // ✅ controlled access to private data
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);

        // acc.balance = 9999;   ❌ ERROR — private, can't access from outside
        System.out.println(acc.getBalance());   // ✅ 1000.0 — through public method
    }
}
```

---

### 3. `protected`
**Accessible within the same package AND subclasses** (even in different packages).

```java
package com.school.models;

public class Person {
    protected String name;   // accessible in same package + subclasses

    protected void walk() {
        System.out.println(name + " is walking.");
    }
}
```

```java
package com.school.staff;   // different package

import com.school.models.Person;

public class Teacher extends Person {   // subclass of Person
    public void teach() {
        System.out.println(name + " is teaching.");   // ✅ protected — accessible in subclass
        walk();   // ✅ protected method — accessible in subclass
    }
}
```

```java
// From a non-subclass in a different package
Person p = new Person();
// p.name = "Anuj";   ❌ ERROR — not a subclass, different package
```

---

### 4. Default (No Modifier — Package-Private)
When you **don't write any modifier**, Java gives it **package-level access** — accessible only within the **same package**, not from outside.

```java
package com.school.models;

class Helper {              // no modifier — package-private
    void doSomething() {    // no modifier — package-private
        System.out.println("Helping...");
    }
}
```

```java
// Same package — works fine
package com.school.models;

class Student {
    void test() {
        Helper h = new Helper();
        h.doSomething();   // ✅ same package — accessible
    }
}
```

```java
// Different package — fails
package com.school;

import com.school.models.Helper;   // ❌ ERROR — Helper is not public, can't import
```

---

### Access Modifiers — Where Can They Be Used: (Chart)

| Modifier | Same Class | Same Package | Subclass (diff package) | Anywhere (diff package) |
|----------|-----------|-------------|------------------------|------------------------|
| `public` | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| Default (none) | ✅ | ✅ | ❌ | ❌ |
| `private` | ✅ | ❌ | ❌ | ❌ |

> 💡 **Order from most open to most restricted:**
> `public` → `protected` → default → `private`

---

### Practice Example — All Four Modifiers Together:

```java
package com.practice;

public class AccessDemo {
    public String publicVar = "I am public";
    protected String protectedVar = "I am protected";
    String defaultVar = "I am default (package-private)";
    private String privateVar = "I am private";

    public void showAll() {
        // Inside the same class — ALL are accessible
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);   // ✅ only place where private works
    }
}
```

```java
package com.practice;

public class SamePackageClass {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println(obj.publicVar);      // ✅ public
        System.out.println(obj.protectedVar);   // ✅ protected — same package
        System.out.println(obj.defaultVar);     // ✅ default — same package
        // System.out.println(obj.privateVar);  // ❌ private — can't access
    }
}
```

```java
package com.other;   // DIFFERENT package

import com.practice.AccessDemo;

public class DifferentPackageClass {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println(obj.publicVar);      // ✅ public — accessible anywhere
        // System.out.println(obj.protectedVar); // ❌ not a subclass — can't access
        // System.out.println(obj.defaultVar);   // ❌ different package — can't access
        // System.out.println(obj.privateVar);   // ❌ private — can't access
    }
}
```

---

## Encapsulation

### What is Encapsulation?
**Encapsulation** means **bundling the data (variables) and the methods that operate on that data together inside a class, and restricting direct access to the data from outside**.

In simple terms — **hide your data, expose controlled access**.

> 💡 **Real world analogy:** Think of a **capsule (medicine tablet)**. The medicine is packed inside and protected by the outer shell. You can't directly touch the medicine — you take the capsule as a whole. The shell controls how the medicine is delivered. Similarly, encapsulation wraps your data inside a class and controls how it is accessed.

---

### Where and Why Do We Use It?

| Where | Why |
|-------|-----|
| **Sensitive data** | Bank balance, password, medical records — should not be directly modified |
| **Validation needed** | You don't want someone setting `age = -500` — encapsulation lets you validate |
| **Internal logic hidden** | Others don't need to know HOW something works, just WHAT it does |
| **Prevent accidental changes** | Making variables `private` protects them from unintended modification |

---

### Applications and Use Cases:

| Application | What's Encapsulated |
|-------------|-------------------|
| **Banking App** | Account balance — only accessible via `deposit()` and `withdraw()` |
| **Login System** | Password — stored privately, only compared internally |
| **E-Commerce** | Product price — can't be set to negative via validation in setter |
| **Hospital System** | Patient medical data — only doctors (authorized methods) can update it |

---

### Full Encapsulation Program — Explained:

```java
public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Anuj", 5000);

        System.out.println(acc.getOwner());     // Anuj
        System.out.println(acc.getBalance());   // 5000.0

        acc.deposit(2000);
        System.out.println(acc.getBalance());   // 7000.0

        acc.withdraw(10000);   // Insufficient balance!
        System.out.println(acc.getBalance());   // 7000.0 — unchanged

        // acc.balance = 99999;   ❌ ERROR — balance is private, can't touch directly
    }
}

class BankAccount {
    private String owner;    // private — hidden from outside
    private double balance;  // private — can't be directly changed

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    // Controlled access to balance — read only
    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    // Controlled way to add money — with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Controlled way to remove money — with validation
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}
```

**Output:**
```
Anuj
5000.0
Deposited: 2000.0
7000.0
Insufficient balance!
7000.0
```

**Line-by-line explanation:**

| Line | Meaning |
|------|---------|
| `private double balance` | Balance is hidden — no one outside the class can write `acc.balance = 99999` |
| `public double getBalance()` | The only way to READ balance — controlled, read-only access |
| `deposit(double amount)` | The only way to ADD money — validates that amount is positive before adding |
| `withdraw(double amount)` | The only way to REMOVE money — validates that enough balance exists |
| `acc.balance = 99999` | ❌ This is blocked — `private` prevents this entirely |

> 💡 **The power of encapsulation:** Even if someone creates a `BankAccount` object, they **cannot set balance to any random value**. They must go through `deposit()` and `withdraw()` — which have your validation logic. Your data is protected.

---

## Getters and Setters

### What are They?
**Getters and Setters** are `public` methods used to **read and write private variables** in a controlled way.

- **Getter** → a method that **returns** the value of a private variable (`get` + VariableName)
- **Setter** → a method that **sets/updates** the value of a private variable (`set` + VariableName)

They are the standard way to implement encapsulation in Java.

---

### Why Do We Use Them?
Because variables are `private` (hidden), you need a controlled door to access them. Getters and setters are that door — but with **guards** (validation logic) at the door.

---

### Benefits:

| Benefit | Meaning |
|---------|---------|
| **Validation** | You can check if the value is valid before setting it (`age` can't be negative) |
| **Read-only fields** | Provide only a getter (no setter) — field becomes read-only from outside |
| **Write-only fields** | Provide only a setter (no getter) — field becomes write-only (rare but possible) |
| **Flexibility** | Change internal logic without affecting code that uses the class |
| **Debugging** | Add print/log statements inside getter/setter to track changes |

---

### Full Example — Getters and Setters:

```java
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();

        // Using setters — with validation
        s1.setName("Anuj");
        s1.setAge(21);
        s1.setMarks(95);

        // Invalid inputs — setters block them
        s1.setAge(-5);       // Invalid age!
        s1.setMarks(150);    // Marks can't exceed 100!

        // Using getters — to read values
        System.out.println("Name: " + s1.getName());    // Anuj
        System.out.println("Age: " + s1.getAge());      // 21
        System.out.println("Marks: " + s1.getMarks());  // 95

        // Direct access is blocked
        // s1.name = "Prem";   ❌ ERROR — private
        // s1.age = -5;        ❌ ERROR — private
    }
}

class Student {
    private String name;
    private int age;
    private int marks;

    // ---- Getters ----

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    // ---- Setters ----

    public void setName(String name) {
        this.name = name;   // no validation needed for name here
    }

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            System.out.println("Invalid age! Age not updated.");
        } else {
            this.age = age;
        }
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Marks must be between 0 and 100.");
        } else {
            this.marks = marks;
        }
    }
}
```

**Output:**
```
Invalid age! Age not updated.
Invalid marks! Marks must be between 0 and 100.
Name: Anuj
Age: 21
Marks: 95
```

---

### Naming Convention for Getters and Setters:

| Variable | Getter | Setter |
|----------|--------|--------|
| `name` | `getName()` | `setName(String name)` |
| `age` | `getAge()` | `setAge(int age)` |
| `isActive` (boolean) | `isActive()` | `setActive(boolean active)` |

> For `boolean` variables, the getter is named `is` + VariableName, not `get`.

```java
private boolean active;

public boolean isActive() {   // getter for boolean
    return active;
}

public void setActive(boolean active) {
    this.active = active;
}
```

---

### Encapsulation + Getters/Setters — How They Work Together:

```
private variable         →   data is hidden (Encapsulation)
     +
public getter/setter     →   controlled door to access the data
     =
Data is protected but still usable in a safe, validated way
```

> 💡 **Encapsulation is the concept. Getters and Setters are the tool to implement it.**

---

*End of Notes — Packages, Access Modifiers & Encapsulation*

---

# Abstraction, Abstract Classes & Interfaces

---

## Abstraction

### What is Abstraction?
**Abstraction means hiding the internal complexity and showing only what is necessary to the user.**

The user should know **what** something does — not **how** it does it internally.

> 💡 **Basic understanding:** You press the accelerator in a car — the car speeds up. You don't need to know about the fuel injection system, pistons, or engine timing. That complexity is hidden. You only see what matters — the car moves faster.

---

### Why Do We Use It?
- To reduce complexity for the user of a class
- To enforce a structure — every child class **must** implement certain methods
- To separate **what to do** from **how to do it**
- To make large systems manageable — each layer only knows what it needs to

---

### Significance in Real-World Software Development:

| Real World | What's Abstracted |
|------------|------------------|
| **Payment Gateway** | You call `pay()` — internally it handles UPI, card, net banking, encryption. You see none of that. |
| **Database Connection** | You call `connect()` — internally it manages drivers, ports, credentials. Hidden from you. |
| **Android Apps** | You call `sendNotification()` — Android handles background services, OS calls. You don't care. |
| **ATM Machine** | You press "Withdraw" — internally it verifies PIN, checks balance, communicates with server. Hidden. |

---

### Two Ways to Achieve Abstraction in Java:
1. **`abstract` keyword** — Partial abstraction
2. **Interfaces** — Full abstraction

---

## 1. `abstract` Keyword

### What is the `abstract` Keyword?
`abstract` is a keyword used to declare a class or method as **incomplete** — meaning it is a template that child classes must complete.

- An **abstract class** cannot be instantiated (you cannot create objects of it)
- An **abstract method** has no body — just a declaration. The child class **must** provide the body.

---

### Before Using `abstract` — The Problem:

```java
class Car {
    int price;

    void start() {
        System.out.println("Car is starting.");
    }
}

class Audi extends Car { }
class BMW extends Car { }
```

**What's wrong here?**
- `Car` is just a concept — a real car is always an Audi, BMW, or some specific brand. Nobody drives a "Car" — they drive a specific type.
- But nothing is stopping someone from writing `Car c = new Car()` — which makes no sense
- Also, `start()` in `Car` prints "Car is starting" — but every car starts differently. This generic implementation is useless and misleading.
- There is **no guarantee** that Audi or BMW will override `start()` — they might just inherit the wrong generic version

---

### After Using `abstract` — The Solution:

```java
public class mainClass {
    public static void main(String[] args) {

        // Car c = new Car();   ❌ ERROR — can't create object of abstract class
        // Car is just a concept — making its object is useless

        Audi a1 = new Audi();
        a1.start();   // Output: Audi is starting.
    }
}

class Audi extends Car {
    @Override
    void start() {
        System.out.println("Audi is starting.");
    }
}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("BMW is starting.");
    }
}

abstract class Car {
    int price;

    abstract void start();   // Abstract method — no body, no { }
}
```

**Output:**
```
Audi is starting.
```

---

### Line-by-Line Explanation:

| Line | Meaning |
|------|---------|
| `abstract class Car` | Car is declared abstract — **no one can create a `Car` object** directly. It exists only to be extended. |
| `abstract void start()` | Abstract method — **only declaration, no body**. It says "every Car must have a `start()`, but I won't define how". |
| `class Audi extends Car` | Audi is a child of Car — it inherits `price` and is **forced** to define `start()` |
| `@Override` | Tells Java "I am providing the implementation of a method declared in the parent". Explained in detail below. |
| `void start() { ... }` | Audi's own version of `start()` — this is the required implementation |
| `Car c = new Car()` | ❌ This is blocked — abstract class cannot be instantiated |

---

### Why is This More Efficient Than Without `abstract`?

| Without `abstract` | With `abstract` |
|--------------------|----------------|
| Anyone can create a `Car` object — which makes no real sense | `Car` object creation is **blocked at compile time** |
| `Audi` and `BMW` might forget to override `start()` — they'd inherit the wrong generic version | Every child class is **forced** to override `start()` — compile error if they don't |
| No guarantee of consistent behaviour across child classes | Guaranteed — every child **must** implement abstract methods |
| Generic, meaningless implementation in parent | Parent has **no implementation** — each child defines its own correctly |

---

### What is an Abstract Method?

An **abstract method** is a method declared with the `abstract` keyword that has **no body** — just the signature.

```java
abstract void start();    // ✅ abstract method — no body
void start() { }          // ✅ concrete method — has body (even if empty)
```

#### Why define a method with no body?
Because the abstract class is saying: *"I don't know HOW this should work — that depends on who extends me. But I guarantee that every child WILL have this method."*

It is a **contract** — every child class must honour it by providing the implementation.

#### Why does a compile error occur if you don't override it?
Because Java sees: *"You extended an abstract class that has an abstract method. That method has no body yet. You haven't provided one either. So this class is still incomplete — I can't allow it."*

```java
class Ferrari extends Car {
    // Did NOT override start()
}
// ❌ COMPILE ERROR: Ferrari is not abstract and does not override abstract method start() in Car
```

---

### Rule: If a Method is Abstract, the Class Must Be Abstract Too

You **cannot** have an abstract method inside a non-abstract class. Because a non-abstract class must be complete — ready to create objects. An abstract method makes it incomplete.

```java
class Car {
    abstract void start();   // ❌ ERROR — Car is not abstract but has abstract method
}

abstract class Car {
    abstract void start();   // ✅ Fine — Car is abstract, so it can have abstract methods
}
```

---

### What is `@Override`?

`@Override` is an **annotation** (a special instruction to the compiler). It tells Java: *"The method below is intentionally overriding a method from the parent class."*

#### What does it do?
- It is not mandatory — the code works without it
- But it makes Java **verify** that you are actually overriding something from the parent
- If you make a typo in the method name (e.g., `strat()` instead of `start()`), Java will catch it and give an error — without `@Override`, Java would silently treat it as a new method

```java
class Audi extends Car {
    @Override
    void start() {              // ✅ Java confirms: yes, start() exists in Car
        System.out.println("Audi is starting.");
    }
}

class BMW extends Car {
    @Override
    void strat() {              // ❌ ERROR — no method called 'strat' in Car
        System.out.println("BMW is starting.");
    }
}
```

#### Why we use it:
- **Safety** — prevents accidental new method creation due to typos
- **Readability** — anyone reading the code immediately knows this method overrides a parent
- **Best practice** — always use it when overriding

---

## 2. Interfaces

### What is an Interface?
An **interface** is a completely abstract blueprint — it only declares **what** methods a class must have, never **how** they work. A class that uses an interface **must implement all its methods**.

- All methods in an interface are **`public` and `abstract` by default** — you don't need to write those keywords
- All variables in an interface are **`public`, `static`, and `final` by default** (constants)
- A class uses `implements` keyword (not `extends`) to use an interface

---

### How Does it Achieve Abstraction?
An interface provides **100% abstraction** — there is no implementation at all inside it. It is a pure contract. The implementing class decides everything about how the methods work.

---

### Why Do We Use Interfaces?

| Reason | Meaning |
|--------|---------|
| **Full abstraction** | Interface has zero implementation — pure "what to do", never "how" |
| **Multiple inheritance** | A class can implement multiple interfaces — solves Java's multiple inheritance limitation |
| **Contract enforcement** | Forces every implementing class to define all methods |
| **Loose coupling** | Code depends on the interface, not on a specific class — easier to swap implementations |

---

### Use Cases and Applications:

| Area | Interface Used |
|------|---------------|
| **Payment systems** | `Payable` interface — `CreditCard`, `UPI`, `NetBanking` all implement it |
| **Sorting algorithms** | `Comparable` interface — tells Java how to compare objects |
| **Event handling** | `OnClickListener` interface — Android uses this for button clicks |
| **Database layers** | `Repository` interface — switch from MySQL to MongoDB without changing business logic |
| **Collections framework** | `List`, `Map`, `Set` in Java are all interfaces |

---

### Your Code — Explained:

```java
public class Interfaces implements Car, Person {

    public static void main(String[] args) { }

    @Override
    public void start() {
        System.out.println("My car is starting");
    }

    @Override
    public void walk() {
        System.out.println("I am Walking.");
    }
}

interface Car {
    // public abstract void start();  // you CAN write this explicitly
    void start();   // same thing — public and abstract by default
}

interface Person {
    void walk();
}
```

| Line | Meaning |
|------|---------|
| `interface Car` | Declares a pure contract — any class that implements `Car` must define `start()` |
| `void start()` | Abstract method by default — no body allowed inside interface |
| `implements Car, Person` | The `Interfaces` class agrees to fulfil the contracts of **both** `Car` and `Person` |
| `@Override public void start()` | Providing the actual body for `Car`'s `start()` method |
| `@Override public void walk()` | Providing the actual body for `Person`'s `walk()` method |

---

### The Diamond Problem — Why Java Blocks Multiple Inheritance in Classes

The **Diamond Problem** occurs when a class inherits from two classes that both have a method with the same name — Java doesn't know which version to use.

```
      A
    (hello)
    /     \
   B       C
(hello)  (hello)
    \     /
      D
  (which hello? B's or C's?)
```

```java
class A {
    void hello() { System.out.println("Hello from A"); }
}
class B extends A {
    void hello() { System.out.println("Hello from B"); }
}
class C extends A {
    void hello() { System.out.println("Hello from C"); }
}
class D extends B, C { }   // ❌ Not allowed — which hello() does D get?
```

**Java's solution → Interfaces.** Since interfaces have no method bodies, there is no conflict — the implementing class writes its own body anyway:

```java
interface B {
    void hello();   // no body
}
interface C {
    void hello();   // no body
}
class D implements B, C {
    @Override
    public void hello() {
        System.out.println("Hello from D");   // D writes its own — no conflict
    }
}
```

No ambiguity — `D` provides the only implementation. Problem solved.

---

## `abstract` Class vs Interface — The Difference

Both help achieve abstraction, but they are used in different situations:

| | Abstract Class | Interface |
|--|---------------|-----------|
| **Abstraction level** | Partial — can have both abstract and concrete methods | Full — all methods are abstract by default |
| **Concrete methods** | ✅ Allowed | ❌ Not allowed (before Java 8) |
| **Variables** | Can have regular instance variables | Only `public static final` constants |
| **Constructor** | ✅ Can have constructors | ❌ Cannot have constructors |
| **Keyword** | `extends` | `implements` |
| **Multiple** | ❌ A class can extend only ONE abstract class | ✅ A class can implement MULTIPLE interfaces |
| **When to use** | When classes share common code + some behaviour varies | When you want to define a pure contract with no shared code |

---

### Concrete Method — What is it?
A **concrete method** is a normal method that **has a body** (implementation). It is the opposite of an abstract method.

```java
abstract class Car {
    int price;

    abstract void start();          // abstract method — no body

    void showPrice() {              // concrete method — has body
        System.out.println("Price: " + price);
    }
}
```

In an **abstract class** — both are allowed.
In an **interface** — only abstract methods (no concrete methods, no body).

---

### Final Example — Both Side by Side:

```java
// Abstract class — partial abstraction
abstract class Vehicle {
    String brand;

    // Concrete method — shared behaviour, has a body
    void refuel() {
        System.out.println(brand + " is being refuelled.");
    }

    // Abstract method — each vehicle starts differently
    abstract void start();
}

// Interface — full abstraction, pure contract
interface Electric {
    void charge();   // no body — implementing class decides
}

class Tesla extends Vehicle implements Electric {
    Tesla(String brand) {
        this.brand = brand;
    }

    @Override
    void start() {
        System.out.println(brand + " starts silently.");
    }

    @Override
    public void charge() {
        System.out.println(brand + " is charging.");
    }
}

public class Main {
    public static void main(String[] args) {
        Tesla t = new Tesla("Tesla");
        t.refuel();   // from abstract class (concrete method) → Tesla is being refuelled.
        t.start();    // overridden abstract method            → Tesla starts silently.
        t.charge();   // from interface                        → Tesla is charging.
    }
}
```

**Output:**
```
Tesla is being refuelled.
Tesla starts silently.
Tesla is charging.
```

> 💡 **When to use which:**
> - Use **abstract class** when child classes share some common code (like `refuel()`) but also need to define their own behaviour for some methods
> - Use **interface** when you just want to define a contract — no shared code, just "you must have these methods"

---

*End of Notes — Abstraction, Abstract Classes & Interfaces*