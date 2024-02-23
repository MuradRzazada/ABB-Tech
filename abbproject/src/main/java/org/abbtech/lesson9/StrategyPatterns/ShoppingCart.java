package org.abbtech.lesson9.StrategyPatterns;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items=new ArrayList<>();

    public ShoppingCart() {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod) {
        int amount = calculateTotal();
        paymentMethod.pay(amount);

    }

}