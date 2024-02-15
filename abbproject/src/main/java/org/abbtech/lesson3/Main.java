package src.main.java.org.abbtech.lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //hometask2();
        //hometask3();
        //hometask4();
        //hometask5();
        //hometask6();
        //hometask7();
        //hometask8();
        //hometask9();
        //hometask10();
    }

    public static void task1() {
        String string = "ABB Tech";
        System.out.println("Orginal String: " + string);
        int index1 = string.charAt(2);
        int index2 = string.charAt(4);

        System.out.println("First position: " + (char) index1);
        System.out.println("Other position: " + (char) index2);
    }

    public static void task2() {
        String str1 = "Hello World";
        String str2 = "ABB Tech";
        System.out.println("String 1:" + str1);
        System.out.println("String 2:" + str2);
        int result = str1.compareTo(str2);
        System.out.println(result);
    }


    // Write a Java program to replace each substring of a given string that matches the given regular expression
    // with the given replacement.
    public static void hometask2() {
        String str = "Office notebooks are heavier ";
        System.out.println("Orginal string: " + str);

        String newStr = str.replaceAll("Office", "Gaming");
        System.out.println("New String: " + newStr);

    }

    //Write a Java program to print the result of removing duplicates from a given string.
    public static void hometask4() {
        String word = "Hello World";
        System.out.println("(The given string is: " + word);

        char[] arr = word.toCharArray();
        String newStr = "";
        for (int i = 0; i < arr.length; i++) {
            if (newStr.indexOf(arr[i]) == -1)
                newStr += arr[i];
        }
        System.out.println("After Removing duplicates characters in string is: " + newStr);
    }


    //Write a Java program to divide a string into n equal parts.
    public static void hometask5() {
        String str = "AAaaBBbbCCcc";
        int len = str.length();
        int n = 2;
        int temp = 0, chars = len / n;
        String[] equalStr = new String[n];

        if (len % n != 0) {
            System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
        } else {
            for (int i = 0; i < len; i = i + chars) {
                String part = str.substring(i, i + chars);
                equalStr[temp] = part;
            }
            System.out.println(n + " equal parts of given string are ");
            for (int i = 0; i < equalStr.length; i++) ;
            System.out.println(equalStr);
        }
    }

    // Write a Java program to reverse words in a given string.
    public static void hometask6() {
        String sentence = "Reverse words in a given string";
        String words[] = sentence.split("\\s");
        String reversedSentence = "";
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            reversedSentence += word + " ";
        }
        System.out.println(reversedSentence);
    }

    //Write a Java program to return the sum of the digits present in the given string. In the absence of digits,
    // the sum is 0.
    public static void hometask7() {
        String word = new String("sjd398jke20ej3");
        System.out.println("The given string is: " + word);
        System.out.println("The sum of the digits in the string is:  " + sumOfDigits(word));
    }

    public static int sumOfDigits(String word) {
        int sum = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                // String string = word.substring(i, i + 1);
                String number = String.valueOf(word.charAt(i));
                sum += Integer.parseInt(number);
            }
        }
        return sum;
    }

    //Write a Java program to sort in ascending and descending order by the length of the given array of strings.
    public static void hometask8() {


    }

    //Write a Java program to find the maximum and minimum value of an array.
    public static void hometask9() {
        int array[] = {4, 56, 2, 78};
        int max = array[0];
        int min = array[0];

        System.out.println("The values you enter: " + Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
            }
            if (array[i] > min) {
                min = array[i];
            }
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }

    //Write a program to count the occurrences of a specific value in an array.
    public static void hometask10() {
        int array[] = new int[]{1, 2, 3, 5, 8, 8, 4, 2, 5, 7, 3, 3};
        int specificNum = 3;
        int occurrence = 0;
        for (int i = 0; i < array.length; i++) {
            if (specificNum == array[i])
                occurrence++;
        }
        System.out.println("Result: " + occurrence);
    }
}