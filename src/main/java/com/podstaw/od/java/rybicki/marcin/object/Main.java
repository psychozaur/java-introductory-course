package com.podstaw.od.java.rybicki.marcin.object;

public class Main {
    public static void main(String[] args) {
        Person.somethingAboutPerson();

        Person me = new Person();
        Person you = new Person("Marcin","Rybicki",27);
        Person arek = new Person("Arek");
        me.introducePerson();
        you.introducePerson();
        arek.introducePerson();

        me.somethingAboutPerson();
        you.somethingAboutPerson();
        arek.somethingAboutPerson();

        // nie robić tego, bo i tak zamieni to na Person.something...
        Person nullPerson = null;
        nullPerson.somethingAboutPerson();

        Person.printNumberOfPeople();
    }
}
