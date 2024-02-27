package org.Practise.Exception;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Black");
        list.add("Blue");
        list.add("Dark");
        list.add("Yellow");
        list.add("White");
        list.add("White");
        list.add(null);
        list.add(null);

        List<String> list2 = new ArrayList<>();

        list2.add("Red");
        list2.add("Black");
        list2.add("Blue");
        list2.add("Dark");
        list2.add("Yellow");
        list2.add("White");
        list2.add("White");
        list2.add(null);
        list2.add(null);

        System.out.println(list.hashCode() + " "+list2.hashCode());









    }


}
