package pl.com.empas.java_introductory_course.time.standard;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        calendar.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone().getDisplayName(Locale.getDefault()));
        System.out.println(calendar.get(Calendar.YEAR));
    }
}
