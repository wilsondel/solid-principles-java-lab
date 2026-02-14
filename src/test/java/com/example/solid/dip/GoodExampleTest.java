package com.example.solid.dip;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GoodExampleTest {

    private static class MockDatabase implements Database {
        private String savedOrder;

        @Override
        public void saveOrder(String order) {
            this.savedOrder = order;
        }

        public String getSavedOrder() {
            return savedOrder;
        }
    }

    @Test
    void testProcessOrder() {
        MockDatabase mockDatabase = new MockDatabase();
        OrderProcessorRepo orderProcessor = new OrderProcessorRepo(mockDatabase);
        String order = "Test Order";
        orderProcessor.processOrder(order);
        assertEquals(order, mockDatabase.getSavedOrder());
    }
}
