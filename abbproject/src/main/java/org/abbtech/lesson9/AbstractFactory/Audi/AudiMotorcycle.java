package org.abbtech.lesson9.AbstractFactory.Audi;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyMotorCycle;

public class AudiMotorcycle implements MyMotorCycle {

    private String type;
    private double price;

    public AudiMotorcycle(String type, double price) {
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
