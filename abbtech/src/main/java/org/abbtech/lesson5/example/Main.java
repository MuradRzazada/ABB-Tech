package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("Red");
        list.add("Yellow");
        list.add("Dark Blue");
        list.add("Blue");
        list.add("Orange");
        list.add("Black");
        list.add("White");
        list.add(null);
        list.add(null);
        list.add(null);

        for (String elmt : list){
            System.out.println(elmt);
        }











//        HashSet<String> list1 = new HashSet<>();
//        list1.add("Red");
//        list1.add("Yellow");
//        list1.add("Dark Blue");
//        list1.add("Blue");
//        list1.add("Orange");
//        list1.add("Black");
//        list1.add("White");
//
//
//        HashSet<String> list2 = new HashSet<>();
//        list2.add("Red");
//        list2.add("Yellow");
//        list2.add("Dark Blue");
//        list2.add("Blue");
//        list2.add("Orange");
//        list2.add("Black");
//        list2.add("White");
//
//        System.out.println(list1.hashCode());
//        System.out.println(list2.hashCode());
    }
}
