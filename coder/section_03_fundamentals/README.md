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
