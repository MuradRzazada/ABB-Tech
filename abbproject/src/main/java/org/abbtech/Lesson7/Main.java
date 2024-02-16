package src.main.java.org.abbtech.Lesson7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("Murad", 1, 4, 10);
        PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Ilkin", 2, 4, 15);
        PartTimeEmployee partTimeEmployee3 = new PartTimeEmployee("Ehmed", 3, 4, 20);

        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("Elcin", 4, 2000);
        FullTimeEmployee fullTimeEmployee2 = new FullTimeEmployee("Eli", 5, 2500);
        FullTimeEmployee fullTimeEmployee3 = new FullTimeEmployee("Memmed", 6, 3000);

        employees.add(fullTimeEmployee1);
        employees.add(fullTimeEmployee2);
        employees.add(fullTimeEmployee3);
        employees.add(partTimeEmployee1);
        employees.add(partTimeEmployee2);
        employees.add(partTimeEmployee3);

        List<Employee> midEmployees = new ArrayList<>();

        for(Employee emp :employees){
            if (emp.getExperience()>2){
                midEmployees.add(emp);
            }
        }
        midEmployees.sort(Comparator.comparing(Employee::getExperience));
        System.out.println("Employees: "+midEmployees);

        Map <String,Employee> employeeMap = new HashMap<>();
        employeeMap.put("Minimum",midEmployees.get(0));
        employeeMap.put("Maximum",midEmployees.get(midEmployees.size()-1));

        System.out.println("Update:" +employeeMap);

    }
}
