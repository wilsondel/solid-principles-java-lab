package com.example.solid.dip.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MySQLDatabaseClientTest {

    @Test
    void saveOrderReturnsCorrectString() {
        MySQLDatabaseClient client = new MySQLDatabaseClient();
        String order = "TestOrder123";
        String expected = "Guardando pedido en MySQL: TestOrder123";
        String actual = client.saveOrder(order);
        assertEquals(expected, actual);
    }
}
