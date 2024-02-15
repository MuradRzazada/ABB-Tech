package src.main.java.org.abbtech.lesson4.Task2;

public class Counter {

    //static field
    public static int instanceCount;

    public Counter() {

        instanceCount++;
    }

    //static metod
    public static int getInstanceCount() {

        return instanceCount;
    }
}
