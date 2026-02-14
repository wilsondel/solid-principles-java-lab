package com.example.solid.dip;

public class GoodExample {
}

interface Database {
    void saveOrder(String order);
}

class MySQLDatabaseClient implements Database {
    @Override
    public void saveOrder(String order) {
        System.out.println("Guardando pedido en MySQL: " + order);
    }
}

class OrderProcessorRepo {
    private Database database;

    public OrderProcessorRepo(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        System.out.println("Procesando pedido: " + order);
        database.saveOrder(order);
    }
}