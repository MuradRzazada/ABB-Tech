package org.abbtech.lesson9.AbstractFactory.BMW;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyCar;

public class BMWCar implements MyCar {

    private String colour;
    private double price;

    public BMWCar(String colour, double price) {
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
