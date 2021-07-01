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
$ git clone https://github.com/DiBarrera/job-search
```

You will find the following files:

- **A gradle directory**, that contains the files necessary for the operation of the application.
- **The src directory** containing the main files of the job-search project development.



<!-- Topics reviewed -->
## Topics reviewed

In this repository you will find sql files that were varied exercises to practice searching for data in databases in different ways. The topics are made up of the different ways to do these searches. Topics such as a brief history of databases, the different types of databases, services, and other fundamental topics for a better general understanding about databases were also included.

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
Lambda functions are anonymous functions, they have no name..
```markdown
useAFunction((x, y) -> x * y);
}
``` 



 <!-- Acquired skills -->
## Acquired skills

- Develop in Java with immutable objects and functions.
- Design functions for data transformation.
- Discover Java classes and packages for functional programming.
- Create a fully functional application.










---------
