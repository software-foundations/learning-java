# Introduction

- OOP concepts

- classes

- objects

- methods

# Class review

- Java is totally centred in classes

- The file name must be equals the public class name inside it

- <code>public</code> keyword means accessible outside class

- A <code>public</code> class is accessible outside its file module

- We can have more classes per file

- But the normal case is to have one public class per file

- Set <code>main</code> method in each class make them independent

- The rule is one class per project within a main method

- This mains method is the enter port of the program

- A class defines a block (scope)

# Class vs object

- The OOP paradigm is based on real life

- The most important are the concpets instead of syntax

## Class

- `A class defines a type`

- `A type is a data structure`

- `A class represents an abstraction`

- `An abstraction represents a simplification`

- `Is a mold/shape/structure to instantiate an object`

- Follow the `PascalCase` name convention

- The class uses the constructor method to create an object

- The <code>new</code> keyword invokes the constructor when creating an object

- Specific types should be created to accord with a specific business rule

- Every class has <code>attributes</code> and <code>behaviors</code>

- Attributes are data

- behaviors are methods

- The idea behind class is to get `data` and `behavior` as close as possible

- Then, the class `group` data and `behavior`

```java

<modifiers> class <ClassName> (someThingsHere) {

	// body
}
```

## Objects

- `An object is created from a class`

- `The object represents the data`

- `A object is a class instance`

- <code>object === instance</code>

## Class members

- <code>someObject.member</code> (point notation)

- <code>SomeClass.member</code> (point notation)

- Attributes

```
Can be variables or constants

We can have object attributes for both variables and constants

We can have class attributes for both variables and constants (static)
```

- Constructors

```
Can have 1:n
```

- Methods

```
Can have 0:n others methods that are not constructors

We can have object methods

We can have class methods (static)
```

- Classes

```
We can have classes inside anothers

It sometimes can be useful
```

# Date class challenge

# Tip

- Packages in same package are available for each other without need to import them

- In other cases, you have to import a class from a specific package

- In intellij, ...

```
1. I click with right button on src directory

2. Then, i click in 'make it as root source' to make it executable by intellij
```

# Method

- Is related with action, behavior, and algorithm

- Is a sequence os steps

- It generally receive some input parameters. But is not a rule

- The set of parameters is the signature of the method

- The method may both return or not a value

- Follows the camelCase

```java
<modifiers> <returnType> methodName () {

}
```

```java
// public and static are modifiers
// void means that is has no return

public static void myMethod() {

}

// private is a modifier
// String is the return Type of the method

private String otherMethod() {

}

// public is a modifier
// Integer is the return type

// anotherMethod(Integer) is the signature of the method (the method identity) in a class
// We cannot have a class with more than one method with the same identity
// Then, only the methodName and the type of the parameters (not their names) belongs to the method signature
// Then, we can have methods with same name but with different types of parameters

// x is a parameter of type Integer
public Integer anotherMethod(Integer x) {

}
```

# Constructor

- It has the same name of the class

- It is a special method of a class

- It creates (constructs) a new object from a class

- It doesn't have a return type (even <code>void</code> mustn't be used)

- Put <code>void</code> in a type return of a constructor turns it into a method

- The constructor returns an instance of the class

## Default constructor

- Every java class has a default (implicity) constructor

- This default constructor has no parameters

- We does not have to create it 'cause it is available by default, too

```java
ClassName {

	// ..
}

// using the default constructor
ClassName classNameInstance = new ClassName();
```

## Customized constructors

- We can explicity create/define constructors

- When we create a constructor, we lose the default implicity constructor

```java
ClassName {

	// Explicity
	ClassName(int a, int b) {

		// ..
	}

	// Explicity
	ClassName(int a){

		// ..

	}

	// The default/implicity constructor doesn't work anymore by default
	// We have to explicity declare the default constructor to use it
	ClassName() {

		// ..
	}


}

ClassName classNameInstance1 = new ClassName();

ClassName classNameInstance2 = new ClassName(1, 2);

ClassName classNameInstance3 = new ClassName(1);
```

- We will see in a future that we can call a constructor from another one

# Constructor Challenge

- Add another constructor in <code>Date</code> class

- The default constructor must have default values

# Class members vs instance members

## Class members

- Are memory spaces associated to the class

- All the instances share these memory spaces of the class attributes

- <code>static</code> modifier do the work of turn something a class member

- We access it through the class. We can, but we don't need to instantiate the class

- We use <code>final</code> modifier in static members generally

- It turns the member a constant

- Constants are defined by capital letters by convention

- We can use both <code>final static <type> or </code><code>static final<type></code>

- However, the <code><type></code> must be beside of the member
	
## Instance members

- Are memory spaces associated to the instance

- Each instance has it own memory space to these instance attributes

- We must to instantiate the class to access the attributes

# Challenge class members vs instance members

- All products must have the same discount

- Apply a default discount of 25% to all products

# Assignment: by reference vs by value

- By reference: objects

```txt
Object memory position (reference) is copied when we assign a object to another
```

```java
int a = 1;

int b = a;

a = 10;

// a == 10;
// b == 1;
```

- By value: primitive variables

```txt
Value is copied when we assign a primitive variable to another
```

```java
Date d1 = new Date(); // Sat Sep 17 19:18:35 BRT 2022

Date d2 = d1;

Thread.sleep(1000)

d1 = new Date();

// d1 == // Sat Sep 17 19:18:36 BRT 2022
// d2 == // Sat Sep 17 19:18:36 BRT 2022
```

- Java provides <code>/clone</code> method for many classes

- This method is to define how the object will be cloned

- It is to take a copy of the object value instead of its reference

- Obs: When we pass an object in a paramater of a method, we pass the reference

- Obs: We cannot access a instance method from a static method

# Challenge: first trauma

- How to access a instance member inside an static method?

- R: instantiating the class

- R: We can turn the instance member into a class member using <code>static</code>

- In resume, class members can access another class members

- In resume, instance members can access both another instance members and class (static) members

```java
package classesandmethods;

public class FirstTraumaChallenge {

	int a = 10;

	static int b = 20;

	public static void main ( String[] args ) {

		// error: non-static variable a cannot be referenced
		// from a static context
		FirstTraumaChallenge firstTraumaChallenge = new FirstTraumaChallenge();

		System.out.println(firstTraumaChallenge.a);

		System.out.println(firstTraumaChallenge.b);

		System.out.println(b);

	}
}
```

# this and this()

- We can use this even if there's no name conflict

- Obs: we can use <code>final parameterName</code> in a parameter of a method

- <code>this</code> refers to instance

- <code>this</code> turns optional when we don't have name conflict

- Then, when there isn't a variable/method with the name of a instance member, <code>this</code> is optional

- <code>static</code> members cannot be accessed with <code>this</code>

- Because <code>this</code> refers to the instance, and not the class

- An the <code>static</code> member is associated to the class

- Then, <code>this</code> cannot be used inside static methods

- Then, only instance methods can use <code>this</code> inside them

- <strong>Obs</strong>: we can use this as a constructor of the class

- <strong>Obs</strong>: we can only do that inside another constructor

# Local Variables

- A variable can be a instance (<code>this</code>) or a class (<code>static</code>) variable

- When a variable is declared inside a method it is a local variable

- Obs: the scope of a variable is the area of visibility

- The method parameters are local variables

- Then, they're visible only inside the methods

- Then, they belong to the method scope

# Default values

- <code>byte, short, int, and long</code> <strong>0</strong> is de default values

- <code>float and double</code> <strong>0.0</strong> is de default value

- <code>boolean</code> <strong>false</strong> is the default value

- <code>char</code> <strong>'\u0000'</strong> (1º unicode element) is the default value

- These default values are given when we not assign nothing to the variable

- However, local variables cannot be used until they have a explicity assignment

- Then, default values exist only in instance members, not on local variables

- Then, local variables aren't initialized with a default value

- It happend 'cause local variables aren't initialized by default

- <code>Objects in general (String, etc.) </code> <strong>null</strong> is the default value

- Remember that <strong>null</strong> doesn't point to any memory address

- Obs: <code>final</code> (constant) instance/or class attribute must be explicity assigned until the constructor be executed

# Null

- <code>null</code> means that it doesn't point to any memory address

```java
package classesandmethods;

public class Null {

	public static void main ( String[] args ) {

		// It is an empty String
		String s1 = "";

		System.out.println(s1.concat("!!!"));

		// This will raise a compilation error
		/*String s2;

		System.out.println(s2.concat("!!!"));*/

		// This will raise a runtime error
		// It is the famous NullPointerException
		/*
		String s3 = null;

		System.out.println(s3.concat("!!!"));
		*/
	}
}
```

- The <strong>java.lang.NullPointerException</strong> occurs when whe try to access some attribute/or method of a variable that points to null (has no memory address)

- How can we avoid <code>java.lang.NullPointerException</code> ?

```java
if (someVariable != null) {
	// code
}
```

# Module challenge

- Create 3 classes: Person, Food, and Dinner

## Dinner

- Will have the main method

- It will
```
Instantiate a person
Instantiate 2 foods
Make the person eat the food
Print the person weigth before and after the person eat the food
```

## Person

- Will have the person name (String)

- Will have the person weight (double)

- Will have a method called <code>eat</code>

- This method will receive as a parameter a object of the <code>Food</code> class

## Food

- will have the food name (String)

- will have the food weight (double)

## Behavior

- When the person eat the food, the person weight will increase according to the food weight