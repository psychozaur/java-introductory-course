package com.podstaw.od.java.rybicki.marcin.exception.network;

public class StockExchangeCreationException extends RuntimeException {

    StockExchangeCreationException(){

    }

    StockExchangeCreationException(String message){
        super(message);
    }

    StockExchangeCreationException(String message, Throwable cause){
        super(message, cause);
    }
}
