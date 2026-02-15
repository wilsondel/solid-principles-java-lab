package com.example.solid.ocp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VIPCustomerDiscountTest {

    @Test
    void calculateDiscountReturnsCorrectValue() {
        VIPCustomerDiscount discount = new VIPCustomerDiscount();
        double price = 100.0;
        double expected = 20.0; // 20% discount
        double actual = discount.calculateDiscount(price);
        assertEquals(expected, actual, 0.001); // Using delta for double comparison
    }
}
