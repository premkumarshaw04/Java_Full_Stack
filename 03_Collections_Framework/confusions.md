# Clearing Confusions

## Confusion — Two Different `remove()` Methods in List

This is one of the most **common confusions** in Java — especially with `ArrayList<Integer>`.

### The Problem:

`ArrayList` has **two overloaded `remove()` methods**:

| Method | What It Does |
|--------|--------------|
| `remove(int index)` | Removes element **at that index position** |
| `remove(Object obj)` | Removes the **first occurrence** of that specific value/object |

---

### Why the Confusion?

When you have an `ArrayList<Integer>` and write `list.remove(1)` — Java sees the `1` as an **`int`** (primitive), so it automatically picks the **`remove(int index)`** version — removing the element **at index 1**, NOT the value `1`.

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);

// Index:  0    1    2    3
// Value: [10, 20,  30,  40]

list.remove(1);   // ← Java sees int 1 → removes element AT INDEX 1 (which is value 20)

System.out.println(list);   // [10, 30, 40]
```

> ⚠️ It did NOT remove the value `1` — it removed the element **sitting at position 1** (which was `20`).

---

### How to Remove by Value — Use `Integer.valueOf()`:

To tell Java **"I want to remove the value, not the index"**, wrap the number in `Integer.valueOf()` — this converts the primitive `int` into an `Integer` **object**, so Java picks the `remove(Object obj)` version instead.

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(30);
list.add(40);
list.add(50);

// Index:  0    1    2    3
// Value: [10, 30,  40,  50]

list.remove(Integer.valueOf(30));   // ← Java sees Integer object → removes VALUE 30

System.out.println(list);   // [10, 40, 50]
```

> ✅ Now it correctly removed the **value `30`**, not whatever was at index 30.

---

### Full Side-by-Side Example:

```java
import java.util.ArrayList;
import java.util.List;

public class RemoveConfusion {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original: " + list);
        // Original: [10, 20, 30, 40, 50]

        // remove(int index) — removes element AT index 1 (value 20)
        list.remove(1);
        System.out.println("After remove(1) [by index]: " + list);
        // After remove(1) [by index]: [10, 30, 40, 50]

        // remove(Object) — removes the VALUE 30
        list.remove(Integer.valueOf(30));
        System.out.println("After remove(Integer.valueOf(30)) [by value]: " + list);
        // After remove(Integer.valueOf(30)) [by value]: [10, 40, 50]
    }
}
```

**Output:**
```
Original: [10, 20, 30, 40, 50]
After remove(1) [by index]: [10, 30, 40, 50]
After remove(Integer.valueOf(30)) [by value]: [10, 40, 50]
```

---

### Quick Memory Trick:

```
list.remove(1)                →  removes element at INDEX 1
list.remove(Integer.valueOf(1)) →  removes element with VALUE 1
```

> 💡 This confusion **only happens with `ArrayList<Integer>`** — because `int` and `Integer` look the same when you type a number. With `ArrayList<String>`, there's no confusion — `list.remove("Aman")` can only mean remove by value, since `"Aman"` is clearly not an index.

---

*End of Notes — Clearing Confusions*