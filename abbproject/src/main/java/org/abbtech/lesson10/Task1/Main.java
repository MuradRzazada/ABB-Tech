package org.abbtech.lesson10.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt();
                int square = number * number;
                System.out.println("The square of " + number + " is " + square);
                break;
            } catch (InputMismatchException exception) {
                scanner.nextLine();
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        scanner.close();
    }
}

