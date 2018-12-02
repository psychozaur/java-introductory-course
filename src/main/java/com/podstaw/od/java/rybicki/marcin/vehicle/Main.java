package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.printName();

        Car ferrari = new Car();
        ferrari.printName();
        ferrari.speedUp();

        //upcasting
        Vehicle car = (Vehicle) ferrari;

        car.printName();

        //downcasting
        Car carForSure = (Car) car;
        carForSure.speedUp();

        //downcasting i ClassCastException
        Boat boat = (Boat) car;
        boat.dontSink();
    }
}
