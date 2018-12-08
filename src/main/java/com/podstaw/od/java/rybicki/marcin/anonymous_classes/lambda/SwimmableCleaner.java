package com.podstaw.od.java.rybicki.marcin.anonymous_classes.lambda;

import java.util.Random;

public class SwimmableCleaner {

    public void clean(Swimmable swimmable){
        Random rand = new Random();

        System.out.println("Swimmable cleaned " + rand.nextInt(5) + " times.");
    }
}
