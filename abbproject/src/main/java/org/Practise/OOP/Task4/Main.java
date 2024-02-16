package src.main.java.org.Practise.OOP.Task4;

//Question:

//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this
//attribute. Calculate the area and circumference of the circle.


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(8);

        System.out.println("Radius of the circle is: " +circle.getRadius());
        System.out.println("The area of the circle is: " +circle.getArea());
        System.out.println("The circumference of the circle is: " +circle.getCircumference());

    }
}
