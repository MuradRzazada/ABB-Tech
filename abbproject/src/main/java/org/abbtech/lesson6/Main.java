package org.abbtech.lesson6;

public class Main {
    public static void main(String[] args) {
        GenericStorage<Student> studentStorage = new GenericStorage<>();

        Student student1 = new Student(253, "Murad", 19);
        Student student2 = new Student(455, "Ilkin", 25);
        Student student3 = new Student(145, "Ali", 28);
        studentStorage.addItem(student1);
        studentStorage.addItem(student2);
        studentStorage.addItem(student3);

        System.out.println("All Students:");
        studentStorage.displayAllItems();
        System.out.println("\nSearching for student with ID 145:");
        Student foundStudent = studentStorage.searchItem(145);
        if (foundStudent != null) {
            System.out.println("Found Student: " + foundStudent.getName());
        } else {
            System.out.println("Student not found");
        }
        studentStorage.removeItem(student1);
        System.out.println("\nAll Students after removal:");
        studentStorage.displayAllItems();

    }
}
