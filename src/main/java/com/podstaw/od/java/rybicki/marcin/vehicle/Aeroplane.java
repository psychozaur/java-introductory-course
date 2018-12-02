package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Aeroplane extends Vehicle {

    @Override
    public void move() {
        System.out.println("Aeroplane is flying...");
    }

    @Override
    public String toString() {
        return "Aeroplane";
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Aeroplane");
    }
}
