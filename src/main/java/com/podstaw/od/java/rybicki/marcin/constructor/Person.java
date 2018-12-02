package com.podstaw.od.java.rybicki.marcin.constructor;

public class Person implements Nervous {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Hi, I'm " + name);
    }
}
