package com.example.solid.srp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceRepositoryTest {

    @Test
    void saveToDatabaseReturnsCorrectString() {
        InvoiceRepository repository = new InvoiceRepository();
        String expected = "Guardando factura...";
        String actual = repository.saveToDatabase();
        assertEquals(expected, actual);
    }
}
