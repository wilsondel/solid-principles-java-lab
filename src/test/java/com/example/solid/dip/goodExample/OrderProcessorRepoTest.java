package com.example.solid.dip.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class OrderProcessorRepoTest {

    @Test
    void processOrderCallsSaveOrderAndReturnsCorrectString() {
        // Mock the Database dependency
        Database mockDatabase = mock(Database.class);
        when(mockDatabase.saveOrder(anyString())).thenReturn("Pedido guardado");

        OrderProcessorRepo processor = new OrderProcessorRepo(mockDatabase);
        String order = "TestOrder456";
        String expected = "Procesando pedido: TestOrder456";
        String actual = processor.processOrder(order);

        assertEquals(expected, actual);
        // Verify that saveOrder was called on the mockDatabase
        verify(mockDatabase, times(1)).saveOrder(order);
    }
}
