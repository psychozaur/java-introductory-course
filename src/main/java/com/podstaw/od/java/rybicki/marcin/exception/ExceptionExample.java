package com.podstaw.od.java.rybicki.marcin.exception;

public class ExceptionExample {

    public static void main(String[] args) {
//        MyExceptionThrower thrower = new MyExceptionThrower();
//
////        try {
//            thrower.throwMyException();
//            System.out.println("here");
////        } catch (MyException e) {
////            e.printStackTrace();
////        }

//        System.out.println("here again");
        //ha, w przeciwienstwie do WrongParameterException, nie muszę tu dawać throws,
        //ponieważ IllegalArgumentException dziedziczy po Runtime...
        AnotherPerson me = new AnotherPerson("M","R", -27);

        AnotherPerson nobody = null;
        try {
            nobody = new AnotherPerson("M","",0);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println(me);
        System.out.println(nobody);

    }
}
