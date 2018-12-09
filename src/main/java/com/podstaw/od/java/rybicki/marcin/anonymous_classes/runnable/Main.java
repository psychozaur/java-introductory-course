package com.podstaw.od.java.rybicki.marcin.anonymous_classes.runnable;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("////////////////");
        System.out.println("run() from regular class");
        System.out.println("/////////////////");
    }
}

public class Main {

    public static void main(String[] args) {

        //zwykła klasa
        MyRunnable myRunnable = new MyRunnable();
        processRunnable(myRunnable);

        // klasa anonimowa z zachowaniem referencji,
        // (nowy obiekt nienazwanej klasy dziedziczącej po Runnable)
        Runnable myRunnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("//////////////");
                System.out.println("run() anonymously with reference");
                System.out.println("//////////////");
            }
        };

        processRunnable(myRunnable2);

        // klasa anonimowa - przekazana jako parametr,

        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("////////////////");
                System.out.println("run() anonymously as a parameter");
                System.out.println("////////////////");
            }
        });

        // lambda
        processRunnable(() -> {
            System.out.println("////////////////");
            System.out.println("run() from lambda");
            System.out.println("////////////////");
        });

        // lambda z zachowaniem referencji
        Runnable myRunnable3 = () -> {
            System.out.println("////////////////");
            System.out.println("run() from lambda with reference");
            System.out.println("////////////////");
        };

        processRunnable(myRunnable3);

    }

    private static void processRunnable(Runnable runnable){
        System.out.println();
        System.out.println("inside processRunnable()");
        runnable.run();
        System.out.println();
    }

}
