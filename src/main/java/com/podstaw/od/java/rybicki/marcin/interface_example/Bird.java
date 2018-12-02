package com.podstaw.od.java.rybicki.marcin.interface_example;

public class Bird implements Moveable, Flyable {
    @Override
    public void move() {
        System.out.println("Bird - I'm moving");
    }

    @Override
    public void fly() {
        System.out.println("Bird - I'm flying");
    }
}
