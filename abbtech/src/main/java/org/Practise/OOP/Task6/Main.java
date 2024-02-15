package org.Practise.OOP.Task6;

//Question:

//Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
//and methods to calculate and update salary.


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob Harley ", "engineer", 262);

        employee1.printEmployeeDetails();

        employee1.raiseSalary(250);

        System.out.println("\n After raising salary: ");

        employee1.printEmployeeDetails();
    }
}
