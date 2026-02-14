package com.example.solid.isp;

public class GoodExample {
}

interface Workable {
    void work();
}
interface Eatable {
    void eat();
}

class Dev implements Workable {
    @Override
    public void work() {
        System.out.println("Escribiendo código...");
    }
}

class Student implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Estudiando desde casa...");
    }

    @Override
    public void eat() {
        System.out.println("Almorzando de 12 a 1 PM...");
    }
}