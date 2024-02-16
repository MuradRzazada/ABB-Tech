package src.main.java.org.abbtech.Lesson7.Hometask;

import src.main.java.org.abbtech.Lesson7.Hometask.Employee;

public class FullTimeEmployee extends Employee {

    private double salary;


    public FullTimeEmployee(String name, int experience,double salary) {
        super(name, experience);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "salary=" + salary +
                '}';
    }
}
