package com.example.solid.srp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceCalculatorTest {

    @Test
    void calculateTotalReturnsCorrectValue() {
        InvoiceCalculator calculator = new InvoiceCalculator(100.0);
        double expected = 100.0 * 1.21;
        double actual = calculator.calculateTotal();
        assertEquals(expected, actual, 0.001); // Using delta for double comparison
    }
}
