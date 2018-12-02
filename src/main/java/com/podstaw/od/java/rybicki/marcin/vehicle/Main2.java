package com.podstaw.od.java.rybicki.marcin.vehicle;

public class Main2 {
    // TODO: virtual method
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Aeroplane();

        vehicle.move();
        car.move();
        boat.move();
        plane.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        plane.increaseSpeed();

        processVehicle(vehicle);
        processVehicle(car);
        processVehicle(boat);
        processVehicle(plane);

        increaseSpeedOfVehicle(vehicle);
        increaseSpeedOfVehicle(car);
        increaseSpeedOfVehicle(boat);
        increaseSpeedOfVehicle(plane);
    }


    //okazuje się, że nie trzeba robić każdej metody dla typu obiektu. Polimorfizm...
    public static void processVehicle(Vehicle vehicle) {
        System.out.println("Info about vehicle: " + vehicle);
    }

    //przykład late-binding; dopiero JVM wie do jakiego obiektu należy referencja
    public static void increaseSpeedOfVehicle (Vehicle vehicle){
        System.out.println("from method increaseSpeedOfVehicle(Vehicle)");
        vehicle.increaseSpeed();
        System.out.println();
    }
}
