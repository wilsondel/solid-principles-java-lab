package com.example.solid.ocp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoDiscountTest {

    @Test
    void calculateDiscountReturnsZero() {
        NoDiscount discount = new NoDiscount();
        double price = 100.0;
        double expected = 0.0;
        double actual = discount.calculateDiscount(price);
        assertEquals(expected, actual, 0.001); // Using delta for double comparison
    }
}
