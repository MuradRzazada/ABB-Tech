package src.main.java.org.Practise.OOP.Task10;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList<String> courses;

    public Student(String name, char grade) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void printStudentDetails() {
        System.out.println("\n Name: "+name);
        System.out.println("Grade: "+grade);
    }
}
