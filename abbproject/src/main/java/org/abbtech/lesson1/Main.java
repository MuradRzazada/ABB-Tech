package src.main.java.org.abbtech.lesson1;

public class Main {

    public static void main(String[] args) {
        task1();


    }


    public static void task1() {
        int a = 10;
        Integer b = a;
        System.out.println(b);
        Integer c = 20;
        int e = c;
        System.out.println(c);

    }

    public static void task2() {
        int age = 10;
        System.out.println(age);
        double a = 2.5;
        System.out.println(a);
        char grade = 88;
        System.out.println(grade);
        float myNum = 56.15f;
        System.out.println(grade);
        boolean f = true;
        System.out.println(f);

    }

    public static void task3() {

        double d = 12.0;
        int i = (int) d;
        System.out.println("Orginal double Value:" + d);

        System.out.println("Orginal int Value:" + i);

    }

}
