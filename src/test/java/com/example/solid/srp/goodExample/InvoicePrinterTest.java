package com.example.solid.srp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class InvoicePrinterTest {

    @Test
    void printInvoiceReturnsCorrectString() {
        InvoiceCalculator mockCalculator = mock(InvoiceCalculator.class);
        when(mockCalculator.calculateTotal()).thenReturn(121.0);

        InvoicePrinter printer = new InvoicePrinter(mockCalculator);
        String expected = "Factura para: un cliente Total: 121.0";
        String actual = printer.printInvoice();

        assertEquals(expected, actual);
        verify(mockCalculator, times(1)).calculateTotal();
    }
}
