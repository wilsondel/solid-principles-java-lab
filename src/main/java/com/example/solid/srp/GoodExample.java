package com.example.solid.srp;

public class GoodExample {
}

// InvoiceCalculator únicamente calcula
class InvoiceCalculator  {
    private double amount;

    public InvoiceCalculator(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.21;
    }
}

// InvoiceCalculator únicamente imprime
class InvoicePrinter {
    private InvoiceCalculator calculator;

    public InvoicePrinter(InvoiceCalculator calculator) {
        this.calculator = calculator;
    }

    public void printInvoice(Invoice invoice) {
        System.out.println("Factura para: " + invoice);
        System.out.println("Total: " + calculator.calculateTotal());
    }
}

// InvoiceCalculator guarda a base de datos
class InvoiceRepository {

    public void saveToDatabase() {
        System.out.println("Guardando factura...");
    }

}