package org.abbtech.lesson5.Task2;

public class Outer {
    public   static class Inner {
        private static int count = 0;

        public  Inner() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }
}