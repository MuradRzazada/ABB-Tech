package org.abbtech.lesson11.LiveLock;

import org.abbtech.lesson11.LiveLock.Person1;

public class Person2 {
    private boolean isBusy;

    public boolean isBusy() {
        return isBusy;
    }

    public void makeCall(Person1 person_1) {
        while (!person_1.isBusy()) {
            System.out.println("Person 2 is calling Person 1 ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
