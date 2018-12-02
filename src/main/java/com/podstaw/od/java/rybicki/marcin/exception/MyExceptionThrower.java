package com.podstaw.od.java.rybicki.marcin.exception;

public class MyExceptionThrower {

    public void throwMyException() throws MyException{
        System.out.println("throwMyException()");
        throw new MyException("hahahahahahaha");
    }
}
