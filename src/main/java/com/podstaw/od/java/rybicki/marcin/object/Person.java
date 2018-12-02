package com.podstaw.od.java.rybicki.marcin.object;

public class Person {
    public static int numberOfPeople = 0;

    private String name;
    private String surname;
    private int age;

    public Person() {
        numberOfPeople++; // numberOfPeople = numberOfPeople + 1;
    }

    public Person (String name){
        this.name = name;
        surname = "Anonymous";
        age = 1;
        numberOfPeople++;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPeople++;
    }

    // not a constructor, it's a method
    public void Person(){

    }

    public void introducePerson() {
        System.out.println("Hi, my name is " + name + " " + surname + ". I'm " + age + ".");
    }

    public static void somethingAboutPerson() {
        System.out.println("Everybody loves math.");
    }

    public static void accessToObjectPropertiesFromStatic(){
       // System.out.println("Name: " + Person.name);

    }

    public static void printNumberOfPeople(){
        System.out.println("Number of people so far: " + numberOfPeople);
    }
}
