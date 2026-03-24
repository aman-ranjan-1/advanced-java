# Java List Interface

## 📌 Overview

The **List** interface in Java is a part of the Java Collection Framework and represents an **ordered collection** of elements.

* Allows duplicate elements
* Maintains insertion order
* Provides index-based access

It is available in the `java.util` package.

---

## 🧱 Key Characteristics

* Ordered collection
* Allows duplicates
* Supports null elements (depends on implementation)
* Elements can be accessed using index

---

## 📦 Common Implementations

### 🔹 ArrayList

* Dynamic array
* Fast random access (O(1))
* Slow insertion/deletion in middle

### 🔹 LinkedList

* Doubly linked list
* Fast insertion/deletion (O(1))
* Slow access (O(n))

### 🔹 Vector

* Thread-safe (synchronized)
* Slower compared to ArrayList

---

## ⚙️ Important Methods

| Method              | Description             |
| ------------------- | ----------------------- |
| add(E e)            | Adds element            |
| add(int index, E e) | Inserts at index        |
| get(int index)      | Returns element         |
| set(int index, E e) | Updates element         |
| remove(int index)   | Removes element         |
| size()              | Returns size            |
| isEmpty()           | Checks if list is empty |

---

## 🔁 Iteration Techniques

### 1. Enhanced For Loop

```java
for (String item : list) {
    System.out.println(item);
}
```

### 2. For Loop (Using Index)

```java
for (int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
}
```

### 3. Iterator

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

## ⚖️ ArrayList vs LinkedList

| Feature       | ArrayList     | LinkedList         |
| ------------- | ------------- | ------------------ |
| Structure     | Dynamic array | Doubly linked list |
| Access time   | Fast          | Slow               |
| Insert/Delete | Slow          | Fast               |

---

## 🚀 Advantages

* Flexible and dynamic size
* Easy to use
* Supports duplicate elements
* Provides index-based operations

---d

## ⚠️ Limitations

* Slower than arrays for some operations
* Not thread-safe (except Vector)

---

## 📚 Conclusion

The List interface is one of the most commonly used parts of the Java Collection Framework. It is best suited when you need an ordered collection with duplicates and index
