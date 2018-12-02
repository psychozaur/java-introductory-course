package com.podstaw.od.java.rybicki.marcin.switch_test;

import com.podstaw.od.java.rybicki.marcin.switch_test.Months;

public class SwitchTest {

    public static void checkMark(int mark) {
        if (mark == 6 || mark == 5) {
            System.out.println("reward");
        } else if (mark == 4) {
            System.out.println("alright");
        } else if (mark == 3) {
            System.out.println("whatever, son");
        } else if (mark == 2) {
            System.out.println("no money this month");
        } else if (mark == 1) {
            System.out.println("you're not my child anymore");
        }
    }

    public static void checkMarkWithSwitch(final int mark) {
        switch (mark) {
            case 6:
            case 5:
                System.out.println("Great");
                break;
            case 4:
            case 3:
                System.out.println("Good");
                break;
            default:
                System.out.println("wrr");

        }
    }

    public static int noOfDaysInMonth(Months months) {
        switch (months) {
//            case JANUARY:
//            case MARCH:
//            case MAY:
//            case JULY:
//            case AUGUST:
//            case OCTOBER:
//            case DECEMBER:
//                return 31;
            case FEBRUARY:
                return 28;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;

        }
    }

    public static int noOfDaysInMonthByString(String months) {
        switch (months) {
            case "February":
                return 28;
            case "April":
            case "June":
            case "September":
            case "November":
                return 30;
            default:
                return 31;

        }
    }

    public static void changeInt(int a) {
        a = 6;
        System.out.println("'a' inside method: " + a);
    }

    public static void main(String[] args) {

        final int a = 5;
        changeInt(a);
        System.out.println("'a' after method call: " + a);

        checkMarkWithSwitch(6);
        checkMarkWithSwitch(3);
        checkMarkWithSwitch(2);

        //final pieczętuje jedynie referencję, a nie obiekt, który możemy modyfikować
        final StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append(2);
        builder.reverse();

        System.out.println(noOfDaysInMonthByString("April"));


    }
}
