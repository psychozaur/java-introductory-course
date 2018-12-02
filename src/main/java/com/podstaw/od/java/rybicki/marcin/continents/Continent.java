package com.podstaw.od.java.rybicki.marcin.continents;

public class Continent {

    private int population;
    private int area;

    static {
        System.out.println("Continent - first static block");
    }

    static {
        System.out.println("Continent - second static block");
    }

    {
        System.out.println("Continent - first instance block");
    }

    {
        System.out.println("Continent - second instance block");
    }

    public Continent(){
        this(42);
        System.out.println("Continent()");
    }

    public Continent(int area){
        this(42,43);
        System.out.println("Continent() " + area);
    }

    public Continent(int area, int population){
        System.out.println("Continent() " + area + ", " + population);
    }
}
