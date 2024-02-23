package org.abbtech.lesson9.StrategyPatterns;

public class Item {
    private String code;
    private int price;

    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }

    public String getUpcCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }
}
