package org.abbtech.lesson5.AtLesson;

/*
1. Create a program to model different animals. Implement the following using interfaces and abstract classes:
2. Create an interface named Animal with a method makeSound().
3. Create an abstract class named Mammal that implements the Animal interface.
4. This class should have an abstract method describe().
5. Create concrete classes Dog and Cat that extend Mammal. Implement the makeSound() method for each animal
  (e.g., Dogs bark, Cats meow) and the describe() method to provide a brief description of the animal.*/
public interface Animal {
    void makeSound();
}
