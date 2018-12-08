package com.podstaw.od.java.rybicki.marcin.anonymous_classes.my_anon;

public class Main {

    public static void main(String[] args) {
        Plant rose = new Rose();
        Gardener gardener = new Gardener();

        //rose
        gardener.processPlant(rose);

        //tulip?
        Plant tulip = new Plant() {
            @Override
            public void grow() {
                System.out.println("Tulip grows");
            }

            @Override
            public void giveSmell() {
                System.out.println("Tulip gives off a nice fragrance");
            }

            @Override
            public void wither() {
                System.out.println("Tulip dies out of dehydration");
            }
        };
        gardener.processPlant(tulip);

        //daisy?
        gardener.processPlant(new Plant() {
            @Override
            public void grow() {
                System.out.println("Daisy grows");
            }

            @Override
            public void giveSmell() {
                System.out.println("Daisy smells sweet");
            }

            @Override
            public void wither() {
                System.out.println("Daisy withers");
            }
        });


    }
}
