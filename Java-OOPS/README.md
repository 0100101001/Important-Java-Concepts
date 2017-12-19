# Object Oriented Programming in Java

Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance. Main Concepts - Inheritance, Polymorphism, Abstraction, Encapsulation.

## Java Naming Conventions :

![java naming conventions](https://user-images.githubusercontent.com/2780145/34084497-913ac9a0-e3a7-11e7-8eb9-5a733a330ea6.png)

## Constructors vs Methods

![java constructor vs java methods](https://user-images.githubusercontent.com/2780145/34126228-e3c983ca-e45e-11e7-938a-b8549f29aab7.png)

## Types of Inheritance (Supported through Class)

![types of inheritance](https://user-images.githubusercontent.com/2780145/34169728-542d8684-e50e-11e7-82a1-7b2b1d37f73a.jpg)

## Types of Inheritance (Supported through Interface only)

To reduce the complexity and simplify the language, multiple (hybrid is also multiple) inheritance is not supported in java through classes. Consider a scenario where A, B and C are three classes. The C class inherits A and B classes. If A and B classes have same method and you call it from child class object, there will be ambiguity to call method of A or B class. Since compile time errors are better than runtime errors, java renders compile time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.

![multiple](https://user-images.githubusercontent.com/2780145/34169841-c1c4ad6c-e50e-11e7-90df-fdb2f63ae9b5.jpg)
