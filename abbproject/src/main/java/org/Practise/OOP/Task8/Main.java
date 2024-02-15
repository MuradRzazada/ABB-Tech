package src.main.java.org.Practise.OOP.Task8;

//Question:

//Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to
//change the color and check for red or green.

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);


        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());

        light.changeColour("Green");

        System.out.println("\n");

        System.out.println("The light is now green: " + light.isGreen());
        System.out.println("The light duration is: " + light.getDuration());

        light.setDuration(15);

        System.out.println("The light duration is now: " + light.getDuration());

    }
}
