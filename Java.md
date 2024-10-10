

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


## Static Variables and Blocks in Java

- **Static variables** are shared across all instances of a class. These are also referred to as class variables.
- The `static` keyword is used to define class-level variables and methods.
- **Static block** can be used for initializing static variables. It runs only once, when the class is loaded:
  
  ```java
  static {
      // static block
  }
  ```

- The static block is executed before any object of the class is created, but it does not run if no object or static method is invoked.
  
### Example

```java
class Details {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Human {
    public static void main(String[] args) {
        Details A = new Details();
        A.setAge(22);
        A.setName("Anvesh");

        System.out.println(A.getAge());
        System.out.println(A.getName());
    }
}
```

## Constructors in Java

- **Constructors** initialize an object when it's created.
- They don’t have a return type and have the same name as the class.
- Constructors are of two types:
  - **Default constructor:** No arguments.
  - **Parameterized constructor:** Takes arguments.
  
### Method Overloading in Constructors

Constructors can be overloaded, meaning there can be multiple constructors with different parameter lists.

### `this` and `super` Keywords

- `this` keyword is used to refer to the current instance of the class.
- `super` keyword is used to call parent class constructors and methods.
  
### Example of Constructor Overloading and Inheritance

```java
class A {
    public A() {
        System.out.println("in A");
    }

    public A(String name) {
        this();
        System.out.println(name + " from A(String name)");
    }
}

class B extends A {
    public B() {
        super("Anvesh");
        System.out.println("in B");
    }

    int add(int a, int b) {
        return a + b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        B b = new B();
        b.add(1, 2);
    }
}
```

## Naming Conventions

- **Camel casing**: 
  - Class and interface names start with uppercase (e.g., `Student`, `Payment`).
  - Variables and methods start with lowercase (e.g., `marks`, `show()`).
  - Constants are fully capitalized (e.g., `PIE`).
  - When combining multiple words in names, use camelCase (e.g., `showMyMarks()`).
  
- **Snake casing**: Use underscores (`_`) to join words, commonly in Python (e.g., `show_my_marks()`).

## Inheritance in Java

- Java supports:
  - **Single inheritance**
  - **Multi-level inheritance**
  - **Hierarchical inheritance**
- Java doesn’t support multiple inheritance (due to ambiguity problems).

### Examples of Different Types of Inheritance:

- **Single-level inheritance**:
  ```java
  class A {
      // Attributes and methods
  }
  
  class B extends A {
      // B inherits A’s attributes and methods
  }
  ```

- **Multi-level inheritance**:
  ```java
  class A {
      // Attributes and methods
  }
  
  class B extends A {
      // Inherits A’s methods
  }
  
  class C extends B {
      // Inherits A and B’s methods
  }
  ```

## Method Overloading and Method Overriding

- **Method overloading**: Multiple methods with the same name but different parameters.
- **Method overriding**: Same method name and parameters in child class, overriding parent class implementation.

## Access Modifiers

Java provides different access levels:

| Modifier   | Same Class | Same Package | Subclass (same pkg) | Subclass (diff pkg) | Everywhere |
|------------|------------|--------------|---------------------|---------------------|------------|
| private    | Yes        | No           | No                  | No                  | No         |
| protected  | Yes        | Yes          | Yes                 | Yes                 | No         |
| public     | Yes        | Yes          | Yes                 | Yes                 | Yes        |
| default    | Yes        | Yes          | Yes                 | No                  | No         |

## Polymorphism in Java

Polymorphism allows an object to take many forms:

- **Compile-time (method overloading)**: Same method, different signatures.
- **Runtime (method overriding)**: Same method, different implementation in child class.

## `final` Keyword

- `final` can be used with variables, methods, and classes.
- Variables marked `final` cannot be reassigned.
- Methods marked `final` cannot be overridden.
- Classes marked `final` cannot be extended.

### Example:
```java
final class A {
    // Class A cannot be extended
}

class B extends A {
    // This will cause an error
}
```

## Upcasting and Downcasting

- **Upcasting**: Assigning a child object to a parent reference:
  
  ```java
  A obj = new B();
  ```

- **Downcasting**: Casting a parent object to a child reference:
  
  ```java
  B obj1 = (B) obj;
  ```

## Wrapper Classes

Java provides wrapper classes for primitive types:

- `int` -> `Integer`
- `char` -> `Character`
- `double` -> `Double`

```java
int num = 7;
Integer num1 = num;  // Auto-boxing
int num2 = num1.intValue();  // Auto-unboxing
```

## Abstract Classes and Interfaces

- **Abstract classes**: Cannot be instantiated, can contain both abstract and non-abstract methods.
- **Interfaces**: Define method signatures without implementation.

### Example of Interface Implementation

```java
interface A {
    void show();
    void config();
}

class B implements A {
    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }
}
```

- A class can implement multiple interfaces, but can only extend one class.

## Inner Classes

Java allows classes within other classes:

```java
class A {
    class B {
        public void config() {
            System.out.println("in config");
        }
    }
}
```

- **Static inner classes** are also possible.
