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
Now to use Lambda Expression we need to learn functional Interface.

Functional interface:
Interface having exaclty single abstract method but can have any number of defaults and
static methods. 
We can invoke lambda epression by using functional Interface.

