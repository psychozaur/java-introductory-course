package com.podstaw.od.java.rybicki.marcin.collection.set;

import com.podstaw.od.java.rybicki.marcin.watering_plants.Plant;
import com.podstaw.od.java.rybicki.marcin.watering_plants.Rose;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
//        Set<String> stringSet = new HashSet<>();
//
//        stringSet.add("one");
//        stringSet.add("two");
//        stringSet.add("three");
//
//        stringSet.add("three");
//
//        System.out.println("Size: " + stringSet.size());

        Set<Plant> plantSet = new HashSet<>();

        Plant rose1 = new Rose(5,5,5);
        Plant rose2 = new Rose(5,4,5);
        Plant rose3 = new Rose(5,3,5);

        plantSet.add(rose1);
        plantSet.add(rose2);
        plantSet.add(rose3);
        plantSet.add(rose1);
        plantSet.add(new Rose(5,5,5));
        plantSet.add(new Rose(5,3,5));


        System.out.println("Size: " + plantSet.size());


    }
}
