package src.main.java.org.Practise.OOP.Task7;

//Question:
//Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove
//accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a
//particular customer.


public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Murad","21S6516836851",23.1);

        System.out.println(bank.getAccountInfo());
    }
}
