package org.abbtech.lesson10.Task2;

import java.util.Scanner;

public class Main {
    public static void checkInput(int input) throws InvalidInputException {
        int min = 0;
        int max = 100;

        if (input < min || input > max) {
            throw new InvalidInputException("Input age should be between " + min + " and " + max);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age between 0 and 100:");
        int user = scanner.nextInt();
        try {
            checkInput(user);
            System.out.println("Input accepted: " + user);
        } catch (InvalidInputException invalidInputException){
            System.out.println("Invalid input: " + invalidInputException.getMessage());

        }
    }
}
