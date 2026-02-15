package com.example.solid.lsp.goodExample;

public class GasolineCar implements FuelVehicle {
    @Override
    public String drive() {
        return "Conduciendo carro de gasolina...";
    }

    @Override
    public String refuel() {
        return "Repostando gasolina...";
    }
}
