package com.example.solid.lsp.goodExample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasolineCarTest {

    @Test
    void driveReturnsCorrectString() {
        GasolineCar car = new GasolineCar();
        String expected = "Conduciendo carro de gasolina...";
        String actual = car.drive();
        assertEquals(expected, actual);
    }

    @Test
    void refuelReturnsCorrectString() {
        GasolineCar car = new GasolineCar();
        String expected = "Repostando gasolina...";
        String actual = car.refuel();
        assertEquals(expected, actual);
    }
}
