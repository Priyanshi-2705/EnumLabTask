package main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int totalNumberOfDays;

    Months(int totalNumberOfDays) {
        this.totalNumberOfDays = totalNumberOfDays;
    }

    public int getTotalNumberOfDays() {
        return totalNumberOfDays;
    }
}

class nowCalendar {
    public static void main(String[] args) {


        System.out.println(
                new GregorianCalendar().getDisplayName(
                        Calendar.MONTH,
                        Calendar.LONG,
                        Locale.US
                )
        );
        Scanner scanner = new Scanner(System.in);
        String currentMonthName = new GregorianCalendar().getDisplayName(
                Calendar.MONTH,
                Calendar.LONG,
                Locale.US
        ).toUpperCase();
        System.out.println("Current Month is " + currentMonthName + " !");
    }
}

//Months thisMonth = Months.valueOf(currentMonthName);