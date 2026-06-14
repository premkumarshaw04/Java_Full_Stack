# Collections Framework

---

## What is the Collections Framework?

Before collections, if you wanted to store multiple values you used **arrays**. But arrays have problems:
- **Fixed size** — once declared, size cannot change
- **No built-in methods** — no sort, search, insert, delete built in
- **Hard to manage** — adding/removing elements is painful

The **Collections Framework** is a set of **ready-made classes and interfaces** in Java that give you flexible, powerful data structures to store, manage, and manipulate groups of objects — with all the operations (add, remove, search, sort) built in.

```java
// Old way — array (fixed, rigid)
int[] marks = new int[5];   // stuck with size 5 forever

// New way — collection (flexible, powerful)
ArrayList<Integer> marks = new ArrayList<>();
marks.add(95);
marks.add(88);
marks.remove(0);   // built-in operations — no manual work
```

---

### Why Do We Need It?
- Arrays are **fixed in size** — collections grow and shrink dynamically
- No need to write sorting, searching logic from scratch — it's all built in
- Different problems need different data structures — collections give you all of them
- Works with **generics** — type-safe storage (no accidental wrong types)

---

### Benefits & Advantages:

| Benefit | Meaning |
|---------|---------|
| **Dynamic size** | Grows and shrinks automatically as you add/remove elements |
| **Ready-made algorithms** | Sort, search, shuffle — all built in |
| **Type safety** | Generics prevent storing wrong data types |
| **Multiple data structures** | List, Set, Queue, Map — pick what fits your problem |
| **Less code** | No need to manually implement linked lists, trees, hash tables from scratch |
| **Interoperability** | All collections work with the same set of methods — easy to switch |

---

### Real-World Use Cases:

| Use Case | Collection Used |
|----------|----------------|
| Storing a list of students | `ArrayList` |
| Storing unique usernames | `HashSet` |
| Browser history (back/forward) | `Stack` / `Deque` |
| Task queue (first in, first out) | `Queue` |
| Storing key-value pairs (user ID → name) | `HashMap` |
| Leaderboard (sorted scores) | `TreeMap` / `TreeSet` |

---

## The Collections Framework — Full Structure

The framework is built around **interfaces** that define the behaviour, and **classes** that implement those interfaces.

There are **two separate hierarchies** inside the framework:

```
java.util
│
├── Collection Interface  (stores individual elements)
│     ├── List Interface
│     │     ├── ArrayList
│     │     ├── LinkedList
│     │     └── Vector
│     │           └── Stack
│     ├── Set Interface
│     │     ├── HashSet
│     │     ├── LinkedHashSet
│     │     └── SortedSet Interface
│     │           └── TreeSet
│     └── Queue Interface
│           ├── PriorityQueue
│           ├── ArrayDeque
│           └── Deque Interface
│                 └── LinkedList
│
├── Map Interface  (stores key-value pairs — NOT part of Collection)
│     ├── HashMap
│     ├── LinkedHashMap
│     ├── Hashtable
│     └── SortedMap Interface
│           └── TreeMap
│
└── Iterator Interface  (used to traverse/loop through collections)
```

---

## Collection Interface

### What is the Collection Interface?
`Collection` is the **root interface** of the collection hierarchy. It defines the **basic operations** that every collection must support — add, remove, size, contains, iterate, etc.

Every data structure like `ArrayList`, `HashSet`, `Queue` is ultimately a child of `Collection`.

### Why Do We Need It?
- It defines a **common contract** — any class implementing it must provide `add()`, `remove()`, `size()` etc.
- It allows **polymorphism** — you can write code that works on ANY collection type

```java
// Works for ArrayList, HashSet, LinkedList — all are Collection
public void printAll(Collection<String> items) {
    for (String item : items) {
        System.out.println(item);
    }
}
```

### Benefits:
- Provides a **unified API** — learn once, use on all collections
- Foundation for all other interfaces (List, Set, Queue all extend it)
- Enables writing **generic, reusable** code

---

### Collection Interface — Children (Diagram):

```
Collection Interface
│
├── List Interface  →  Ordered, allows duplicates, index-based access
│     ├── ArrayList      → Dynamic array, fast random access
│     ├── LinkedList     → Doubly linked list, fast insert/delete
│     └── Vector         → Thread-safe ArrayList (older)
│           └── Stack    → Last In First Out (LIFO)
│
├── Set Interface  →  Unordered, NO duplicates allowed
│     ├── HashSet        → Fastest, no order guaranteed
│     ├── LinkedHashSet  → Maintains insertion order
│     └── TreeSet        → Sorted order (natural/custom)
│
└── Queue Interface  →  Ordered for processing, First In First Out (FIFO)
      ├── PriorityQueue  → Elements processed by priority
      ├── ArrayDeque     → Double-ended queue (add/remove from both ends)
      └── LinkedList     → Also implements Queue
```

---

### Quick Summary of Children:

| Interface | Key Feature | Example Use |
|-----------|------------|-------------|
| **List** | Ordered + allows duplicates + index access | Student marks list |
| **Set** | No duplicates + unordered | Unique usernames |
| **Queue** | FIFO — first in, first out | Task processing |

---

## Map Interface

### What is the Map Interface?
`Map` is an interface that stores data as **key-value pairs** — every value is associated with a unique key. Think of it like a dictionary — you look up a word (key) and get its meaning (value).

> ⚠️ **Important:** `Map` is **NOT** a child of `Collection` interface. It is a **completely separate hierarchy** in the framework. But it is still part of the **Collections Framework**.

### Why Do We Need It?
- Sometimes you don't just want to store values — you want to **associate** them with something
- Fast lookup — find a value by its key in O(1) time (HashMap)
- Perfect for any kind of ID → data mapping

```java
HashMap<Integer, String> students = new HashMap<>();
students.put(1, "Anuj");
students.put(2, "Prem");
students.put(3, "Shiva");

System.out.println(students.get(2));   // Prem — found instantly by key
```

### Benefits:

| Benefit | Meaning |
|---------|---------|
| **Key-value storage** | Associate any data with a unique key |
| **Fast lookup** | Find values by key in constant time (HashMap) |
| **No duplicate keys** | Each key is unique — prevents data conflicts |
| **Flexible** | Keys and values can be any object type |

---

### Map Interface — Children (Diagram):

```
Map Interface  (key → value pairs, NOT a Collection)
│
├── HashMap         → Fastest, NO order guaranteed, allows one null key
├── LinkedHashMap   → Maintains insertion order
├── Hashtable       → Thread-safe, older version of HashMap
└── SortedMap Interface
      └── TreeMap   → Keys stored in sorted (natural) order
```

---

### Quick Summary of Map Children:

| Class | Key Feature | Example Use |
|-------|------------|-------------|
| **HashMap** | Fastest, unordered | User ID → User data |
| **LinkedHashMap** | Insertion order maintained | Cache (keep recent order) |
| **TreeMap** | Keys sorted automatically | Leaderboard (sorted by score) |
| **Hashtable** | Thread-safe (old) | Legacy multi-threaded apps |

---

### Collection vs Map — Key Difference:

| | Collection | Map |
|--|-----------|-----|
| **Stores** | Individual elements | Key-value pairs |
| **Example** | `[Anuj, Prem, Shiva]` | `{1→Anuj, 2→Prem, 3→Shiva}` |
| **Duplicate values** | Depends on type (List=yes, Set=no) | Values can duplicate, keys cannot |
| **Access** | By index or iteration | By key |
| **Part of Collection?** | ✅ Yes | ❌ No — separate hierarchy |

---

## Iterator Interface

### What is the Iterator Interface?
`Iterator` is an interface that provides a **standard way to traverse (loop through) any collection** one element at a time — without needing to know the internal structure of the collection.

Think of it like a **pointer** that starts before the first element and moves forward one step at a time.

### Why Do We Need It?
- Different collections store data differently internally (array, linked list, tree)
- You don't want to write different traversal logic for each
- `Iterator` gives a **uniform way** to go through any collection the same way

### Benefits:

| Benefit | Meaning |
|---------|---------|
| **Universal** | Works on ArrayList, HashSet, LinkedList — any Collection |
| **Safe removal** | Can safely remove elements while iterating (can't do this with for-each) |
| **Decoupled** | You don't need to know HOW the collection stores data internally |

---

### Iterator — Three Key Methods:

| Method | What it does |
|--------|-------------|
| `hasNext()` | Returns `true` if there are more elements to iterate |
| `next()` | Returns the next element and moves the pointer forward |
| `remove()` | Removes the last element returned by `next()` |

---

### Iterator Example:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Anuj");
        names.add("Prem");
        names.add("Shiva");
        names.add("Ravi");

        // Get iterator for the list
        Iterator<String> it = names.iterator();

        // Traverse using iterator
        while (it.hasNext()) {                  // is there a next element?
            String name = it.next();            // get it and move forward
            System.out.println(name);
        }

        // Output:
        // Anuj
        // Prem
        // Shiva
        // Ravi
    }
}
```

---

### Safe Removal Using Iterator:

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);

Iterator<Integer> it = numbers.iterator();

while (it.hasNext()) {
    int num = it.next();
    if (num == 20) {
        it.remove();   // ✅ safe removal while iterating
    }
}

System.out.println(numbers);   // [10, 30, 40]
```

> ⚠️ If you try to remove elements using a regular `for` loop or `for-each` while iterating, Java throws a `ConcurrentModificationException`. Iterator's `remove()` is the safe way.

---

### Iterator — Diagram (Where it fits):

```
Iterator Interface
│
├── Works with → All Collection types
│     ├── List (ArrayList, LinkedList)
│     ├── Set  (HashSet, TreeSet)
│     └── Queue (PriorityQueue)
│
└── ListIterator (child of Iterator)
      └── Works only with List — can go BOTH forward and backward
```

---

## Collection Framework vs Collection Interface — The Difference

This is a common confusion because both have the word "Collection".

| | Collections Framework | Collection Interface |
|--|----------------------|---------------------|
| **What it is** | The entire **package/system** — all interfaces, classes, algorithms together | One **specific interface** inside the framework |
| **Includes** | `Collection`, `Map`, `Iterator`, `ArrayList`, `HashMap`, `TreeSet` and everything else | Only defines basic operations: `add()`, `remove()`, `size()`, `contains()` etc. |
| **Scope** | The whole thing — the big picture | Just one piece of the puzzle |
| **Analogy** | The entire **toolkit** | One specific **tool** inside the toolkit |

> 💡 **Simple way to remember:** The **Collections Framework** is the entire library. The **Collection Interface** is one book inside that library. `Map` and `Iterator` are other books in the same library — but they are NOT part of the `Collection` book.

---

# 1. List Interface

---

## List Interface

### What is the List Interface?
`List` is a child interface of `Collection` that represents an **ordered sequence of elements**. "Ordered" means the elements maintain the **order in which they were inserted** — element at index 0 stays at 0 unless you move it.

### What does it do?
- Allows **duplicate elements** — same value can appear multiple times
- Provides **index-based access** — you can get, set, or remove by position
- Maintains **insertion order** — elements stay in the order you added them

### Advantages:

| Advantage | Meaning |
|-----------|---------|
| **Ordered** | Elements always in a predictable sequence |
| **Duplicates allowed** | Unlike Set — same value can exist multiple times |
| **Index access** | Get any element instantly using its position |
| **Flexible implementations** | ArrayList (fast read), LinkedList (fast insert/delete) |

### Example:

```java
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");   // duplicate — allowed in List

        System.out.println(fruits);          // [Apple, Banana, Apple]
        System.out.println(fruits.get(1));   // Banana — index-based access
    }
}
```

> `List` is an **interface** — you can't create `new List()` directly. You always create an object of a class that **implements** List, like `ArrayList` or `LinkedList`.

---

## *[i]* ArrayList

### What is ArrayList?
`ArrayList` is a class that **implements the List interface** using a **dynamic array** internally. It solves the biggest problem with regular arrays — the fixed size.

---

### The Problem with Arrays:

```java
String[] studentName = new String[30];
// Can only store 30 students
// If a 31st student comes — you're stuck
// You'd have to create a NEW bigger array and copy everything manually
// Not scalable at all
```

### How ArrayList Solves It:

```java
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("Rakesh");   // add as many as you want — no size limit
        studentName.add("Anuj");
        studentName.add("Prem");
        // keep going... ArrayList handles it automatically
    }
}
```

---

### How ArrayList Solves the Problem Internally:

ArrayList uses an **array under the hood** — but it manages resizing automatically for you. Here's what happens step by step:

1. ArrayList starts with a **default capacity of 10**
2. You keep adding elements
3. When the array gets **full**, ArrayList creates a **new bigger array** using this formula:

```
New size = old size + (old size / 2) + 1

Example: old size = 10
New size = 10 + 5 + 1 = 16
```

4. All elements from the old array are **copied** to the new array
5. The old array is **discarded (garbage collected)**
6. You never see any of this — it all happens silently behind the scenes

> 💡 This is why ArrayList feels like it has no size limit — it keeps growing automatically whenever needed.

---

### Advantages of ArrayList Over Arrays:

| | Array | ArrayList |
|--|-------|-----------|
| **Size** | Fixed — set at creation | Dynamic — grows automatically |
| **Built-in methods** | None | add, remove, get, set, contains, sort, etc. |
| **Type safety** | Primitive or Object | Generics — type-safe |
| **Memory** | Exact size only | May have extra capacity (auto-managed) |
| **Ease of use** | Manual management | Fully managed |

---

## ArrayList Functionalities

---

### Important Line — Explained:

```java
List<Integer> list = new ArrayList<>();
```

| Part | Meaning |
|------|---------|
| `List<Integer>` | The **type** of the variable — declared as the `List` interface. This is good practice — program to the interface, not the implementation |
| `<Integer>` | **Generic type** — this list will only hold `Integer` objects. No accidental wrong types. |
| `new ArrayList<>()` | The actual object created in memory — `ArrayList` is the implementation |
| `<>` | **Diamond operator** — Java infers the type from the left side, so you don't repeat `<Integer>` |

> 💡 Why declare as `List` instead of `ArrayList`? Because if you later want to switch to `LinkedList`, you only change one line — `new LinkedList<>()`. The rest of your code stays the same. This is **good OOPs practice**.

---

### i. `add()` Function — Types & Time Complexity

#### Type 1 — Add at the end: `list.add(element)`
Adds the element at the **last position**.
- ⏱ **Time complexity: O(1)** amortized (occasionally O(n) when resize happens)

```java
list.add(4);
// Before: [1, 2, 3]
// After:  [1, 2, 3, 4]
```

#### Type 2 — Add at specific index: `list.add(index, element)`
Inserts element at the given index. All existing elements from that index **shift right**.
- ⏱ **Time complexity: O(n)** — shifting takes time

```java
list.add(1, 50);
// Before: [1, 2, 3, 4]
// After:  [1, 50, 2, 3, 4]   → everything from index 1 shifted right
```

#### Type 3 — Add another list: `list.addAll(anotherList)`
Adds **all elements** of another collection to the end of the current list.
- ⏱ **Time complexity: O(k)** where k = size of the list being added

```java
List<Integer> newList = new ArrayList<>();
newList.add(150);
newList.add(160);

list.addAll(newList);
// Before: [1, 50, 2, 3, 4]
// After:  [1, 50, 2, 3, 4, 150, 160]
```

---

### Full add() Example — Explained:

```java
import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);   // [1, 2, 3]

        list.add(4);                // add at end
        System.out.println(list);   // [1, 2, 3, 4]

        list.add(1, 50);            // add 50 at index 1 — shifts others right
        System.out.println(list);   // [1, 50, 2, 3, 4]

        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);

        list.addAll(newList);       // merge newList into list
        System.out.println(list);   // [1, 50, 2, 3, 4, 150, 160]
    }
}
```

---

### ii. `get()` Function

Returns the element at a specific index — **read only**, doesn't remove it.
- ⏱ **Time complexity: O(1)** — direct index access, instant

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

System.out.println(list.get(0));   // 10 — first element
System.out.println(list.get(2));   // 30 — third element
```

> ⚠️ If you use an index that doesn't exist, Java throws `IndexOutOfBoundsException`.

---

### iii. `remove()` and `clear()`

#### `remove(int index)` — Remove by index
Removes the element at the given index. All elements after it **shift left**.
- ⏱ **Time complexity: O(n)** — shifting required

```java
list.remove(1);
// Removes element at index 1
// [10, 20, 30, 40] → [10, 30, 40]
```

#### `remove(Object o)` — Remove by value
Removes the **first occurrence** of the specified value.
- ⏱ **Time complexity: O(n)** — must search for the value first

```java
list.remove(Integer.valueOf(30));
// Removes the value 30 (not index 30)
// [10, 30, 40, 50] → [10, 40, 50]
```

> ⚠️ **Why `Integer.valueOf(30)` and not just `30`?**
> Because `remove(1)` takes an `int` — Java treats it as **index**. To remove by **value**, you must pass an `Integer` object, not a primitive `int`. `Integer.valueOf(30)` wraps 30 as an object so Java knows you mean the value, not the index.

#### `clear()` — Remove everything
Removes ALL elements from the list. List becomes empty `[]`.
- ⏱ **Time complexity: O(n)**

```java
list.clear();
// [10, 40, 50, 60, 70, 80] → []
```

---

### Full remove() Example with Output:

```java
List<Integer> list = new ArrayList<>();
list.add(10); list.add(20); list.add(30);
list.add(40); list.add(50); list.add(60);
list.add(70); list.add(80);

System.out.println(list);               // [10, 20, 30, 40, 50, 60, 70, 80]

list.remove(1);                         // remove index 1 (value 20)
System.out.println(list);               // [10, 30, 40, 50, 60, 70, 80]

list.remove(Integer.valueOf(30));       // remove value 30
System.out.println(list);               // [10, 40, 50, 60, 70, 80]

list.clear();                           // remove everything
System.out.println(list);               // []
```

---

### iv. `set()` Function

**Replaces** the element at a given index with a new value. The size of the list stays the same.
- ⏱ **Time complexity: O(1)**

```java
list.set(2, 1000);
// Before: [10, 20, 30, 40, 50, 60, 70, 80]
// After:  [10, 20, 1000, 40, 50, 60, 70, 80]
// Element at index 2 (was 30) is now replaced by 1000
```

---

### v. `contains()` Function

Checks whether a specific value **exists** in the list. Returns `true` or `false`.
- ⏱ **Time complexity: O(n)** — scans through the list

```java
System.out.println(list.contains(50));    // true  — 50 exists in list
System.out.println(list.contains(999));   // false — 999 not in list
```

---

### Full set() and contains() Example with Output:

```java
List<Integer> list = new ArrayList<>();
list.add(10); list.add(20); list.add(30);
list.add(40); list.add(50); list.add(60);
list.add(70); list.add(80);

System.out.println(list);               // [10, 20, 30, 40, 50, 60, 70, 80]

list.set(2, 1000);
System.out.println(list);               // [10, 20, 1000, 40, 50, 60, 70, 80]

System.out.println(list.contains(50));  // true
System.out.println(list.contains(999)); // false
```

---

## What is `toString()` and Why Does `System.out.println(list)` Print Nicely?

When you write `System.out.println(list)`, you're passing an **object** to `println`. Internally, `println` calls the **`toString()` method** of that object to convert it to a String before printing.

### What is `toString()`?
`toString()` is a method defined in the **`Object` class** — the root parent of every class in Java. By default, it returns something like `ArrayList@7852e922` (class name + memory address) — not very useful.

But `ArrayList` **overrides** `toString()` to return a nicely formatted string like `[10, 20, 30]`.

### How it works internally:
1. You write `System.out.println(list)`
2. Java calls `list.toString()` automatically
3. ArrayList's `toString()` loops through all elements, joins them with `, `, wraps in `[ ]`
4. Returns `"[10, 20, 30, 40]"` as a String
5. That String gets printed

```java
// What ArrayList's toString() roughly does internally:
public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < size; i++) {
        sb.append(elements[i]);
        if (i < size - 1) sb.append(", ");
    }
    sb.append("]");
    return sb.toString();
}
```

> 💡 This is why every class in Java should override `toString()` — so when you print an object, you see meaningful data instead of a memory address. It's a best practice.

---

## Traversing ArrayList Elements

There are 3 ways to loop through an ArrayList:

---

### 1. Using `for` Loop

Classic index-based loop. Use when you need the **index** of each element.

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println("The element is " + list.get(i));
}
```

- `list.size()` → returns total number of elements
- `list.get(i)` → gets element at index `i`

---

### 2. Using `for-each` Loop

Cleaner syntax. Use when you just need **each element** and don't need the index.

```java
for (Integer element : list) {
    System.out.println("foreach element is " + element);
}
```

- Automatically goes through each element one by one
- Can't access index, can't remove elements safely while iterating

---

### 3. Using `Iterator`

### What is an Iterator?
`Iterator` is an interface that provides a **cursor** to traverse a collection one element at a time — without knowing how the collection stores data internally.

### Why Do We Use It?
- **Safe removal** — you can remove elements while iterating without errors
- **Universal** — works the same way on any Collection type
- Useful when you need to **filter and remove** elements during traversal

### Advantages:
| Advantage | Meaning |
|-----------|---------|
| **Safe removal** | `it.remove()` is the only safe way to remove while iterating |
| **Universal** | Same code works for ArrayList, HashSet, LinkedList |
| **Controlled traversal** | `hasNext()` gives you precise control over when to stop |

```java
import java.util.Iterator;

Iterator<Integer> it = list.iterator();   // get iterator for the list

while (it.hasNext()) {                    // as long as there's a next element
    System.out.println("iterator " + it.next());   // get it and move forward
}
```

---

### Full Traversal Example — All 3 Methods:

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30);
        list.add(40); list.add(50); list.add(60);
        list.add(70); list.add(80);

        System.out.println(list);   // [10, 20, 30, 40, 50, 60, 70, 80]

        // 1. for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("for loop: " + list.get(i));
        }

        // 2. for-each loop
        for (Integer element : list) {
            System.out.println("for-each: " + element);
        }

        // 3. Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("iterator: " + it.next());
        }
    }
}
```

---

### Traversal Methods — When to Use Which:

| Method | Use when... |
|--------|------------|
| `for` loop | You need the **index** of each element |
| `for-each` | Simple traversal — you just need each **value** |
| `Iterator` | You need to **remove elements** safely while iterating |

---

### Quick Reference — All ArrayList Methods:

| Method | What it does | Time Complexity |
|--------|-------------|----------------|
| `add(e)` | Add at end | O(1) amortized |
| `add(i, e)` | Add at index | O(n) |
| `addAll(list)` | Add another list | O(k) |
| `get(i)` | Get element at index | O(1) |
| `set(i, e)` | Replace element at index | O(1) |
| `remove(i)` | Remove by index | O(n) |
| `remove(Object)` | Remove by value | O(n) |
| `clear()` | Remove all elements | O(n) |
| `contains(e)` | Check if value exists | O(n) |
| `size()` | Get number of elements | O(1) |

---

## *[ii]* Stack

## What is a Stack?

A **Stack** is a linear data structure that follows the **LIFO** principle —
**Last In, First Out**.

The element that is added **last** is the one that comes out **first** — just like a stack of plates. You put a plate on top, and you always pick from the top too. You can't directly access a plate in the middle.

```
        ┌─────────┐
        │   Cat   │  ← TOP (added last, removed first)
        ├─────────┤
        │  Horse  │
        ├─────────┤
        │   Dog   │
        ├─────────┤
        │  Lion   │  ← BOTTOM (added first, removed last)
        └─────────┘
```

> 💡 **LIFO = Last In, First Out** — the last element pushed is the first one popped.

---

### Advantages of Using Stack:

| Advantage | Meaning |
|-----------|---------|
| **Simple and fast** | Push and pop are O(1) — constant time operations |
| **Natural fit for LIFO problems** | Undo/redo, backtracking, recursion all naturally follow LIFO |
| **Built-in in Java** | `java.util.Stack` class is ready to use — no manual implementation needed |
| **Extends Vector** | Gets thread-safety and all Vector methods along with stack operations |

---

### Where Do We Use Stack?

| Use Case | How Stack Helps |
|----------|----------------|
| **Undo/Redo** (MS Word, Photoshop) | Every action is pushed — undo pops the last action |
| **Browser Back Button** | Each visited page is pushed — back button pops the last page |
| **Function Call Stack** | Java itself uses a stack to track method calls — when a method is called it's pushed, when it returns it's popped |
| **Expression Evaluation** | Compilers use stacks to evaluate `(2 + 3) * 4` type expressions |
| **Backtracking** (Maze solving, DFS) | Explore a path, push positions — backtrack by popping |

---

## Stack Functions

---

### `push(element)` — Add to Top
Adds an element to the **top** of the stack.
- ⏱ **Time Complexity: O(1)**

```java
animals.push("Lion");    // Stack: [Lion]
animals.push("Dog");     // Stack: [Lion, Dog]
animals.push("Horse");   // Stack: [Lion, Dog, Horse]
animals.push("Cat");     // Stack: [Lion, Dog, Horse, Cat]
```

---

### `peek()` — View Top Element (Without Removing)
Returns the element at the **top** of the stack — but does **not** remove it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.peek());   // Cat — just looks, doesn't remove
// Stack is still: [Lion, Dog, Horse, Cat]
```

> 💡 `peek()` is like looking at the top plate without picking it up.

---

### `pop()` — Remove from Top
Removes and returns the element at the **top** of the stack.
- ⏱ **Time Complexity: O(1)**

```java
animals.pop();   // removes Cat (the top element)
// Stack is now: [Lion, Dog, Horse]
```

> ⚠️ If you call `pop()` on an empty stack, Java throws `EmptyStackException`.

---

### `isEmpty()` — Check if Stack is Empty
Returns `true` if the stack has no elements, `false` otherwise.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false — stack has elements
```

---

### `size()` — Get Number of Elements
Returns the total number of elements currently in the stack.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 3
```

---

## Full Example — All Operations Together:

```java
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();   // creating a Stack of Strings

        // push — adding elements to the top
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        System.out.println("Stack: " + animals);
        // Stack: [Lion, Dog, Horse, Cat]

        // peek — view top element without removing
        System.out.println(animals.peek());
        // Cat

        // pop — remove top element
        animals.pop();

        System.out.println("Stack: " + animals);
        // Stack: [Lion, Dog, Horse]

        // peek again — now Horse is on top
        System.out.println(animals.peek());
        // Horse

        // isEmpty
        System.out.println(animals.isEmpty());
        // false

        // size
        System.out.println(animals.size());
        // 3
    }
}
```

**Output:**
```
Stack: [Lion, Dog, Horse, Cat]
Cat
Stack: [Lion, Dog, Horse]
Horse
false
3
```

---

### How the Stack Changes Step by Step:

| Operation | Stack State | Top Element |
|-----------|------------|-------------|
| `push("Lion")` | `[Lion]` | Lion |
| `push("Dog")` | `[Lion, Dog]` | Dog |
| `push("Horse")` | `[Lion, Dog, Horse]` | Horse |
| `push("Cat")` | `[Lion, Dog, Horse, Cat]` | Cat |
| `peek()` | `[Lion, Dog, Horse, Cat]` | Cat (unchanged) |
| `pop()` | `[Lion, Dog, Horse]` | Horse |
| `peek()` | `[Lion, Dog, Horse]` | Horse (unchanged) |

---

### Quick Reference — Stack Methods:

| Method | What it does | Time Complexity |
|--------|-------------|----------------|
| `push(e)` | Add element to top | O(1) |
| `pop()` | Remove and return top element | O(1) |
| `peek()` | View top element without removing | O(1) |
| `isEmpty()` | Check if stack is empty | O(1) |
| `size()` | Get number of elements | O(1) |

---

*End of Notes — Stack*

---

## *[iii]* LinkedList

### What is a LinkedList?

A **LinkedList** is a linear data structure where elements are **not stored in continuous memory locations** like arrays. Instead, each element (called a **Node**) holds:
- The **data** itself
- A **pointer/reference** to the **next node**

Think of it like a **treasure hunt** — each clue (node) tells you where the next clue is.

```
[Lion | •]──→ [Dog | •]──→ [Horse | •]──→ [Cat | null]
  ↑
 HEAD
```

> 💡 The last node points to `null` — meaning there's no next element after it.

---

### Doubly LinkedList (How Java Implements It)

Java's `LinkedList` is actually a **Doubly LinkedList** — each node has **two pointers**:
- One pointing to the **next** node
- One pointing to the **previous** node

```
null ←[Lion]⇄[Dog]⇄[Horse]⇄[Cat]→ null
        ↑                    ↑
       HEAD                 TAIL
```

> 💡 Because of two pointers, you can **traverse in both directions** — forward and backward.

---

### Advantages of LinkedList:

| Advantage | Meaning |
|-----------|---------|
| **Fast Insert/Delete** | Adding or removing from beginning or middle is O(1) — no shifting needed |
| **Dynamic Size** | Grows and shrinks at runtime — no fixed size like arrays |
| **Implements Multiple Interfaces** | Works as a `List`, `Queue`, and `Deque` — very flexible |
| **No Memory Waste** | Memory is allocated only when a new node is added |

---

### Disadvantages of LinkedList:

| Disadvantage | Meaning |
|--------------|---------|
| **Slow Access** | To reach index 3, you must traverse from HEAD — O(n) |
| **Extra Memory** | Each node stores data + pointer(s) — more memory than ArrayList |
| **No Random Access** | You cannot directly do `get(5)` efficiently like an array |

---

### Where Do We Use LinkedList?

| Use Case | How LinkedList Helps |
|----------|---------------------|
| **Music Playlist** | Each song points to next — easy to insert/remove songs |
| **Browser History** | Doubly linked — go forward and backward easily |
| **Implementing Queue/Stack** | Natural fit due to fast insert/delete at both ends |
| **Undo Functionality** | Each action is a node — easy to traverse back |

---

## LinkedList Functions

---

### `add(element)` — Add to End
Adds an element to the **end** of the list.
- ⏱ **Time Complexity: O(1)**

```java
animals.add("Lion");     // [Lion]
animals.add("Dog");      // [Lion, Dog]
animals.add("Horse");    // [Lion, Dog, Horse]
animals.add("Cat");      // [Lion, Dog, Horse, Cat]
```

---

### `addFirst(element)` — Add to Beginning
Adds an element to the **front** of the list.
- ⏱ **Time Complexity: O(1)**

```java
animals.addFirst("Tiger");
// [Tiger, Lion, Dog, Horse, Cat]
```

---

### `addLast(element)` — Add to End
Explicitly adds an element to the **end** — same as `add()`.
- ⏱ **Time Complexity: O(1)**

```java
animals.addLast("Elephant");
// [Tiger, Lion, Dog, Horse, Cat, Elephant]
```

---

### `getFirst()` — Get First Element
Returns the **first** element without removing it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.getFirst());   // Tiger
```

---

### `getLast()` — Get Last Element
Returns the **last** element without removing it.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.getLast());   // Elephant
```

---

### `removeFirst()` — Remove from Front
Removes and returns the **first** element.
- ⏱ **Time Complexity: O(1)**

```java
animals.removeFirst();   // removes Tiger
// [Lion, Dog, Horse, Cat, Elephant]
```

---

### `removeLast()` — Remove from End
Removes and returns the **last** element.
- ⏱ **Time Complexity: O(1)**

```java
animals.removeLast();   // removes Elephant
// [Lion, Dog, Horse, Cat]
```

---

### `get(index)` — Access by Index
Returns the element at a specific **index**.
- ⏱ **Time Complexity: O(n)** — has to traverse from HEAD

```java
System.out.println(animals.get(2));   // Horse
```

> ⚠️ This is slower than ArrayList because LinkedList has no direct memory access — it walks node by node.

---

### `size()` — Get Number of Elements
Returns the total number of elements in the list.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 4
```

---

### `isEmpty()` — Check if List is Empty
Returns `true` if the list has no elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false
```

---

## Full Example — LinkedList:

```java
import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        // add elements
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("LinkedList: " + animals);
        // LinkedList: [Lion, Dog, Horse, Cat]

        // addFirst
        animals.addFirst("Tiger");
        System.out.println("After addFirst: " + animals);
        // After addFirst: [Tiger, Lion, Dog, Horse, Cat]

        // addLast
        animals.addLast("Elephant");
        System.out.println("After addLast: " + animals);
        // After addLast: [Tiger, Lion, Dog, Horse, Cat, Elephant]

        // getFirst and getLast
        System.out.println("First: " + animals.getFirst());   // Tiger
        System.out.println("Last: " + animals.getLast());     // Elephant

        // removeFirst and removeLast
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removals: " + animals);
        // After removals: [Lion, Dog, Horse, Cat]

        // get by index
        System.out.println("Index 2: " + animals.get(2));   // Horse

        // size and isEmpty
        System.out.println("Size: " + animals.size());        // 4
        System.out.println("isEmpty: " + animals.isEmpty());  // false
    }
}
```

**Output:**
```
LinkedList: [Lion, Dog, Horse, Cat]
After addFirst: [Tiger, Lion, Dog, Horse, Cat]
After addLast: [Tiger, Lion, Dog, Horse, Cat, Elephant]
First: Tiger
Last: Elephant
After removals: [Lion, Dog, Horse, Cat]
Index 2: Horse
Size: 4
isEmpty: false
```

---

### How the LinkedList Changes Step by Step:

| Operation | List State | Head | Tail |
|-----------|-----------|------|------|
| `add("Lion")` | `[Lion]` | Lion | Lion |
| `add("Dog")` | `[Lion, Dog]` | Lion | Dog |
| `add("Horse")` | `[Lion, Dog, Horse]` | Lion | Horse |
| `add("Cat")` | `[Lion, Dog, Horse, Cat]` | Lion | Cat |
| `addFirst("Tiger")` | `[Tiger, Lion, Dog, Horse, Cat]` | Tiger | Cat |
| `addLast("Elephant")` | `[Tiger, Lion, Dog, Horse, Cat, Elephant]` | Tiger | Elephant |
| `removeFirst()` | `[Lion, Dog, Horse, Cat, Elephant]` | Lion | Elephant |
| `removeLast()` | `[Lion, Dog, Horse, Cat]` | Lion | Cat |

---

### Quick Reference — LinkedList Methods:

| Method | What it does | Time Complexity |
|--------|-------------|-----------------|
| `add(e)` | Add to end | O(1) |
| `addFirst(e)` | Add to front | O(1) |
| `addLast(e)` | Add to end | O(1) |
| `getFirst()` | View first element | O(1) |
| `getLast()` | View last element | O(1) |
| `removeFirst()` | Remove from front | O(1) |
| `removeLast()` | Remove from end | O(1) |
| `get(index)` | Access by index | O(n) |
| `size()` | Get element count | O(1) |
| `isEmpty()` | Check if empty | O(1) |

---

---

## *[iv]* Vector 

### What is a Vector?

A **Vector** is similar to an **ArrayList** — it stores elements in a **dynamic array** that grows automatically when needed. But the key difference is:

> 💡 **Vector is synchronized** — meaning it is **thread-safe**. Only one thread can access it at a time, which prevents data corruption in multi-threaded programs.

Think of it like a **single-lane bridge** — only one vehicle (thread) can cross at a time, making it safe but slightly slower.

---

### Vector vs ArrayList — Key Difference:

| Feature | ArrayList | Vector |
|---------|-----------|--------|
| **Thread Safety** | ❌ Not thread-safe | ✅ Thread-safe (synchronized) |
| **Speed** | Faster | Slightly slower (due to sync) |
| **Growth Rate** | Grows by 50% | Grows by 100% (doubles) |
| **Legacy** | Modern (Java 1.2) | Old (Java 1.0) |

> 💡 When Vector runs out of space, it **doubles its size**. ArrayList only grows by **50%**.

---

### Advantages of Vector:

| Advantage | Meaning |
|-----------|---------|
| **Thread-safe** | Safe to use in multi-threaded environments without extra code |
| **Dynamic Sizing** | Automatically grows — no need to define size upfront |
| **Legacy Support** | Older Java codebases use Vector heavily |

---

### Where Do We Use Vector?

| Use Case | How Vector Helps |
|----------|-----------------|
| **Multi-threaded apps** | When multiple threads read/write a list simultaneously |
| **Legacy Java code** | Older projects written before `ArrayList` existed |
| **Simple thread-safety** | Without manually writing `synchronized` blocks |

---

## Vector Functions

---

### `add(element)` — Add to End
Adds an element to the **end** of the Vector.
- ⏱ **Time Complexity: O(1)**

```java
animals.add("Lion");
animals.add("Dog");
animals.add("Horse");
// [Lion, Dog, Horse]
```

---

### `get(index)` — Access by Index
Returns the element at a specific index.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.get(1));   // Dog
```

---

### `remove(index)` — Remove by Index
Removes the element at the given index.
- ⏱ **Time Complexity: O(n)** — elements shift after removal

```java
animals.remove(1);   // removes Dog
// [Lion, Horse]
```

---

### `size()` — Get Number of Elements
Returns the total number of elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.size());   // 2
```

---

### `contains(element)` — Check if Element Exists
Returns `true` if the element is present in the Vector.
- ⏱ **Time Complexity: O(n)**

```java
System.out.println(animals.contains("Lion"));   // true
System.out.println(animals.contains("Cat"));    // false
```

---

### `isEmpty()` — Check if Vector is Empty
Returns `true` if the Vector has no elements.
- ⏱ **Time Complexity: O(1)**

```java
System.out.println(animals.isEmpty());   // false
```

---

### `clear()` — Remove All Elements
Removes **all** elements from the Vector.
- ⏱ **Time Complexity: O(n)**

```java
animals.clear();
System.out.println(animals.isEmpty());   // true
```

---

## Full Example — Vector:

```java
import java.util.Vector;

public class LearnVector {
    public static void main(String[] args) {

        Vector<String> animals = new Vector<>();

        // add elements
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        System.out.println("Vector: " + animals);
        // Vector: [Lion, Dog, Horse, Cat]

        // get by index
        System.out.println("Index 1: " + animals.get(1));   // Dog

        // remove by index
        animals.remove(1);
        System.out.println("After remove(1): " + animals);
        // After remove(1): [Lion, Horse, Cat]

        // contains
        System.out.println("Contains Lion: " + animals.contains("Lion"));   // true
        System.out.println("Contains Dog: " + animals.contains("Dog"));     // false

        // size and isEmpty
        System.out.println("Size: " + animals.size());        // 3
        System.out.println("isEmpty: " + animals.isEmpty());  // false

        // clear
        animals.clear();
        System.out.println("After clear, isEmpty: " + animals.isEmpty());   // true
    }
}
```

**Output:**
```
Vector: [Lion, Dog, Horse, Cat]
Index 1: Dog
After remove(1): [Lion, Horse, Cat]
Contains Lion: true
Contains Dog: false
Size: 3
isEmpty: false
After clear, isEmpty: true
```

---

### How the Vector Changes Step by Step:

| Operation | Vector State |
|-----------|-------------|
| `add("Lion")` | `[Lion]` |
| `add("Dog")` | `[Lion, Dog]` |
| `add("Horse")` | `[Lion, Dog, Horse]` |
| `add("Cat")` | `[Lion, Dog, Horse, Cat]` |
| `remove(1)` | `[Lion, Horse, Cat]` |
| `clear()` | `[]` |

---

### Quick Reference — Vector Methods:

| Method | What it does | Time Complexity |
|--------|-------------|-----------------|
| `add(e)` | Add to end | O(1) |
| `get(index)` | Access by index | O(1) |
| `remove(index)` | Remove by index | O(n) |
| `contains(e)` | Check if element exists | O(n) |
| `size()` | Get element count | O(1) |
| `isEmpty()` | Check if empty | O(1) |
| `clear()` | Remove all elements | O(n) |

---

---

## 🆚 LinkedList vs Vector vs ArrayList — Full Comparison:

| Feature | LinkedList | Vector | ArrayList |
|---------|-----------|--------|-----------|
| **Internal Structure** | Doubly linked nodes | Dynamic array | Dynamic array |
| **Thread-safe** | ❌ No | ✅ Yes | ❌ No |
| **Access by index** | O(n) — traverse | O(1) — direct | O(1) — direct |
| **Insert/Delete (middle)** | O(1) — just relink | O(n) — shift | O(n) — shift |
| **Memory** | More (stores pointers) | Less | Less |
| **Growth** | Node by node | Doubles (100%) | 50% |
| **Best used when** | Frequent insert/delete | Multi-threading | General purpose |


---

*End of Notes — List Interface*

---

# 2. Queue (Interface)

Queue Interface  →  Ordered for processing, First In First Out (FIFO)  
    ├── PriorityQueue (Class)  
    ├── ArrayDeque    (Class)  
    └── LinkedList    (Class)  


>*You can say:*  
>Queue is an interface that defines queue-related operations such as add(), offer(), poll(), peek(), etc.  
>PriorityQueue, ArrayDeque, and LinkedList are classes that implement the Queue interface and provide their own implementations of these operations.


## What is a Queue?

A **Queue** is an interface that represents an **ordered collection designed for processing**, following the **FIFO** principle —
**First In, First Out**.

The element that is added **first** is the one that comes out **first** — just like a queue (line) of people waiting for a billing counter. The first person to stand in line is the first one to get served.

```
ENTRY →  [Lion] [Dog] [Horse] [Cat]  → EXIT
          ↑                    ↑
        FRONT                 REAR
      (served first)      (added last)
```

> 💡 **FIFO = First In, First Out** — the first element added is the first one removed.

---

### Queue — What It Is, What It Does, Advantages:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface (not a class) that defines a contract for FIFO-style operations |
| **What it does** | Provides methods to insert, remove, and inspect elements in order |
| **Advantages** | Simple, predictable ordering; ideal for task scheduling, buffering, and processing items in the order they arrive |

> 💡 You can say: **Queue is an interface that defines queue-related operations** such as `add()`, `offer()`, `poll()`, `peek()`, etc.
> **PriorityQueue, ArrayDeque, and LinkedList** are classes that **implement** the Queue interface and provide their **own implementations** of these operations.

```
        Queue (Interface)
              │
   ┌──────────┼──────────────┐
   │          │               │
PriorityQueue ArrayDeque   LinkedList
  (Class)      (Class)       (Class)
```

---

## Queue Interface Methods

The `Queue` interface specifies **6 main methods** — they come in **pairs** based on behavior:

| Operation | "Throws Exception" version | "Returns Special Value" version |
|-----------|----------------------------|----------------------------------|
| Insert | `add()` | `offer()` |
| Remove | `remove()` | `poll()` |
| Examine | `element()` | `peek()` |

> 💡 The right-side methods (`offer`, `poll`, `peek`) are **safer** — they don't throw exceptions on failure, they just return `null` or `false`. That's why they are used **more often** in practice.

---

### `add(element)` — Insert an Element
Inserts the element into the queue. If the queue is **full** (capacity-restricted queues), it **throws an exception** (`IllegalStateException`).
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();
queue.add("Lion");
queue.add("Dog");
System.out.println(queue);   // [Lion, Dog]
```

---

### `offer(element)` — Insert an Element (Safe)
Inserts the element into the queue. If insertion fails (e.g., queue is full), it returns **`false`** instead of throwing an exception.
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();
boolean result = queue.offer("Horse");
System.out.println(result);   // true
System.out.println(queue);    // [Horse]
```

> 💡 ⭐ **Commonly used.**

---

### `remove()` — Remove and Return Head
Removes and returns the **head** (front) of the queue. If the queue is **empty**, it **throws** `NoSuchElementException`.
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();
queue.add("Lion");
queue.add("Dog");

System.out.println(queue.remove());   // Lion (removed and returned)
System.out.println(queue);            // [Dog]
```

---

### `poll()` — Remove and Return Head (Safe)
Removes and returns the **head** of the queue. If the queue is **empty**, it returns **`null`** instead of throwing an exception.
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();
queue.add("Lion");

System.out.println(queue.poll());   // Lion
System.out.println(queue.poll());   // null (queue is empty, no exception)
```

> 💡 ⭐ **Commonly used.**

---

### `element()` — View Head Without Removing
Returns the **head** of the queue **without removing it**. If the queue is **empty**, it **throws** `NoSuchElementException`.
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();
queue.add("Lion");
queue.add("Dog");

System.out.println(queue.element());   // Lion
System.out.println(queue);             // [Lion, Dog] — unchanged
```

---

### `peek()` — View Head Without Removing (Safe)
Returns the **head** of the queue **without removing it**. If the queue is **empty**, it returns **`null`** instead of throwing an exception.
- ⏱ **Time Complexity: O(1)**

```java
Queue<String> queue = new LinkedList<>();

System.out.println(queue.peek());   // null (empty queue, no exception)

queue.add("Lion");
System.out.println(queue.peek());   // Lion
```

> 💡 ⭐ **Commonly used.**

---

### Quick Reference — Queue Methods:

| Method | Action | On Failure |
|--------|--------|-----------|
| `add(e)` | Insert element | Throws `IllegalStateException` |
| `offer(e)` | Insert element | Returns `false` |
| `remove()` | Remove & return head | Throws `NoSuchElementException` |
| `poll()` | Remove & return head | Returns `null` |
| `element()` | View head | Throws `NoSuchElementException` |
| `peek()` | View head | Returns `null` |

> 💡 **Rule of thumb:** prefer `offer()`, `poll()`, and `peek()` — they handle edge cases gracefully without crashing your program.

---
---

# classes that implement the Queue interface:

## i. PriorityQueue

### What It Is, What It Does, Why We Use It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A class that implements `Queue`, but does **NOT** follow strict FIFO order |
| **What it does** | Orders elements based on **priority** — the **smallest** (or highest priority) element is always at the **head**, ready to be removed first |
| **Why we use it** | When you need to repeatedly access the "smallest" or "largest" item efficiently, without sorting the whole collection every time |

> 💡 Think of it like a **hospital emergency room** — patients aren't treated in arrival order (FIFO); the **most critical** patient is treated first, regardless of when they arrived.

---

### Advantages and Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Always know the min/max instantly** | `peek()` gives the highest-priority element in O(1) |
| **Efficient insert/remove** | Both operations are O(log n) — much better than sorting repeatedly |
| **Custom ordering** | Use a `Comparator` to define your own priority rules |

| Use Case | How PriorityQueue Helps |
|----------|--------------------------|
| **Task Scheduling (OS)** | Higher-priority tasks/processes run first |
| **Dijkstra's Algorithm** | Always pick the nearest unvisited node next |
| **Hospital Triage Systems** | Treat the most critical patient first |
| **Event-driven simulations** | Process the next event in time order |

---

### How It Works Internally

A `PriorityQueue` is internally implemented using a **Binary Heap** (specifically a **Min-Heap** by default).

- A **Min-Heap** is a complete binary tree where **every parent node is smaller than (or equal to) its children**.
- This guarantees the **smallest element is always at the root** — which is the "head" of the queue.
- It's stored internally as an **array**, but logically behaves like a tree.

```
        1
       / \
      3   2
     / \  /
    5  4 6

Array representation: [1, 3, 2, 5, 4, 6]
```

> 💡 When you `poll()`, the root (smallest) is removed, and the heap **re-arranges itself** (called "heapify") to bring the next smallest element to the root — this takes **O(log n)**.

---

### How Priority Is Decided

By default, **PriorityQueue is a Min-Heap** — the **smallest element** has the **highest priority** (comes out first).

- For numbers → smallest number first (natural ordering via `Comparable`)
- For Strings → alphabetically first comes first
- **Custom priority** → pass a `Comparator` to the constructor to define your own rules (e.g., largest first, or sort by a custom field)

```java
// Min-Heap (default) — smallest first
PriorityQueue<Integer> pq = new PriorityQueue<>();

// Max-Heap — largest first (using Comparator)
PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
```

---

### Code Example — PriorityQueue:

```java
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // offer — insert elements
        pq.offer(5);
        pq.offer(1);
        pq.offer(3);
        pq.offer(2);
        pq.offer(4);

        System.out.println("PriorityQueue: " + pq);
        // PriorityQueue: [1, 2, 3, 5, 4]  (heap order, NOT fully sorted)

        // peek — view smallest element
        System.out.println("Peek: " + pq.peek());   // 1

        // poll — remove smallest elements one by one
        System.out.println("Poll: " + pq.poll());   // 1
        System.out.println("Poll: " + pq.poll());   // 2
        System.out.println("Poll: " + pq.poll());   // 3

        System.out.println("Remaining: " + pq);
        // Remaining: [4, 5]

        // size
        System.out.println("Size: " + pq.size());   // 2
    }
}
```

**Output:**
```
PriorityQueue: [1, 2, 3, 5, 4]
Peek: 1
Poll: 1
Poll: 2
Poll: 3
Remaining: [4, 5]
Size: 2
```

> ⚠️ **Important:** Printing a `PriorityQueue` does **NOT** show elements in fully sorted order — it shows the internal **heap array structure**. Only `poll()` guarantees retrieval in priority order.

---

### Specific Methods of PriorityQueue:

| Method | What It Does | Time Complexity |
|--------|--------------|------------------|
| `offer(e)` | Insert element, auto-positions based on priority | O(log n) |
| `poll()` | Remove and return highest-priority (smallest) element | O(log n) |
| `peek()` | View highest-priority element without removing | O(1) |
| `size()` | Get number of elements | O(1) |
| `remove(e)` | Remove a specific element (searches for it) | O(n) |
| `contains(e)` | Check if element exists | O(n) |

---
---

## ii. ArrayDeque

### Basic Idea — How Is It Different from a Normal Queue?

**ArrayDeque** stands for **"Array Double-Ended Queue"**. Unlike a normal `Queue` (which only allows insertion/removal from specific ends following FIFO), an **ArrayDeque allows insertion and removal from BOTH ends** — front and rear.

```
   addFirst()              addLast()
        ↓                       ↓
   ┌─────────────────────────────┐
   │ Lion │ Dog │ Horse │ Cat     │
   └─────────────────────────────┘
        ↑                       ↑
   removeFirst()           removeLast()
```

> 💡 Think of it like a **deck of cards** — you can add or remove cards from **both the top and the bottom**, not just one side.

---

### What It Is, What It Does, Why We Use It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A class implementing both `Queue` and `Deque` interfaces — a resizable array that supports operations at both ends |
| **What it does** | Allows fast insertion/removal from **front AND rear** — can act as a Queue, a Stack, or a Deque |
| **Why we use it** | It's faster than `LinkedList` for stack/queue operations (no node overhead) and faster than `Stack` (no synchronization overhead) |

---

### Advantages and Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Faster than Stack/LinkedList** | No synchronization overhead (unlike `Stack`), no node pointers (unlike `LinkedList`) |
| **Double-ended operations** | Insert/remove from both front and rear in O(1) |
| **No capacity restriction** | Grows dynamically, like an ArrayList |
| **null not allowed** | Prevents ambiguous `null` returns from `poll()`/`peek()` |

| Use Case | How ArrayDeque Helps |
|----------|------------------------|
| **Implementing a Stack** | Use `push()`/`pop()` — faster than `java.util.Stack` |
| **Implementing a Queue** | Use `offer()`/`poll()` — faster than `LinkedList` |
| **Sliding Window problems** | Add/remove from both ends efficiently (e.g., max in sliding window) |
| **Palindrome checking** | Compare elements from both ends simultaneously |

---

### Code Example — ArrayDeque (All Operations in Sequence):

```java
import java.util.ArrayDeque;
import java.util.Deque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        Deque<String> animals = new ArrayDeque<>();

        // offer — adds to the rear (inherited from Queue)
        animals.offer("Dog");
        animals.offer("Horse");
        System.out.println("After offer: " + animals);
        // After offer: [Dog, Horse]

        // offerFirst — add to the front
        animals.offerFirst("Lion");
        System.out.println("After offerFirst: " + animals);
        // After offerFirst: [Lion, Dog, Horse]

        // offerLast — add to the rear
        animals.offerLast("Cat");
        System.out.println("After offerLast: " + animals);
        // After offerLast: [Lion, Dog, Horse, Cat]

        // peekFirst — view front element
        System.out.println("PeekFirst: " + animals.peekFirst());   // Lion

        // peekLast — view rear element
        System.out.println("PeekLast: " + animals.peekLast());     // Cat

        // pollFirst — remove and return front element
        System.out.println("PollFirst: " + animals.pollFirst());   // Lion
        System.out.println("After pollFirst: " + animals);
        // After pollFirst: [Dog, Horse, Cat]

        // pollLast — remove and return rear element
        System.out.println("PollLast: " + animals.pollLast());     // Cat
        System.out.println("After pollLast: " + animals);
        // After pollLast: [Dog, Horse]

        // size
        System.out.println("Size: " + animals.size());   // 2
    }
}
```

**Output:**
```
After offer: [Dog, Horse]
After offerFirst: [Lion, Dog, Horse]
After offerLast: [Lion, Dog, Horse, Cat]
PeekFirst: Lion
PeekLast: Cat
PollFirst: Lion
After pollFirst: [Dog, Horse, Cat]
PollLast: Cat
After pollLast: [Dog, Horse]
Size: 2
```

---

### Specific (Personal) Methods of ArrayDeque:

| Method | Source | What It Does |
|--------|--------|---------------|
| `offer(e)` | From `Queue` | Adds to the **rear** (same as `offerLast`) |
| `offerFirst(e)` | ArrayDeque/Deque-specific | Adds to the **front** |
| `offerLast(e)` | ArrayDeque/Deque-specific | Adds to the **rear** |
| `peekFirst()` | ArrayDeque/Deque-specific | Views the **front** element without removing |
| `peekLast()` | ArrayDeque/Deque-specific | Views the **rear** element without removing |
| `pollFirst()` | ArrayDeque/Deque-specific | Removes and returns the **front** element |
| `pollLast()` | ArrayDeque/Deque-specific | Removes and returns the **rear** element |
| `push(e)` | Deque (Stack-like) | Adds to the **front** (acts like a stack push) |
| `pop()` | Deque (Stack-like) | Removes from the **front** (acts like a stack pop) |

> 💡 **Note:** All these operations run in **O(1)** amortized time complexity — that's the whole point of ArrayDeque being fast for both stack-like and queue-like usage.

---
---

## iii. LinkedList (as Queue)

### What It Is, What It Does, Why We Use It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A doubly-linked-list class that implements **both** `List` and `Deque` (and therefore `Queue`) interfaces |
| **What it does** | Lets you use the same `LinkedList` object as a List, a Queue, a Deque, or a Stack — depending on which methods you call |
| **Why we use it** | Flexibility — one data structure that adapts to FIFO, LIFO, or double-ended access patterns |

---

### Advantages and Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Multi-purpose** | Can behave as List, Queue, Deque, or Stack |
| **Fast insert/remove at ends** | O(1) for adding/removing from head or tail (no shifting) |
| **Dynamic size** | No capacity limit, grows/shrinks as needed |

| Use Case | How LinkedList (as Queue) Helps |
|----------|-------------------------------------|
| **Task queues** | Add tasks at the rear, process from the front (FIFO) |
| **BFS (Breadth-First Search)** | Classic use — `LinkedList` as a `Queue` to explore nodes level by level |
| **Buffer/Producer-Consumer** | Producer adds to rear, consumer removes from front |

---

### Code Example — LinkedList as Queue:

```java
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // offer — add to rear
        queue.offer("Lion");
        queue.offer("Dog");
        queue.offer("Horse");

        System.out.println("Queue: " + queue);
        // Queue: [Lion, Dog, Horse]

        // peek — view head
        System.out.println("Peek: " + queue.peek());   // Lion

        // poll — remove from head
        System.out.println("Poll: " + queue.poll());   // Lion
        System.out.println("After poll: " + queue);
        // After poll: [Dog, Horse]
    }
}
```

**Output:**
```
Queue: [Lion, Dog, Horse]
Peek: Lion
Poll: Lion
After poll: [Dog, Horse]
```

---

### Specific (Personal) Methods of LinkedList:

These are methods that come from `LinkedList`'s own `List`/`Deque` heritage (beyond plain Queue methods):

| Method | What It Does |
|--------|---------------|
| `addFirst(e)` | Add element to the front |
| `addLast(e)` | Add element to the rear |
| `getFirst()` | View the first element |
| `getLast()` | View the last element |
| `removeFirst()` | Remove and return the first element |
| `removeLast()` | Remove and return the last element |
| `get(index)` | Access element by index (O(n)) |

---

### Code Example — LinkedList Specific Methods:

```java
import java.util.LinkedList;

public class LearnLinkedListMethods {
    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();

        // addLast (same as add)
        animals.addLast("Dog");
        animals.addLast("Horse");
        System.out.println("After addLast: " + animals);
        // After addLast: [Dog, Horse]

        // addFirst
        animals.addFirst("Lion");
        System.out.println("After addFirst: " + animals);
        // After addFirst: [Lion, Dog, Horse]

        // getFirst and getLast
        System.out.println("First: " + animals.getFirst());   // Lion
        System.out.println("Last: " + animals.getLast());     // Horse

        // removeFirst
        System.out.println("RemoveFirst: " + animals.removeFirst());   // Lion
        System.out.println("After removeFirst: " + animals);
        // After removeFirst: [Dog, Horse]

        // removeLast
        System.out.println("RemoveLast: " + animals.removeLast());     // Horse
        System.out.println("After removeLast: " + animals);
        // After removeLast: [Dog]

        // get by index
        System.out.println("Get(0): " + animals.get(0));   // Dog
    }
}
```

**Output:**
```
After addLast: [Dog, Horse]
After addFirst: [Lion, Dog, Horse]
First: Lion
Last: Horse
RemoveFirst: Lion
After removeFirst: [Dog, Horse]
RemoveLast: Horse
After removeLast: [Dog]
Get(0): Dog
```

---
---

## 📌 Note: What is a Comparator?

### What It Is:

A **Comparator** is an interface in `java.util` used to define a **custom ordering/sorting logic** for objects, instead of relying on their natural ordering (`Comparable`).

### What It Does:

It provides a method `compare(obj1, obj2)` that returns:
- **Negative number** → `obj1` comes before `obj2`
- **Zero** → `obj1` and `obj2` are equal in order
- **Positive number** → `obj1` comes after `obj2`

### Use of Comparator:

Used when you want to sort objects in a way that's **different from their default/natural order**, or when the objects don't have a natural order at all (like custom classes).

```java
// Without Comparator — natural order (ascending for numbers)
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(1);
pq.offer(3);
System.out.println(pq.peek());   // 1 (smallest first - default)

// With Comparator — reverse order (descending)
PriorityQueue<Integer> maxPq = new PriorityQueue<>((a, b) -> b - a);
maxPq.offer(5);
maxPq.offer(1);
maxPq.offer(3);
System.out.println(maxPq.peek());   // 5 (largest first - custom order)
```

### Advantages of Using Comparator:

| Advantage | Meaning |
|-----------|---------|
| **Custom sorting logic** | Sort by any field/criteria you define (e.g., sort objects by age, price, length) |
| **Multiple sorting orders** | Same class can be sorted differently in different contexts (without modifying the class itself) |
| **Works with built-in data structures** | Pass directly to `PriorityQueue`, `TreeMap`, `Collections.sort()`, etc. |
| **Flexible — supports lambdas** | Can be written concisely using lambda expressions (`(a, b) -> ...`) |

---

### Quick Reference — Comparator in PriorityQueue:

| Code | Order |
|------|-------|
| `new PriorityQueue<>()` | Natural order (ascending / Min-Heap) |
| `new PriorityQueue<>(Collections.reverseOrder())` | Reverse natural order (descending / Max-Heap) |
| `new PriorityQueue<>((a, b) -> a - b)` | Ascending (custom, equivalent to default for numbers) |
| `new PriorityQueue<>((a, b) -> b - a)` | Descending |

---

*End of Notes — Queue Interface*

---

# Hashing

>Before understanding Set Interface, Lets first understand What is Hashing.

---

## 🔑 What is Hashing?

### What It Is:

**Hashing** is a technique that converts **any input (data/object)** into a **fixed-size numeric value**, called a **hash code**, using a **hash function**. This hash code is then used to determine **where the data should be stored** in memory (typically in an array-like structure called a **hash table**).

```
"Lion"  ──→ hashCode() ──→ 73120054 ──→ % tableSize ──→ Index 4
"Dog"   ──→ hashCode() ──→ 99644      ──→ % tableSize ──→ Index 1
"Cat"   ──→ hashCode() ──→ 98262      ──→ % tableSize ──→ Index 7
```

> 💡 Think of hashing like a **library system** — instead of searching every shelf for a book, the hash function tells you **exactly which shelf number** to go to directly.

---

### Why We Use Hashing:

| Reason | Explanation |
|--------|-------------|
| **Fast lookups** | Instead of scanning every element (O(n)), hashing lets you jump directly to the location (O(1) on average) |
| **Fast insertion/deletion** | No need to shift elements like arrays — just compute the hash and place/remove directly |
| **Uniqueness checking** | Quickly determine if an element already exists (used in `Set` to avoid duplicates) |
| **Efficient grouping/mapping** | Forms the backbone of `HashMap`, `HashSet`, etc. |

---

### How Hashing Works (Internally):

1. **Hash Function**: Every object has a `hashCode()` method that returns an integer.
2. **Index Calculation**: This hash code is converted into an array index using `hashCode % tableSize`.
3. **Bucket Storage**: The element is stored in that "bucket" (array slot).
4. **Collision Handling**: If two elements get the **same index** (called a **collision**), Java handles it by storing multiple elements in the same bucket as a **linked list** (or a balanced tree if too many collide).

```
Hash Table (size 8):

Index 0: []
Index 1: [Dog]
Index 2: []
Index 3: []
Index 4: [Lion]
Index 5: []
Index 6: []
Index 7: [Cat, Tiger]  ← collision: both hashed to index 7, stored together
```

> 💡 **Collision** happens when two different objects produce the **same hash code or index**. Java resolves this using **chaining** (linked list/tree at that index).

---

### Use Cases and Areas Where Hashing is Used:

| Use Case | How Hashing Helps |
|----------|---------------------|
| **HashMap / HashSet / Hashtable** | Core data structures rely on hashing for O(1) average access |
| **Database Indexing** | Quickly locate records without scanning the whole table |
| **Caching** | Fast key-based lookup for cached data |
| **Password Storage** | Store hash of password instead of plain text (security) |
| **Duplicate Detection** | Quickly check if an item has been seen before |
| **Checksums / Data Integrity** | Detect if data has been altered (e.g., file hashes like MD5, SHA) |

---

### Advantages of Hashing:

| Advantage | Meaning |
|-----------|---------|
| **Average O(1) time complexity** | Insert, delete, and search are all very fast on average |
| **Efficient memory usage** | Only stores what's needed, organized via buckets |
| **Foundation for unique collections** | Enables `Set` to guarantee no duplicates efficiently |

---
---

# 3. Set Interface

## What is the Basic Idea of Set?

### What It Is, What It Does, Advantages, Use Cases:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface that represents a collection that contains **NO duplicate elements** |
| **What it does** | Models the mathematical concept of a "set" — stores unique items and provides operations to add, remove, and check membership |
| **Advantages** | Automatic duplicate prevention, fast membership checking (`contains()`), useful set operations (union, intersection, difference) |

| Use Case | How Set Helps |
|----------|----------------|
| **Removing duplicates** | Convert a list to a `Set` to instantly eliminate duplicate values |
| **Membership testing** | Quickly check "does this item exist?" — e.g., checking if a username is already taken |
| **Mathematical set operations** | Find common elements (intersection), combined elements (union), or unique-to-one elements (difference) between two collections |
| **Storing unique tags/categories** | E.g., storing unique skill tags for a user profile |

---

### If We Print a Set, What Will Be the Order of Elements?

> 💡 **It depends on which implementation of Set you use:**

| Implementation | Order When Printed |
|-----------------|---------------------|
| `HashSet` | **No guaranteed order** — appears random (based on hash codes) |
| `LinkedHashSet` | **Insertion order** — maintains the order elements were added |
| `TreeSet` | **Sorted order** — natural ordering (or custom via Comparator) |

> ⚠️ The one universal rule: **a `Set` only keeps unique elements** — adding a duplicate has **no effect** (it's silently ignored, doesn't throw an error).

---

### How Set Internally Works:

A `Set` is essentially a **wrapper around a `Map`** internally (in most implementations):

- `HashSet` is internally backed by a `HashMap` — every element you add is stored as a **key** in that HashMap (with a dummy constant value).
- Since `HashMap` keys are **always unique**, this automatically gives `HashSet` its "no duplicates" property.
- When you call `add(element)`, Java:
  1. Computes `hashCode()` of the element
  2. Finds the bucket using that hash
  3. Checks if an **equal** element already exists in that bucket (using `equals()`)
  4. If yes → ignores the new element (duplicate)
  5. If no → adds it to the bucket

```
HashSet internally:
add("Lion")  →  HashMap.put("Lion", DUMMY_VALUE)
add("Lion")  →  HashMap.put("Lion", DUMMY_VALUE)  → key already exists, no change
```

---

## Methods of Set

| Method | What It Does |
|--------|---------------|
| `add(element)` | Adds the element to the set **if it's not already present**. Returns `true` if added, `false` if it was a duplicate |
| `remove(element)` | Removes the specified element from the set if present. Returns `true`/`false` |
| `contains(element)` | Checks if the element exists in the set. Returns `true`/`false` |
| `size()` | Returns the number of elements in the set |
| `isEmpty()` | Returns `true` if the set has no elements |
| `clear()` | Removes all elements from the set |
| `iterator()` | Returns an iterator to traverse elements one by one |
| `addAll(collection)` | Adds all elements from another collection (acts like a **union**) |
| `removeAll(collection)` | Removes all elements that exist in another collection (acts like a **difference**) |
| `retainAll(collection)` | Keeps only elements that exist in **both** sets (acts like an **intersection**) |

---

### Code Example — Set Methods (using HashSet):

```java
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class LearnSet {
    public static void main(String[] args) {

        Set<String> animals = new HashSet<>();

        // add — adds elements (duplicates ignored)
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        animals.add("Lion");   // duplicate — ignored

        System.out.println("Set: " + animals);
        // Set: [Cat, Dog, Horse, Lion] (order may vary - random)

        // contains — check membership
        System.out.println("Contains Dog: " + animals.contains("Dog"));   // true
        System.out.println("Contains Tiger: " + animals.contains("Tiger")); // false

        // size
        System.out.println("Size: " + animals.size());   // 4 (Lion not duplicated)

        // remove
        animals.remove("Dog");
        System.out.println("After remove: " + animals);
        // After remove: [Cat, Horse, Lion]

        // iterator — traverse one by one
        Iterator<String> it = animals.iterator();
        System.out.print("Iterating: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        // Iterating: Cat Horse Lion

        // addAll — union
        Set<String> moreAnimals = new HashSet<>();
        moreAnimals.add("Tiger");
        moreAnimals.add("Cat");
        animals.addAll(moreAnimals);
        System.out.println("After addAll (union): " + animals);
        // After addAll: [Cat, Horse, Lion, Tiger]

        // retainAll — intersection
        Set<String> common = new HashSet<>(animals);
        common.retainAll(moreAnimals);
        System.out.println("Intersection: " + common);
        // Intersection: [Cat, Tiger]

        // removeAll — difference
        Set<String> diff = new HashSet<>(animals);
        diff.removeAll(moreAnimals);
        System.out.println("Difference: " + diff);
        // Difference: [Horse, Lion]

        // isEmpty and clear
        System.out.println("isEmpty: " + animals.isEmpty());   // false
        animals.clear();
        System.out.println("After clear, isEmpty: " + animals.isEmpty());   // true
    }
}
```

**Output:**
```
Set: [Cat, Dog, Horse, Lion]
Contains Dog: true
Contains Tiger: false
Size: 4
After remove: [Cat, Horse, Lion]
Iterating: Cat Horse Lion
After addAll (union): [Cat, Horse, Lion, Tiger]
Intersection: [Cat, Tiger]
Difference: [Horse, Lion]
isEmpty: false
After clear, isEmpty: true
```

> ⚠️ Note: The actual printed order of `HashSet` elements may differ on your machine — it depends on hash codes, not insertion order.

---
---

## 1️⃣ HashSet

### What It Is, What It Does, Advantages and Use Cases:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | The most basic implementation of `Set`, backed internally by a `HashMap` |
| **What it does** | Stores unique elements with **no guaranteed order** — order depends on hash codes |
| **Advantages** | Fastest among Set implementations for add/remove/contains — average **O(1)** |
| **Use cases** | When you need uniqueness and fast lookups, and **don't care about order** |

> 💡 **The Order of Elements is Random** — it's based on the internal hash table layout, not the order you inserted them. Don't rely on `HashSet` printing elements in the order you added them.

---

### Specific Methods of HashSet:

HashSet mostly uses the **standard Set methods** (`add`, `remove`, `contains`, `size`, `isEmpty`, `clear`, `iterator`). It doesn't add many "extra" methods of its own — its specialty is **how** it implements these methods (via hashing) rather than adding new ones.

| Method | What It Does |
|--------|---------------|
| `add(e)` | Computes hash of `e`, places it in the appropriate bucket if not already present |
| `remove(e)` | Computes hash of `e`, locates and removes it from its bucket |
| `contains(e)` | Computes hash of `e`, checks the corresponding bucket for existence |
| `size()` | Returns total count of unique elements |
| `clear()` | Empties all buckets |

---

### Code Example — HashSet:

```java
import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {

        Set<String> animals = new HashSet<>();

        // add
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        animals.add("Dog");   // duplicate, ignored

        System.out.println("HashSet: " + animals);
        // HashSet: [Cat, Horse, Dog, Lion]  ← random order, NOT insertion order

        // contains
        System.out.println("Contains Lion: " + animals.contains("Lion"));   // true

        // remove
        animals.remove("Horse");
        System.out.println("After remove: " + animals);
        // After remove: [Cat, Dog, Lion]

        // size
        System.out.println("Size: " + animals.size());   // 3
    }
}
```

**Output (order may vary):**
```
HashSet: [Cat, Horse, Dog, Lion]
Contains Lion: true
After remove: [Cat, Dog, Lion]
Size: 3
```

---
---

## 2️⃣ LinkedHashSet

### What It Is, What It Does, Advantages and Use Cases:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A `Set` implementation that combines a **HashSet** (for uniqueness) with a **LinkedList** (for maintaining order) |
| **What it does** | Stores unique elements **AND** remembers the **order in which they were inserted** |
| **Advantages** | Predictable iteration order + still fast O(1) average operations like HashSet |
| **Use cases** | When you need **uniqueness + insertion order** — e.g., displaying a list of unique recently-visited pages in the order visited |

> 💡 **How it works**: Internally, each entry is stored in a hash table (like HashSet) **but also linked together** in a doubly-linked list that tracks insertion order — combining the speed of hashing with the order of a linked list.

> 💡 **Here the order of elements WILL be maintained** — exactly as you inserted them.

---

### Specific Methods of LinkedHashSet:

LinkedHashSet **doesn't introduce brand new methods** beyond the standard `Set` interface — its specialty is that all the standard methods (`add`, `remove`, `contains`, `iterator`, etc.) **preserve insertion order** while operating.

| Method | What It Does (LinkedHashSet behavior) |
|--------|------------------------------------------|
| `add(e)` | Adds element; if new, it's appended to the **end** of the maintained order |
| `remove(e)` | Removes element; order of remaining elements stays intact |
| `contains(e)` | Same fast O(1) check as HashSet |
| `iterator()` | Iterates in **insertion order** (this is the key difference from HashSet) |

---

### Code Example — LinkedHashSet:

```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {

        Set<String> animals = new LinkedHashSet<>();

        // add — order will be preserved
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");
        animals.add("Dog");   // duplicate, ignored

        System.out.println("LinkedHashSet: " + animals);
        // LinkedHashSet: [Lion, Dog, Horse, Cat]  ← insertion order maintained!

        // contains
        System.out.println("Contains Horse: " + animals.contains("Horse"));   // true

        // remove
        animals.remove("Dog");
        System.out.println("After remove: " + animals);
        // After remove: [Lion, Horse, Cat]

        // add new element — goes to the end
        animals.add("Tiger");
        System.out.println("After adding Tiger: " + animals);
        // After adding Tiger: [Lion, Horse, Cat, Tiger]

        // size
        System.out.println("Size: " + animals.size());   // 4
    }
}
```

**Output:**
```
LinkedHashSet: [Lion, Dog, Horse, Cat]
Contains Horse: true
After remove: [Lion, Horse, Cat]
After adding Tiger: [Lion, Horse, Cat, Tiger]
Size: 4
```

---
---

## 3️⃣ TreeSet

### What It Is, What It Does, Advantages and Use Cases:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A `Set` implementation that stores elements in **sorted (ascending) order** |
| **What it does** | Maintains unique elements **always sorted** — either by natural order (`Comparable`) or a custom `Comparator` |
| **Advantages** | Always sorted automatically; supports range operations (`first()`, `last()`, `headSet()`, `tailSet()`, etc.) |
| **Use cases** | When you need a **unique, always-sorted** collection — e.g., maintaining a sorted leaderboard of unique scores |

---

### How TreeSet Internally Maintains Sorted Order:

`TreeSet` is internally backed by a **`TreeMap`**, which uses a **Red-Black Tree** (a type of self-balancing Binary Search Tree).

- Every time you `add()` an element, it's placed in the correct position in the tree based on comparison (`compareTo()` or `Comparator`).
- A **Red-Black Tree** automatically **rebalances itself** during insertions/deletions to keep operations efficient.
- Because it's a **Binary Search Tree**, an **in-order traversal** of the tree always gives elements in **sorted order** — this is why iterating/printing a TreeSet shows sorted elements.

```
TreeSet adding: 5, 2, 8, 1, 3

           5
          / \
         2   8
        / \
       1   3

In-order traversal → 1, 2, 3, 5, 8  (sorted!)
```

- **Time Complexity**: Insert, delete, search are all **O(log n)** — slightly slower than HashSet's O(1), but you get sorting "for free."

---

### Specific Methods of TreeSet:

| Method | What It Does |
|--------|---------------|
| `first()` | Returns the **smallest** (first) element in the set |
| `last()` | Returns the **largest** (last) element in the set |
| `ceiling(e)` | Returns the smallest element **≥** `e` (or `null` if none) |
| `floor(e)` | Returns the largest element **≤** `e` (or `null` if none) |
| `higher(e)` | Returns the smallest element **strictly greater than** `e` |
| `lower(e)` | Returns the largest element **strictly less than** `e` |
| `headSet(e)` | Returns all elements **strictly less than** `e` |
| `tailSet(e)` | Returns all elements **greater than or equal to** `e` |
| `pollFirst()` | Removes and returns the **smallest** element |
| `pollLast()` | Removes and returns the **largest** element |

---

### Code Example — TreeSet:

```java
import java.util.TreeSet;
import java.util.Set;

public class LearnTreeSet {
    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        // add — automatically sorted
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(30);

        System.out.println("TreeSet: " + numbers);
        // TreeSet: [10, 20, 30, 50, 80]  ← always sorted!

        TreeSet<Integer> treeSet = (TreeSet<Integer>) numbers;

        // first and last
        System.out.println("First: " + treeSet.first());   // 10
        System.out.println("Last: " + treeSet.last());     // 80

        // ceiling and floor
        System.out.println("Ceiling(25): " + treeSet.ceiling(25));   // 30 (smallest >= 25)
        System.out.println("Floor(25): " + treeSet.floor(25));       // 20 (largest <= 25)

        // higher and lower
        System.out.println("Higher(30): " + treeSet.higher(30));     // 50 (strictly > 30)
        System.out.println("Lower(30): " + treeSet.lower(30));       // 20 (strictly < 30)

        // headSet and tailSet
        System.out.println("HeadSet(30): " + treeSet.headSet(30));   // [10, 20]
        System.out.println("TailSet(30): " + treeSet.tailSet(30));   // [30, 50, 80]

        // pollFirst and pollLast
        System.out.println("PollFirst: " + treeSet.pollFirst());     // 10
        System.out.println("PollLast: " + treeSet.pollLast());       // 80
        System.out.println("After polls: " + treeSet);
        // After polls: [20, 30, 50]
    }
}
```

**Output:**
```
TreeSet: [10, 20, 30, 50, 80]
First: 10
Last: 80
Ceiling(25): 30
Floor(25): 20
Higher(30): 50
Lower(30): 20
HeadSet(30): [10, 20]
TailSet(30): [30, 50, 80]
PollFirst: 10
PollLast: 80
After polls: [20, 30, 50]
```

---
---

## 4️⃣ EnumSet

### What It Is, What It Does, Advantages and Use Cases:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A specialized `Set` implementation designed **exclusively for Enum types** |
| **What it does** | Stores a collection of **enum constants** — internally represented as a **bit vector** for extreme efficiency |
| **Advantages** | Extremely fast and memory-efficient (much faster than HashSet for enums); maintains **natural enum order** (declaration order) automatically |
| **Use cases** | When working with a fixed set of constants — e.g., representing days of the week selected, permissions/flags, status combinations |

> 💡 Think of `EnumSet` as a set of **checkboxes** where each checkbox corresponds to one enum constant — internally it's just a sequence of bits (1 = present, 0 = absent), making operations blazing fast.

---

### Specific Methods of EnumSet:

| Method | What It Does |
|--------|---------------|
| `EnumSet.of(e1, e2, ...)` | Creates a set containing the specified enum constants |
| `EnumSet.allOf(EnumClass.class)` | Creates a set containing **all** constants of the given enum |
| `EnumSet.noneOf(EnumClass.class)` | Creates an **empty** set for the given enum type |
| `EnumSet.range(e1, e2)` | Creates a set containing all constants **between** `e1` and `e2` (inclusive, in declaration order) |
| `EnumSet.complementOf(otherSet)` | Creates a set containing all constants **NOT** in `otherSet` |

---

### Code Example — EnumSet:

```java
import java.util.EnumSet;
import java.util.Set;

public class LearnEnumSet {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        // EnumSet.of — specific constants
        Set<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend: " + weekend);
        // Weekend: [SATURDAY, SUNDAY]

        // EnumSet.allOf — all constants
        Set<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All Days: " + allDays);
        // All Days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]

        // EnumSet.noneOf — empty set
        Set<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println("No Days: " + noDays);
        // No Days: []

        // EnumSet.range — range of constants
        Set<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        System.out.println("Weekdays: " + weekdays);
        // Weekdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]

        // EnumSet.complementOf — opposite of a set
        Set<Day> notWeekend = EnumSet.complementOf((EnumSet<Day>) weekend);
        System.out.println("Not Weekend: " + notWeekend);
        // Not Weekend: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]

        // add and contains (standard Set methods)
        noDays.add(Day.MONDAY);
        System.out.println("Contains MONDAY: " + noDays.contains(Day.MONDAY));   // true
    }
}
```

**Output:**
```
Weekend: [SATURDAY, SUNDAY]
All Days: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]
No Days: []
Weekdays: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
Not Weekend: [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY]
Contains MONDAY: true
```

> 💡 Notice how `EnumSet` always prints elements in their **declaration order** in the enum (not insertion order!) — this is part of its internal bit-vector design.

---
---

## ⭐ Important: When to Use Which Set?

### Scenario-Based Guide:

| Implementation | Use When... |
|------------------|-------------|
| **HashSet** | You just need uniqueness and **don't care about order** — fastest general-purpose choice |
| **LinkedHashSet** | You need uniqueness **AND** want to preserve **insertion order** (e.g., showing unique items in the order user added them) |
| **TreeSet** | You need uniqueness **AND** elements **always sorted** (e.g., leaderboard, range queries like "find all scores between 50 and 100") |
| **EnumSet** | You're working with a **fixed enum type** and need extremely fast set operations on enum constants (e.g., permission flags, days selected) |

---

### Time Complexity Comparison:

| Operation | HashSet | LinkedHashSet | TreeSet | EnumSet |
|-----------|---------|----------------|---------|---------|
| `add(e)` | O(1) average | O(1) average | O(log n) | O(1) |
| `remove(e)` | O(1) average | O(1) average | O(log n) | O(1) |
| `contains(e)` | O(1) average | O(1) average | O(log n) | O(1) |
| **Order maintained** | ❌ No (random) | ✅ Insertion order | ✅ Sorted order | ✅ Declaration order |
| **Internal structure** | Hash Table (HashMap) | Hash Table + Linked List | Red-Black Tree (TreeMap) | Bit Vector |
| **Allows `null`** | ✅ One `null` allowed | ✅ One `null` allowed | ❌ No (throws `NullPointerException`) | ❌ No |
| **Best for** | General-purpose, fastest | Order-sensitive uniqueness | Sorted unique data, range queries | Enum-based flags/constants |

---

*End of Notes — Set Interface*

---

# Sets of Custom Classes (hashCode & equals)

---

## How Do We Make a Set of Custom Class Objects?

### We Cannot Make It Naturally (By Default)

When you create a `Set` of a **custom class** (like `Student`, `Employee`, etc.), Java **cannot automatically know** whether two objects represent the "same" thing or "different" things.

```java
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

Set<Student> students = new HashSet<>();
students.add(new Student("Aman", 101));
students.add(new Student("Aman", 101));   // same data, but...

System.out.println(students.size());   // 2 (NOT 1!) ❌
```

> ⚠️ Even though both `Student` objects have **identical data** (`"Aman"`, `101`), the `Set` treats them as **two different elements** — so it adds **both**, breaking the "uniqueness" guarantee of a Set.

**Why does this happen?**

By default, every Java object inherits `hashCode()` and `equals()` from the `Object` class, and these default versions:
- `hashCode()` → returns a value based on the object's **memory address**
- `equals()` → checks **reference equality** (`==`) — i.e., are these the **exact same object in memory**?

Since `new Student("Aman", 101)` creates **two separate objects in memory**, both `hashCode()` and `equals()` say "these are different" — even though their data is the same.

```
Object 1: Student@1a2b3c  (memory address A)
Object 2: Student@4d5e6f  (memory address B)

hashCode() → different (based on address)
equals()   → false (different references)

Result: Set treats them as DIFFERENT elements
```

---

## How `hashCode()` and `equals()` Solve This

To make a `Set` correctly recognize **logically equal** custom objects as duplicates, you must **override** both `hashCode()` and `equals()` in your class — defining equality based on **data/fields**, not memory address.

---

### What `hashCode()` Is and What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A method (inherited from `Object`) that returns an **integer** representing the object, used to determine which **bucket** the object goes into in a hash table |
| **What it does** | When you `add()` an object to a `HashSet`, Java first calls `hashCode()` to find the right bucket. This narrows down the search **before** even checking `equals()` |
| **Why we override it** | So that two objects with the **same data** produce the **same hash code** — meaning they land in the **same bucket**, where `equals()` can then compare them properly |

---

### What `equals()` Is and What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A method (inherited from `Object`) used to check whether **two objects are logically equal** |
| **What it does** | Once `hashCode()` narrows down the bucket, `equals()` is used to do a **field-by-field comparison** — if it returns `true`, the object is considered a duplicate and **not added** |
| **Why we override it** | So that equality is based on **meaningful data** (e.g., same name and roll number = same student), not memory address |

---

### Why We Use Them Together:

> 💡 **The Golden Rule**: If two objects are `equal` (via `equals()`), they **MUST** have the **same `hashCode()`**.

This is critical because of how `HashSet` checks for duplicates:

```
add(newObject):
  1. Compute newObject.hashCode()
  2. Find the bucket for that hash code
  3. For each existing object in that bucket:
       if (newObject.equals(existingObject)) → it's a duplicate, DON'T add
  4. If no match found → add newObject to that bucket
```

If `hashCode()` is **not overridden**, two "equal" objects (by your `equals()` logic) might get **different hash codes** → land in **different buckets** → `equals()` is **never even called** between them → both get added as "duplicates."

---

### Advantages and Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Correct duplicate detection** | Set behaves as expected — objects with same data are treated as duplicates |
| **Enables custom objects in HashSet/HashMap** | Without this, custom classes can't be reliably used as Set elements or Map keys |
| **Fast lookups still work** | `contains()`, `remove()` etc. work correctly and efficiently for custom objects |
| **Consistent behavior across collections** | `HashMap`, `HashSet`, `Hashtable` all rely on this contract |

| Use Case | Example |
|----------|---------|
| **Storing unique Student records** | Two `Student` objects with the same roll number should be treated as the same student |
| **De-duplicating custom objects** | E.g., removing duplicate `Address` objects with the same street/city/zip |
| **Using custom objects as HashMap keys** | E.g., using a `Point(x, y)` object as a key — two points with same coordinates should map to the same value |

---

## Example — Fixing the Student Class

```java
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Override equals() — define what makes two Students "equal"
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;                    // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Student other = (Student) obj;
        return rollNo == other.rollNo && name.equals(other.name);
    }

    // Override hashCode() — must be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo);
    }

    @Override
    public String toString() {
        return name + "(" + rollNo + ")";
    }
}

public class LearnHashCodeEquals {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student("Aman", 101));
        students.add(new Student("Aman", 101));   // same data — should be treated as duplicate
        students.add(new Student("Riya", 102));

        System.out.println("Set: " + students);
        System.out.println("Size: " + students.size());

        // contains works correctly now
        System.out.println("Contains Aman(101): " + students.contains(new Student("Aman", 101)));
    }
}
```

**Output:**
```
Set: [Aman(101), Riya(102)]
Size: 2
Contains Aman(101): true
```

> ✅ Now the `Set` correctly recognizes `new Student("Aman", 101)` added twice as the **same logical object** — only one copy is kept!

---

### Step-by-Step — What Happens When We Add the Second `Student("Aman", 101)`:

| Step | What Happens |
|------|---------------|
| 1 | `hashCode()` is computed using `name` and `rollNo` → produces the **same value** as the first `Student("Aman", 101)` |
| 2 | Both objects land in the **same bucket** (same hash code) |
| 3 | `equals()` is called between the new object and the existing one in that bucket |
| 4 | `equals()` compares `name` and `rollNo` → both match → returns `true` |
| 5 | `HashSet` recognizes this as a **duplicate** → does **NOT** add it |

---

### Quick Reference:

| Method | Purpose | Default Behavior (if not overridden) | What Overriding Achieves |
|--------|---------|------------------------------------------|----------------------------|
| `hashCode()` | Determines which bucket an object goes into | Based on memory address | Same data → same hash code → same bucket |
| `equals()` | Determines if two objects are logically the same | Reference comparison (`==`) | Field-by-field comparison → logical equality |

> 💡 **Tip**: In real projects, use `Objects.hash(field1, field2, ...)` for `hashCode()` — it's a clean, built-in way to combine multiple fields into one hash code. Most IDEs (IntelliJ, Eclipse) can also **auto-generate** correct `hashCode()` and `equals()` implementations for you.

---

*End of Notes — Sets of Custom Classes (hashCode & equals)*

---

# Java Collections Framework Hierarchy

---

## 📚 Collection Hierarchy

```
Iterable (Interface)
│
└── Collection (Interface)
    │
    ├── List (Interface)
    │   │
    │   ├── ArrayList
    │   ├── LinkedList
    │   ├── Vector
    │   │    └── Stack
    │
    ├── Set (Interface)
    │   │
    │   ├── HashSet
    │   │    └── LinkedHashSet
    │   │
    │   ├── SortedSet (Interface)
    │   │    └── NavigableSet (Interface)
    │   │          └── TreeSet
    │
    └── Queue (Interface)
        │
        ├── PriorityQueue
        │
        └── Deque (Interface)
             │
             ├── ArrayDeque
             └── LinkedList
```

> 💡 **Note:** `LinkedList` appears in **two** places — it implements both `List` and `Deque` (and therefore `Queue`). Similarly, `LinkedHashSet` extends `HashSet`, and `TreeSet` implements `NavigableSet` (which extends `SortedSet`).

---

# What is `Iterable (Interface)` in Java?

`Iterable` is the root interface of the Collection Framework hierarchy.

```
Iterable
   │
   └── Collection
         ├── List
         ├── Set
         └── Queue
```

Its main purpose is to allow objects to be traversed (iterated) one element at a time.

## What does it provide?

The `Iterable` interface contains one important method:

```java
Iterator<T> iterator();
```

This method returns an `Iterator`, which is used to go through all the elements in a collection.

## Example

```java
List<String> names = new ArrayList<>();

names.add("Prem");
names.add("Rahul");
names.add("Aman");

Iterator<String> it = names.iterator();

while(it.hasNext()) {
    System.out.println(it.next());
}
```

Output:

```
Prem
Rahul
Aman
```

## Why is it important?

Because every collection that implements `Iterable` can be used in a for-each loop:

```java
for(String name : names) {
    System.out.println(name);
}
```

This works because `ArrayList` → `List` → `Collection` → `Iterable`.

## Real-Life Analogy

Think of `Iterable` as:

"Any object implementing me must provide a way to visit all its elements one by one."

For example:

* ArrayList ✔️
* LinkedList ✔️
* HashSet ✔️
* TreeSet ✔️

All of them can be traversed element by element.

## Interview Definition

`Iterable` is the root interface of the Java Collection Framework. It provides the `iterator()` method, which allows collections to be traversed element by element and enables the enhanced for-each loop.

## One Thing to Remember

`Map` does not implement `Iterable` directly because a map stores key-value pairs, not individual elements.

That's why you iterate over:

```java
map.keySet()
map.values()
map.entrySet()
```

instead of iterating over the map itself.

---

## 🗺️ Map Hierarchy (Separate from Collection)

> ⚠️ **`Map` is NOT a child of `Collection`** — it's a completely separate interface hierarchy, because `Map` deals with **key-value pairs**, not single elements.

```
Map (Interface)
│
├── HashMap
│    └── LinkedHashMap
│
├── Hashtable
│
├── SortedMap (Interface)
│    └── NavigableMap (Interface)
│          └── TreeMap
```

---

## 🔍 Quick Categorization

| Interface | Main Implementations |
|-----------|------------------------|
| **List** | `ArrayList`, `LinkedList`, `Vector`, `Stack` |
| **Set** | `HashSet`, `LinkedHashSet`, `TreeSet` |
| **Queue** | `PriorityQueue`, `LinkedList`, `ArrayDeque` |
| **Deque** | `ArrayDeque`, `LinkedList` |
| **Map** | `HashMap`, `LinkedHashMap`, `Hashtable`, `TreeMap` |

---

## 🧠 Memory Trick

```
Collection
│
├── List   → Ordered, Duplicates Allowed
├── Set    → No Duplicates
└── Queue  → FIFO / Processing Order

Map → Key-Value Pairs (Separate Hierarchy)
```

| Type | One-Line Memory Hook |
|------|------------------------|
| **List** | "Order matters, repeats allowed" |
| **Set** | "Uniqueness guaranteed" |
| **Queue** | "First in, first out — processing order" |
| **Map** | "Key unlocks Value — lives outside Collection" |

---

*End of Notes — Collections Framework Hierarchy*

---

# Map (Interface)

> ⚠️ **`Map` is NOT a child of `Collection`** — it's a completely separate interface hierarchy, because `Map` deals with **key-value pairs**, not single elements.

```
Map (Interface)
│
├── HashMap
│    └── LinkedHashMap
│
├── Hashtable
│
├── SortedMap (Interface)
│    └── NavigableMap (Interface)
│          └── TreeMap
```

## 🗺️ What is a Map?

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface in `java.util` that represents a collection of **key-value pairs** — each key maps to exactly one value |
| **What it does** | Stores, retrieves, updates, and deletes data using a **key** — instead of using an index (like List) or just a value (like Set) |

> 💡 Think of a `Map` like a **dictionary** — you look up a **word (key)** to get its **meaning (value)**. You don't search page by page — you go directly to the word.

---

### How It Stores Key-Value Pairs:

Every entry in a `Map` is a **pair** — one key, one value:

```
Map<String, Integer> marks = new HashMap<>();

marks.put("Aman",  95);
marks.put("Riya",  88);
marks.put("Rahul", 76);

┌─────────────────────────┐
│   KEY      │   VALUE    │
├────────────┼────────────┤
│  "Aman"    │    95      │
│  "Riya"    │    88      │
│  "Rahul"   │    76      │
└────────────┴────────────┘
```

- Each **key is unique** — no two entries can have the same key.
- Each key maps to **exactly one value**.
- **Values can be duplicated** — two different keys can point to the same value.

---

### ⭐ Important — Benefits of Making Maps:

> 💡 **Keys will always be unique.** If you put the same key again with a **different value**, the old value gets **overridden** (replaced) by the new one.

```java
marks.put("Aman", 95);
marks.put("Aman", 99);   // same key "Aman" — value 95 gets overridden by 99

System.out.println(marks.get("Aman"));   // 99
```

This is extremely useful — it means you can **update records** just by putting the same key again, without worrying about duplicates.

---

### Advantages of Using Map:

| Advantage | Meaning |
|-----------|---------|
| **Direct key-based access** | Retrieve any value instantly by its key — no loops needed |
| **Automatic overwrite on duplicate keys** | Updating a value is as simple as `put()` with the same key |
| **Flexible key-value types** | Keys and values can be any object type (`String`, `Integer`, custom class, etc.) |
| **Natural fit for real-world associations** | Phone book, student roll numbers, product prices — everything is a key-value pair |

---

### Real-World Use Cases of Map:

| Use Case | Key | Value |
|----------|-----|-------|
| **Phone book** | Person's name | Phone number |
| **Student marks** | Roll number | Marks |
| **Word frequency counter** | Word | How many times it appears |
| **Login system** | Username | Password/Profile |
| **Product catalog** | Product ID | Product details |
| **Cache (like browser cache)** | URL | Cached response |

---

## Methods of Map

| Method | What It Does |
|--------|---------------|
| `put(key, value)` | Inserts a key-value pair. If key already exists, **overrides** the old value with the new one |
| `get(key)` | Returns the value associated with the given key. Returns `null` if key doesn't exist |
| `getOrDefault(key, defaultValue)` | Returns value for the key, or `defaultValue` if the key doesn't exist |
| `containsKey(key)` | Returns `true` if the given key exists in the map |
| `containsValue(value)` | Returns `true` if the given value exists in the map (scans all entries) |
| `remove(key)` | Removes the entry with the given key. Returns the removed value |
| `size()` | Returns the total number of key-value pairs |
| `isEmpty()` | Returns `true` if the map has no entries |
| `clear()` | Removes all entries from the map |
| `keySet()` | Returns a `Set` of all keys in the map |
| `values()` | Returns a `Collection` of all values in the map |
| `entrySet()` | Returns a `Set` of all key-value pairs as `Map.Entry` objects |
| `putIfAbsent(key, value)` | Inserts the key-value pair **only if** the key is not already present |
| `replace(key, value)` | Replaces the value of an existing key — does nothing if key doesn't exist |

---

## Code Example — Map (using HashMap):

```java
import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        // Creating a Map — keys are String, values are Integer
        Map<String, Integer> marks = new HashMap<>();

        // put() — insert key-value pairs
        marks.put("Aman", 95);
        marks.put("Riya", 88);
        marks.put("Rahul", 76);
        marks.put("Priya", 91);

        System.out.println("Map: " + marks);
        // Map: {Riya=88, Aman=95, Rahul=76, Priya=91}

        // put() with same key — value gets overridden
        marks.put("Aman", 99);
        System.out.println("After override Aman: " + marks.get("Aman"));
        // After override Aman: 99

        // get() — retrieve value by key
        System.out.println("Marks of Riya: " + marks.get("Riya"));
        // Marks of Riya: 88

        // getOrDefault() — safe retrieval
        System.out.println("Marks of Raj: " + marks.getOrDefault("Raj", 0));
        // Marks of Raj: 0  (Raj doesn't exist, returns default 0)

        // containsKey()
        System.out.println("Contains Rahul: " + marks.containsKey("Rahul"));
        // Contains Rahul: true

        // containsValue()
        System.out.println("Contains value 88: " + marks.containsValue(88));
        // Contains value 88: true

        // putIfAbsent() — only adds if key is NOT already present
        marks.putIfAbsent("Aman", 50);   // Aman already exists — no change
        marks.putIfAbsent("Raj", 70);    // Raj doesn't exist — added
        System.out.println("After putIfAbsent: " + marks);

        // replace() — replaces value of existing key
        marks.replace("Raj", 85);
        System.out.println("After replace Raj: " + marks.get("Raj"));
        // After replace Raj: 85

        // keySet() — all keys
        System.out.println("Keys: " + marks.keySet());
        // Keys: [Riya, Aman, Rahul, Priya, Raj]

        // values() — all values
        System.out.println("Values: " + marks.values());
        // Values: [88, 99, 76, 91, 85]

        // entrySet() — iterate over all key-value pairs
        System.out.println("All entries:");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("  " + entry.getKey() + " → " + entry.getValue());
        }

        // size()
        System.out.println("Size: " + marks.size());
        // Size: 5

        // remove()
        marks.remove("Rahul");
        System.out.println("After remove Rahul: " + marks);

        // isEmpty() and clear()
        System.out.println("isEmpty: " + marks.isEmpty());   // false
        marks.clear();
        System.out.println("After clear, isEmpty: " + marks.isEmpty());   // true
    }
}
```

**Output:**
```
Map: {Riya=88, Aman=95, Rahul=76, Priya=91}
After override Aman: 99
Marks of Riya: 88
Marks of Raj: 0
Contains Rahul: true
Contains value 88: true
After putIfAbsent: {Riya=88, Aman=99, Rahul=76, Priya=91, Raj=70}
After replace Raj: 85
Keys: [Riya, Aman, Rahul, Priya, Raj]
Values: [88, 99, 76, 91, 85]
All entries:
  Riya → 88
  Aman → 99
  Rahul → 76
  Priya → 91
  Raj → 85
Size: 5
After remove Rahul: {Riya=88, Aman=99, Priya=91, Raj=85}
isEmpty: false
After clear, isEmpty: true
```

---
---

## 1️⃣ HashMap

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | The most widely used implementation of the `Map` interface, backed internally by a **Hash Table** |
| **What it does** | Stores key-value pairs with **no guaranteed order** — the order of entries when printed is random (based on hash codes) |

---

### How HashMap is Different from Map:

| Aspect | Map (Interface) | HashMap (Class) |
|--------|-----------------|-----------------|
| **Type** | Interface — just defines the contract (method names) | Concrete class — actual implementation you can instantiate |
| **Can be instantiated?** | ❌ No (`new Map()` is invalid) | ✅ Yes (`new HashMap()`) |
| **Order** | Depends on implementation | ❌ No guaranteed order (random) |
| **Thread safety** | Depends on implementation | ❌ Not thread-safe |
| **Null keys** | Depends on implementation | ✅ Allows **one** `null` key and multiple `null` values |

> 💡 `Map` is the **blueprint**, `HashMap` is the **building built from that blueprint** — with its own specific behavior (hashing, no order).

---

### How HashMap Works Internally:

Internally, `HashMap` uses a **Hash Table** (array of "buckets"):

1. When you call `put(key, value)`, Java computes `hashCode()` of the key.
2. That hash code is converted to a bucket index.
3. The key-value pair is stored in that bucket.
4. If two keys land in the same bucket (**collision**), they're stored together as a linked list (or a Red-Black Tree if more than 8 entries collide in one bucket — Java 8+).

```
HashMap internal structure:

Bucket 0: []
Bucket 1: [Riya=88]
Bucket 2: []
Bucket 3: [Aman=99]
Bucket 4: [Rahul=76] → [Priya=91]   ← collision, stored as chain
Bucket 5: []
...
```

---

### Advantages and Real-World Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Fastest Map implementation** | O(1) average for `put()`, `get()`, `remove()` |
| **Allows null key/values** | Flexible for cases where data might be missing |
| **Most flexible ordering needs** | When you just need key-value storage and don't care about order |

| Use Case | Example |
|----------|---------|
| **Caching** | URL → cached HTML response |
| **Word frequency** | Word → count of occurrences |
| **User sessions** | Session ID → User object |
| **Configuration store** | Config key → Config value |

---

### Methods of HashMap:

HashMap inherits all `Map` methods plus adds a few of its own:

| Method | What It Does |
|--------|---------------|
| `put(key, value)` | Insert/update a key-value pair |
| `get(key)` | Retrieve value by key |
| `getOrDefault(key, default)` | Retrieve value or return default if key missing |
| `containsKey(key)` | Check if key exists |
| `containsValue(value)` | Check if value exists |
| `remove(key)` | Remove entry by key |
| `putIfAbsent(key, value)` | Add only if key not already present |
| `replace(key, value)` | Replace value of existing key |
| `size()` | Number of entries |
| `isEmpty()` | Check if empty |
| `clear()` | Remove all entries |
| `keySet()` | Get all keys as a `Set` |
| `values()` | Get all values as a `Collection` |
| `entrySet()` | Get all key-value pairs as `Set<Map.Entry>` |
| `putAll(map)` | Copy all entries from another map into this one |

---

### Code Example — HashMap:

```java
import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {

        // Creating HashMap — key: product name, value: price
        HashMap<String, Integer> prices = new HashMap<>();

        // put() — insert entries
        prices.put("Apple",  150);
        prices.put("Mango",  80);
        prices.put("Banana", 40);
        prices.put("Grapes", 120);

        System.out.println("HashMap: " + prices);
        // HashMap: {Banana=40, Apple=150, Mango=80, Grapes=120}  ← random order

        // get() — retrieve price of Apple
        System.out.println("Price of Apple: " + prices.get("Apple"));
        // Price of Apple: 150

        // put() same key — overrides value
        prices.put("Apple", 170);
        System.out.println("Updated Apple price: " + prices.get("Apple"));
        // Updated Apple price: 170

        // getOrDefault() — safe get
        System.out.println("Price of Kiwi: " + prices.getOrDefault("Kiwi", -1));
        // Price of Kiwi: -1  (Kiwi not found, returns -1)

        // containsKey()
        System.out.println("Has Mango: " + prices.containsKey("Mango"));
        // Has Mango: true

        // containsValue()
        System.out.println("Has price 40: " + prices.containsValue(40));
        // Has price 40: true

        // putIfAbsent() — Mango already exists, no change; Kiwi is new, gets added
        prices.putIfAbsent("Mango", 999);
        prices.putIfAbsent("Kiwi", 200);
        System.out.println("After putIfAbsent: " + prices);

        // replace()
        prices.replace("Kiwi", 220);
        System.out.println("After replace Kiwi: " + prices.get("Kiwi"));
        // After replace Kiwi: 220

        // keySet() — all keys
        System.out.println("Products: " + prices.keySet());

        // values() — all values
        System.out.println("Prices: " + prices.values());

        // entrySet() — iterate all pairs
        System.out.println("All Products and Prices:");
        for (Map.Entry<String, Integer> entry : prices.entrySet()) {
            System.out.println("  " + entry.getKey() + " → ₹" + entry.getValue());
        }

        // putAll()
        HashMap<String, Integer> morePrices = new HashMap<>();
        morePrices.put("Papaya", 60);
        morePrices.put("Lychee", 90);
        prices.putAll(morePrices);
        System.out.println("After putAll: " + prices);

        // remove()
        prices.remove("Banana");
        System.out.println("After removing Banana: " + prices);

        // size()
        System.out.println("Total products: " + prices.size());

        // clear() and isEmpty()
        prices.clear();
        System.out.println("After clear, isEmpty: " + prices.isEmpty());   // true
    }
}
```

**Output:**
```
HashMap: {Banana=40, Apple=150, Mango=80, Grapes=120}
Price of Apple: 150
Updated Apple price: 170
Price of Kiwi: -1
Has Mango: true
Has price 40: true
After putIfAbsent: {Banana=40, Apple=170, Mango=80, Grapes=120, Kiwi=200}
After replace Kiwi: 220
Products: [Banana, Apple, Mango, Grapes, Kiwi]
Prices: [40, 170, 80, 120, 220]
All Products and Prices:
  Banana → ₹40
  Apple → ₹170
  Mango → ₹80
  Grapes → ₹120
  Kiwi → ₹220
After putAll: {Banana=40, Apple=170, Mango=80, Grapes=120, Kiwi=220, Papaya=60, Lychee=90}
After removing Banana: {Apple=170, Mango=80, Grapes=120, Kiwi=220, Papaya=60, Lychee=90}
Total products: 6
After clear, isEmpty: true
```

---
---

## 2️⃣ TreeMap

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A `Map` implementation that stores key-value pairs in **sorted order of keys** (ascending by default) |
| **What it does** | Automatically sorts entries by key every time you insert — no manual sorting needed |

---

### How TreeMap is Different from Map and HashMap:

| Aspect | Map (Interface) | HashMap | TreeMap |
|--------|-----------------|---------|---------|
| **Type** | Interface | Class (Hash Table) | Class (Red-Black Tree) |
| **Order** | Depends on impl | ❌ Random (no order) | ✅ Always sorted by key |
| **Null keys** | Depends on impl | ✅ One null key allowed | ❌ No null keys (throws `NullPointerException`) |
| **Performance** | Depends on impl | O(1) avg | O(log n) |
| **Internal structure** | — | Hash Table | Red-Black Tree (Self-balancing BST) |
| **Best for** | General contract | Fast unordered access | Sorted key-value storage, range queries |

> 💡 Just like `TreeSet` (which is backed by `TreeMap`), `TreeMap` uses a **Red-Black Tree** internally — keys are always positioned in sorted order inside the tree, so traversal always gives sorted output.

---

### Advantages and Real-World Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Always sorted by key** | No need to manually sort — keys are automatically in ascending order |
| **Rich range query methods** | Find entries between two keys, get floor/ceiling keys, get sub-maps |
| **Predictable iteration order** | Iterating `entrySet()` or `keySet()` always gives sorted keys |

| Use Case | Example |
|----------|---------|
| **Leaderboard** | Score → Player name (always sorted by score) |
| **Timeline of events** | Date/Time → Event (naturally sorted by time) |
| **Dictionary/Glossary** | Word → Definition (alphabetically sorted) |
| **Range-based pricing tiers** | Quantity threshold → Discount percentage |

---

### Specific Methods of TreeMap:

TreeMap includes all `Map` methods **plus** these powerful range/navigation methods:

| Method | What It Does |
|--------|---------------|
| `firstKey()` | Returns the **smallest** key in the map |
| `lastKey()` | Returns the **largest** key in the map |
| `ceilingKey(key)` | Returns the smallest key **≥** given key |
| `floorKey(key)` | Returns the largest key **≤** given key |
| `higherKey(key)` | Returns the smallest key **strictly greater than** given key |
| `lowerKey(key)` | Returns the largest key **strictly less than** given key |
| `headMap(toKey)` | Returns all entries with keys **strictly less than** `toKey` |
| `tailMap(fromKey)` | Returns all entries with keys **≥** `fromKey` |
| `subMap(from, to)` | Returns all entries with keys from `from` (inclusive) to `to` (exclusive) |
| `pollFirstEntry()` | Removes and returns the entry with the **smallest** key |
| `pollLastEntry()` | Removes and returns the entry with the **largest** key |
| `firstEntry()` | Returns (without removing) the entry with the **smallest** key |
| `lastEntry()` | Returns (without removing) the entry with the **largest** key |
| `descendingMap()` | Returns a reverse-order view of the map (largest key first) |

---

### Code Example — TreeMap:

```java
import java.util.TreeMap;
import java.util.Map;

public class LearnTreeMap {
    public static void main(String[] args) {

        // Creating TreeMap — key: score, value: student name
        TreeMap<Integer, String> scores = new TreeMap<>();

        // put() — entries will auto-sort by key (score)
        scores.put(75, "Rahul");
        scores.put(95, "Aman");
        scores.put(60, "Priya");
        scores.put(88, "Riya");
        scores.put(72, "Raj");

        System.out.println("TreeMap: " + scores);
        // TreeMap: {60=Priya, 72=Raj, 75=Rahul, 88=Riya, 95=Aman}  ← sorted by key!

        // get()
        System.out.println("Score 88: " + scores.get(88));
        // Score 88: Riya

        // firstKey() and lastKey()
        System.out.println("Lowest score: " + scores.firstKey());    // 60
        System.out.println("Highest score: " + scores.lastKey());    // 95

        // firstEntry() and lastEntry()
        System.out.println("Lowest entry: " + scores.firstEntry());  // 60=Priya
        System.out.println("Highest entry: " + scores.lastEntry());  // 95=Aman

        // ceilingKey() — smallest key >= 73
        System.out.println("Ceiling(73): " + scores.ceilingKey(73)); // 75

        // floorKey() — largest key <= 73
        System.out.println("Floor(73): " + scores.floorKey(73));     // 72

        // higherKey() — strictly > 75
        System.out.println("Higher(75): " + scores.higherKey(75));   // 88

        // lowerKey() — strictly < 75
        System.out.println("Lower(75): " + scores.lowerKey(75));     // 72

        // headMap() — all entries with key < 80
        System.out.println("HeadMap(<80): " + scores.headMap(80));
        // HeadMap(<80): {60=Priya, 72=Raj, 75=Rahul}

        // tailMap() — all entries with key >= 80
        System.out.println("TailMap(>=80): " + scores.tailMap(80));
        // TailMap(>=80): {88=Riya, 95=Aman}

        // subMap() — keys from 70 (inclusive) to 90 (exclusive)
        System.out.println("SubMap(70-90): " + scores.subMap(70, 90));
        // SubMap(70-90): {72=Raj, 75=Rahul, 88=Riya}

        // descendingMap() — reverse order view
        System.out.println("Descending: " + scores.descendingMap());
        // Descending: {95=Aman, 88=Riya, 75=Rahul, 72=Raj, 60=Priya}

        // pollFirstEntry() — removes and returns smallest key entry
        System.out.println("PollFirst: " + scores.pollFirstEntry());
        // PollFirst: 60=Priya

        // pollLastEntry() — removes and returns largest key entry
        System.out.println("PollLast: " + scores.pollLastEntry());
        // PollLast: 95=Aman

        System.out.println("After polls: " + scores);
        // After polls: {72=Raj, 75=Rahul, 88=Riya}

        // size(), remove(), clear()
        System.out.println("Size: " + scores.size());                // 3
        scores.remove(75);
        System.out.println("After remove(75): " + scores);
        // After remove(75): {72=Raj, 88=Riya}
    }
}
```

**Output:**
```
TreeMap: {60=Priya, 72=Raj, 75=Rahul, 88=Riya, 95=Aman}
Score 88: Riya
Lowest score: 60
Highest score: 95
Lowest entry: 60=Priya
Highest entry: 95=Aman
Ceiling(73): 75
Floor(73): 72
Higher(75): 88
Lower(75): 72
HeadMap(<80): {60=Priya, 72=Raj, 75=Rahul}
TailMap(>=80): {88=Riya, 95=Aman}
SubMap(70-90): {72=Raj, 75=Rahul, 88=Riya}
Descending: {95=Aman, 88=Riya, 75=Rahul, 72=Raj, 60=Priya}
PollFirst: 60=Priya
PollLast: 95=Aman
After polls: {72=Raj, 75=Rahul, 88=Riya}
Size: 3
After remove(75): {72=Raj, 88=Riya}
```

---

## 🆚 Quick Comparison — Map vs HashMap vs TreeMap:

| Feature | Map (Interface) | HashMap | TreeMap |
|---------|-----------------|---------|---------|
| **Type** | Interface | Class | Class |
| **Order** | Undefined | ❌ Random | ✅ Sorted by key |
| **Null keys** | Undefined | ✅ One allowed | ❌ Not allowed |
| **Performance** | Undefined | O(1) average | O(log n) |
| **Internal structure** | — | Hash Table | Red-Black Tree |
| **Range queries** | ❌ | ❌ | ✅ (`headMap`, `tailMap`, `subMap`, etc.) |
| **Best used when** | Just need contract | Fast, unordered access | Sorted key access + range queries |

---

*End of Notes — Map Interface*

---

# Iterator, ListIterator, Arrays Class & Collections Class

---

## 🔁 Iterator

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface in `java.util` that provides a way to **traverse** (go through) elements of any collection **one by one**, in a forward direction |
| **What it does** | Lets you visit each element of a collection sequentially — and also **safely remove** elements while traversing |

> 💡 Think of `Iterator` like a **TV remote's next button** — every press of `next()` moves you to the next channel (element), one at a time.

---

### Why We Need Iterator:

You might wonder — we already have for-each loops, so why do we need `Iterator`? Here's why:

| Reason | Explanation |
|--------|-------------|
| **Safe removal while looping** | You **cannot** remove elements from a collection inside a for-each loop — it throws `ConcurrentModificationException`. `Iterator` has a built-in `remove()` that does this safely |
| **Works on any Collection** | `Iterator` works on `List`, `Set`, `Queue` — anything that implements `Iterable` |
| **More control** | You can pause, check `hasNext()`, and decide whether to continue |

---

### Advantages and Real-World Use Cases:

| Advantage | Meaning |
|-----------|---------|
| **Safe element removal** | Remove elements during traversal without errors |
| **Universal** | Works across all Collection types uniformly |
| **Lightweight** | No need to know the size or use index-based access |

| Use Case | How Iterator Helps |
|----------|--------------------|
| **Filtering a list** | Traverse and remove elements that don't meet a condition (e.g., remove all students with marks < 50) |
| **Processing a queue** | Go through tasks one by one and remove each after processing |
| **Cleaning up a Set** | Remove banned words from a set of words |

---

### Methods of Iterator:

| Method | What It Does |
|--------|---------------|
| `hasNext()` | Returns `true` if there are more elements to traverse |
| `next()` | Returns the **next element** and moves the cursor forward |
| `remove()` | Removes the **last element returned** by `next()` — safe removal during iteration |

---

## 🔁 ListIterator

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An **extended version of `Iterator`**, available only for `List` implementations (like `ArrayList`, `LinkedList`) |
| **What it does** | Allows traversal in **both forward AND backward** directions, and also supports **adding and replacing** elements during traversal |

> 💡 If `Iterator` is a one-way street, `ListIterator` is a **two-way street** — you can go forward and come back.

---

### How ListIterator is Different from Iterator:

| Feature | Iterator | ListIterator |
|---------|----------|--------------|
| **Direction** | Forward only | ✅ Forward + Backward |
| **Works on** | Any Collection | Lists only (`ArrayList`, `LinkedList`) |
| **Remove** | ✅ Yes | ✅ Yes |
| **Add elements** | ❌ No | ✅ Yes (`add()`) |
| **Replace elements** | ❌ No | ✅ Yes (`set()`) |
| **Get index** | ❌ No | ✅ Yes (`nextIndex()`, `previousIndex()`) |

---

### Methods of ListIterator:

| Method | What It Does |
|--------|---------------|
| `hasNext()` | Returns `true` if there's a next element (forward direction) |
| `next()` | Returns next element, moves cursor forward |
| `hasPrevious()` | Returns `true` if there's a previous element (backward direction) |
| `previous()` | Returns previous element, moves cursor backward |
| `nextIndex()` | Returns index of the element that `next()` would return |
| `previousIndex()` | Returns index of the element that `previous()` would return |
| `remove()` | Removes the last element returned by `next()` or `previous()` |
| `set(element)` | **Replaces** the last element returned by `next()` or `previous()` |
| `add(element)` | **Inserts** a new element at the current cursor position |

---

## Code Example — Iterator and ListIterator:

```java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnIterators {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        marks.add(85);
        marks.add(42);
        marks.add(91);
        marks.add(38);
        marks.add(76);

        System.out.println("Original: " + marks);
        // Original: [85, 42, 91, 38, 76]

        // ── ITERATOR ──────────────────────────────────────────────────

        // Using Iterator to remove elements below 50
        Iterator<Integer> it = marks.iterator();

        while (it.hasNext()) {           // hasNext() — is there a next element?
            int mark = it.next();        // next() — get the next element
            if (mark < 50) {
                it.remove();             // remove() — safely remove it (no exception!)
            }
        }

        System.out.println("After removing marks < 50: " + marks);
        // After removing marks < 50: [85, 91, 76]

        // ── LIST ITERATOR ─────────────────────────────────────────────

        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Rahul");
        names.add("Priya");

        ListIterator<String> lit = names.listIterator();

        // Forward traversal
        System.out.print("Forward: ");
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");   // next() — forward
        }
        System.out.println();
        // Forward: Aman Riya Rahul Priya

        // Backward traversal (cursor is now at the end)
        System.out.print("Backward: ");
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");   // previous() — backward
        }
        System.out.println();
        // Backward: Priya Rahul Riya Aman

        // set() — replace an element during traversal
        ListIterator<String> lit2 = names.listIterator();
        while (lit2.hasNext()) {
            String name = lit2.next();
            if (name.equals("Rahul")) {
                lit2.set("Raj");   // replace "Rahul" with "Raj"
            }
        }
        System.out.println("After set: " + names);
        // After set: [Aman, Riya, Raj, Priya]

        // add() — insert an element at current cursor position
        ListIterator<String> lit3 = names.listIterator();
        lit3.next();   // move past "Aman"
        lit3.add("Karan");   // insert "Karan" after "Aman"
        System.out.println("After add: " + names);
        // After add: [Aman, Karan, Riya, Raj, Priya]

        // nextIndex() and previousIndex()
        ListIterator<String> lit4 = names.listIterator();
        lit4.next();
        System.out.println("nextIndex: " + lit4.nextIndex());         // 1
        System.out.println("previousIndex: " + lit4.previousIndex()); // 0
    }
}
```

**Output:**
```
Original: [85, 42, 91, 38, 76]
After removing marks < 50: [85, 91, 76]
Forward: Aman Riya Rahul Priya
Backward: Priya Rahul Riya Aman
After set: [Aman, Riya, Raj, Priya]
After add: [Aman, Karan, Riya, Raj, Priya]
nextIndex: 1
previousIndex: 0
```

---
---

# 🛠️ Other Functionalities

---

## 1️⃣ Arrays Class

### What It Is, What It Does, Why We Need It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A **utility class** in `java.util` that provides static helper methods for working with **primitive arrays** (like `int[]`, `String[]`, `double[]`) |
| **What it does** | Provides ready-made methods for common array tasks — sorting, searching, filling, copying, and comparing arrays |
| **Why we need it** | Without it, you'd have to write loops manually for sorting, searching, etc. `Arrays` class gives you one-line solutions |

> ⚠️ **Important:** `Arrays` class works on **primitive arrays** (e.g., `int[]`, `String[]`) — **NOT** on `ArrayList` or other Collection classes. For Collections, use the `Collections` class (covered next).

---

### Methods of Arrays Class:

| Method | What It Does |
|--------|---------------|
| `Arrays.sort(arr)` | Sorts the array in **ascending order** in-place. Uses **Dual-Pivot Quicksort** for primitives, **TimSort** for objects |
| `Arrays.sort(arr, from, to)` | Sorts only the specified **range** of the array (from index `from` to `to-1`) |
| `Arrays.binarySearch(arr, key)` | Searches for `key` in a **sorted** array using Binary Search. Returns the index if found, negative value if not |
| `Arrays.fill(arr, value)` | Fills the **entire** array with the given value |
| `Arrays.fill(arr, from, to, value)` | Fills a **range** of the array with the given value |
| `Arrays.copyOf(arr, newLength)` | Returns a **new array** copied from `arr` with the specified length (pads with 0/null if longer) |
| `Arrays.copyOfRange(arr, from, to)` | Returns a **new array** that is a copy of a range from `arr` |
| `Arrays.equals(arr1, arr2)` | Returns `true` if both arrays have the **same length and same elements** in the same order |
| `Arrays.toString(arr)` | Returns a **readable String** representation of the array (e.g., `"[1, 2, 3]"`) |
| `Arrays.asList(arr)` | Converts an array to a **fixed-size List** (bridge between arrays and collections) |

---

### Advantages and Benefits:

| Advantage | Meaning |
|-----------|---------|
| **No manual loops** | Sort, search, fill in one line instead of writing loops |
| **Optimized algorithms** | `Arrays.sort()` uses highly optimized algorithms (not a basic bubble sort) |
| **Readable output** | `Arrays.toString()` gives clean printable format for any array |

---

### Code Example — Arrays Class:

```java
import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int[] numbers = {50, 20, 80, 10, 60, 30};

        System.out.println("Original: " + Arrays.toString(numbers));
        // Original: [50, 20, 80, 10, 60, 30]

        // Arrays.sort() — sort entire array ascending
        Arrays.sort(numbers);
        System.out.println("After sort: " + Arrays.toString(numbers));
        // After sort: [10, 20, 30, 50, 60, 80]

        // Arrays.binarySearch() — search in sorted array
        int index = Arrays.binarySearch(numbers, 50);
        System.out.println("Index of 50: " + index);
        // Index of 50: 3

        int notFound = Arrays.binarySearch(numbers, 99);
        System.out.println("Index of 99 (not found): " + notFound);
        // Index of 99 (not found): -7  (negative = not found)

        // Arrays.sort() — sort only a range (index 1 to 3, exclusive of 4)
        int[] nums2 = {50, 20, 80, 10, 60};
        Arrays.sort(nums2, 1, 4);   // sorts only index 1,2,3
        System.out.println("Partial sort: " + Arrays.toString(nums2));
        // Partial sort: [50, 10, 20, 80, 60]

        // Arrays.fill() — fill entire array with a value
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled: " + Arrays.toString(filled));
        // Filled: [7, 7, 7, 7, 7]

        // Arrays.fill() — fill a range
        Arrays.fill(filled, 1, 4, 99);   // fill index 1 to 3 with 99
        System.out.println("Range filled: " + Arrays.toString(filled));
        // Range filled: [7, 99, 99, 99, 7]

        // Arrays.copyOf() — copy with new length
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, 8);   // extra slots filled with 0
        System.out.println("CopyOf: " + Arrays.toString(copy));
        // CopyOf: [1, 2, 3, 4, 5, 0, 0, 0]

        // Arrays.copyOfRange() — copy a range
        int[] rangeCopy = Arrays.copyOfRange(original, 1, 4);   // index 1 to 3
        System.out.println("CopyOfRange: " + Arrays.toString(rangeCopy));
        // CopyOfRange: [2, 3, 4]

        // Arrays.equals() — compare two arrays
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        System.out.println("a equals b: " + Arrays.equals(a, b));   // true
        System.out.println("a equals c: " + Arrays.equals(a, c));   // false

        // Arrays.asList() — convert array to List
        String[] names = {"Aman", "Riya", "Rahul"};
        System.out.println("asList: " + Arrays.asList(names));
        // asList: [Aman, Riya, Rahul]
    }
}
```

**Output:**
```
Original: [50, 20, 80, 10, 60, 30]
After sort: [10, 20, 30, 50, 60, 80]
Index of 50: 3
Index of 99 (not found): -7
Partial sort: [50, 10, 20, 80, 60]
Filled: [7, 7, 7, 7, 7]
Range filled: [7, 99, 99, 99, 7]
CopyOf: [1, 2, 3, 4, 5, 0, 0, 0]
CopyOfRange: [2, 3, 4]
a equals b: true
a equals c: false
asList: [Aman, Riya, Rahul]
```

---
---

## 2️⃣ Collections Class

### If We Already Have Collection Framework, Why Do We Need Collections Class?

Great question — the naming is confusing but the purpose is very different:

| | `Collection` (Interface) | `Collections` (Class) |
|-|--------------------------|------------------------|
| **What it is** | The **root interface** of the framework — defines what a collection should do | A **utility class** with static helper methods that **operate on** Collection objects |
| **Purpose** | Blueprint for List, Set, Queue etc. | Provides tools to sort, search, shuffle, find min/max in those collections |

> 💡 Think of it this way: `Collection` is the **tool** (like a knife), and `Collections` is the **toolkit** (sharpener, cleaner, holder) that helps you work with that tool better.

---

### What It Is, What It Does, Why We Need It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A utility class in `java.util` that contains **only static methods** for performing common operations on Collection objects (List, Set, etc.) |
| **What it does** | Sorting, reversing, shuffling, finding min/max, counting frequency, making collections unmodifiable/thread-safe, and more |
| **Why we need it** | Collections like `ArrayList`, `HashSet` etc. don't have built-in methods for operations like sort, shuffle, or reverse — `Collections` class provides these as external utilities |

---

### Methods of Collections Class:

| Method | What It Does |
|--------|---------------|
| `Collections.sort(list)` | Sorts a List in **ascending order** (natural ordering) |
| `Collections.sort(list, comparator)` | Sorts a List using a **custom Comparator** |
| `Collections.reverse(list)` | Reverses the order of elements in a List |
| `Collections.shuffle(list)` | Randomly **shuffles** the elements of a List |
| `Collections.min(collection)` | Returns the **minimum** element (natural ordering) |
| `Collections.max(collection)` | Returns the **maximum** element (natural ordering) |
| `Collections.frequency(collection, obj)` | Returns the number of times `obj` **appears** in the collection |
| `Collections.swap(list, i, j)` | Swaps elements at index `i` and `j` in the List |
| `Collections.fill(list, obj)` | Replaces all elements in the List with `obj` |
| `Collections.copy(dest, src)` | Copies all elements from `src` list into `dest` list |
| `Collections.disjoint(c1, c2)` | Returns `true` if the two collections have **no elements in common** |
| `Collections.unmodifiableList(list)` | Returns a **read-only** view of the list — any modification throws exception |
| `Collections.synchronizedList(list)` | Returns a **thread-safe** version of the list |
| `Collections.nCopies(n, obj)` | Returns an **immutable List** with `n` copies of `obj` |
| `Collections.binarySearch(list, key)` | Searches a **sorted** list using Binary Search |

---

### Advantages and Benefits:

| Advantage | Meaning |
|-----------|---------|
| **Ready-to-use operations** | No need to write sorting/searching logic manually for collections |
| **Works across all Collection types** | One utility class covers List, Set, Queue, etc. |
| **Thread-safety made easy** | `synchronizedList()` wraps any list to be thread-safe in one line |
| **Immutability** | `unmodifiableList()` creates a read-only view — useful for returning data safely from APIs |

---

### Code Example — Collections Class:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(20);
        numbers.add(80);
        numbers.add(10);
        numbers.add(60);
        numbers.add(20);   // duplicate — for frequency demo

        System.out.println("Original: " + numbers);
        // Original: [50, 20, 80, 10, 60, 20]

        // sort() — ascending order
        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);
        // Sorted: [10, 20, 20, 50, 60, 80]

        // reverse() — reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);
        // Reversed: [80, 60, 50, 20, 20, 10]

        // shuffle() — random order
        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
        // Shuffled: (random each time)

        // min() and max()
        System.out.println("Min: " + Collections.min(numbers));   // 10
        System.out.println("Max: " + Collections.max(numbers));   // 80

        // frequency() — count occurrences
        System.out.println("Frequency of 20: " + Collections.frequency(numbers, 20));
        // Frequency of 20: 2

        // swap() — swap elements at index 0 and 1
        Collections.sort(numbers);   // sort first: [10, 20, 20, 50, 60, 80]
        Collections.swap(numbers, 0, 5);
        System.out.println("After swap(0,5): " + numbers);
        // After swap(0,5): [80, 20, 20, 50, 60, 10]

        // fill() — replace all with one value
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Rahul");
        Collections.fill(names, "Unknown");
        System.out.println("After fill: " + names);
        // After fill: [Unknown, Unknown, Unknown]

        // nCopies() — list with n copies of an object
        List<String> copies = Collections.nCopies(4, "Java");
        System.out.println("nCopies: " + copies);
        // nCopies: [Java, Java, Java, Java]

        // disjoint() — check if two collections share no elements
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(List.of(4, 5, 6));
        List<Integer> list3 = new ArrayList<>(List.of(3, 7, 8));
        System.out.println("Disjoint(list1,list2): " + Collections.disjoint(list1, list2)); // true
        System.out.println("Disjoint(list1,list3): " + Collections.disjoint(list1, list3)); // false

        // binarySearch() — on sorted list
        List<Integer> sorted = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        System.out.println("BinarySearch(30): " + Collections.binarySearch(sorted, 30));
        // BinarySearch(30): 2

        // unmodifiableList()
        List<String> readOnly = Collections.unmodifiableList(new ArrayList<>(List.of("A", "B", "C")));
        System.out.println("ReadOnly: " + readOnly);
        // readOnly.add("D");  // ← throws UnsupportedOperationException
    }
}
```

**Output:**
```
Original: [50, 20, 80, 10, 60, 20]
Sorted: [10, 20, 20, 50, 60, 80]
Reversed: [80, 60, 50, 20, 20, 10]
Shuffled: (random order)
Min: 10
Max: 80
Frequency of 20: 2
After swap(0,5): [80, 20, 20, 50, 60, 10]
After fill: [Unknown, Unknown, Unknown]
nCopies: [Java, Java, Java, Java]
Disjoint(list1,list2): true
Disjoint(list1,list3): false
BinarySearch(30): 2
ReadOnly: [A, B, C]
```

---

## Sorting Custom Collections — `Collections.sort()` with Comparator

### What It Is, What It Does:

By default, `Collections.sort()` sorts in **natural ascending order** (numbers: small to large, strings: A to Z). But what if you have a **custom class** like `Student` and want to sort by name, or by marks, or by age?

> 💡 For that, you pass a **Comparator** — a custom rule that tells `sort()` how to compare two objects.

### How We Can Sort a Custom Class:

There are **two ways** to provide sorting logic for custom classes:

**Way 1 — Using Lambda (most common in modern Java):**

```java
Collections.sort(list, (obj1, obj2) -> obj1.field - obj2.field);
```

**Way 2 — Using `Comparator.comparing()` (cleanest syntax):**

```java
Collections.sort(list, Comparator.comparing(obj -> obj.field));
```

---

### Code Example — Sorting Custom Class:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class SortCustomClass {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Aman",  85));
        students.add(new Student("Riya",  92));
        students.add(new Student("Rahul", 78));
        students.add(new Student("Priya", 95));

        System.out.println("Original: " + students);
        // Original: [Aman(85), Riya(92), Rahul(78), Priya(95)]

        // Sort by marks — ascending
        Collections.sort(students, (s1, s2) -> s1.marks - s2.marks);
        System.out.println("Sorted by marks (asc): " + students);
        // Sorted by marks (asc): [Rahul(78), Aman(85), Riya(92), Priya(95)]

        // Sort by marks — descending
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);
        System.out.println("Sorted by marks (desc): " + students);
        // Sorted by marks (desc): [Priya(95), Riya(92), Aman(85), Rahul(78)]

        // Sort by name — alphabetically (A to Z)
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("Sorted by name (A-Z): " + students);
        // Sorted by name (A-Z): [Aman(85), Priya(95), Rahul(78), Riya(92)]
    }
}
```

**Output:**
```
Original: [Aman(85), Riya(92), Rahul(78), Priya(95)]
Sorted by marks (asc): [Rahul(78), Aman(85), Riya(92), Priya(95)]
Sorted by marks (desc): [Priya(95), Riya(92), Aman(85), Rahul(78)]
Sorted by name (A-Z): [Aman(85), Priya(95), Rahul(78), Riya(92)]
```

---

### Arrays Class vs Collections Class — Quick Difference:

| Aspect | Arrays Class | Collections Class |
|--------|-------------|-------------------|
| **Works on** | Primitive arrays (`int[]`, `String[]`) | Collection objects (`List`, `Set`, `Queue`) |
| **Sort method** | `Arrays.sort(arr)` | `Collections.sort(list)` |
| **Search method** | `Arrays.binarySearch(arr, key)` | `Collections.binarySearch(list, key)` |
| **Fill method** | `Arrays.fill(arr, value)` | `Collections.fill(list, value)` |
| **Min / Max** | ❌ Not available | ✅ `Collections.min()` / `Collections.max()` |
| **Shuffle** | ❌ Not available | ✅ `Collections.shuffle()` |

---

*End of Notes — Iterator, ListIterator, Arrays Class & Collections Class*

---

# Comparator, Comparable & Comparator Interface

---

## 🔢 What is a Comparator?

### What It Is, What It Does:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | A **comparison rule** — a piece of logic that defines how two objects should be ordered relative to each other |
| **What it does** | Takes **two objects**, compares them, and returns a number indicating which one comes first |

The comparison result works like this:

| Return Value | Meaning |
|-------------|---------|
| **Negative number** | First object comes **before** the second |
| **Zero** | Both objects are **equal** in order |
| **Positive number** | First object comes **after** the second |

```
compare(obj1, obj2):
  negative → obj1 comes first
  zero     → equal
  positive → obj2 comes first
```

---

### Why We Need It:

Java's built-in sort (`Collections.sort()`, `Arrays.sort()`) needs to **know how to compare objects**. For simple types like `int` or `String`, Java already knows (1 < 2, "A" < "B"). But for **custom classes** like `Student` or `Product`, Java has no idea how to order them — you need to tell it.

> 💡 Without a Comparator (or Comparable), Java would throw a `ClassCastException` when trying to sort a list of custom objects — because it doesn't know the comparison rule.

---

### How We Use It:

You can write a Comparator in **three ways** — all do the same thing, just different syntax:

**Way 1 — Anonymous Class (old style):**
```java
Comparator<Student> byMarks = new Comparator<Student>() {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks;
    }
};
```

**Way 2 — Lambda (modern, preferred):**
```java
Comparator<Student> byMarks = (s1, s2) -> s1.marks - s2.marks;
```

**Way 3 — `Comparator.comparing()` (cleanest):**
```java
Comparator<Student> byName = Comparator.comparing(s -> s.name);
```

---

### Advantages of Using Comparator:

| Advantage | Meaning |
|-----------|---------|
| **Multiple sorting orders** | Same class can be sorted differently in different places (by name here, by marks there) — without touching the class itself |
| **External logic** | Sorting logic lives outside the class — clean separation of concerns |
| **Works with built-in tools** | Plug directly into `Collections.sort()`, `Arrays.sort()`, `PriorityQueue`, `TreeSet`, `TreeMap` |
| **Chainable** | Use `.thenComparing()` to sort by multiple fields (e.g., sort by marks, then by name if marks are equal) |

---

### Code Example — Comparator:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int marks;
    int age;

    Student(String name, int marks, int age) {
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(marks=" + marks + ", age=" + age + ")";
    }
}

public class LearnComparator {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Riya",  92, 21));
        students.add(new Student("Aman",  85, 22));
        students.add(new Student("Rahul", 92, 20));
        students.add(new Student("Priya", 78, 21));

        System.out.println("Original: " + students);
        // Original: [Riya(marks=92, age=21), Aman(marks=85, age=22), Rahul(marks=92, age=20), Priya(marks=78, age=21)]

        // Sort by marks — ascending (lambda)
        Collections.sort(students, (s1, s2) -> s1.marks - s2.marks);
        System.out.println("By marks (asc): " + students);
        // By marks (asc): [Priya(78), Aman(85), Riya(92), Rahul(92)]

        // Sort by marks — descending
        Collections.sort(students, (s1, s2) -> s2.marks - s1.marks);
        System.out.println("By marks (desc): " + students);
        // By marks (desc): [Riya(92), Rahul(92), Aman(85), Priya(78)]

        // Sort by name — alphabetically using Comparator.comparing()
        Collections.sort(students, Comparator.comparing(s -> s.name));
        System.out.println("By name (A-Z): " + students);
        // By name (A-Z): [Aman(85), Priya(78), Rahul(92), Riya(92)]

        // Sort by marks, then by age if marks are equal — chained comparator
        Comparator<Student> byMarksThenAge = Comparator
                .comparingInt((Student s) -> s.marks)
                .thenComparingInt(s -> s.age);

        Collections.sort(students, byMarksThenAge);
        System.out.println("By marks then age: " + students);
        // Riya and Rahul both have 92 marks — Rahul(age=20) comes before Riya(age=21)
        // By marks then age: [Priya(78,21), Aman(85,22), Rahul(92,20), Riya(92,21)]
    }
}
```

**Output:**
```
Original: [Riya(marks=92, age=21), Aman(marks=85, age=22), Rahul(marks=92, age=20), Priya(marks=78, age=21)]
By marks (asc): [Priya(marks=78, age=21), Aman(marks=85, age=22), Riya(marks=92, age=21), Rahul(marks=92, age=20)]
By marks (desc): [Riya(marks=92, age=21), Rahul(marks=92, age=20), Aman(marks=85, age=22), Priya(marks=78, age=21)]
By name (A-Z): [Aman(marks=85, age=22), Priya(marks=78, age=21), Rahul(marks=92, age=20), Riya(marks=92, age=21)]
By marks then age: [Priya(marks=78, age=21), Aman(marks=85, age=22), Rahul(marks=92, age=20), Riya(marks=92, age=21)]
```

> 💡 Notice the **chained comparator** — when Riya and Rahul both have `92` marks, it breaks the tie by `age` — Rahul (age 20) comes before Riya (age 21). This is the power of `.thenComparing()`.

---
---

## 1️⃣ Comparable Interface

### What It Is, What It Does, Why We Need It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface in `java.lang` that a class **implements to define its own natural ordering** |
| **What it does** | Forces the class to implement the `compareTo(obj)` method — defining how one object of that class compares to another |
| **Why we need it** | When you want a class to have a **single, built-in default sort order** — e.g., `String` sorts alphabetically, `Integer` sorts numerically — because they implement `Comparable` |

> 💡 `Comparable` answers the question: **"How does THIS object compare to another one?"** — the comparison logic lives **inside** the class itself.

---

### How We Use It:

Implement the `Comparable<T>` interface in your class and override the `compareTo()` method:

```java
class Student implements Comparable<Student> {
    String name;
    int marks;

    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;   // sort by marks ascending
    }
}
```

Once you implement `Comparable`, you can call `Collections.sort(list)` or `Arrays.sort(arr)` **without passing any Comparator** — Java uses your `compareTo()` automatically.

---

### Advantages of Comparable:

| Advantage | Meaning |
|-----------|---------|
| **Built-in default ordering** | Once defined, the class always knows its natural sort order — no extra code needed at sort call sites |
| **Works automatically** | `Collections.sort()`, `TreeSet`, `TreeMap`, `Arrays.sort()` all use it without any extra Comparator argument |
| **Clean API** | Users of your class can sort it naturally without needing to know the internal fields |

---

### Code Example — Comparable Interface:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Define natural ordering — by marks ascending
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;
        // negative → this comes first (this.marks is smaller)
        // zero     → equal marks
        // positive → other comes first (other.marks is smaller)
    }

    @Override
    public String toString() {
        return name + "(" + marks + ")";
    }
}

public class LearnComparable {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Riya",  92));
        students.add(new Student("Aman",  85));
        students.add(new Student("Rahul", 78));
        students.add(new Student("Priya", 95));

        System.out.println("Before sort: " + students);
        // Before sort: [Riya(92), Aman(85), Rahul(78), Priya(95)]

        // No Comparator needed — uses compareTo() automatically
        Collections.sort(students);

        System.out.println("After sort: " + students);
        // After sort: [Rahul(78), Aman(85), Riya(92), Priya(95)]
    }
}
```

**Output:**
```
Before sort: [Riya(92), Aman(85), Rahul(78), Priya(95)]
After sort: [Rahul(78), Aman(85), Riya(92), Priya(95)]
```

> 💡 `Collections.sort(students)` works with **no Comparator** — it automatically uses the `compareTo()` method defined inside the `Student` class.

---
---

## 2️⃣ Comparator Interface

### What It Is, What It Does, Why We Need It:

| Aspect | Explanation |
|--------|-------------|
| **What it is** | An interface in `java.util` that represents an **external comparison rule** — defined **outside** the class being sorted |
| **What it does** | Provides a `compare(obj1, obj2)` method that defines a custom ordering for objects — without modifying the original class |
| **Why we need it** | When you need **multiple different sort orders** for the same class, or when you can't modify the class (e.g., it's a third-party class), or when you want the sorting logic to live separately from the class |

> 💡 `Comparator` answers the question: **"How should THESE TWO objects be compared in THIS specific context?"** — the logic lives **outside** the class.

---

### How We Use It:

```java
// As a lambda — passed directly to sort
Collections.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));

// As a named variable — reusable
Comparator<Student> byMarks = (s1, s2) -> s1.marks - s2.marks;
Collections.sort(students, byMarks);

// Using Comparator.comparing() — cleanest
Collections.sort(students, Comparator.comparing(s -> s.name));
```

---

### Advantages of Comparator Interface:

| Advantage | Meaning |
|-----------|---------|
| **Multiple sort orders** | Define sort-by-name, sort-by-marks, sort-by-age — all for the same class |
| **Doesn't modify the class** | You can add sorting to a class you **cannot change** (like a library class) |
| **Flexible and reusable** | Define once as a variable, reuse anywhere |
| **Chainable** | `.thenComparing()` lets you sort by multiple fields in one expression |
| **Lambda-friendly** | Since it's a functional interface, it works cleanly with lambdas |

---

### Code Example — Comparator Interface:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    String name;
    double price;
    int stock;

    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + "(₹" + price + ", stock=" + stock + ")";
    }
}

public class LearnComparatorInterface {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000, 5));
        products.add(new Product("Phone",  25000, 12));
        products.add(new Product("Tablet", 40000, 8));
        products.add(new Product("Watch",  15000, 20));

        // Comparator 1 — sort by price ascending
        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);

        // Comparator 2 — sort by price descending
        Comparator<Product> byPriceDesc = (p1, p2) -> Double.compare(p2.price, p1.price);

        // Comparator 3 — sort by name alphabetically
        Comparator<Product> byName = Comparator.comparing(p -> p.name);

        // Comparator 4 — sort by stock descending
        Comparator<Product> byStockDesc = (p1, p2) -> p2.stock - p1.stock;

        Collections.sort(products, byPrice);
        System.out.println("By price (asc): " + products);
        // By price (asc): [Watch(₹15000), Phone(₹25000), Tablet(₹40000), Laptop(₹75000)]

        Collections.sort(products, byPriceDesc);
        System.out.println("By price (desc): " + products);
        // By price (desc): [Laptop(₹75000), Tablet(₹40000), Phone(₹25000), Watch(₹15000)]

        Collections.sort(products, byName);
        System.out.println("By name (A-Z): " + products);
        // By name (A-Z): [Laptop, Phone, Tablet, Watch]

        Collections.sort(products, byStockDesc);
        System.out.println("By stock (desc): " + products);
        // By stock (desc): [Watch(20), Phone(12), Tablet(8), Laptop(5)]
    }
}
```

**Output:**
```
By price (asc): [Watch(₹15000.0, stock=20), Phone(₹25000.0, stock=12), Tablet(₹40000.0, stock=8), Laptop(₹75000.0, stock=5)]
By price (desc): [Laptop(₹75000.0, stock=5), Tablet(₹40000.0, stock=8), Phone(₹25000.0, stock=12), Watch(₹15000.0, stock=20)]
By name (A-Z): [Laptop(₹75000.0, stock=5), Phone(₹25000.0, stock=12), Tablet(₹40000.0, stock=8), Watch(₹15000.0, stock=20)]
By stock (desc): [Watch(₹15000.0, stock=20), Phone(₹25000.0, stock=12), Tablet(₹40000.0, stock=8), Laptop(₹75000.0, stock=5)]
```

---
---

## 🆚 Difference Between Comparable and Comparator Interface

| Aspect | Comparable | Comparator |
|--------|-----------|------------|
| **Package** | `java.lang` | `java.util` |
| **Method** | `compareTo(Object o)` | `compare(Object o1, Object o2)` |
| **Where logic lives** | **Inside** the class being sorted | **Outside** the class being sorted |
| **How many sort orders** | Only **one** natural ordering per class | **Multiple** orderings possible |
| **Modifies original class?** | ✅ Yes — class must implement it | ❌ No — class stays untouched |
| **Used with** | `Collections.sort(list)` — no extra arg | `Collections.sort(list, comparator)` |
| **Works when** | You own the class and want a default order | You need multiple orders or can't edit the class |
| **Lambda support** | ❌ Not directly | ✅ Yes — it's a functional interface |
| **Best for** | Natural/default ordering (e.g., Student by rollNo) | Flexible/context-specific sorting (e.g., by name, price, age) |

---

### Simple Memory Trick:

```
Comparable  → "I know how to compare myself"
              (logic INSIDE the class)

Comparator  → "Someone else defines how to compare me"
              (logic OUTSIDE the class)
```

---

*End of Notes — Comparator, Comparable & Comparator Interface*













