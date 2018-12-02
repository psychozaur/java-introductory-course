package com.podstaw.od.java.rybicki.marcin.date_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class NewDateAndTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(18,5);
        System.out.println(localTime);
        System.out.println(localTime1);

        localTime1 = localTime1.minusMinutes(5);

        System.out.println("localTime1: " + localTime1);
        System.out.println("///////////////////////////");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate localDate1 = LocalDate.of(1410,7,15);
        System.out.println(localDate1);

        System.out.println(localDate1.getMonth());
        System.out.println("////////////////////////////");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime1);

        System.out.println("//////////////////////////////");
        String formattedTime = localDateTime.format(DateTimeFormatter.ofPattern("YMd"));
        System.out.println(formattedTime);

        System.out.println("///////////////////////////////");
        Date maybeNow = new Date();
        Instant instant = Instant.ofEpochMilli(maybeNow.getTime());
        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(maybeNowNewWay);


    }
}
