package org.abbtech.lesson5.AtLesson;

import org.abbtech.lesson5.AtLesson.Animal;

abstract class Mammal implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    abstract void describe();

}
