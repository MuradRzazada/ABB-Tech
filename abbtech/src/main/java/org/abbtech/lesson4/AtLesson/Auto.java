package org.abbtech.lesson4.AtLesson;

public class Auto {
    String model;
    int year;

    public Auto(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public Auto() {

    }

    void startEngine(){
        System.out.println("Car starting ...");
    }
}
