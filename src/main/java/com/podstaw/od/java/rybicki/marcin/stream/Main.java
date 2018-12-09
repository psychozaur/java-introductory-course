package com.podstaw.od.java.rybicki.marcin.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Country> countries = Arrays.asList(
                new Country(40_000_000,"Poland",312, 4500),
                new Country(500_000_000,"USA",31000, 25000),
                new Country(80_000_000,"Dojczland",712.7, 16500),
                new Country(60_000_000,"France",812.6, 15000),
                new Country(4_000_000,"Finland",612, 20000),
                new Country(1_300_000_000,"China",612, 10000)
        );

        List<Country> result = genericFilter(countries, country -> country.getAveragePaycheck() > 10_000);
        List<Country> result1 = genericFilter(countries, country -> country.getNumberOfPeople() > 70_000_000);

        result.forEach(country -> System.out.println(country));
        result1.forEach(country -> System.out.println(country));


    }

    private static List<Country> getListOfRichCountries (List<Country> countries, double paycheck){
        List<Country> result = new ArrayList<>();

        for (Country country : countries){
            if (country.getAveragePaycheck() >= paycheck){
                result.add(country);
            }
        }

        return result;
    }

    private static List<Country> getListOfMostPopulatedCountries (List<Country> countries, long population){
        List<Country> result = new ArrayList<>();

        for (Country country : countries){
            if (country.getNumberOfPeople() >= population){
                result.add(country);
            }
        }

        return result;
    }

    private static List<Country> filterByMinimalNumberOfPeople (List <Country> countries, long minimalNumberOfPeople){

        return countries.stream()
                .filter(country -> country.getNumberOfPeople() > minimalNumberOfPeople)
                .collect(Collectors.toList());

    }

    private static List<Country> genericFilter (List <Country> countries, Predicate<Country> predicate){

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }
}
