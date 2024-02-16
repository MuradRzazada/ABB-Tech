package src.main.java.org.abbtech.lesson5.Task2;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        System.out.println(Outer.Inner.getCount());
    }
}
