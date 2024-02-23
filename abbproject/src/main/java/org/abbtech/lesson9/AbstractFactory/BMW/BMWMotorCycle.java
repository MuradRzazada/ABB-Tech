package org.abbtech.lesson9.AbstractFactory.BMW;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyMotorCycle;

public class BMWMotorCycle implements MyMotorCycle {
   private String type;
   private double price;

    public BMWMotorCycle(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
