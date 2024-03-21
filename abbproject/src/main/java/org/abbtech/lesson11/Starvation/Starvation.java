package org.abbtech.lesson11.Starvation;

public class Starvation extends Thread {
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " Started");
        synchronized (Starvation.class) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
            }
        }
        System.out.println(threadName + " End");
    }
}
