package pl.com.empas.java_introductory_course.time.standard;

import java.util.Calendar;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date future = calendar.getTime();
        System.out.println(now);
        System.out.println(future);
        System.out.println(now.compareTo(future));

    }
}
