package com.podstaw.od.java.rybicki.marcin.continents;

public class Europe extends Continent {
    static {
        System.out.println("Europe - first static block");
    }

    static {
        System.out.println("Europe - second static block");
    }

    {
        System.out.println("Europe - first instance block");
    }

    {
        System.out.println("Europe - second instance block");
    }

    public Europe(){
        this(6);
        System.out.println("Europe()");
    }

    public Europe(int number){
        System.out.println("Europe() " + number);
    }
}
