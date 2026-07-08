# Java Basics

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

# ☕ Java Notes — Section 3

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
