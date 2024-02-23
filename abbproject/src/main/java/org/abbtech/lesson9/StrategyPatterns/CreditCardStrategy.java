package org.abbtech.lesson9.StrategyPatterns;

public class CreditCardStrategy implements PaymentStrategy{
    private String name;
    private String cardNumber;
    private int cvv;

    public CreditCardStrategy(String name, String cardNumber, int cvv) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount +" paid with credit/debit card");

    }
}
