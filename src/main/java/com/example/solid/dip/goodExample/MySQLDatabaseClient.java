package com.example.solid.dip.goodExample;

public class MySQLDatabaseClient implements Database {
    @Override
    public String saveOrder(String order) {
       return "Guardando pedido en MySQL: " + order;
    }
}
