
# Java Overview

## Java Compilation Process

- **Java Code (.java)** → **Compiler (javac)** → **Byte Code (.class)**
- **Byte Code (.class)** → **JVM (Java Virtual Machine)** → **Output**

The JVM looks for the `public static void main(String[] args)` method as the entry point for execution.

### Key Concepts:
- **JVM (Java Virtual Machine)** is platform-dependent, meaning it runs differently on different operating systems, but the bytecode remains the same.
- **JDK (Java Development Kit)** contains the **JRE (Java Runtime Environment)**, which in turn contains the **JVM**.
- **Java follows WORA** (Write Once, Run Anywhere), meaning that Java code can be run on any device that has a JVM without needing modifications.

### Components:
- **JDK**: Provides tools for developing Java applications, including the compiler and JRE.
- **JRE**: Includes libraries and the JVM necessary to run Java programs.
- **JVM**: Executes Java bytecode and provides the environment for runtime.

---

## Java as a Strongly Typed Language
Java is a strongly typed language, which means that each variable must be declared with a specific data type (e.g., `int`, `String`, etc.). Once a variable is declared with a type, it cannot store values of another type unless explicitly converted.

---

## Data Types in Java

### Primitive Data Types

1. **Integer Types:**
   - **int**: 4 bytes (32 bits)
     ```java
     int x = 100;
     ```
   - **long**: 8 bytes (64 bits) 
     ```java
     long l = 14235234L;
     ```
   - **short**: 2 bytes (16 bits)
     ```java
     short s = 32767;
     ```
   - **byte**: 1 byte (8 bits), range: -128 to 127
     ```java
     byte b = 127;
     ```

2. **Floating-Point Types:**
   - **float**: 4 bytes (32 bits)
     ```java
     float num = 5.6f;
     ```
   - **double**: 8 bytes (64 bits)
     ```java
     double num = 5.6;
     ```

3. **Character Type:**
   - **char**: 2 bytes (16 bits), represents a single character
     ```java
     char c = 'A';
     ```

4. **Boolean Type:**
   - **boolean**: Can be either `true` or `false`
     ```java
     boolean isJavaFun = true;
     ```

### Special Number Formats:
- **Binary Literal** (prefix `0b`):
  ```java
  int binaryNumber = 0b0101; // 5 in binary
  ```
- **Hexadecimal Literal** (prefix `0x`):
  ```java
  int hexNumber = 0x22; // 34 in hexadecimal
  ```
- **Underscores in Numeric Literals**: Helps in reading large numbers
  ```java
  int bigNumber = 10_000_000_000;
  ```
- **Scientific Notation for Floats**:
  ```java
  float scientificFloat = 12e10f; // 12 * 10^10
  ```

### Non-Primitive Data Types:
- **String**: Represents sequences of characters.
  ```java
  String name = "Java";
  ```
- **Array**: A collection of similar types of elements.
  ```java
  int[] arr = {1, 2, 3};
  ```

---

## Type Casting and Type Conversion

### Implicit Conversion:
Java automatically converts smaller data types to larger ones (e.g., `int` to `double`), which is known as type promotion.
```java
int a = 5;
double b = a; // Implicit conversion from int to double
```

### Explicit Type Conversion:
You must manually convert one data type to another when moving from a larger to a smaller type or from incompatible types.

```java
byte smallByte = 127;
int largeInt = 100;
smallByte = (byte) largeInt; // Explicit conversion from int to byte
```

#### Example with Floating Point:
```java
float f = 4.5f;
int x = (int) f; // Explicit conversion from float to int (fractional part discarded)
```

#### Error Example:
```java
int c = 12;
byte k = c; // Error: cannot convert int to byte
```

#### Correct Conversion:
```java
byte k = (byte) c; // Correct explicit conversion
```

### Type Promotion in Expressions:
When performing arithmetic operations on smaller types (e.g., `byte`, `short`), Java automatically promotes them to `int`.

```java
byte a = 10;
byte b = 40;
int result = a * b; // Both a and b are promoted to int
```

---

## Arithmetic Operations in Java

### Basic Operations:
- **Addition**: `+`
- **Subtraction**: `-`
- **Multiplication**: `*`
- **Division**: `/`
- **Modulus (Remainder)**: `%`

### Division and Modulus:
- To get the quotient:
  ```java
  int num1 = a / b;
  ```
- To get the remainder:
  ```java
  int num2 = a % b;
  ```

### Increment and Decrement:
- **Add/Subtract by 2:**
  ```java
  num1 += 2;
  num1 -= 2;
  ```
- **Post-increment:**
  ```java
  num++;
  ```
- **Pre-increment:**
  ```java
  ++num;
  ```

---

## Comparison and Logical Operators

### Comparison Operators:
- `>`, `<`, `>=`, `<=`, `==`, `!=`

### Logical Operators:
- **Logical AND** (`&&`)
- **Logical OR** (`||`)
- **Logical NOT** (`!`)

---

## Conditional Statements

### 1. If Statement:
```java
if (condition) {
    // Code inside if block
}
```

### 2. If-Else Statement:
```java
if (condition) {
    // Code inside if block
} else {
    // Code inside else block
}
```

### 3. If-Else If Statement:
```java
if (condition) {
    // Code inside if block
} else if (anotherCondition) {
    // Code inside else-if block
} else {
    // Code inside else block
}
```

### 4. Switch Statement:
```java
switch (n) {
    case 1:
        // Code for case 1
        break;
    case 2:
        // Code for case 2
        break;
    case 3:
        // Code for case 3
        break;
    default:
        // Code for default case
        break;
}
```

---

## Looping Statements

### While Loop:
```java
while (condition) {
    // Code inside while block
}
```

### Do-While Loop:
```java
do {
    // Code inside do-while block
} while (condition);
```

### For Loop:
```java
for (initialization; condition; step) {
    // Code inside for block
}
```

---

## Additional Notes

- **Type Promotion**: Java automatically promotes smaller data types (`byte`, `short`) to `int` in expressions.
- **Switch Statements**: Always use `break` after each case to prevent fall-through.
- **Looping**: Make sure to update the loop variables to avoid infinite loops.
- **Array**: Java supports arrays to store multiple values of the same type. For example:
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  ```

---

Feel free to explore more about Java as it offers rich libraries and support for various application developments!
```

