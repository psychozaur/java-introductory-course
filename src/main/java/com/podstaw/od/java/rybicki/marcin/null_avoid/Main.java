package com.podstaw.od.java.rybicki.marcin.null_avoid;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //dom bez łazienki
        House house1 = new House(null);

        //dom z łazienką bez zlewu
        Bathroom withoutSink = new Bathroom(null);
        House house2 = new House(withoutSink);

        // dom właściwy
        Sink sink = new Sink("Roca");
        Bathroom bathroom = new Bathroom(sink);
        House house3 = new House(bathroom);

//        displaySinkBrandVeryVeryNaive(house2);

        displaySinkBrandImNotAFool(house1);
        displaySinkBrandImNotAFool(house2);
        displaySinkBrandImNotAFool(house3);




    }

    private static void displaySinkBrandVeryVeryNaive(House house){
        String brand = house.getBathroom().getSink().getBrand();
        System.out.println(brand);
    }

    private static void displaySinkBrandLessNaive(House house){
        String brand = "default";

        if (null != house){
            Bathroom bathroom = house.getBathroom();

            if (null != bathroom){
                Sink sink = bathroom.getSink();

                if (null != sink) {
                    brand = sink.getBrand();
                }

            }
        }
        System.out.println(brand);
    }

    private static void displaySinkBrandStillNaive(House house){
        String brand = "default";

        if (null != house.getBathroom().getSink().getBrand()){
            brand = house.getBathroom().getSink().getBrand();
            System.out.println(brand);
        } else {
            System.out.println("null");
        }
    }

    //mieszamy stary, Javowy, ifowy beton ze zbrojeniami z lambdy
    private static void displaySinkBrandImNotAFool(House house){
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getBrand())
                .ifPresent(s -> System.out.println("Brand: " + s));
    }
}
