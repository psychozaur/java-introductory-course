package com.podstaw.od.java.rybicki.marcin.exception;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException() {
        System.out.println("throwMyRuntimeException()");
        throw new MyRuntimeException("haha");
    }
}
