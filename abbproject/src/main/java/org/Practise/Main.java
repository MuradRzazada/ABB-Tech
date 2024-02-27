package org.Practise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter inforamtion: ");
        String  s = sc.nextLine();
    if (s == " "){
        throw new Exception("Adi duzgun daxil edin! ");
    }
        System.out.println(s);
    }
}
