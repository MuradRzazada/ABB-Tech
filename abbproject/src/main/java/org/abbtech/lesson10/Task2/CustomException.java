package org.abbtech.lesson10.Task2;

public class CustomException {
    public static void checkInput(int input) throws InvalidInputException {
        int min = 0;
        int max = 100;
        if(input<min || input>max){
            throw new InvalidInputException("Input value should be between " + min + " and " + max);
        }
    }
}
