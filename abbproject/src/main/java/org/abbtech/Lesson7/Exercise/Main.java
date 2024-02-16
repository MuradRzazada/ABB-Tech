package src.main.java.org.abbtech.Lesson7.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> arrayList = new ArrayList<>();
        LinkedList<Person> linkedList = new LinkedList<>();

        arrayList.add(new Person("Homer", "Holland", 2));
        arrayList.add(new Person("Marge", "Lopez", 1));
        arrayList.add(new Person("Bart", "Gonzales", 4));
        arrayList.add(new Person("Lisa", "Rodriguez", 3));
        arrayList.add(new Person("Jack", "Wick", 5));

        linkedList.add(new Person("Miller", "Jonshon", 10));
        linkedList.add(new Person("Carl", "Garcia ", 14));
        linkedList.add(new Person("David", "Silva", 11));
        linkedList.add(new Person("Andre", "Andre", 13));
        linkedList.add(new Person("Jonny", "Otto", 12));

        Collections.sort(arrayList);
        Collections.sort(linkedList);

        arrayList.addAll(linkedList);

        System.out.println("ArrayList size : " + arrayList.size());

        linkedList.clear();

        System.out.println("LinkedList size: " + linkedList.size());
    }
}
