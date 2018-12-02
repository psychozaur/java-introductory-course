package com.podstaw.od.java.rybicki.marcin.package_test;



import com.podstaw.od.java.rybicki.marcin.package_test.one.*;
import sun.util.calendar.BaseCalendar;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Speaker speaker =
                new Speaker();
        com.podstaw.od.java.rybicki.marcin.package_test.two.Speaker speaker2 =
                new com.podstaw.od.java.rybicki.marcin.package_test.two.Speaker();
        com.podstaw.od.java.rybicki.marcin.package_test.three.Speaker speaker3 =
                new com.podstaw.od.java.rybicki.marcin.package_test.three.Speaker();
//        Speaker speaker = new Speaker();
//        Speaker speaker2 = new Speaker();
//        Speaker speaker3 = new Speaker();

        speaker.speak();
        speaker2.speak();
        speaker3.speak();

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(0,0,0);
        BaseCalendar.Date date3 = new BaseCalendar.Date() {
            @Override
            public int getNormalizedYear() {
                return 0;
            }

            @Override
            public void setNormalizedYear(int normalizedYear) {

            }
        };


    }
}
