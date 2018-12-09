package com.podstaw.od.java.rybicki.marcin.null_avoid.optional;

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

        //never like that! not before value types are a thing...
//        Optional<String> maybeString;

        Optional<String> maybeString = Optional.empty();
        //gdy jesteśmy pewni, że nie ma nulla
        Optional<String> stringForSure = Optional.of("Marcin");

        //gdy nie mamy pewności czy parametr jest nullem
        Optional<String> absentString = Optional.ofNullable(null);

        if (stringForSure.isPresent()){
             System.out.println(stringForSure.get());
        }

        //Consumer.accept
        absentString.ifPresent(x -> System.out.println(x));

        displayBrandSlowMode(house1);
        displayBrandSlowMode(house2);
        displayBrandSlowMode(house3);

    }

    private static void displayBrandWithLambda1(House house){
       Optional.ofNullable(house)
            .ifPresent(house1 -> house1.getBathroom()
                    .ifPresent(bathroom -> bathroom.getSink()
                            .ifPresent(sink -> System.out.println(sink.getBrand()))));
    }

    //flatMap spłaszcza, nie dostawia dodatkowego pudełka Optional; używamy, gdy metoda zwraca Optionala
    private static void displayBrandWithLambda2(House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getBrand())
                .ifPresent(s -> System.out.println("Brand: " + s));
    }

    private static void displayBrandSlowMode(House house) {
        String brand = "empty";
        Optional<House> maybeHouse = Optional.ofNullable(house);

        if (maybeHouse.isPresent()){
           Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();

           if (maybeBathroom.isPresent()){
               Optional<Sink> maybeSink = maybeBathroom.get().getSink();

               if (maybeSink.isPresent()){
                   brand = maybeSink.get().getBrand();
               }
           }
        }
        System.out.println(brand);
    }

}
