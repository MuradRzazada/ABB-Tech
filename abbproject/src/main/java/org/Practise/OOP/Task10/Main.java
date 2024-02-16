package src.main.java.org.Practise.OOP.Task10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Carolus Vitali", (char) 11);

        System.out.println("Student Details: ");
        student1.printStudentDetails();

        student1.addCourse("Math");
        Student student = new Student("Carolus Vitali", (char) 11);

    }
}
