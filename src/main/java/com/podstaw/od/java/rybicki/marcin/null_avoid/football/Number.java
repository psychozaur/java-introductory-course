package com.podstaw.od.java.rybicki.marcin.null_avoid.football;

import java.util.Optional;

public class Number {

    int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Optional<Integer> getNumberOptional() {
        return Optional.ofNullable(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Number{" +
                "number=" + number +
                '}';
    }
}
