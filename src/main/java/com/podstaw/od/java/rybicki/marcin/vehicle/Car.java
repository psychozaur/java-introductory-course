package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Car extends Vehicle {
    public void speedUp () {
        System.out.println("Speeding up!");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Car is moving...");
    }

    @Override
    public String toString() {
        return "Car";
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Car");
    }
}
