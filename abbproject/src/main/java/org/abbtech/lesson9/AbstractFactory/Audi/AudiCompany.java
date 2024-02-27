package org.abbtech.lesson9.AbstractFactory.Audi;

import org.abbtech.lesson9.AbstractFactory.Interfaces.MyAbstractFactory;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyCar;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyMotorCycle;

public class AudiCompany implements MyAbstractFactory {
    @Override
    public MyCar createCar(String type, double price) {
        return new AudiCar(type, price);
    }


    @Override
    public MyMotorCycle createMotorCycle(String type, double price) {
        return new AudiMotorcycle(type, price);
    }
}
