package src.main.java.org.abbtech.lesson4.Task4;

import java.util.Scanner;

public class PhoneNumberFormatChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phone number: ");
        String number = scanner.nextLine();
        PhoneNumber phoneNumber = new PhoneNumber(number);
        phoneNumber.setPhoneNumber(number);
        System.out.println("Valid phone number:" + phoneNumber.getPhoneNumber());
    }
}
