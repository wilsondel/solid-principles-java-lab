package com.example.solid.srp.goodExample;


// InvoiceCalculator únicamente calcula
public class InvoiceCalculator  {
    private double amount;

    public InvoiceCalculator(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.21;
    }
}