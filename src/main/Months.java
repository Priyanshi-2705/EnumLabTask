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

        String currentMonthName = new GregorianCalendar().getDisplayName(
                Calendar.MONTH,
                Calendar.LONG,
                Locale.US
        ).toUpperCase();
        System.out.println("Current Month is " + currentMonthName + " !");
        Months thisMonth = Months.valueOf(currentMonthName);

        switch (thisMonth) {
            case JANUARY -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in January!"
            );
            case FEBRUARY -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in February!"
            );
            case MARCH -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in March!"
            );
            case APRIL -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in April!"
            );
            case MAY -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in May!"
            );
            case JUNE -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in June!"
            );
            case JULY -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in July!"
            );
            case AUGUST -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in August!"
            );
            case SEPTEMBER -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in September!"
            );
            case OCTOBER -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in October!"
            );
            case NOVEMBER -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in November!"
            );
            case DECEMBER -> System.out.println(
                    "We have " + thisMonth.getTotalNumberOfDays() + " days in December!"
            );
            default -> System.out.println("Please check the name of the month! ");
        }
        System.out.println("Please enter today's date: ");
        Scanner scanner = new Scanner(System.in);
        int currentDate = scanner.nextInt();
        System.out.println("Current date is " + currentDate + " !");
        scanner.close();

        int remainingDayInMonth = thisMonth.getTotalNumberOfDays() - currentDate;
        System.out.println(remainingDayInMonth + " days left in " + currentMonthName + " !");


    }
}



