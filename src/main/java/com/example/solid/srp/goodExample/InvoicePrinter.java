package com.example.solid.srp.goodExample;

public class InvoicePrinter {
    private InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public String printInvoice() {
        return "Factura para: " + "un cliente" +
                " Total: " + calculator.calculateTotal();
    }
}
