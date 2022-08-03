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

# Variables and constants