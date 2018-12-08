package com.podstaw.od.java.rybicki.marcin.anonymous_classes.lambda;

public class Main {

    public static void main(String[] args) {
        Flyable bird = new Bird();

        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Plane can fly");
            }
        };

        // lambdy działają dla interfejsów z jedną metodą póki co
        // -> separator listy argumentów i ciała metody
        Flyable bullet = () -> { System.out.println("Bullet can fly with lambda");
                                System.out.println("And lambda can perform a block of instructions");};

        Moveable moveable = () -> System.out.println("It moves with lambda");

        Swimmable swimmable = (distance, speed) -> System.out.println("It can swim over " + distance + " meters with the speed of " + speed + " knots per minute.");
        swimmable.swim(10,10);

        Formula converter = celsius -> (celsius * 9 / 5) + 32;
        System.out.println(converter.fromCelsiusToFahrenheit(25));

        MyLambda myLambda = n -> {
            String mahFavoriteString = "";
            for (int i = 0; i < n; i++){
                mahFavoriteString += "HomeSweet";
            }
            return mahFavoriteString;
        };

        FlyableProcessor cleaner = new FlyableProcessor();

        cleaner.clean(new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        });

        cleaner.clean(() -> {});

        SwimmableCleaner swimCleaner = new SwimmableCleaner();

        swimCleaner.clean(new Swimmable() {
            @Override
            public void swim(long distance, double speed) {
                System.out.println("Swim " + distance + " kilometers at " + speed + " km/h.");
            }
        });

        swimCleaner.clean((distance,speed) -> {
//            String a = "test";
//            System.out.println(this.a);
        });

    }
}
