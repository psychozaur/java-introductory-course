package com.podstaw.od.java.rybicki.marcin.equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollectionsList {
    public static void main(String[] args) {
        // 2 lists
        // 500 items for each list
        // first for searching
        // second for adding

        List<Person> searchList = new ArrayList<>();
        List<Person> addingList = new LinkedList<>();

        long timeStart = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - timeStart);

        for (int i = 0; i < 5000; i++){
            searchList.add(new Person("","",1));
            addingList.add(new Person("","",1));
        }

        System.out.println(System.currentTimeMillis() - timeStart);
        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++){
            searchList.add(4999, new Person("","",1));
        }

        System.out.println(System.currentTimeMillis() - timeStart);
        timeStart = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++){
            addingList.add(4999, new Person("","",1));
        }

        System.out.println(System.currentTimeMillis() - timeStart);
        timeStart = System.currentTimeMillis();

    }
}
