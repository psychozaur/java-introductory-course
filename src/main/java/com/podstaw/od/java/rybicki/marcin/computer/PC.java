package com.podstaw.od.java.rybicki.marcin.computer;

public class PC extends Computer {

    @Override
    public void changeDisc(){
        System.out.println("Disc changed on PC");
    }

    public static void print(){
        System.out.println("print() from PC");
    }
}
