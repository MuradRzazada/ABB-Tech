package src.main.java.org.abbtech.lesson5.AtLesson;

abstract class Mammal implements Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }

    abstract void describe();

}
