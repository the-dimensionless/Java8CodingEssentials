package com.spider.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class JavaClassicalDateTime {

    static void demoUtilDate() {
        // java.util.Date
        Date date = new Date();
        System.out.println("Date is :: " + date);

        Long timeMS = System.currentTimeMillis();
        Date d2 = new Date(timeMS);
        System.out.println("Current TS " + timeMS);
        System.out.println("Date from time is :: " + d2);

        System.out.println("To Instant :: " + date.toInstant());
        System.out.println("GET TIME :: " + date.getTime());
        System.out.println("is after :: " + date.after(d2));
        System.out.println("is before :: " + date.before(d2));
    }

    static void demoSqlDate() {
        /*The java.sql.Date class represents only date in java. It inherits java.util.Date class.
        The java.sql.Date instance is widely used in JDBC because it represents the date that can be stored in database.*
         */
        Long timeMS = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(timeMS);
        System.out.println("SQL Date :: "+date);

        String s = "2021-09-08";
        java.sql.Date date1 = java.sql.Date.valueOf(s);
        System.out.println("String to SQL Date :: "+date1);

        LocalDate localDate = date1.toLocalDate();
        System.out.println("Local Date :: "+localDate.format(DateTimeFormatter.ofPattern(
                "dd-MM-yyy"
        )));
    }

    static void demoCalendar() {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar current date " + calendar.getTime());
        System.out.println("Calendar current Date " + calendar.get(Calendar.DATE) + " : ");
        System.out.println("Calendar current month " + calendar.get(Calendar.MONTH) + " : ");
        System.out.println("Calendar current year " + calendar.get(Calendar.YEAR));

        calendar.add(Calendar.DATE, -15);
        System.out.println("15 days ago "+ calendar.getTime());

        calendar.add(Calendar.MONTH, 2);
        System.out.println("2 months after "+ calendar.getTime());

        calendar.add(Calendar.YEAR, 1);
        System.out.println("1 year after "+ calendar.getTime());

    }

    public static void main(String[] args) {
        demoCalendar();
    }
}
