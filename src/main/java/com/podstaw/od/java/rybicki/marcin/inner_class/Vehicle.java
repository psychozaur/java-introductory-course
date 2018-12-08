package com.podstaw.od.java.rybicki.marcin.inner_class;

public class Vehicle {

    private String vehicleName;
    private Wheel wheels;

    public Vehicle(String vehicleName, Wheel wheels) {
        this.vehicleName = vehicleName;
        this.wheels = wheels;
        System.out.println("Vehicle constructed");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleName='" + vehicleName + '\'' +
                '}';
    }

    public static class Wheel{
        private int sizeInInches;

        public Wheel(int sizeInInches) {
            this.sizeInInches = sizeInInches;
            System.out.println("Wheel constructed");
        }

        //nope, koło potrzebuje statycznego pola
//        public void printNameOfVehicle(){
//            System.out.println("Vehicle name: " + vehicleName);
//        }

        @Override
        public String toString() {
            return "Wheel{" +
                    "sizeInInches=" + sizeInInches +
                    '}';
        }
    }
}
