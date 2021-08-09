package com.spider.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8DateTime {

    public static void main(String[] args) {

        // Local Date

        LocalDate date = LocalDate.now(); // It is used to obtain the current date from the system clock in the default time-zone.

        System.out.println(String.format("Current Date from Sys Clock: %s", date)); // 2021-08-09
        // utility (param in Long format)
        System.out.println("On Adding 1 day: " + date.plusDays(1));
        System.out.println("On Adding 2 months: " + date.plusMonths(2));
        System.out.println("On Adding 3 years: " + date.plusYears(2));
        System.out.println("On Adding 4 weeks: " + date.plusWeeks(4));
        System.out.println("On Subtracting 4 weeks: " + date.minusWeeks(4));
        System.out.println("On Subtracting 3 years: " + date.minusYears(3));
        System.out.println("On Subtracting 2 months: " + date.minusMonths(2));
        System.out.println("On Subtracting 1 day: " + date.minusDays(1));

        System.out.println("Are we in Leap Year ? " + date.isLeapYear());

        LocalDate d1 = LocalDate.of(2021, 8, 8);
        System.out.println("Comparing today & yesterday's date: " + d1.compareTo(date)); // how +- is d1 from date

        LocalDate date1 = LocalDate.of(2021, 01, 01);
        LocalDate date2 = LocalDate.of(2021, 01, 01);
        System.out.println("Are two equal ? " + date1.equals(date2));

        LocalDateTime datetime = date.atTime(1,50,9);
        DateTimeFormatter inBuiltFormatter1 = DateTimeFormatter.ISO_DATE;
        System.out.println("Formatted Date in ISO DATE : " + date.format(inBuiltFormatter1));
        System.out.println("Formatted DateTime in ISO DATE TIME : " + datetime.format(DateTimeFormatter.ISO_DATE_TIME));

        // Custom date time patterns (Date, DateTime, ZoneDateTime)
        DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Custom Formatted Date : " + date.format(customFormatter));

        DateTimeFormatter customFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' hh:mm:ss a");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Custom Formatted DateTime: " + dateTime.format(customFormatter2));

        DateTimeFormatter customFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy 'at' hh:mm:ss a z");
        //Zoned datetime instance
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("Custom Formatted ZonedDate Time: " + zdt.format(customFormatter3));
        System.out.println("Custom Formatted ZonedDate Time: " + customFormatter3.format(zdt)); // same as above

    }
}