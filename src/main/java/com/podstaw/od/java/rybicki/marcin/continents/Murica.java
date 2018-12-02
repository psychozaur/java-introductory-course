package com.podstaw.od.java.rybicki.marcin.continents;

public class Murica extends Continent {
    static {
        System.out.println("Murica - first static block");
    }

    static {
        System.out.println("Murica - second static block");
    }

    {
        System.out.println("Murica - first instance block");
    }

    {
        System.out.println("Murica - second instance block");
    }

    public Murica(){
        this(5);
        System.out.println("Murica()");
    }

    public Murica(int number){
        System.out.println("Murica() " + number);
    }
}
