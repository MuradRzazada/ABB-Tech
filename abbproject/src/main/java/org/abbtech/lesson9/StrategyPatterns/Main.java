package org.abbtech.lesson9.StrategyPatterns;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart1 = new ShoppingCart();
        Item item1 = new Item("AS5122", 623);
        shoppingCart1.addItem(item1);
        shoppingCart1.pay(new PaypalStrategy("rzazada.murad@gmail.com", "Bjk1903"));
        shoppingCart1.pay(new CreditCardStrategy("Murad", "1234567890123456", 786));

        ShoppingCart shoppingCart2 = new ShoppingCart();
        Item item2 = new Item("WA325346", 100);
        shoppingCart2.addItem(item2);
        shoppingCart2.pay(new PaypalStrategy("ilikin.aa@gmail.com", "Aa1234"));
        shoppingCart2.pay(new CreditCardStrategy("Ilkin", "2895729985702598", 998));

    }
}
