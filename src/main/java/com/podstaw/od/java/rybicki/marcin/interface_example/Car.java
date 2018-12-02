package com.podstaw.od.java.rybicki.marcin.interface_example;

public class Car extends Vehicle
      //  implements Moveable
    //dla kompilatora nadmiarowe, ale podanie implements tutaj ułatwia czytanie bibliotek
{

    @Override
    public void move() {
        System.out.println("Car - I'm moving");
    }
}
