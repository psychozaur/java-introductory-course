package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Boat extends Vehicle {
    public void dontSink () {
        System.out.println("Not sinking...");
    }

    @Override
    public void move() {
//        super.move();
        System.out.println("Boat is sailing...");
    }

    @Override
    public String toString() {
        return "Boat";
    }

    @Override
    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Boat");
    }
}
