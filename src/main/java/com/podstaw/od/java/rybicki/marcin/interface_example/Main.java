package com.podstaw.od.java.rybicki.marcin.interface_example;

public class Main {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
        bird.fly();

        System.out.println("////////////////////////////////");

        Plane plane = new Plane();
        plane.move();
        plane.fly();

        System.out.println("/////////////////////////////////");

        Car car = new Car();
        car.move();
    }
}
