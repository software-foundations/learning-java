# Introduction

- It is about <code>loops and conditionals</code>

- It is important to learn algorithms

# If

- Evaluate a boolean expression and change the flow acording to this

# If Challenge

```java
package control;

public class IfChallenge {

	public static void main( String[] args ) {

		double grade = 1.3;

		if ( grade >= 9.0 ); {

			System.out.println("CONGRATULATIONS");
			System.out.println("APPROVED");

		}
	}
}
```

- output

```console
CONGRATULATIONS
APPROVED
```

- This output happens 'cause <code>;</code> break the instruction

- The <code>{...}</code> block has no ligation with the if conditional

- Then, the if conditional ends with the <code>;</code>

- Then, the block <code>{...}</code> is executed

- The <code>;</code> is a valid code sentente

- Just remove the <code>;</code> to solve the issue

```java
package control;

public class IfChallenge {

	public static void main( String[] args ) {

		double grade = 1.3;

		// Do not use ; in if statements
		// But, this have a exception that will be discussed later
		if ( grade >= 9.0 ) {

			System.out.println("CONGRATULATIONS");
			System.out.println("APPROVED");

		}
	}
}
```

# If and Else

- <code>if</code> execute the first block when the condition is true

- <code>else</code> execute the second block (when the condition is false)

# If Else If

- To more than 2 blocks to be executing according to more than one conditional

# If Else Challenge

```
Sunday -> 1
...
saturday -> 7
```

- Tip: we can use <code><string>.equalsIgnoreCase()</code>

# While

- Execute a block or a sentence while some condition is satisfied

## Determined while

- Like a for loop

## Indetermined while

- Do not knows the number of iterations

# For

- Controlled loop

# Do While

```java
do {

}

while ( <some_boolean_expression> )
```

# While Challenge

# For2

- We can make nested for loops

# For3

- Variables have block scope

# For challenge

- We cannot use numerical value to control the loop

- expected output

```console
#
##
###
####
#####
```

# Switch

- Use this instead of many if/else

- We cannot have duplicated cases

- We can group cases

- We cannot have range (<= and >=) in case expression

- default clause can be at any position (start, middle, or end)

## Without Break

- Less used

## With Break

- More used

# Break1

- He have 2 important reserved keywords in java: <code>break</code> and <code>continue</code>

- <code>break</code> continues the flow, but break it, breaking the scope

- <code>break</code> breaks the scope of the following control sctructures

```java
for
while
switch
```

- <code>break</code> does not act in <code>if</code> scope

# Continue

- <code>continue</code> continues the flow

- <code>continue</code> comes back to the loop scope that it has effect

- <code>continue</code> stops the loop, restarting it to the next iteration

# Break 2 Rotuled break

- <strong>avoid this kind of</strong> <code>break</code> <strong>usage</strong>

- It acts like <code>GOTO</code> statements

```java
public class Break2RotuledBreak {

	public static void main ( String[] args ) {

		// outer is a label (alias) for the for loop

		outer: for (int i = 0; i < 3; i ++) {

			inner: for (int j = 0; j < 3; j ++) {

				if (i == 1) {
					break outer;
					// break;
				}

				System.out.printf("[%d %d] ", i, j);
			}

			System.out.println();
		}

		System.out.println("END");
	}
}
```

# Continue 2 Rotuled continue

- acts at the same way of rouled break