package pl.com.empas.java_introductory_course.time.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalField;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate future = LocalDate.now().plusDays(1);
        LocalDateTime past = LocalDateTime.now().with(LocalTime.of(17, 18));

        System.out.println(date);
        System.out.println(future);
        System.out.println(past);

        System.out.println(date.compareTo(future));
        System.out.println(future.compareTo(past.toLocalDate()));

    }
}
