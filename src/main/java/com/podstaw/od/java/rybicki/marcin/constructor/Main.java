package com.podstaw.od.java.rybicki.marcin.constructor;

public class Main {
    public static void main(String[] args) {
//        Dish myLunch = new Dish();
//        Dish myLunch2 = new Dish();
//
//        System.out.println("////////////////////////////////////");
//
//        Fish mahFish = new Fish();
//
//        System.out.println("//////////////////////////////////////");
//
//        Cutlet cutlet = Cutlet.giveMeNewNormalCutlet();
//
//        System.out.println("/////////////////////////////////////////");
//
//        Cutlet kindaOnionCutlet = Cutlet.giveMeACutletWithOnion("red onion");
//
//        System.out.println("///////////////////////////////////////////");
//
//        CutletWithOnion cutletWithOnion = CutletWithOnion.giveMeACutletWithOnion();

        Nervous nervousGuy = new Nervous() {
            @Override
            public void introduceYourself() {
                System.out.println("I'm anonymous");
            }
        };


    }
}
