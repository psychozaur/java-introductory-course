package com.podstaw.od.java.rybicki.marcin.date_and_time.old_way;

import java.util.Calendar;
import java.util.Date;

public class OldDateTimeExample {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("now: " + now);

        Date nowAgain = new Date(990_000_000_000L);
        System.out.println("now?: " + nowAgain);

        Date tomorrow = new Date();
        tomorrow.setTime(now.getTime() + (1000 * 60 * 60 * 24));
        System.out.println(tomorrow);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-1);
        calendar.add(Calendar.MONTH,-1);

        System.out.println("calendar: " + calendar.getTime());
    }
}
