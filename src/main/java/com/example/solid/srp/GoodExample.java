package com.example.solid.srp;

public class GoodExample {
}

interface DiscountStrategy {
    double calculateDiscount(double price);
}

class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}

class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}

class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return 0;
    }
}
