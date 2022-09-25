# Introduction

- Arrays and collections are data structures that group data in a variable

- Then, we group a bunch of information in one memory address

# Array

- An array is a static structure

- An array must contain elements with the same type

- It means that an array is a homegenous data structure

- An array is a indexed structure, where the index start on zero

- An array is an object

- An array is a unidimensional structure

- It means that we have attributes and behaviors associated with an array

- An array is a data structure with fixed size

- We have to specify the number of elements the array will comport in its definition

- The array cannot change its lentgth after its creation

- But, we can create another array with different size and associate to the same variable that storaged another older array with same or different size

- An array is placed in a memory address

- We cannot alter the array at the same memory address, but we can create another array, which will be storaged in another memory address

- Example
```java
// <type[] variable = <type>[<number_of_elements>];
double[] array = new double[6];

// variable[index] = value;
array[2] = 10.0;
array[1] = 10.0;

System.out.println(array[5]);
```

- Obs: it has nothing to do with Array, but remember that ...

*A variable of primitive type (int, double, char, etc) doesn't have dot operator, 'cause it isn't an object*

- Obs: we don't have a multimensional array, but ...

*We can create array of arrays to use like a matrix or any multidimensional data structure we want*

- Example of array of array
```java
// an 2x2 structure (2d)
double[][] = double[10][8]

// an 3x3 structure (3d)
double[][][] = double[5][3][7]

// and so on
```

- An array is initialized with default values according to the type

- For example, the default value to <code>double</code> id <code>0.0</code>

# Foreach

- We have an optimezed way to iterate over an array: <code>foreach</code>

```java
double[] grades = {9.6, 10, 3.5, 4, 9}

for(double grade: grades)
{
	// code
}
```

# Array challenge

- Create an array of grades

- The number of grades is determined by the user

- Populate the array by using canonical <code>for</code> loop

- Calculate the mean grade by using <code>foreach</code> loop

```java
Scanner scanner = new Scanner(System.in);

int numberOfGrades = 0;
System.out.println("Number of grades: ");
numberOfGrades = scanner.nextInt();

double[] grades = new double[numberOfGrades];
for(int i = 0; i < grades.length; i ++) {
	System.out.println("Grade: ");
	grades[i] = scanner.nextDouble();
}

double sumGrades = 0;
for(double grade: grades) {
	sumGrades += grade;
}
double meanGrade = sumGrades / grades.length;
System.out.println("Mean grade: " + meanGrade);
```

# Matrix Challenge

- Create an array of the students

- Create an array of grades per student 

- Calculate the mean grade of the classroom

# Equals and hashcode

- There is a way to compare equality between objects

- When we compare objects we compare memory address

- Then, <code>obj1 == obj2</code> will raises <code>false</code>

- Whe we compare primitive types, like this <code>3.2 == 3.2</code> ...

- It compares the values itself

- But, how to compare objects ?

- We compare objects using <code>equals</code> method

- It is a method that is builtin in all objects

- The sintax is ...

```java
obj1.equals(obj2)
```

- But, by default, equals acts like <code>obj1 == obj2</code>

- There is another method, called <code>hashcode</code>

- Another thing is that java has a method used to find elements in a set

- This method is called <code>hashSet</code>

- In <code>hashSet</code>, the <code>hashcode</code> concept is useful

- The <code>hashcode</code> concept is useful to find elements in lists

- <code>hashcode</code>	returns an <code>int</code>

- <code>equals</code> returns a <code>boolean</code>

- <code>equals</code> compares attribute by attribute

- Then, <code>equals</code> is slow, because it compares a *set of attributes*

- <code>hashcode</code> compares only attributes that may be equal

- Then, <code>hashcode</code> is faster, beacause it compare a *subset of attributes*

- Whats's the relationship between <code>hashcode</code> and <code>equals</code> ?

- Answer: **Using equals only when hashcode matches makes the comparison faster**

- In resume ...

1. <code>==</code> and <code>equals</code> compare the memory address

2. <code>equals</code> can be reimplemented using our own equality criteria

3. We should use <code>hashcode</code> when implementing <code>equals</code>

# Collecions

- In contrast of arrays, a collection has variable size

- Then, a collection can grow up along the code

- We can, but we don't need to say the size of a collection during its definition

- A collection may have elements of different types, but we sholdn't do this

- We shold have a collection with elements of only one type (homogenous)]

- We can't have primitive types inside collections

- To achieve this, we cound use an array or a wrapper

- Examples of wrapper

```txt
int 	- Integer
double	- Double
boolean - Boolean
char 	- Character
```

- Kinds of collections

## Set
```
- Is not sorted
- Is not indexed
- Does not allow repetitions
```

## List
```
- Indexed
- Accepts repetitions
```

## Map
```
- Key/Value mapping
- Does not allow key repetitions
```

## Queue
```
- Implements a queue
- First In / First Out (FIFO)
```

## Stack
```
- Implements a stack
- Last In / First Out (LIFO)
```

---

We also have vectors, but these ones are the most important

# Set

- Is an interface, not a class

- <code>HashSet</code> is a class which implements this interface

- Can be heterogeneous (not recommended)

- Can be homogeneous (recommended)

- Does not accept duplicated objects

- Can be ordered

- Is not indexed

- A **autowrapper** occurs (cast primitive to Object) when add a primitive element to a Set

- Set only storages Objects. It accepts all kinds of Objects, even heterogeous one

- If we want onlye homogenous elements in a set, we should use ...

```
// Both works the same
Set<ClassName> set = new HashSet<ClassName>();
Set<ClassName> set = new HashSet<>();
```

- The notation above is called *Generics*

- It sounds non sense a specific <code>Set</code> allow only element of specific Class

- But it makes sense. It will be discussed later

- We can create lists of our own classes

- Create homogeneous set facilitate the <code>foreach</code> usage

- <code>HashSet</code> does not obbeys insertion order. It is alphabetically ordered

- If we want a <code>Set</code> which respects insertion order we must use <code>TreeSet</code>

# List

- A list can be bouht heterogeneous and homegeneous

- A list accepts duplicated objects

- A list is ordered

- A list is indexed

- We'll see that a generic helps to associate a type of elements inside a collection

# Queue

- First in, First Out - FIFO

- <code>Queue</code> is an interface in java

- <code>LinkedList</code> class implements <code>Queue</code> interface

- <code>LinkedList</code> - addition methods

```java
.add(element) // raise an exception when the queue is fullfilled
.offer(element) // return false when the queue is fullfilled
```

- <code>LinkedList</code> - read the next element, but remain it on the queue

```java
.peek() // raise an exception when the queue is empty (return null)
.element() // return false when the queue is empty
```

- <code>LinkedList</code> - take the next element and remove it from the queue

```java
.poll() // returns null when the queue is empty, but does not raise an exception
.remove() // raise an exception when the queue is empty
.contains(element) // check if an element is in the queue
```
- <code>LinkedList</code> - others

```java
.clear() // clear the queue
.isEmpty() // check if is empty
```

# Stack

- LIFO - *Last In, First Out*

# Map

```java
Map<keyType, value> obj = new HashMap<keyType, valueType>;
Map<keyType, valueType> obj = new HashMap<>;
```

- Methods

```java
.put() // Because it can create a new item or refreshing existing one
.size()
.isEmpty()
.keySet() // the set of keys that the map contains
.values() // only the values
.entrySet() // key and values at the same time
.containsKey() // return a boolean
.containsValue() // returns a boolean
.get() // get a value from its key
.remove(key) // return the removed value or null
.remove(key, value) // remove a boolean

// To an individual key value item
.getKey()
.getValue()
```

- We can iterate over key, value, or both at the same time

# Hash

- The hashcode is the first thing that a comparison checks

- We should override the hashcode in a class

- A hashcode should be as different a possible

- The lack of hashcode may cause bug in comparisons

- The comparison first check hashcode

- Then, for the objects that have the same hashcode, the equals is called

- Then, the lack of hashcode will cause always false in comparisons

- Then, we have to implement/override both equals and hashcode

- We should use equals and hashcode generated by our ide
- A HashSet is faster than a List

- Methods

```java
.add()
.contains()
```