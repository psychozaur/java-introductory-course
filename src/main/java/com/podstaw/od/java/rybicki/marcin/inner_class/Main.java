package com.podstaw.od.java.rybicki.marcin.inner_class;

import static com.podstaw.od.java.rybicki.marcin.inner_class.Vehicle.Wheel;

public class Main {

    public static void main(String[] args) {
//        Wheel wheel = new Wheel(16);
//        Vehicle.Wheel wheel2 = new Vehicle.Wheel(17);
//        Vehicle vehicle = new Vehicle("suzuku", new Wheel(17));
//
//        System.out.println(vehicle);
//        System.out.println(wheel);
//        System.out.println(wheel2);

//        House.Apartment apartment = new House.Apartment();

        House myHouse = new House("Javaminium 2020");

        House betterHouse1 = new House();
        betterHouse1.setHouseName("Java home");
        House.Apartment myNewApartment = betterHouse1.new Apartment(80);
        House.Apartment newApartment = betterHouse1.new Apartment(80);

        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home");
        House.Apartment friendsApartment = betterHouse2.new Apartment(40);
        House.Apartment friendsApartment2 = betterHouse2.new Apartment(40);

        myNewApartment.printNameOfHouse();
        newApartment.printNameOfHouse();
        friendsApartment.printNameOfHouse();
        friendsApartment2.printNameOfHouse();
    }
}
