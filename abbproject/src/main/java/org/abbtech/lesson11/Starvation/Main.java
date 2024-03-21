package org.abbtech.lesson11.Starvation;

public class Main { public static void main(String[] args) {
        System.out.println("Start of Main thread");
        Starvation mt[] = new Starvation[10];
        for (int i=0; i<mt.length; i++) {
            mt[i] = new Starvation(); 
            mt[i].start();
        }
        System.out.println("End of Main thread");
    }
}
