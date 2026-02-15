package com.example.solid.ocp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularCustomerDiscountTest {

    @Test
    void calculateDiscountReturnsCorrectValue() {
        RegularCustomerDiscount discount = new RegularCustomerDiscount();
        double price = 100.0;
        double expected = 10.0; // 10% discount
        double actual = discount.calculateDiscount(price);
        assertEquals(expected, actual, 0.001); // Using delta for double comparison
    }
}
