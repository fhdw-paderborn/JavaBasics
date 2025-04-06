# Java Basics Demo

This command-line application demonstrates all basic Java concepts in a clear example.

## Content

The program shows the following Java basics:

### 1. Primitive Data Types
- **boolean**: Truth values (true/false), 1 bit
- **char**: A single Unicode character, 16 bit
- **byte**: Signed integer, 8 bit (-128 to 127)
- **short**: Signed integer, 16 bit (-32,768 to 32,767)
- **int**: Signed integer, 32 bit (-2^31 to 2^31-1)
- **long**: Signed integer, 64 bit (-2^63 to 2^63-1)
- **float**: Single-precision floating-point, 32 bit
- **double**: Double-precision floating-point, 64 bit

### 2. Type Inference
- **var**: Automatic type inference by the compiler (introduced in Java 10)

### 3. Operators
- **Arithmetic Operators**: +, -, *, /, % (addition, subtraction, multiplication, division, modulo)
- **Relational Operators**: ==, !=, >, <, >=, <= (equality, inequality, greater than, less than, etc.)
- **Logical Operators**: &&, ||, ! (logical AND, OR, NOT)
- **Bit Operators**: &, |, ^, ~, <<, >>, >>> (bitwise AND, OR, XOR, complement, shifts)
- **Assignment Operators**: =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
- **Increment/Decrement**: ++, -- (pre- and post-increment/decrement)
- **Conditional Operator**: ? : (ternary operator)
- **Cast Operator**: (type) variable (explicit type conversion)

### 4. Control Structures
- **if-else**: Conditional execution
- **switch**: Multiple branches
- **while**: Loop with condition check before execution
- **do...while**: Loop with condition check after execution
- **for**: Counting loop
- **foreach** (enhanced for): Simplified iteration over arrays and collections
- **break**: Premature termination of a loop or switch block
- **continue**: Skipping the current loop iteration
- **Labels**: Marking loops for targeted break/continue

## Compiling and Running

### Using Java directly

```bash
# Compile
javac src/JavaBasicsDemo.java

# Run
java -cp src JavaBasicsDemo
```

## Output

The program displays examples for each area and their output to illustrate the concept.

## Exercises

The `src/aufgaben` directory contains various exercises that demonstrate Java basics:

1. Temperature Conversion
2. Leap Year Verification
3. ISBN Validator
4. Prime Number Test
5. Interest Calculator
6. Palindrome Checker
7. Array Sorting
8. Word Counter
9. Number System Converter
10. Format Console Output

Each exercise includes a corresponding test in the `src/tests` directory.