package com.example.solid.ocp.goodExample;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return 0;
    }
}
