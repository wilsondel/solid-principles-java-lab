package com.example.solid.ocp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GoodExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testInvoiceCalculatorCalculateTotal() {
        InvoiceCalculator calculator = new InvoiceCalculator(100.0);
        assertEquals(100.0 * 1.21, calculator.calculateTotal(), 0.001);
    }

    @Test
    void testInvoicePrinterPrintInvoice() {
        InvoiceCalculator calculator = new InvoiceCalculator(100.0);
        InvoicePrinter printer = new InvoicePrinter(calculator);
        Invoice invoice = new Invoice(1, 0.0); // Use the real Invoice class
        printer.printInvoice(invoice);
        String expectedOutput = "Factura para: Invoice ID: 1, Amount: 0.0" + System.lineSeparator() + "Total: 121.0";
        assertTrue(outContent.toString().trim().contains(expectedOutput));
    }

    @Test
    void testInvoiceRepositorySaveToDatabase() {
        InvoiceRepository repository = new InvoiceRepository();
        repository.saveToDatabase();
        assertTrue(outContent.toString().contains("Guardando factura..."));
    }
}
