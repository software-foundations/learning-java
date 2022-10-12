# Introduction

- Object Oriented Programming - OOP - is a paradigm

- A paradigm is the way we think as structure our software

- Java is strongly based on OOP

- We will se some important concepts, like

```
Inheritance
Encapsulation
Polimorphism
Abstraction
Abstract classes
Interfaces
```

# Reuse by composition

- Reuse code is a natural thing we want in a project

- Resuse by composition means use objects inside anothers to be the things reusable

- It means spread the specific responsabilities along specific objects

- The classes can be related at tree forms

```
1:1
1:n
n:n
```

# 1 to 1 relationship

- A car has one motor

- A motor belongs to one car

- Then, 1:1 is the relationship between a car and a motor

- 1:1 relationship can be unidiretional or bidiretional

# 1 to n relationship

- A purchase has many items

- An item belongs to one purchase

- A client has many purchases

- A purchase belongs to one client

- A purchase has many items

- An items belongs to one purchase

- It is a bidirectional relationship

# n to n relationship

- A course has many students

- A students belongs to many courses

- It is a composition, because there's no sense a student without a course

- Then, a course is composed by students

- Obs: a final variable always points to the same memory address

- Obs: in contrast, if a final variable points to a List, the list content can change

- Then, the final is the reference (memory address), not the content itself

# Relationship Challenge

- Client 1:n Purchase 1:n Item n:1 Product

- There's Item entity because Purchase can have n products and a Product can have n purchases

- In database modelling, we put a intermediate table (Item here) in the middle of the relationship

- Obs: we can have class with the same name in different packages

- Obs: remember that a class that bellongs to the same package doesn't need to be imported

- Obs: The course solution is a little different from mine, but both are ok.

# Paradigms

- Are ways to structure and bring ideas and thoughts of real world in software

- There are many paradigms

1. Not structured (GOTO)

2. Procedural (Since Dijkstra - Here was born the function, control structures, like conditionals and loops)
```
Here, we have global data (shared data beeing modified)
Here, the function alter global data
The principal actor is the function
```

3. Functional
```
- Imutable data
- Constants
- Composition of functions
- Evolute the aplication state instead of modifu it
```

4. Object Oriented Programming
```
- The class is the data
- The class holds both: data and behavior (methods)
- The class defines a type (a data structure)
- The principal actor is the object
- In java, we can only declare functions (methods) inside a class
- Java is centered in Object
- Other languages allows many paradigmns
- But, in java, we can only use the OOP paradigm
- But, we have some functional principles present in java
```

- In general, we have follow the principle of the paradigms that we are using the software

# Principle of the OOP

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

## Encapsulation

- Hide the complexity
- Hide the details
- So, we can use the object without know the internal details

## Inheritance

- It is a type of code reuse by using the <code>extends</code> keyword
- Here, the relation is <code>is one</code>
- In java, multiple inheritance is not allowed

## Polymorphism

- Insert specific things by the benefit of using a generic concept

- Remember that the method name, the parameter types, and the parameter order defines the method signature

- **We have two types of polymorphism: statical and dynamic**

### Statical polymorphism

- **Statical polymorphism** happens when we have methods with the same name but with different parameters

- In this case, we are **overloading** the method name

- It is statical polymorphism because we statically insert polymorphism in the code

- In this case, we statically insert different ways to use the same method

### Dynamic polymorphism

- The requisite to it happens is the **inheritance**

- The same object that inherit a father class can assume, along the code, many subclasses that inherit the generic things in father class, but maybe implement then in specific way

- Example
```java
Car c = new Civic(); // Here, c is a Civic Car
c.move(); // Here, the car mover like a Civic Car

c = new Ferrari(); // Here, the car is now a Ferrari Car
c.move () // Here, the car movers like a Ferrari Car

// Both, Ferrari and Civic are Cars that moves in their only ways
// The c variable is a car. Then, it can assume, with the time, many Car ways (Ferrari, Civic)
```

- Another example is when a method expected a generic type in a parameter, which allows any subclass be passed

- This example is useful because allows versatility

## Abstraction

- Abstract the business rules from real world to the code

- It's a simplified real world concept in the code

- There's no such a rule to follow when putting real world concept in the code

- We have abstraction in generic classes and interfaces

- The real world is the reference

- Not everything in real world must appear in the code

- Not everything in the code must exist real world

# OOP Principles: Encapsulation

- The encapsulation exposes only public things

- The other things are internal ones

- The other things the client doesn't need to know

- Low level of encapsulation allows high level of coupling

- The encapsulation holds simple and stable the communication form

- The OOP holds near the data and the method that use that data

- Then, it allows keep the data private while the method is public

- A private attribute is only accessible inside the class its declared

- Then, only a public method can access this private attribute

- So, the attribute is hided while the method is exposed

## Access modifiers

- <code>package</code> has all <code>private</code> visibility levels and more
- <code>protected</code> has all <code>package</code> visibility levels and more
- <code>public</code> has all <code>protected</code> visibility levels and more
1. Public (more exposed)
2. Protected
```text
- Is inherited by other classes
```
3. Package (default level that has no modifier keyword)
```text
- A package is visible inside the class and by other classes inside the same package
```
4. Private (only inside the class)

# Enum

- It is another structure that we can create in java that isn't a class

- It is to avoid mapping along the code

- It should be used when we have a finite number of possibilities to be mapped

# Override behavior in child class

- To override a method in a child class, we just need to redefine the method in the child class

- I think that to override we need to use the same method signature

- To reuse the method in the mother class, we can use

```java
class ChildClass extends MotherClass {

	void methodName() {
		super.methodName();
	}

}
```

- The <code>super</code> keyword refers to the mother class reference

# Inheritance Challenge

- Create a <code>Car</code>
- A <code>Car</code> can

```java
void accelerate() {}
void brake() {}
```

- Create two types of Car: <code>Civic</code> and <code>Ferrari</code>

- <code>Civic</code> accelerate likes a normal car

- <code>Ferrari</code> accelerate 3 times more than a normal car

- Both cars brake like a normal car

- We should use, in <code>Ferrari</code>

```java
@Override
void accelerate() {
	// code here
}
```

- The <code>@Override</code> annotaiton is just to explicit override a method

- It also validate if the method exists in the mother class and, if not, raise an error

- The <code>@Override</code> it is not an obligation

# Relationship between Object constructors and inheritance

- We can define more than a constructor in a class

- Remember that a constructor can call another constructor

- We have to be aware to prevent an infinite loop of constructors

- It hapens when the the construcor call the second, which call the first, and so on

- We use <code>this(...)</code> to call the constructor of a class

- We use <code>super(...)</code> to call the constructor of the mother class

- We use <code>this.attribute</code> to access the attribute of a class

- We use <code>super.attribute</code> to access the attribute of the mother class

- Remember that each class has as default/implicity constructor which doesn't need to be implemented

- Every class contains the default constructor which has a unique call inside it

```java
super();
```

- So, when a mother class has one, and only one, explicity constructor, it is the constructor which the child class will call

- Then, the child class invoke <code>super()</code> constructor by default in its default constructor

- Then, the default constructor of the child class is to call the constructor of the mother class, which is no more the default constructor of java

- So, to keep the default constructor available in child class, we have to explicit declare it in the mother class

- All constructors in mother class are available in the child class

- **We always have to call explicity the whenever that the mother class hasn't the default constructor defined**

# Inheritance challenge 2

- Remember that a final varible can be initialized only one time: or in its definition or later, but only one time

# Access modifiers

- He have

- <code>private</code> (less visible)

- <code>package</code> (default visibility when not was applyed)
```
- Was not passed by inheritance
```

- <code>protected</code> (same as package, but always passed by inheritance)

- <code>public</code> (more visible)

---

- A package is like a house

- A class is like a person inside a house

- Classes inside the same package are visible to each other

- <code>@SuppressWarnings("unused")</code> to suppres unused warning of an attribute

- The package property is not passed by inheritance when the child class is in another package

- The proteced property is accessed by inheritance without makes a reference to the super class. It is accessed like the property was of the child class, and, in fact, it is, 'cause it is inherited and now the child class has the property inside it

# Encapsulation Challenge

- Take challenges of inheritance, move test classes to a **test** package and apply the modifiers in methods, constructors, and attributes to make the code work properly

- Obs: he cannot use <code>private, protected</code> as class access modifers

- Whe we <code>@Override</code> a method, we cannot use a less permissive access modifier

# Getters and Setters

- We should create <code>private</code> attributes with, probably <code>public</code>, getters and setters

- We have **two kinds of operations for an attribute: get and set**

- It holds to encapsulation the class data

- It can be used to validate before get or set an attribute

- I can create a getter to an calculated attribute which derive from inner attributes

# Polymorphism challenge

- We have the static polymorphism (method overload) and the dynamic polymorphism

- In the next challenge, we will have to substitute the static polymorphism by a dynamic one

- We do this by creating a generic class, called <code>Food</code>

# Interface

- An interface has almost the same structure of a class

- The methods of an interface mustn't have a body/implementation

- The interface its to obligate the class that implement has some methods signatures

- A class can implement multiples interfaces

- TO implement use both the interface and the MotherClass propertly, we must

```java
class Car {

}

public interface Sportive {

	void turnOnTurbo();
	void turnOffTurbo();
}

public interface Lux {

	void turnOnRefrigeration();
	void turnOffRefrigeration();
}

class Ferrari extends Car implement Sportive {
	
	@Override
	public void turnOnTurbo() {}
	@Override
	public void turnOffTurbo() {}

	@Override
	public void turnOnRefrigeration() {}
	@Override
	public void turnOffRefrigeration() {}


}

Ferrari ferrari = new Ferrari();
ferrari.turnOnTurbo();
ferrari.turnOffRefrigeration();
```

- By default, all method inside an interface is public and abstarct, even if we do not use either <code>public</code> and <code>abstract</code> keywords

# Abstract class

- It holds abstractions shared by all concrete classes that inheret from it

- It can hold (1) abstract methods, (2) abstract methods and concrete methods, and (3) concrete methods

- Then, it can varry from 0% to 100% of abstraction

- **The abstract class cannot be instantiated**

- We donnot need to define the body of abstract methods in a abstract class, even if a abstract class extends another abstract class

- We can define abstract methods inside a abstract class that extends another abstarct class

- a <code>final</code> method cannot be overrided in the subclasses

# interface 02

- We can use <code>default</code> keyword to specify the default implementation of an interface method

- It means that if the implementations does not override the methods, then the default implementation will be used

- Then, it acts like an optional method