package com.podstaw.od.java.rybicki.marcin.computer;

public class Laptop extends Computer {

    @Override
    public void changeDisc(){
        System.out.println("Disc changed on Laptop");
    }

    public static void print(){
        System.out.println("print() from Laptop");
    }
}
