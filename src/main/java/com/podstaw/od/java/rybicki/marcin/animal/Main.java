package com.podstaw.od.java.rybicki.marcin.animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.whichAnimal();
        dog.makeSound();

        Animal maybeDog = new Dog();
        maybeDog.whichAnimal();
//        maybeDog.makeSound();

        Animal maybeCat = new Cat();

        Animal maybeMonkey = new Monkey();
        Object maybeMonkeyObject = new Monkey();
    }
}
