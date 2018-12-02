package com.podstaw.od.java.rybicki.marcin.exception;

public class AnotherPerson {

    private String name;
    private String surname;
    private int age;

    public AnotherPerson(String name, String surname, int age)
            throws IllegalArgumentException{
        //"".equals(name) bo nie poleci nullpointerexception?
        if (name == null || "".equals(name)){
            throw new IllegalArgumentException("Wrong name value");
        }
        this.name = name;

        if (surname == null || "".equals(surname)){
            throw new IllegalArgumentException("Wrong surname value");
        }
        this.surname = surname;


        if(age <= 0) {
            throw new IllegalArgumentException("Wrong age value");
        }
        this.age = age;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
