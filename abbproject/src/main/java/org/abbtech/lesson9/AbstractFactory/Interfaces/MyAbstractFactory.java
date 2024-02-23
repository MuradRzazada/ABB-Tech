package org.abbtech.lesson9.AbstractFactory.Interfaces;

public interface MyAbstractFactory {
    MyCar createCar(String type, double price);
    MyMotorCycle createMotorCycle(String type, double price);

}
