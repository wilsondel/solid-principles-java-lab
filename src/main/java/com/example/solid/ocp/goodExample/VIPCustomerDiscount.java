package com.example.solid.ocp.goodExample;

public class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
