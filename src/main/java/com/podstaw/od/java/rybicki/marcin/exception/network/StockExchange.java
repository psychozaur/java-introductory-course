package com.podstaw.od.java.rybicki.marcin.exception.network;

import java.util.Random;

public class StockExchange {

    //constructor StockExchangeCreationException
    // ReadDataException
    // Random - % 2
    private static final Random number = new Random();

    public StockExchange() throws StockExchangeCreationException{
        if (number.nextInt(2) % 2 == 1){
            throw new StockExchangeCreationException("Problem in StockExchange()");
        }
    }

    public String readData() throws ReadDataException{
        String result = "Data read: " + number.nextInt(100);

        if (number.nextInt(2) % 2 == 1){
            throw new ReadDataException("Problem in readData()");
        }

        return result;
    }
}
