package src.main.java.org.Practise.OOP.Task1;

public class Main {
    public static void main(String[] args) {

        Personn personn1 = new Personn("Jabir",22);
        Personn personn2 = new Personn("Elcin",20);

        System.out.println("Person1: "+personn1.getName()+" is "+personn1.getAge()+" years old.");
        System.out.println("Person2: "+personn2.getName()+" is "+personn2.getAge()+" years old.");
    }
}

//Question:
//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances
//of the "Person" class, set their attributes using the constructor, and print their name and age.