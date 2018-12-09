package com.podstaw.od.java.rybicki.marcin.null_avoid.football;

import java.util.Optional;

public class Chair {

   private Number number;

    public Chair(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

    public Optional<Number> getNumberOptional() {
        return Optional.ofNullable(number);
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "number=" + number +
                '}';
    }
}
