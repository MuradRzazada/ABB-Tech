package org.abbtech.lesson4.Task1;

public class Product {
    private static String companyName;
    private int productID = 1000;
    private String productName;

    static {
        companyName = "MyCompany";
    }

    public Product(String name) {
        productID ++;
        this.productName = name;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Product.companyName = companyName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
