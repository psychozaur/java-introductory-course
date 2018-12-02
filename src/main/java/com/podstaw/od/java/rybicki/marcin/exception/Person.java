package com.podstaw.od.java.rybicki.marcin.exception;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age)
            throws WrongParameterException{
        //"".equals(name) bo nie poleci nullpointerexception?
        if (name == null || "".equals(name)){
            throw new WrongParameterException("Wrong name value: " + name);
        }
        this.name = name;

        if (surname == null || "".equals(surname)){
            throw new WrongParameterException("Wrong surname value: " + surname);
        }
        this.surname = surname;


        if(age <= 0) {
            throw new WrongParameterException("Wrong age value: " + age);
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
