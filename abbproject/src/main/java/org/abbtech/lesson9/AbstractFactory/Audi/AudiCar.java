package org.abbtech.lesson9.AbstractFactory.Audi;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyCar;

public class AudiCar implements MyCar {

    private String color;
    private double price;

    public AudiCar(String color, double price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColour() {
        return color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "AudiCar{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}