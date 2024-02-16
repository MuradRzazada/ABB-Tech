package src.main.java.org.abbtech.lesson6;

public class Teacher   {
    private int id;
    private String name;
    private int age;

    private static int idIncrement=0;
    public Teacher(String name, int age) {
        this.id = idIncrement++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
