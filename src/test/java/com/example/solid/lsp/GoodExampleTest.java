package com.example.solid.lsp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GoodExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testGasolineCarDrive() {
        GasolineCar car = new GasolineCar();
        car.drive();
        assertTrue(outContent.toString().contains("Conduciendo carro de gasolina..."));
    }

    @Test
    void testGasolineCarRefuel() {
        GasolineCar car = new GasolineCar();
        car.refuel();
        assertTrue(outContent.toString().contains("Repostando gasolina..."));
    }

    @Test
    void testElectroCarDrive() {
        ElectroCar car = new ElectroCar();
        car.drive();
        assertTrue(outContent.toString().contains("Conduciendo carro eléctrico..."));
    }

    @Test
    void testElectroCarCharge() {
        ElectroCar car = new ElectroCar();
        car.charge();
        assertTrue(outContent.toString().contains("Cargando batería..."));
    }
}
