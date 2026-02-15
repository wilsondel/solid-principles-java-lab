package com.example.solid.dip.goodExample;

public class OrderProcessorRepo {
    private Database database;

    public OrderProcessorRepo(Database database) {
        this.database = database;
    }

    public String processOrder(String order) {
        database.saveOrder(order);
        return "Procesando pedido: " + order;
    }
}
