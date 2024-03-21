package org.abbtech.lesson11.LiveLock;

public class LiveLockExample {
    static final Person2 PERSON_2 = new Person2();
    static final Person1 PERSON_1 = new Person1();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                PERSON_1.makeCall(PERSON_2);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                PERSON_2.makeCall(PERSON_1);
            }
        }).start();
    }
}
