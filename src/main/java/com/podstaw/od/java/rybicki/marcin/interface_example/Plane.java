package com.podstaw.od.java.rybicki.marcin.interface_example;

public class Plane extends Vehicle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane - I'm flying");
    }
}
