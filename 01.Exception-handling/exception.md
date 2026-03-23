# Java Exception Handling Guide

## 📌 Overview

Exception handling in Java is a mechanism to handle runtime errors and maintain the normal flow of a program. It allows developers to manage unexpected situations gracefully without crashing the application.

---

## ⚙️ What is an Exception?

An **exception** is an event that disrupts the normal execution of a program during runtime.

---

## 🧱 Types of Exceptions

### 1. Checked Exceptions

* Checked at compile-time
* Must be handled using `try-catch` or declared with `throws`
* Examples: `IOException`, `SQLException`

### 2. Unchecked Exceptions

* Occur at runtime
* Not mandatory to handle
* Examples: `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ArithmeticException`

---

## 🛠️ Exception Handling Keywords

### `try`

Used to wrap code that may throw an exception.

```java
try {
    int result = 10 / 0;
}
```

### `catch`

Handles the exception.

```java
catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

### `finally`

Executes whether an exception occurs or not.

```java
finally {
    System.out.println("Execution completed");
}
```

### `throw`

Used to explicitly throw an exception.

```java
throw new IllegalArgumentException("Invalid input");
```

### `throws`

Declares exceptions a method can throw.

```java
public void readFile() throws IOException {
    // code
}
```

---

## 🔄 Example

```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        } finally {
            System.out.println("Program finished");
        }
    }
}
```

---

## 🧩 Custom Exception

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

Usage:

```java
if (age < 18) {
    throw new MyException("Age must be 18 or above");
}
```

---

## 📄 Code Files

Below is the list of important files :

1. Exception1.java - example and explaination of try , catch , finally block with ArithmeticException

2. Exception2.java - example and explaination of multiple catch blocks (multiple exceptions)

3. Exception3.java - Example and Explainaton Code of Throwing Exceptions , use of throw keyword

4. Exception4.java - example code and explaination of Checked Exceptions in Java 

5. Exception5.java - example code and explaination of Unchecked Exceptions in Java

6. Exception6.java - example code and explaination of Custom Exceptions
   Most Important in Exception Handling

7. PracticeCode1.java - a program to create a method that takes an integer as a parameter and throws an exception if num is odd.

8. PracticeCode2.java - a program to create a method that takes a string as an input and throws an exception if the number is odd.
---

---

## ✅ Best Practices

* Catch specific exceptions instead of generic ones
* Avoid empty catch blocks
* Use `finally` or try-with-resources for cleanup
* Provide meaningful error messages
* Do not use exceptions for normal program flow

---

## 🚀 Conclusion

Exception handling improves program reliability and ensures smooth execution even when unexpected errors occur.
