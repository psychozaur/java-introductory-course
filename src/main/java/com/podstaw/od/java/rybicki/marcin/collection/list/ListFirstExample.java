package com.podstaw.od.java.rybicki.marcin.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {

    public static void main(String[] args) {
        //String[]
        List<String> strings = new ArrayList<>();

        strings.add("enum");
        strings.add("abstract");

//        strings.get(0);
//        strings.size();

        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

        for (String string : strings){
            System.out.println(string);
        }
    }
}
