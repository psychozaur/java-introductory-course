package com.podstaw.od.java.rybicki.marcin.anonymous_classes.runnable;

public class FactoryExample {

    String name = "Adam";

    public static void main(String[] args) {

        MyRunnable2 first = new MyRunnable2();
        first.run();

        MyRunnable2 second = new MyRunnable2();
        second.run();

        makeNewRunnable().run();
    }

    private static Runnable makeNewRunnable(){
        return new Runnable() {
            private String name = "Marcin";
            @Override
            public void run() {
                String name = "Paweł";
                System.out.println("My name: " + this.name);
            }
        };
    }

    //lambdy nie tworzą nowych klas jak anonimowe
    //lambdy uwspólniają do jednej klasy
    private static Runnable makeNewRunnableWithLambda(){
        return () -> {
            String name = "Marcin";
            System.out.println("My name: " + name);
        };
    }



    }

class MyRunnable2 implements Runnable {

    private String name = "Marcin";

    @Override
    public void run() {
        System.out.println("My name: " + this.name);
    }
}