package com.podstaw.od.java.rybicki.marcin.constructor;

public class Cutlet extends Dish {

    private Cutlet(){
        System.out.println("Cutlet()");
    }

    private Cutlet(String onionType){
        System.out.println("Cutlet() with " + onionType);
    }

    //metoda fabryczna musi być statyczna
    public static Cutlet giveMeNewNormalCutlet(){
        return new Cutlet();
    }

    //kotlet z cebulką już nie oszukany
    public static Cutlet giveMeACutletWithOnion(String onionType){
        return new Cutlet(onionType);
    }
}
