package org.abbtech.lesson10.Task2;

import java.util.Scanner;

import static org.abbtech.lesson10.Task2.CustomException.checkInput;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age between 0 and 100:");
        int user = scanner.nextInt();
        try {
            checkInput(user);
            System.out.println("Input accepted: " + user);
        } catch (InvalidInputException invalidInputException){
        } finally {
            scanner.close();
        }
    }
}
