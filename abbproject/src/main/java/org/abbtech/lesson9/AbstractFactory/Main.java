package org.abbtech.lesson9.AbstractFactory;

import org.abbtech.lesson9.AbstractFactory.Audi.AudiCompany;
import org.abbtech.lesson9.AbstractFactory.BMW.BMWCompany;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyAbstractFactory;
import org.abbtech.lesson9.AbstractFactory.Interfaces.MyCar;
public class Main {
    public static void main(String[] args) {
        MyAbstractFactory bmwCompany = new BMWCompany();
        MyAbstractFactory audiCompany = new AudiCompany();
        MyCar bmw = bmwCompany.createCar("BMW e60",17000);
        MyCar audi = audiCompany.createCar("Audi RS 6",85000);

        System.out.println(bmw);
        System.out.println(audi);

    }
}
