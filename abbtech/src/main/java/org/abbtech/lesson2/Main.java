package org.abbtech.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //hometask1();
        //hometask2();
        //hometask3();
        //hometask5();
        //hometask6();
        //hometask8();
        //hometask9();
        //hometask10();

    }

    public static void hometask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }

    // 0-dan verilmish edede qeder sade ededleri chap et.
    public static void hometask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            if ((num % i == 0) && (num % 1 == 0)) {
                System.out.println(num);
            }
        }
    }

    //Verilmish ededin butun ededleri cemini tap.
    public static void hometask3() {
        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = scanner.nextInt();
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        System.out.println("Sum of Digits " + sum);
    }

    //Ededin reqemlerinin sayini tapin.//12345
    public static void hometask5() {
        int count = 0, number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();
        for (int i = 0; number != 0; number /= 10, ++count) ;
        {
            System.out.println("Number of digits: " + count);
        }
    }

    public static void hometask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month's number: ");
        int monthNumbers;
        monthNumbers = scanner.nextInt();
        switch (monthNumbers) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("Octomber");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

    public static void hometask8() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+, -, *, /): \"");
        operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        double result = calculate(num1, num2, operator);

        if (result == Double.MAX_VALUE) {
            System.out.println("Error: Invalid operator or division by zero.");
        } else {
            System.out.println("Result: " + result);
        }
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.MAX_VALUE;
                }
            default:
                return Double.MAX_VALUE;
        }

    }

    //Calculate the factorial of the number.
    public static void hometask9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int i = 1, factorial = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of the number: " + factorial);

    }

    static public void hometask10() {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}