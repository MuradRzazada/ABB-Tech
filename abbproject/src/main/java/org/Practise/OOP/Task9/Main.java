package src.main.java.org.Practise.OOP.Task9;

import java.time.LocalDate;

//Question:
//Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
//and a method to calculate years of service.



public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Eli", 453, LocalDate.parse("2023.02.12"));
        Employee employee2 = new Employee("Ilkin", 500, LocalDate.parse("2024.01.12"));

        employee1.employeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());
        employee2.employeeDetails();
        System.out.println("Years of Service: " + employee2.getYearsOfService());
    }
}
