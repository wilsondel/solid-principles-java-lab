package com.example.solid.lsp;

public class GoodExample {
}

interface Vehicle {
    void drive();
}

interface FuelVehicle extends Vehicle {
    void refuel();
}

interface ElectricVehicle extends Vehicle {
    void charge();
}

// Implementación para carro a gasolina
class GasolineCar implements FuelVehicle {
    @Override
    public void drive() {
        System.out.println("Conduciendo carro de gasolina...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}

// Implementación para carro eléctrico
class ElectroCar implements ElectricVehicle {
    @Override
    public void drive() {
        System.out.println("Conduciendo carro eléctrico...");
    }

    @Override
    public void charge() {
        System.out.println("Cargando batería...");
    }
}