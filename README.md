# Functional programming

## Java 8 introduced a functional paradigm with Lambda functions. With this approach you can now be able to create functions that process data regardless of its type, you can develop highly efficient and functional software.



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#Overviwe">Overviwe</a>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
    </li>
    <li><a href="#Topics-reviewed">Topics reviewed</a></li>
    <li><a href="#Basics">Basics</a></li>
    <li><a href="#Acquired-skills">Acquired skills</a></li>
  </ol>
</details>



<!-- Overviwe -->
## Overviwe

In this repository you will find a brief summary of what was learned in the [platzi](https://platzi.com/cursos/java-funcional/) course of Functional programming with Java SE.

---------

This repository shows what has been learned about functional programming applied with java. Topics such as lambda functions, or types of interfaces, were explored in greater depth, but new concepts such as Immutability, Stream listeners, Parallelism, Collectors among others were also learned.

---------

This repository is divided into the following parts.
* The steps to clone the repository and be able to view it.
* The main topics seen in the course
* Some of the basics concepts taught.
* Skills acquired at the end of the course.



<!-- GETTING STARTED -->
## Getting Started

### For this repository, IntelliJ Idea was used as IDE

### For this repository, Gradle was used as the build automation tool

### The libraries used for this repository are: [JCommander](https://mvnrepository.com/artifact/com.beust/jcommander/1.78), [Feign-core](https://mvnrepository.com/artifact/io.github.openfeign/feign-core/10.9), and [Feign-gson](https://mvnrepository.com/artifact/io.github.openfeign/feign-gson/10.9).

## Setup

- Fork this repo
- Clone this repo

```shell
$ mkdir functional-java
$ cd functional-java
$ git clone https://github.com/DiBarrera/job-search.git
```

You will find the following files:

- **A gradle directory**, that contains the files necessary for the operation of the application.
- **The src directory** containing the main files of the job-search project development.



<!-- Topics reviewed -->
## Topics reviewed

In this repository you will find the progress in commits on the use of functional programming, covering the different topics listed below.

### Topics

- What is Functional Programming.
- Functions, delving into the subject.
- Functions, as first-class citizens.
- Pure functions.
- Side effects.
- High order functions.
- Lambda functions.
- Immutability.
- Predicate.
- Consumer and Spplier.
- Operators and BiFunctions.
- SAM (Single Abstract Method).
- FunctionalInterface.
- Reference operator.
- Type inference.
- Default methods in interfaces.
- Chaining.
- Composition of functions.
- Optional class.
- Streams.
- Specific type stream and parallelism.
- Terminal operations.
- Intermediate operations.
- Collectors.
- Final operations.
- Gradle.
- JCommander, Feign-core and Feign-gson.
- Functions for transforming data.



<!-- Basics -->
## Basics

#### Pure functions
Pure functions generate the same result for the same parameter.
```markdown
public static int sum(int x, int y) {
  return x + y;
}
``` 

#### Lambda functions
Lambda functions are anonymous functions, they have no name.
```markdown
useAFunction((x, y) -> x * y);
}
``` 

#### Creating a function
Functions do not receive or return primitive data as parameters, but objects.
```markdown
// Parameter
    |     // Data that returns
    |       |       // Name
    |       |         |
Function<Integer, Integer> square = new Function<Integer, Integer>() {
  @Override   // <--- Function in an interface, which allows us to overwrite its method.
  public Integer apply(Integer x) {
    return x * x;   // <--- Body of the function
  }
}
``` 

#### Invoke the function
Functions do not receive or return primitive data as parameters, but objects.
```markdown
System.out.println(square.apply(5));   // <--- The apply() method receives the parameter required by the function and executes.
``` 

#### Predicate
The predicate interface returns a boolean object.
```markdown
                            // Parameter
                            |
Predicate<Integer> isEven = x -> x % 2 == 0;
                                 |
                                // Evaluate if the expression is true
isEven.test(4);
``` 

#### Consumer.
Consumer is a generic interface that allows us to generate simple functions. It takes or consumes a data but does not return any value.
```markdown
  // Data to be consumed
    |                     // Name
    |                      |              // Parameter
    |                      |              |
Consumer<CLIArgument> consumerHelper = cliArguments1 -> {
  if(cliArguments1.isHelp()) {              // How the data
    System.out.println("Data requested");   // will be consumed
  }
  consumerHelper.accept(cliArguments);
}               |
                // To invoke the conusmer we use the accept() method
``` 

#### Supplier.
Supplier is an interface that does not allow you to create functions that do not require knowing the origin of the data. It does not receive a parameter but it returns a data type.
```markdown
          // Data to be generated
          |               // Name
          |               |        // Indicates that it does not receive any data
          |               |        |
Supplier<CLIArguments> generator = () -> nes CLIArguments();
  return generator.get();
            |
            // Return the supplier with the get method
``` 

#### UnaryOperator.
UnaryOperator is a type of operator that works on a single type of data and returns the same type of data.
```markdown
                // Data on which it works
                |       // Name
                |       |       // Parameter
                |       |       |
UnaryOperator<String> quote = text -> "\" + text + "\";
                                      |
                                      // Return
  System.out.println(quote.apply("This is the data"));
``` 

#### BinaryOperator.
BinaryOperator Receive two types of data and return two types of data.
```markdown
                                   // Parameters
                                   |          // Return
                                   |          |
BinaryOperator<Integer> multiply = (x, y) -> x * y;
  System.out.println(multiply.apply(2, 3));
``` 

#### BiFunction.
Another very common case is that the parameters required by our functions are not necessarily of the same type, in these situations BiFunction is of great help.
```markdown
            // Data to be received
            |         |       // Data to be received
            |         |       |
BiFunction<String, Integer, String> leftPad = (s, i) -> String.format("%" + i + "s", s);
                                                |           |
                                                |           // Return
                                                // Parameters

System.out.println(
  leftPad.apply("Hello", 10)
);
``` 



 <!-- Acquired skills -->
## Acquired skills

- Develop in Java with immutable objects and functions.
- Design functions for data transformation.
- Discover Java classes and packages for functional programming.
- Create a fully functional application.
- Pure functions.
- Side effects.
- High order functions.
- Lambda functions.
- Data immutability.
- Predicate.
- Supplier.
- UnaryOperator and BinaryOperator.
- BiFunctions.
- SAM (Single Abstract Method).
- FunctionalInterface.
- Reference operator.
- Default methods in interfaces.
- Composition of functions.
- Optional class.
- Streams.
- Specific type stream and parallelism.
- Terminal operations.
- Intermediate operations.
- Collectors.
- Final operations.









---------
