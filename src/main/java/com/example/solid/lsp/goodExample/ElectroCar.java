package com.example.solid.lsp.goodExample;

public class ElectroCar implements ElectricVehicle {
    @Override
    public String drive() {
        return "Conduciendo carro eléctrico...";
    }

    @Override
    public String charge() {
        return "Cargando batería...";
    }
}
