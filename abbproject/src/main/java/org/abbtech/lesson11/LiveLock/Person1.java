package org.abbtech.lesson11.LiveLock;

public class Person1 {
    private boolean isBusy;

    public boolean isBusy() {
        return isBusy;
    }

    public void makeCall(Person2 person2) {
        while (!person2.isBusy()) {
            System.out.println("Person 1 is calling Person 2 ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isBusy = true;
    }
}
