package src.main.java.org.abbtech.lesson5.Task1;

public class PartTimeEmployee implements Employee {
    private String name;
    private int ID;
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int ID, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.ID = ID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayDetails() {
        System.out.println("Part Time Employee : Name: " + name + " ID: " + ID + " Salary: "+calculateSalary() );
    }
}
