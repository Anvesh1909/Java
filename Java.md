
# Java Programming Overview

## Java Compilation Process

- **Java code (.java)** -> **Compiler** -> **Byte code (.class)**
- **Byte code (.class)** -> **JVM (Java Virtual Machine)** -> **Execution and Output**
- JVM searches for the method: `public static void main(String[] args)` for execution.
- **JVM is platform-dependent**, meaning the JVM implementation may vary across platforms, but bytecode is platform-independent.
- **JDK (Java Development Kit)** contains:
  - JRE (Java Runtime Environment)
    - **JRE** contains:
      - **JVM**
      - **Libraries** and class libraries (runtime classes)
  - **Development tools**: Compilers, debuggers, etc.
- **WORA**: Write Once, Run Anywhere — Java code can be run on any platform with a compatible JVM.

## Java: Strongly Typed Language

- In Java, the **type of variable** (like `int`, `String`, etc.) must be declared explicitly.
- Java supports 8 **primitive data types**:
  - **Integer types**:
    - `int` -> 4 bytes
    - `long` -> 8 bytes (e.g., `long l = 14235234L;`)
    - `short` -> 2 bytes
    - `byte` -> 1 byte (Range: `-128` to `127`)
  - **Floating-point types**:
    - `float` -> 4 bytes (e.g., `float num = 5.6f;`)
    - `double` -> 8 bytes (e.g., `double num = 5.6;`)
  - **Character type**:
    - `char` -> 2 bytes (supports Unicode characters)
  - **Boolean type**:
    - `boolean` -> 1 bit (`true` or `false`)
- **Wrapper classes** for primitive types:
  - `int` -> `Integer`
  - `char` -> `Character`
  - `double` -> `Double`
  - `boolean` -> `Boolean`

### Literal Examples
- `int b = 0b0101;` (binary literal)
- `int h = 0x22;` (hexadecimal literal)
- `int u = 10_00_00_00_000;` (underscore for readability)
- `float e = 12e10;` (exponential notation)

## Type Casting and Conversion

- **Implicit Conversion**: Java automatically promotes smaller data types to larger ones (e.g., `byte` to `int`).
  
  ```java
  byte b = 10;
  int a = b;  // Implicit casting
  ```

- **Explicit Conversion**: Manual conversion from a larger type to a smaller one, or incompatible types.
  
  ```java
  byte b = (byte) a;  // Casting required
  ```

- **Type Promotion**: Smaller types (`byte`, `short`) are promoted to `int` before operations.
  
  ```java
  byte a = 10;
  byte b = 40;
  int res = a * b;  // Promoted to int
  ```

## Arithmetic and Increment Operations

- **Arithmetic operators**: `+`, `-`, `*`, `/`, `%`
  
  ```java
  int quotient = a / b;
  int remainder = a % b;
  ```

- **Increment/Decrement operators**: `++`, `--`
  - **Post-increment**: `num++` (use then increment)
  - **Pre-increment**: `++num` (increment then use)

- **Compound assignments**: `+=`, `-=`, `*=`, `/=`

## Comparison and Logical Operators

- **Comparison operators**: `>`, `<`, `>=`, `<=`, `==`, `!=`
- **Logical operators**: `&&` (AND), `||` (OR), `!` (NOT)

## Conditional Statements

- **If, If-Else, Switch**:

  ```java
  if (condition) {
      // If block
  } else if (anotherCondition) {
      // Else if block
  } else {
      // Else block
  }
  ```

- **Switch statement**:
  - Can use `int`, `char`, `String` (since Java 7), and `enum` types.
  
  ```java
  switch (n) {
      case 1:
          // Do something
          break;
      default:
          // Default case
  }
  ```

## Looping Statements

- **For loop**: Traditional or enhanced `for-each` loop.
  
  ```java
  for (int i = 0; i < n; i++) {
      // Loop body
  }

  // Enhanced for loop
  for (int element : array) {
      // Loop body
  }
  ```

- **While loop**: Checks condition before entering loop.
  
  ```java
  while (condition) {
      // Loop body
  }
  ```

- **Do-While loop**: Executes at least once before checking condition.
  
  ```java
  do {
      // Loop body
  } while (condition);
  ```

## Object-Oriented Programming (OOP) Concepts

- **Class**: Blueprint for creating objects, containing fields and methods.
- **Object**: An instance of a class.

### Creating an Object:
```java
Classname obj = new Classname();
```

- **Fields (Instance variables)**: Hold data specific to each object.
- **Methods**: Define behaviors.

### Example of a Class with Methods and Fields
```java
class Hello {
    int a;
    static int b;

    int add(int a, int b) {
        return a + b;
    }
}
```

## Arrays in Java

- **1D Arrays**:
  ```java
  int[] arr = {1, 2, 3};
  ```

- **2D Arrays**:
  ```java
  int[][] arr2D = new int[3][3];
  ```

### Enhanced For Loop:
```java
for (int[] row : arr2D) {
    for (int elem : row) {
        System.out.print(elem + " ");
    }
    System.out.println();
}
```

## Strings in Java

- **Immutable Strings**: Once created, strings cannot be modified.
  
  ```java
  String s = "Hello";
  String t = s.concat(" World");  // Creates new String
  ```

- **Mutable Strings** using `StringBuffer` or `StringBuilder`:
  
  ```java
  StringBuffer sb = new StringBuffer("Java");
  sb.append(" Programming");
  ```

- **String methods**:
  - `length()`: Returns length of the string.
  - `charAt()`: Retrieves a character at a specified index.
  - `equals()`: Compares two strings.

## Static Variables and Blocks

- **Static variables** are class-level, shared by all instances.
- **Static block** runs once when the class is loaded:

  ```java
  static {
      // Initialization code
  }
  ```

## Constructors in Java

- **Constructor** initializes objects and does not return a value.
  
  ```java
  public class Car {
      String model;

      public Car(String model) {
          this.model = model;
      }
  }
  ```

- **Constructor Overloading**: Multiple constructors with different parameter types.
  
  ```java
  Car(String model) {...}
  Car(String model, int year) {...}
  ```

## Inheritance in Java

- **Single, multi-level, and hierarchical inheritance**.
- Use the `extends` keyword for inheritance.
  
  ```java
  class Car {}
  class Tesla extends Car {}
  ```

- **Overriding**: Child class redefines a method from the parent class.

## Polymorphism

- **Compile-time Polymorphism** (Method Overloading): Same method name, different signatures.
  
  ```java
  void display(int a) {...}
  void display(double a) {...}
  ```

- **Runtime Polymorphism** (Method Overriding): Same method, different implementations in parent and child classes.

## Abstract Classes and Interfaces

- **Abstract class**: Contains abstract (no body) and non-abstract methods.
- **Interface**: All methods are abstract (unless they are default or static methods).
  
  ```java
  interface Vehicle {
      void start();
  }
  ```

## Exception Handling

- **Try-Catch-Finally** block for handling exceptions:

  ```java
  try {
      // Code that might throw an exception
  } catch (Exception e) {
      // Handle exception
  } finally {
      // Optional finally block
  }
  ```

- **throw** is used to manually throw an exception.

- **Custom exceptions** can be created by extending `Exception`.

## Threads in Java

- **Extending `Thread` class** or **Implementing `Runnable` interface** for multithreading.
  
  ```java
  class MyThread extends Thread {
      public void run() {
          // Code for thread
      }
  }
  ```

- **Thread Priority**, **Synchronization**, and **Inter-thread communication** are important concepts for thread management.

