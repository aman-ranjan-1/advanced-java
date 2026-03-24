# Java Collection Framework

## 📌 Overview

The Java Collection Framework (JCF) is a set of classes and interfaces that provide a unified architecture for storing and manipulating groups of objects.

It is part of the `java.util` package and helps developers work with data structures efficiently.

---

## 🧱 Core Interfaces

### 1. Collection

* Root interface of the framework
* Represents a group of objects

### 2. List

* Ordered collection (allows duplicates)
* Examples: `ArrayList`, `LinkedList`, `Vector`

### 3. Set

* Unordered collection (no duplicates)
* Examples: `HashSet`, `LinkedHashSet`, `TreeSet`

### 4. Map (Not part of Collection interface)

* Stores key-value pairs
* Keys are unique
* Examples: `HashMap`, `LinkedHashMap`, `TreeMap`, `Hashtable`

---

## 📦 Important Classes

### 🔹 List Implementations

* **ArrayList**: Dynamic array, fast access
* **LinkedList**: Doubly linked list, fast insert/delete

### 🔹 Set Implementations

* **HashSet**: No order, fastest performance
* **LinkedHashSet**: Maintains insertion order
* **TreeSet**: Sorted order

### 🔹 Map Implementations

* **HashMap**: Fast, no order
* **LinkedHashMap**: Maintains insertion order
* **TreeMap**: Sorted by keys

---
## FIles Structure 

01.List-Implementations 
   |-- list.md
   |-- 

02.Set-Implementations
   |-- set.md
   |-- 

03.Map-Implementations
   |-- map.md
   |-- 

---
## ⚙️ Common Methods

| Method     | Description                |
| ---------- | -------------------------- |
| add()      | Adds element               |
| remove()   | Removes element            |
| size()     | Returns number of elements |
| clear()    | Removes all elements       |
| contains() | Checks if element exists   |

---

## 🔁 Iteration Techniques

### 1. Enhanced For Loop

```java
for (String item : list) {
    System.out.println(item);
}
```

### 2. Iterator

```java
Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

### 3. ForEach (Java 8+)

```java
list.forEach(item -> System.out.println(item));
```

---

## ⚖️ Comparison Table

| Feature    | List    | Set         | Map              |
| ---------- | ------- | ----------- | ---------------- |
| Order      | Yes     | No          | Key-based        |
| Duplicates | Allowed | Not Allowed | Keys not allowed |
| Index      | Yes     | No          | No               |

---

## 🚀 Advantages

* Reusable data structures
* Reduces coding effort
* Improves performance
* Provides standard APIs

---

## ⚠️ Limitations

* Not thread-safe (most classes)
* Requires understanding of different implementations

---

## 📚 Conclusion

The Java Collection Framework simplifies data handling and provides powerful tools to manage data efficiently. Choosing the right collection depends on the use case (ordering, duplication, performance, etc.).
