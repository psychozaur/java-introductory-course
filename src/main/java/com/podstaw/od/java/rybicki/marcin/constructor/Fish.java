package com.podstaw.od.java.rybicki.marcin.constructor;

public class Fish extends Dish {

    {
        System.out.println("Fish - instance block");
    }

    static {
        System.out.println("Fish - static block");
    }

    {
        System.out.println("Fish - second instance block");
    }

    public Fish(){
        this("and chips lel");
        System.out.println("Fish()");
    }

    public Fish(String toppings){
        super();
        System.out.println("Fish() " + toppings);
    }
}
