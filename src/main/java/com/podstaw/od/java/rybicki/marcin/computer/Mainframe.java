package com.podstaw.od.java.rybicki.marcin.computer;

public class Mainframe extends Computer {

    @Override
    public void changeDisc(){
        System.out.println("Disc changed on Mainframe");
    }

    public static void print(){
        System.out.println("print() from Mainframe");
    }
}
