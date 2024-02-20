package src.main.java.org.abbtech.lesson5.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Murad", 111, 300.0);
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Elcin", 222, 5, 20);

        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            employee.displayDetails();
        }
    }
}
