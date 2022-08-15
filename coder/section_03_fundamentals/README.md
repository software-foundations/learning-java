# Create a project

```bash
mkdir exercises
cd exercises
mkdir src
mkdir bin
```

# First Program

- Create a class

- Create a package from that class

# Compile and run a file

```bash
javac MyClass.java
javac MyClass.java -d packageName.MainClassName
java MyClass
```

# Compile and run a package

```java
package com.core

public MyClass {
	public static void (String[] args) {
		// ...
	}
}
```

```bash
cd ../../
javac com/core/MyClass.java
java com/core/MyClass
```

# The main method

- Is the entrypoint of a program
- We can have more then a main
- But only one of them can be used to start the program

# Comments

- Should be used only when we have to explain something very relevant

- Prefer readable names names instead of comments

- Prefer clean code instead of comments

- One line

```java
//
```

- Many lines

```java
/*
...
*/
```

## Java Doc

```java
// I don't know if we may have more than one since annotation in code

package something;

@author // set the author
@since 1.0 // Software Version
@since JDK1.0 // SDK version

public class myClass {
	// ...
}

```

- firstProgram.java
```java
package fundamentals;

/**
 * This class represents ...
 * 
 * @author Bruno Conde <@email.com>
 * @since 1.0
 * @since JDK1.0
 * @see
/
public class firstProgram {

	/**
	 * @param args
	/
	public void main (String[] args) {

	}
}
```

# Variables and constants - challenge (temperature)

- Since java 9 we have a java interpreter on terminal

- <code>5/9</code> results in 0 (integer) 'cause both are integers

- The code bellow results in 0.5555555555555556 (float) 'cause there's a float

```java
5.0/9

5/9.0
```

```bash
jshell

/exit
```

# Type Inference

- Infer the variable type by the type of value assigned

- We cannot declare a variable using <code>var myVar;</code>

- Declarations without assignment must have a type

- Then, we can only use <code>var</code> in declaration followed by assignment

- We can assign again to this variable

- Variables can only be assigned to the type it is declared or it is first infered

- Remember that in java, the variables has strong types

```java
var a = 10;
```
- Obs: a float variable can receive a int, but the contrary is false

# Primitive Types

- Complex types are composed by primitive types

- Primitve types

## Numerical

```
- Byte	(8 Signed Bits [-128, 127])
- Short (2 Signed Bytes)
- Int 	(4 Signed Bytes - The preferable type in almost case)
- Long 	(8 Signed Bytes)
```

```
Float	(4 Unsigned Bytes)
Double	(8 Unsigned Bytes)
```

```java
// We can separate using undelines

// L indicate that it is a Long
long accumulatedPoints = 3_234_845_223L;

// Here, without L, this literal is treated as an Integer
long accumulatedPoints = 3_234_845_223;
```

- Obs: The first bit (MSB - Most Significative Bit)
- Obs: The first bit indicate the signal of the number

```java
double a = 3 	// Integer
double b = 3.1	// Float
```

- A Float value is truncated to an integer when assigned to a Integer variable

- A Integer value is turned into an Float when assigned to a Float variable

- Any number with floating point is treated as a double

## Others

```
Char 	(One character wrapped by single quotes)
Boolean	(true or false)
```

# Dot Notation

- Is used to access atributes and methods of ...

```
- variable
- objects
- or even in values (literals) which are not storaged in any variable
```

- Primitive Types do not have Dot Operator

# Import

- Import packages that aren't available by default

- The <code>java.lang</code> package is available by default in all classes

- Then, isn't necessary <code>import java.lang</code> package to use it

# String Type

- A non primitive type which is composed by character primitive type

- Is an immutable object

- String methods

```java
.charAt(<int>)
.startsWith(<String>)
.endsWith(<String>)
.toLowerCase()
.toUpperCase()
.length()
.equals(<String>)
.equalsIgnoreCase(<String>)
.contains()
.format(<String interpolation>, <variables>)
.indexOf(<String>)
.substring(<int>)
.substring(<int>, <int>)
```

- String interpolation

```java
%s		// String
%d		// integer
%f 		// Float
%.2f 	// Float with 2 decimal floating points
```

# Console

- <code lang="java">System.out.println()</code> breaks line

- <code lang="java">System.out.print()</code> remains in the same line

- <code lang="java">System.out.printf()</code> allows parameters

- <code>"%n"</code> and <code>"\n"</code> are the same: line break

- <code lang="java">import java.util.Scanner</code> gets input from console

# scanner.nextInt vs scanner.nextDouble

- <code>scanner.nextInt</code>

```
- treat the \n as a number
```

- <code>scanner.nextDouble</code> works the same

# Object vs Primitive

- <code href="https://www.w3schools.com/java/java_data_types.asp">Primitive types in java</code>

```
1 - byte	1 byte	Stores whole numbers from -128 to 127
2 - short	2 bytes	Stores whole numbers from -32,768 to 32,767
3 - int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
4 - long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
5 - float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
6 - double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
7 - boolean	1 bit	Stores true or false values
8 - char	2 bytes	Stores a single character/letter or ASCII values
```

- Everything that is not a primitive type is an object

- Wrapper can add behaviors in primitive types or anything else

- Wrapper is the object version of a primitive type

# Wrappers

- It is a class to wrap a primitive type

- There is a wrapper for each primitive type

# Primitive Type Conversion

- Some conversions between some types are not fundamentals

- Java analyse types while converting

- Java does not analyse values

## Preferable types

```
int
double
```

- These types are the default types in literals

- Use them avoid unecessary cast

## Integers Conversions
```
byte
	short
		int
			long
```

- In this flow of conversion (->)

1. The conversion is implicit and
2. We don't lose information

- In this flow of conversion (<-)

1. The conversion is explicit
2. We can lose information

## Integer to Float
```
int
	float
```

Flows of conversion

- (->)

1. The conversion is implicit
2. We don't lose information

- (<-)

1. The conversion is explicit
2. We can lose information

## Conversion number to string

```java
// Long and Double have the same behavior of Integer
Integer num1 = 10000;

System.out.println(num1.toString().length());

Integer num2 = 100000;

System.out.println(Integer.toString(num2).length());

// works the same, but it is incommon
System.out.println(("" + num1).toString().length());

System.out.println(("" + num2).toString().length());
```

# String to Number Conversion

- Every number can be converted to a string

- Not all strings can be converted to a number

- <code>java.math.BigDecimal</code> to more precise floating points

# Conversion Challenge

- Replace the ',' with ',' to allow conversion between String to Double

# Operators

- Unary, binary, and ternary

```txt
It definition matches with the number of operands

Unary:
	++
	--

Binary:
	+
	-
	*
	/

Ternary:
	<operand> ? <operand> : <operand>
```

- Arithmetic, Relational, logical, and assignment
```
Arithmetic
	+
	-
	*
	/
	%
```

- Obs: there is precedence table

- This table define the priority execution order of the operators

- Forms: prefix, postfix, and infix

```txt

prefix: <operator> <operand>
	++a

postfix: <operand> <operator>
	a++

infix: <operand> <operator> <operand>
	1 + 2
```