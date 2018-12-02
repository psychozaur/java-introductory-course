package com.podstaw.od.java.rybicki.marcin.generic;

import com.podstaw.od.java.rybicki.marcin.equals_and_hashcode.Person;

public class HolderTest {
    public static void main(String[] args) {

        GenericHolder<String> stringHolder = new GenericHolder<>();
        stringHolder.setSecret("sekret");
        System.out.println(stringHolder.getSecret());

        GenericHolder<Person> personHolder = new GenericHolder<>();
        personHolder.setSecret(new Person("M","R",-3));
        System.out.println(personHolder.getSecret());

        //GenericHolder == GenericHolder<Object> (trzeba uważać przy wyciąganiu i rzutowaniu)
        GenericHolder personHolder2 = new GenericHolder<>();
        personHolder2.setSecret(new Person("M","R",-3));
        System.out.println(personHolder2.getSecret());

    }
}
