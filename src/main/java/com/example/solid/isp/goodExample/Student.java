package com.example.solid.isp.goodExample;

public class Student implements Workable, Eatable {
    @Override
    public String work() {
        return "Estudiando desde casa...";
    }

    @Override
    public String eat() {
        return "Almorzando de 12 a 1 PM...";
    }
}
