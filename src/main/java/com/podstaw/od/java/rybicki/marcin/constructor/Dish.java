package com.podstaw.od.java.rybicki.marcin.constructor;

public class Dish {

    private String type;

    {
        System.out.println("Dish - First init block");
    }

    static {
        System.out.println("Dish - Static first initialization");
    }

    //overloading
    public Dish() {
        //tu są wykonywane bloki niestatyczne (inicjalizacji instancji) tak na 50%
        //ten konstruktor musi być pierwszą instrukcją
        this("pasta");
        //tu są wykonywane bloki niestatyczne (inicjalizacji instancji) tak na 100%
        System.out.println("Dish()");

    }

    //overloading
    public Dish(String type){
        System.out.println("Dish() " + type);
        this.type = type;
    }

    //overloading
    public Dish(int number){
        // super();
        System.out.println("Dish() " + number);
    }

    static {
        System.out.println("Dish - Static class initialization");
    }

    {
        System.out.println("Dish - Second init block");
    }

}
