package org.abbtech.lesson9.AbstractFactory.BMW;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyAbstractFactory;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyCar;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyMotorCycle;

public class BMWCompany implements MyAbstractFactory {
    @Override
    public MyCar createCar(String type, double price) {
        return new BMWCar(type,price);
    }

    @Override
    public MyMotorCycle createMotorCycle(String type, double price) {
        return new BMWMotorCycle(type, price);
    }
}
