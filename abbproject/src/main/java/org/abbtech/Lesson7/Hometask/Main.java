package src.main.java.org.abbtech.Lesson7.Hometask;

import java.util.*;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Murad", 1, 4, 10);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Ilkin", 2, 4, 15);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("Ehmed", 3, 4, 20);
        PartTimeEmployee partTimeEmployee4 = new PartTimeEmployee("Serxan", 5, 4, 40);
        PartTimeEmployee partTimeEmployee5 = new PartTimeEmployee("Orxan", 2, 4, 15);
        PartTimeEmployee partTimeEmployee6 = new PartTimeEmployee("Elcin", 4, 4, 25);
        PartTimeEmployee partTimeEmployee7 = new PartTimeEmployee("Cabir", 3, 4, 20);

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Elcin", 4, 2000);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Eli", 5, 2500);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("Samir", 6, 3000);
        FullTimeEmployee fullTimeEmployee4 = new FullTimeEmployee("Memmed", 2, 3000);
        FullTimeEmployee fullTimeEmployee5 = new FullTimeEmployee("Nihad", 3, 2500);
        FullTimeEmployee fullTimeEmployee6 = new FullTimeEmployee("Xaliq", 2, 3000);
        FullTimeEmployee fullTimeEmployee7 = new FullTimeEmployee("Nesir", 1, 1000);

        employees.add(fullTimeEmployee1);
        employees.add(fullTimeEmployee2);
        employees.add(fullTimeEmployee3);
        employees.add(fullTimeEmployee4);
        employees.add(fullTimeEmployee5);
        employees.add(fullTimeEmployee6);
        employees.add(fullTimeEmployee7);
        employees.add(partTimeEmployee1);
        employees.add(partTimeEmployee2);
        employees.add(partTimeEmployee3);
        employees.add(partTimeEmployee4);
        employees.add(partTimeEmployee5);
        employees.add(partTimeEmployee6);
        employees.add(partTimeEmployee7);

        List<Employee> midEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getExperience() > 2) {
                midEmployees.add(emp);
            }
        }
        midEmployees.sort(Comparator.comparing(Employee::getExperience));
        System.out.println("Employees : " + midEmployees);

        Map<String, Employee> employeeMap = new HashMap<>();
        employeeMap.put("Minimum", midEmployees.get(0));
        employeeMap.put("Maximum", midEmployees.get(midEmployees.size() - 1));

        System.out.println("Minimum and maximum salary : " + employeeMap);



    }
}
