package org.abbtech.lesson4.Task1;

import org.abbtech.lesson4.Task1.Product;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a product name: ");
        String name = scanner.nextLine();
        Product product = new Product(name);
        System.out.println(product.getProductID());
        System.out.println(product.getProductName());
        System.out.println(Product.getCompanyName());
    }
    //Statiki cap edende productun adindan birbasa cagirmaq ne derecede duzgundur
    //Product clasinin impelitasiyasi ne derecede dogrudur
}
