package src.main.java.org.Practise.OOP.Task2;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Line", "Husky");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        System.out.println(dog1.getName() + "is a " + dog1.getBreed());
        System.out.println(dog2.getName() + "is a " + dog2.getBreed());

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");


        dog1.setBreed("Golden Retriever");
        dog2.setName("Charlie");

        System.out.println(dog1.getName() + "is now a " + dog1.getBreed());
        System.out.println(dog2.getName() + "is now a " + dog2.getBreed());
    }

    //Question:
//Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of
//the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods
// and print the updated values.
}
