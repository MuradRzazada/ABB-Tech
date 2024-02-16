package src.main.java.org.abbtech.lesson6;

public class Main {
    public static void main(String[] args) {

        GenericStorage<Teacher> storage1 = new GenericStorage<>();
        GenericStorage<Student> storage2 = new GenericStorage<>();

        Student student = new Student("Murad", 19);
        Teacher teacher = new Teacher("Elcin", 25);


    }
}
