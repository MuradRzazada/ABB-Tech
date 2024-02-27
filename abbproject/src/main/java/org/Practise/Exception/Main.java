package org.Practise.Exception;

public class Main {
    public static void main(String[] args) {
        int arr[] = {132, 1, 331, 3, 4, 51, 46, 18, 84, 68, 45};
        try {
            System.out.println(3);
        } catch (ArrayIndexOutOfBoundsException example) {
        } finally {
            System.out.println(arr.length);
        }


    }
}
