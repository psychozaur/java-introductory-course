package com.podstaw.od.java.rybicki.marcin;

public class Cat {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public static void main(String[] args) {
        Cat cat = new Cat();


    }
}
