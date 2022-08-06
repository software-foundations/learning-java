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