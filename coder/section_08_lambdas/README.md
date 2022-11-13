# Introduction

- We will talk about <code>lambda functions</code>

- It can refer to the <code>functional paradigm</code>

- We will talk about some <code>functional programming concepts</code>

- In essence, java is oop

- Since java 8, there were introduced many concepts of funcitonal programming

- The <code>lambda</code> usage is useful when we are working with collections

- Remeber that collections are <code>List, Map, Set, etc</code>

# Lambda function

- It is an annonymous function wihtout name

- We can define a lambda function to matches an interface

```java
public interface InterfaceName {

	double execute(double parameter) {

	}
}
InterfaceName implementationClass = (parameter) -> {
	// method implementation
	// The lambda function mus respect the method signature defined in the interface
	// The lambda function is (parameter) -> ...
};

implementationClass.execute(1);

IntefaceName implementationClass = (parameter) -> parameter;

implementationClass.execute(100);
```

- In java, even a lambda function is still a method when a applyed to an interface

- **The code above works when the interface has only one method**

- In this, case, the concrete class will implements the <code>execute</code>