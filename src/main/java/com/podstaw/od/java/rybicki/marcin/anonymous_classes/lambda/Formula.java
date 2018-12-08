package com.podstaw.od.java.rybicki.marcin.anonymous_classes.lambda;

@FunctionalInterface
public interface Formula {

    double fromCelsiusToFahrenheit(double celsius);
    default double fromFahrenheitToCelsius(double fahrenheit){
        return 0;
    }
}
