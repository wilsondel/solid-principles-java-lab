package com.example.solid.srp;

import com.example.solid.ocp.NoDiscount;
import com.example.solid.ocp.RegularCustomerDiscount;
import com.example.solid.ocp.VIPCustomerDiscount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodExampleTest {

    private static final double PRICE = 100.0;

    @Test
    void testRegularCustomerDiscount() {
        RegularCustomerDiscount discount = new RegularCustomerDiscount();
        assertEquals(PRICE * 0.10, discount.calculateDiscount(PRICE), 0.001);
    }

    @Test
    void testVIPCustomerDiscount() {
        VIPCustomerDiscount discount = new VIPCustomerDiscount();
        assertEquals(PRICE * 0.20, discount.calculateDiscount(PRICE), 0.001);
    }

    @Test
    void testNoDiscount() {
        NoDiscount discount = new NoDiscount();
        assertEquals(0, discount.calculateDiscount(PRICE), 0.001);
    }
}
