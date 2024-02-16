package src.main.java.org.abbtech.Lesson7;

public class PartTimeEmployee extends Employee {

    private int hours;
    private double hoursSalary;


    public PartTimeEmployee(String name, int experience, int hours, double hoursSalary) {
        super(name, experience);
        this.hoursSalary = hoursSalary;
        this.hours = hours;
    }


    public double getSalary() {
        return hoursSalary*hours;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "salary=" + getSalary()+
                '}';
    }
}
