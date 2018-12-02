package com.podstaw.od.java.rybicki.marcin.constructor;

public class CutletWithOnion {

    private CutletWithOnion(){
        System.out.println("CutletWithOnion()");
    }

    public static CutletWithOnion giveMeACutletWithOnion(){
        return new CutletWithOnion();
    }
}
