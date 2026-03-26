# Java Set Interface

## 📌 Overview

The **Set interface** is a part of the Java Collection Framework and represents a collection that **does not allow duplicate elements**.

It is available in the `java.util` package.

---

## 🧱 Key Characteristics

* Does not allow duplicate elements
* Unordered collection (except some implementations)
* Allows at most one null element (depends on implementation)
* No index-based access

---

## 📦 Common Implementations

### 🔹 HashSet

* Uses hash table
* No order maintained
* Fastest operations (O(1) average)

### 🔹 LinkedHashSet

* Maintains insertion order
* Slightly slower than HashSet

### 🔹 TreeSet

* Stores elements in sorted order
* Uses Red-Black Tree
* Operations in O(log n)

---
### File Structure 
  1. Hashset.java - introduction to hashset interface 
  2. 

## ⚙️ Important Methods

| Method             | Description                |
| ------------------ | -------------------------- |
| add(E e)           | Adds element               |
| remove(Object o)   | Removes element            |
| contains(Object o) | Checks if element exists   |
| size()             | Returns number of elements |
| isEmpty()          | Checks if set is empty     |
| clear()            | Removes all elements       |

---

## 🔁 Iteration Techniques

### 1. Enhanced For Loop

```java
for (String item : set) {
    System.out.println(item);
}
```

### 2. Iterator

```java
Iterator<String> it = set.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

---

## ⚖️ Comparison of Implementations

| Feature      | HashSet | LinkedHashSet   | TreeSet |
| ------------ | ------- | --------------- | ------- |
| Order        | No      | Insertion Order | Sorted  |
| Performance  | Fastest | Moderate        | Slower  |
| Null Allowed | Yes     | Yes             | No      |

---

## 🚀 Advantages

* Prevents duplicate values
* Fast lookup and insertion
* Simple and efficient

---

## ⚠️ Limitations

* No index-based access
* Some implementations do not maintain order

---

## 📚 Conclusion

The Set interface is ideal when you need to store unique elements. Choosing between HashSet, LinkedHashSet, and TreeSet depends on whether you need ordering or sorting.
