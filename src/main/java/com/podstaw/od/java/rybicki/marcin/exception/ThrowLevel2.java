package com.podstaw.od.java.rybicki.marcin.exception;

public class ThrowLevel2 {

    public void doIt() throws MyException{
        System.out.println("I'm dangerous");

        MyExceptionThrower thrower = new MyExceptionThrower();
        thrower.throwMyException();
    }
}
