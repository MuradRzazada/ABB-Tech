package src.main.java.org.abbtech.lesson4.AtLesson;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
    }
    public static void  task1(){
        Auto car = new Auto();
        car.model = "Maceratti";
        car.year = 2015;
        car.startEngine();
    }

    public static void task2() {
        Person person = new Person();
        person.name = "Jabir";
        person.age = 22;
        System.out.println("Person name: " + person.name);
        System.out.println("Person age: " + person.age);
    }
}
