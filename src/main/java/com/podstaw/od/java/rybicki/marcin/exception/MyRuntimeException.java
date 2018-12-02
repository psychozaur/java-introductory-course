package com.podstaw.od.java.rybicki.marcin.exception;

public class MyRuntimeException extends RuntimeException {

    public MyRuntimeException(){

    }

    public MyRuntimeException(String message) {
        super(message);
    }

    public MyRuntimeException(String message, Throwable cause){
        super(message, cause);
    }
}
