package com.podstaw.od.java.rybicki.marcin.equals_and_hashcode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Person me = new Person("Marcin", "Ry", 27);
        Person ryba = me;

        System.out.println("equals?: " + (me.equals(ryba)));

        System.out.println("me == ryba?: " + (me == ryba));

        ryba = new Person("Marcin", "Ry", 27);

        System.out.println("and now, me == ryba?: " + (me == ryba));

        System.out.println("equals?: " + (me.equals(ryba)));

        System.out.println("/////////////////////////////////////");

        // ArrayList for Person
        // add 4 person
        // 2 duplicates

        // create new duplicate which exists in arraylist

        List<Person> list = new ArrayList<>();
        Set<Person> set = new HashSet<>();

        set.add(new Person("Marcin", "Ry", 27));
        set.add(new Person("Zuzanna", "K", 24));
        set.add(new Person("Marcin", "Ry", 27));
        set.add(new Person("Zuzanna", "K", 25));

        list.addAll(set);

        System.out.println(set.contains(new Person("Marcin","Ry",27)));
        System.out.println("Size of set: " + set.size());
        System.out.println("Size of list: " + list.size());

        for (Person p : set){
            System.out.println("Person: " + p);
        }

        Set<Person> anotherSet = new LinkedHashSet<>();
        // lista dobra do dużej liczby wstawień, ale małej liczby iteracji
        List<Person> personList = new LinkedList<>();
    }
}
