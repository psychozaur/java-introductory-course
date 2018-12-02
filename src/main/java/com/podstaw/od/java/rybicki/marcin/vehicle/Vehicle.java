package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Vehicle {
    protected String name;
    protected int yearOfProduction;
    protected int price;
    protected double speed;

    public void increaseSpeed(){
        System.out.println("increaseSpeed() from Vehicle");
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void printName(){
        System.out.println("Printing name...");
    }

    public void move(){
        System.out.println("Vehicle is moving...");
    }

    @Override
    public String toString() {
        return "Vehicle";
    }
}
