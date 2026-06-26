# Java 8 – Introduction & Features Overview

## 1. Introduction to Java 8

Java 8 is a major release that brought big changes to how we write Java code. Before Java 8 (i.e., in Java 7 and earlier), Java was purely object-oriented and code tended to be verbose. Java 8 was introduced to fix these pain points.

### Why Java 8 was introduced (3 main reasons)

1. **Concise and minimal code**
   Java 7 required a lot of boilerplate code to do simple things (like looping, sorting, or implementing a single-method interface). Java 8 reduces this verbosity drastically.

2. **Bring functional programming benefits into Java**
   Java was missing the benefits of functional programming (writing code as a sequence of function calls, passing behavior as data, etc.). Java 8 introduced features like Lambda Expressions and the Stream API to enable this.
   > Note: Java is still fundamentally an OOP language — Java 8 just *adds* functional capabilities on top of it; it didn't replace OOP.

3. **Enable parallel programming**
   Modern computers have multi-core processors, but old Java code was mostly written to run sequentially (single-threaded by default). Java 8 made it easier to write code that can automatically take advantage of multiple cores (e.g., parallel streams), making programs faster and more scalable.

---

## 2. Features of Java 8 — List

1. Lambda Expressions
2. Stream API
3. Date and Time API
4. Base64 Encode/Decode
5. Method Reference & Constructor Reference (`::` operator)
6. Default Methods in Interfaces
7. Static Methods in Interfaces
8. Functional Interface
9. Improvements in Java I/O — Optional class & Collection API improvements

---

## 3. Features Explained in Detail

### i. Lambda Expressions

**What it is:**
A Lambda Expression is like a method without a name, defined right where it's needed. It lets you write a function as a value and pass it around.

**Why introduced:**
Writing small, single-use functions (like a Runnable or a Comparator) required creating a whole class or anonymous class — too much boilerplate. Lambdas solve this by letting you write just the logic, without the ceremony.

**Basic syntax:**
```java
(parameters) -> expression_or_block
```

**Example:**
```java
(x, y) -> x + y
```

#### Steps to convert a normal method into a Lambda Expression

1. Remove the modifier (e.g., `private`, `public`)
2. Remove the return type
3. Remove the method name
4. Place the arrow `->` between parameters and body

#### Example 1 — No parameters

```java
// Given function
private void sayHello() {
    System.out.println("Hello World");
}

// Lambda expression
() -> { System.out.println("Hello World"); }
```

#### Example 2 — With parameters

```java
// Given function
private void add(int a, int b) {
    System.out.println(a + b);
}

// Lambda expression
(int a, int b) -> { System.out.println(a + b); }
```

#### Characteristics / Properties of Lambda Expressions

**1. Remove curly braces if body has only one statement**
```java
(int a, int b) -> { System.out.println(a + b); }
// becomes
(int a, int b) -> System.out.println(a + b);
```

**2. Type inference — compiler guesses the parameter types from context**
```java
(int a, int b) -> System.out.println(a + b);
// becomes
(a, b) -> System.out.println(a + b);
```

**3. No `return` keyword needed for single expression bodies**
```java
private int getStringLength(String str) {
    return str.length();
}
// becomes
(String str) -> { return str.length(); }
// becomes
(str) -> str.length();
```

**4. Remove parentheses if there is only one parameter**
```java
(str) -> str.length();
// becomes
str -> str.length();
```

#### Benefits of Lambda Expressions

1. Enables functional programming in Java
2. Makes code more readable, maintainable, and concise
3. Enables parallel processing (works well with Streams)
4. Reduces JAR file size (no extra anonymous class files generated)
5. Eliminates shadow variable issues (lambdas don't create their own `this`, avoiding accidental variable shadowing seen with anonymous classes)

---

### ii. Stream API

**What it is:**
The Stream API is used for performing **bulk data operations on collections** (like List, Set) — such as filtering, mapping, sorting, and reducing data — in a clean, functional style.

**Why introduced:**
Before Java 8, processing a collection (e.g., filtering even numbers, then sorting them) required writing explicit loops with temporary variables. This was repetitive and not easily parallelizable.

**How it solves the problem:**
Streams let you chain operations together in a pipeline, and the same code can run sequentially or in parallel just by calling `.parallelStream()` instead of `.stream()`.

**Example:**
```java
List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);

List<Integer> result = numbers.stream()
        .filter(n -> n % 2 == 0)   // keep even numbers
        .sorted()                  // sort them
        .collect(Collectors.toList());

System.out.println(result); // [2, 8]
```

**Benefits:**
- Less code for common operations (filter, map, sort, reduce, collect)
- Easy to switch between sequential and parallel execution
- Encourages a declarative style (describe *what* you want, not *how* to loop)

---

### iii. Date and Time API

**What it is:**
A brand-new date-time API under the package `java.time`, replacing the old, problematic `java.util.Date` and `java.util.Calendar` classes.

**Why introduced:**
The old `Date`/`Calendar` classes were mutable, not thread-safe, confusing to use (e.g., months were 0-indexed), and error-prone.

**How it solves the problem:**
The new API (classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`) is **immutable** and **thread-safe**, and has a much cleaner, intuitive API.

**Example:**
```java
LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(2000, 5, 20);

System.out.println(today);       // e.g., 2026-06-18
System.out.println(birthday);    // 2000-05-20
```

**Benefits:**
- Immutable objects → safe to share across threads
- Clearer, more readable method names
- Built-in support for time zones, periods, and durations

---

### iv. Base64 Encode/Decode

**What it is:**
Java 8 provides a built-in utility class, `java.util.Base64`, for encoding and decoding data in Base64 format.

**Why introduced:**
Before Java 8, developers had to rely on third-party libraries (like Apache Commons Codec) just to do Base64 encoding/decoding — not ideal for such a common need.

**How it solves the problem:**
Now it's available directly in the JDK, with no external dependency needed.

**Example:**
```java
String original = "Hello World";

// Encoding
String encoded = Base64.getEncoder().encodeToString(original.getBytes());
System.out.println(encoded); // SGVsbG8gV29ybGQ=

// Decoding
byte[] decodedBytes = Base64.getDecoder().decode(encoded);
System.out.println(new String(decodedBytes)); // Hello World
```

**Benefits:**
- No need for external libraries
- Simple, standard API for a common task (e.g., encoding data for URLs, emails, or storing binary data as text)

---

### v. Method Reference & Constructor Reference (`::` operator)

**What it is:**
A shorthand way to refer to an existing method or constructor instead of writing a lambda that just calls it. Uses the `::` operator.

**Why introduced:**
Sometimes a lambda expression does nothing but call one existing method — that's redundant. Method references remove this redundancy.

**Example:**
```java
// Using a lambda
list.forEach(s -> System.out.println(s));

// Using a method reference (cleaner)
list.forEach(System.out::println);

// Constructor reference
Supplier<ArrayList<String>> listSupplier = ArrayList::new;
```

**Benefits:**
- Even more concise than lambdas in these cases
- Improves readability by pointing directly to an existing, named behavior

---

### vi. Default Methods in Interfaces

**What it is:**
Java 8 allows interfaces to have method bodies, using the `default` keyword.

**Why introduced:**
Before Java 8, if you added a new method to an interface, every class implementing that interface would break (since they hadn't implemented it). Default methods solve this.

**How it solves the problem:**
A `default` method provides a default implementation, so existing classes don't need to implement it unless they want to override it.

**Example:**
```java
interface Vehicle {
    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    // No need to implement honk() unless we want a different behavior
}
```

**Benefits:**
- Allows interfaces to evolve without breaking existing implementations
- Supports backward compatibility (this is how Java added new methods to existing interfaces like `Collection` and `List`)

---

### vii. Static Methods in Interfaces

**What it is:**
Just like classes, interfaces in Java 8 can have `static` methods with a full implementation.

**Why introduced:**
Previously, utility/helper methods related to an interface had to be placed in a separate helper class (e.g., `Collections` for `Collection`). Static methods let you keep related logic inside the interface itself.

**Example:**
```java
interface MathOperation {
    static int square(int x) {
        return x * x;
    }
}

int result = MathOperation.square(5); // 25
```

**Benefits:**
- Keeps utility methods organized within the interface
- No need for a separate helper/utility class

---

### viii. Functional Interface

**What it is:**
A Functional Interface is an interface that has **exactly one abstract method** (it can have any number of default/static methods).

**Why introduced:**
Lambda expressions need a "target type" to know what kind of behavior they represent — functional interfaces provide that target type. Every lambda expression is essentially an instance of a functional interface.

**How it solves the problem:**
It connects lambda expressions to the type system — the compiler knows exactly what method the lambda is implementing.

**Example:**
```java
interface Greeting {
    void sayHello(String name);
}

Greeting greeting = name -> System.out.println("Hello, " + name);
greeting.sayHello("Prem"); // Hello, Prem
```

> Note: The `@FunctionalInterface` annotation is **optional** — it's not required to make an interface functional, but it's recommended because the compiler will throw an error if you accidentally add a second abstract method.

**Benefits:**
- Forms the foundation for using lambda expressions
- Built-in functional interfaces are provided (e.g., `Runnable`, `Comparator`, `Function`, `Predicate`, `Consumer`, `Supplier`) so you often don't even need to create your own

---

### ix. Improvements in Java I/O — Optional Class & Collection API Improvements

#### Optional Class

**What it is:**
`Optional<T>` is a container object that may or may not contain a non-null value. It's used to represent the possible absence of a value.

**Why introduced:**
The biggest pain point in Java was `NullPointerException`. Developers often forgot to check for `null`, causing runtime crashes.

**How it solves the problem:**
`Optional` forces you to explicitly handle the "value might not exist" case, making code safer and intentions clearer.

**Example:**
```java
Optional<String> name = Optional.ofNullable(getName());

if (name.isPresent()) {
    System.out.println(name.get());
} else {
    System.out.println("No name found");
}

// Cleaner way
System.out.println(name.orElse("Default Name"));
```

**Benefits:**
- Reduces `NullPointerException` issues
- Makes it explicit in the method signature that a value might be absent

#### Collection API Improvements

Java 8 added several handy default methods directly to collection interfaces, such as:

```java
list.forEach(System.out::println);     // iterate easily
list.removeIf(x -> x % 2 == 0);         // remove matching elements
map.computeIfAbsent(key, k -> value);   // add only if key is missing
map.getOrDefault(key, defaultValue);    // avoid null checks
```

**Benefits:**
- Less boilerplate for common collection tasks
- Works seamlessly with lambda expressions and streams

---

# Functional Interface

Now to use Lambda Expression we need to learn functional Interface.

## Functional Interface

> Functional interface:
> Interface having exaclty single abstract method but can have any number of defaults and
> static methods.
> We can invoke lambda epression by using functional Interface.

**Example:**
```java
interface Greeting {
    void sayHello(String name); // single abstract method
}

Greeting greeting = name -> System.out.println("Hello, " + name); // invoked using lambda
greeting.sayHello("Prem"); // Hello, Prem
```

---

## @FunctionalInterface Annotation

> It restrict the interface to be a Functional Interface.
> So if people have already used some lambda expression and some new
> team member added another abstract method in the Interface
> all lambda expression will have errors.

### What this annotation does

`@FunctionalInterface` is placed on top of an interface to tell the compiler: "this interface must always have exactly one abstract method."

```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}
```

If someone later tries to add a second abstract method to this interface, the **compiler will throw an error immediately** — instead of letting the code compile and breaking all the existing lambda expressions that use this interface.

```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
    void sayBye(String name); // ❌ Compile-time error: not a functional interface anymore
}
```

### Why this matters

- Without the annotation, the interface can still work as a functional interface (as long as it has just one abstract method) — the annotation is **optional**, not mandatory.
- But using it acts as a **safety check**. It catches mistakes early (at compile time) rather than letting a teammate accidentally break the interface, which would otherwise cause errors everywhere that interface's lambda expressions are used.
- This is especially useful in team projects, where someone unaware that an interface is meant to be functional might add another method without realizing the consequence.

---

### Q: What is the advantage of this annotation?

**A:** It forces the compiler to check, at compile time, that the interface has exactly one abstract method. So if a teammate accidentally adds a second abstract method, the build fails immediately with a clear error — instead of the mistake silently breaking every existing lambda expression that uses this interface somewhere else in the codebase. It essentially catches a design mistake early, before it can cause hidden runtime/compile errors elsewhere.

---

# Inheritance in Functional Interface

## What it does

A functional interface can also take part in inheritance — it can `extend` one or more other interfaces, just like a normal interface. Since Java allows interfaces to extend multiple interfaces (unlike classes), a functional interface can inherit abstract methods, default methods, and static methods from its parent interface(s).

Whether the resulting (child) interface is **still a functional interface** depends on how many distinct abstract methods it ends up with after inheritance — it must still have **exactly one abstract method** in total to qualify.

## Benefits of using this

- Allows code reuse — common method contracts can be defined once in a parent interface and reused by child interfaces.
- Lets you build a hierarchy of related single-method contracts instead of repeating the same method everywhere.
- Default and static methods from the parent interface also get inherited, so child interfaces don't need to redefine common logic.
- Helps in designing flexible APIs where multiple related functional interfaces share a common base behavior.

## How we use it

Same as normal interface inheritance — using the `extends` keyword. A child interface can extend **one or multiple** interfaces:

```java
interface A {
    void show();
}

interface B extends A {
    // inherits show() from A
}
```

```java
interface A {
    void show();
}

interface B {
    void display();
}

interface C extends A, B {
    // inherits both show() and display()
}
```

---

## The Four Conditions — When is an Inherited (Child) Interface Still a Functional Interface?

### Condition 1: Child extends one interface, adds no new method

```java
interface A {
    void show();
}

interface B extends A {
    // no new abstract method added
}
```

`B` has exactly one abstract method (`show`, inherited from `A`) → **B is a Functional Interface.** ✅ Can be used with a lambda.

---

### Condition 2: Child extends one interface and re-declares the same method

```java
interface A {
    void show();
}

interface B extends A {
    void show(); // re-declaring the same abstract method
}
```

Re-declaring the exact same method (same name, same signature) doesn't count as adding a *new* method — it's still treated as a single abstract method → **B is a Functional Interface.** ✅

---

### Condition 3: Child extends two interfaces having the same abstract method (same signature)

```java
interface A {
    void show();
}

interface B {
    void show();
}

interface C extends A, B {
}
```

Since both parent interfaces declare the **same method signature**, Java merges them into a single abstract method when inherited by `C` → **C is a Functional Interface.** ✅

---

### Condition 4: Child extends two interfaces having different abstract methods

```java
interface A {
    void show();
}

interface B {
    void display();
}

interface C extends A, B {
}
```

`C` now inherits **two different abstract methods** (`show()` and `display()`) → **C is NOT a Functional Interface.** ❌ A lambda expression cannot be assigned to `C` directly, since a lambda can only implement a single abstract method.

---

### Quick Summary Table

| Condition | Result |
|---|---|
| Extends 1 interface, no new method | ✅ Functional Interface |
| Extends 1 interface, re-declares same method | ✅ Functional Interface |
| Extends 2 interfaces, same method signature | ✅ Functional Interface |
| Extends 2 interfaces, different methods | ❌ Not a Functional Interface |

---

# Default Methods Inside Interface

> Until 1.7 only public abstract methods were allowed
> whether we declare by writing or not.
>
> Similarly public static final variable were allowed.
>
> Since java 8 we can have concrete methods as well inside
> interface

## What is "Default Methods"

A **default method** is a method inside an interface that has a method **body** (a concrete implementation), defined using the `default` keyword. Before Java 8, interfaces could only have abstract methods (no body) — default methods changed that by allowing interfaces to provide ready-to-use implementations too.

## Why we use it

- **Backward compatibility:** Before Java 8, if you added a new method to an existing interface, every class that implemented that interface would break (compile error) because it hadn't implemented the new method. Default methods solve this — you can add new functionality to an interface without breaking existing implementing classes.
- This is exactly how Java itself added new methods (like `forEach()` to `Collection`, `stream()` to `Collection`, etc.) in Java 8 without breaking millions of existing classes that implement those interfaces.

## What it does

A default method provides a **fallback/default implementation** inside the interface itself. Classes that implement the interface:
- Can use this default implementation as-is (no need to override it), **or**
- Can override it with their own custom implementation if needed.

## How we make it

Use the `default` keyword before the method, along with a method body — just like a normal method in a class:

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle starting...");
    }
}
```

## Example Code

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle starting...");
    }
}

class Car implements Vehicle {
    // Not overriding start() — will use the default implementation
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starting with a kick!");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();   // Output: Vehicle starting...

        Vehicle bike = new Bike();
        bike.start();  // Output: Bike starting with a kick!
    }
}
```

---

# Famous Interview Question: Default Method Conflict (Diamond Problem)

## The Problem

```java
package com.edigest.defaultMethods;

interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says hello");
    }
}

public class MyClass implements A, B {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello();
    }
}
```

### What is the problem here?

This code **will not compile**.

`MyClass` implements two interfaces, `A` and `B`, and **both** of them have a `default` method with the exact same signature: `sayHello()`. When `MyClass` tries to inherit from both interfaces, Java doesn't know **which version of `sayHello()`** to use — `A`'s version or `B`'s version.

This is known as the **"Diamond Problem"** for default methods. Since both interfaces provide an actual implementation (not just an abstract declaration), there's a genuine conflict, and the compiler refuses to guess — it throws a compile-time error like:

```
error: class MyClass inherits unrelated defaults for sayHello() from types A and B
```

This is exactly the kind of ambiguity that Java's single inheritance rule (for classes) was designed to avoid — but since interfaces support multiple inheritance, this conflict becomes possible with default methods.

---

## The Solution

To fix this, `MyClass` **must override** the conflicting method and explicitly tell Java which interface's version to use (or provide entirely new logic).

```java
package com.edigest.defaultMethods;

interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says hello");
    }
}

public class MyClass implements A, B {

    @Override
    public void sayHello() {
        A.super.sayHello(); // explicitly choosing A's version
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.sayHello(); // Output: A says Hello
    }
}
```

### Explanation of the solution

- By overriding `sayHello()` inside `MyClass`, we resolve the ambiguity ourselves instead of leaving it to the compiler.
- Inside the override, we use the special syntax **`InterfaceName.super.methodName()`** — here, `A.super.sayHello()` — to explicitly call interface `A`'s default implementation.
- We could just as easily call `B.super.sayHello()` instead, or even call **both**:
  ```java
  @Override
  public void sayHello() {
      A.super.sayHello();
      B.super.sayHello();
  }
  ```
- Or write a completely new implementation instead of reusing either interface's version:
  ```java
  @Override
  public void sayHello() {
      System.out.println("MyClass says Hello");
  }
  ```

This pattern (`Interface.super.method()`) is the standard way Java requires you to resolve conflicts when a class implements multiple interfaces that share a default method with the same signature.

---

# Static Methods in Interface

> Static Methods in Interface are those methods,
> which are defined in the interface with the
> keyword static.
> static methods contain the complete definition of
> the function
> cannot be overridden or changed in theimplementation class

## Q: What are the rules to access Static method of an interface in implementation class

**A:** The rules are:

1. A static method in an interface belongs to the **interface itself**, not to the implementing class or its objects.
2. It is **not inherited** by the implementing class — so you cannot call it using an object of the implementing class.
3. The **only way** to access it is by using the **interface name directly**: `InterfaceName.methodName()`.
4. It **cannot be overridden** in the implementing class. Even if the implementing class defines a method with the same signature, it is treated as a completely separate, unrelated method — not an override.

## Example Code

```java
package com.edigest.defaultMethods;

interface A {
    static void sayHello() {
        System.out.println("Hello !");
    }
}

public class MyClass implements A {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        // obj.sayHello();   // ❌ Not allowed — cannot access static method via object/class instance

        A.sayHello();        // ✅ Correct way — access using the interface name directly
    }
}

// Note: sayHello() cannot be overridden in MyClass.
```

---

## Main Method Inside Interface

we can write main(Static) method inside interface.

Since `main()` is just a `public static` method, and interfaces are allowed to have static methods (with a body) since Java 8, you can technically define and run a `main()` method directly inside an interface.

```java
package com.edigest.staticMethods;

public interface MyInterface {
    public static void main(String[] args) {
        System.out.println("Hello from Interface!");
    }
}
```

Running this interface directly will execute the `main()` method, just like it would in a regular class, and print:

```
Hello from Interface!
```

---

# How to Use Lambda Expression

> Functional Interface act as data type for lambda expression.

## Example

**Employee.java**
```java
package org.example;

public interface Employee {
    String getName();
}
```

**Main.java**
```java
package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = () -> "Software Engineer";
        System.out.println(employee.getName());

        // now we dont need separate implementation class and we can directly use interface.
    }
}
```

**Output:**
```
Software Engineer
```

## Explanation

> Interface reference can be used to hold lambda expression.
> Using lambda expression we don't need to use any
> separate implementation class.

Normally, to use an interface, you'd need to create a separate class that implements it:

```java
class SoftwareEngineer implements Employee {
    @Override
    public String getName() {
        return "Software Engineer";
    }
}

Employee employee = new SoftwareEngineer();
```

But since `Employee` is a **Functional Interface** (it has exactly one abstract method, `getName()`), we can skip creating a separate implementation class entirely. Instead, we directly assign a **lambda expression** to an `Employee` reference:

```java
Employee employee = () -> "Software Engineer";
```

Here:
- `Employee` acts as the **data type** for the lambda expression.
- The lambda `() -> "Software Engineer"` is treated as the implementation of `getName()` — no parameters (matching `getName()`'s signature) and it returns `"Software Engineer"`.
- Calling `employee.getName()` runs this lambda and returns `"Software Engineer"`.

This is the core idea behind using lambda expressions in Java — they let you provide behavior directly, without the boilerplate of writing a whole separate class just to implement one method.

--- 

# Thread using Lambda Expression

## Example

```java
package org.example;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello " + i);
            }
        };

        Thread childThread = new Thread(runnable);
        childThread.run();
    }
}
```

## Explanation

`Runnable` is a **Functional Interface** built into Java — it has exactly one abstract method:

```java
void run();
```

Before Java 8, to create a thread's task, you'd normally write an anonymous class:

```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
    }
};
```

Since `Runnable` is a functional interface, this can be replaced with a much shorter **lambda expression**:

```java
Runnable runnable = () -> {
    for (int i = 1; i <= 10; i++) {
        System.out.println("Hello " + i);
    }
};
```

This lambda becomes the implementation of `run()`. We then pass this `Runnable` to a `Thread` object:

```java
Thread childThread = new Thread(runnable);
```

## Important point: `run()` vs `start()`

In the example above, `childThread.run()` is called — but this is worth being careful about:

- `childThread.run()` → just calls the `run()` method like a **normal method call**, on the **current/main thread itself**. No new thread is actually created.
- `childThread.start()` → this is what actually creates and starts a **new thread**, which then internally calls `run()` on that new thread.

So to truly run this code in parallel on a separate thread, you should use:

```java
childThread.start(); // ✅ actually starts a new thread
```

Using `.run()` instead of `.start()` is a common mistake — the code will still execute and produce output, but it won't run on a separate thread, defeating the purpose of using `Thread` in the first place.

---

# Comparator using Lambda Expression:

What is comparator | Why we use it | benefits of using comparator | How we use comparator using lambda expression (explain and add one exmaple code)

# Lambda Expression and Anonymous Inner class.

What is anonymous Inner class.
Why it is needed 
Benefits of using Annonumous Inner class
Add aexample code and explain

# variables and this in lambda expression:

