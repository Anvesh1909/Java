
# Java Programming Overview

## Java Compilation Process

- **Java code (.java)** -> **Compiler** -> **Byte code (.class)**
- **Byte code (.class)** -> **JVM (Java Virtual Machine)** -> **Execution and Output**
- JVM searches for the method: `public static void main(String[] args)` for execution.
- **JVM is platform-dependent**, meaning the JVM implementation may vary across platforms.
- **JDK (Java Development Kit)** contains:
  - JRE (Java Runtime Environment)
    - **JRE** contains:
      - **JVM**
      - **Libraries**
- **WORA**: Write Once, Run Anywhere — Java code can be run on any platform with a compatible JVM.

## Java: Strongly Typed Language

- In Java, the **type of variable** (like `int`, `String`, etc.) must be declared explicitly.
- Data types in Java are divided into two categories:
  - **Primitive Data Types**
    - Integer types:
      - `int` -> 4 bytes
      - `long` -> 8 bytes (e.g., `long l = 14235234L;`)
      - `short` -> 2 bytes
      - `byte` -> 1 byte (Range: `-128` to `127`)
    - Floating-point types:
      - `float` -> 4 bytes (e.g., `float num = 5.6f;`)
      - `double` -> 8 bytes (e.g., `double num = 5.6;`)
    - Character type:
      - `char` -> 2 bytes (e.g., `char c = 'k';`)
    - Boolean type:
      - `boolean` -> `true` or `false` (e.g., `boolean b = true;`)
  - **Literal Examples**:
    - `int b = 0b0101;` (binary literal)
    - `int h = 0x22;` (hexadecimal literal)
    - `int u = 10_00_00_00_000;` (underscore for readability)
    - `float e = 12e10;` (exponential notation)

## Type Casting and Conversion

- **Explicit Conversion** (manual):
  ```java
  byte b = 127;
  int a = 12;
  b = (byte) a;  // Type casting
  ```
  - Example with float:
    ```java
    float f = 4.5f;
    int x = (int) f;  // Explicit casting
    ```
  - Without casting:
    ```java
    int c = 12;
    byte k = c;  // Error, needs casting
    byte k = (byte) c;  // Correct with casting
    ```

- **Type Promotion**: When operating on smaller types (e.g., `byte`, `short`), Java promotes them to `int` before performing calculations.
  ```java
  byte a = 10;
  byte b = 40;
  int res = a * b;  // Result promoted to int
  ```

## Arithmetic and Increment Operations

- **Quotient and Remainder**:
  ```java
  int num1 = a / b;  // Quotient
  int num2 = a % b;  // Remainder
  ```
- **Increment and Decrement**:
  ```java
  num1 += 2;  // Addition
  num1 -= 2;  // Subtraction
  num1 *= 2;  // Multiplication
  ```

- **Post-increment and Pre-increment**:
  ```java
  num++;  // Post-increment
  ++num;  // Pre-increment
  ```

## Comparison and Logical Operators

- **Comparison Operators**: `>`, `<`, `>=`, `<=`, `==`, `!=`
- **Logical Operators**: `&&`, `||`, `!`

## Conditional Statements

- **If, If-Else, Switch**:
  ```java
  if (condition) {
      // If block
  }

  if (condition) {
      // If block
  } else {
      // Else block
  }

  if (condition) {
      // If block
  } else if (condition) {
      // Else If block
  } else {
      // Else block
  }

  switch (n) {
      case 1:
          // Case 1
          break;
      case 2:
          // Case 2
          break;
      default:
          // Default case
          break;
  }
  ```

## Looping Statements

- **While, Do-While, For loops**:
  ```java
  while (condition) {
      // While block
  }

  do {
      // Do-While block
  } while (condition);

  for (start; condition; step) {
      // For block
  }
  ```

## Object-Oriented Programming (OOP) Concepts

- **What is a Class?**: A blueprint for creating objects. It contains data (fields) and methods.
- **What is an Object?**: An instance of a class.

### Creating an Object:
```java
classname reference_obj_name = new classname();
```

### Example:
```java
class Hello {
    int a;  // Instance variable
    static int b;  // Static variable or class variable

    int add(int a, int b) {
        // Local variables for add method
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        Hello obj = new Hello();  // Reference variable
        int result = obj.add(3, 5);
        System.out.println(result);
    }
}
```

## Arrays in Java

- **1D Arrays**:
  ```java
  int nums[] = {4, 5, 6};
  int nums1[] = new int[5];
  ```

- **2D Arrays**:
  ```java
  int nums2[][] = new int[3][3];

  // Nested enhanced for loop
  for (int[] row : nums2) {
      for (int elem : row) {
          System.out.print(elem + " ");
      }
      System.out.println();
  }
  ```

## Strings in Java

- **Immutable Strings**:
  ```java
  String s1 = new String("Anvesh");
  String s2 = new String("Bunny");
  ```

  - `s1.concat(s2);` // Concatenation
  - `s1.charAt(3);` // Get character at index 3

  Immutable strings mean that changes to the value result in a new object being created.

- **Mutable Strings** using `StringBuffer`:
  ```java
  StringBuffer sb = new StringBuffer("Anvesh");
  sb.append("Bunny");  // Appends "Bunny" to the existing string
  sb.deleteCharAt(2);  // Deletes the character at index 2
  sb.insert(0, "Java");  // Inserts "Java" at the start
  String str = sb.toString();  // Converts StringBuffer to String
  ```
