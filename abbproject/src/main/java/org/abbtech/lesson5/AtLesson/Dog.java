package src.main.java.org.abbtech.lesson5.AtLesson;


public class Dog extends Mammal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    void describe() {
        System.out.println("Dog is animal");
    }
}
