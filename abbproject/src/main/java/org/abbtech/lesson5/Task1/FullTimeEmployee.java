package src.main.java.org.abbtech.lesson5.Task1;

public class FullTimeEmployee implements Employee {
   private String name;
   private int ID;

    private double monthlySalary;
    
    public FullTimeEmployee(String name, int ID, double monthlySalary) {
        this.name = name;
        this.ID = ID;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Full Time Employee : Name: "+name+" ID: "+ID +" Salary: "+calculateSalary());

    }
}
