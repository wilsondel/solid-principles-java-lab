package com.example.solid.lsp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElectroCarTest {

    @Test
    void driveReturnsCorrectString() {
        ElectroCar car = new ElectroCar();
        String expected = "Conduciendo carro eléctrico...";
        String actual = car.drive();
        assertEquals(expected, actual);
    }

    @Test
    void chargeReturnsCorrectString() {
        ElectroCar car = new ElectroCar();
        String expected = "Cargando batería...";
        String actual = car.charge();
        assertEquals(expected, actual);
    }
}
