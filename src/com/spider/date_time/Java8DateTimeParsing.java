package com.spider.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class Java8DateTimeParsing {

    // Java 8 uses 'uuuu' for year, not 'yyyy'. In Java 8, ‘yyyy’ means “year of era” (BC or AD).
    static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(
            "uuuu-MM-dd"
    );

    static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(
            "uuuu-MM-dd'T'HH:mm:ss.SSSS"
    );

    private static LocalDate parseDate(String date) {
        LocalDate parsedDate = LocalDate.parse(date,
                DATE_FORMATTER.withResolverStyle(ResolverStyle.STRICT)); // try STRICT, SMART or LENIENT
        return parsedDate;
    }

    private static LocalDateTime parseDateTime(String dateTime) {
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime,
                DATE_TIME_FORMATTER.withResolverStyle(ResolverStyle.STRICT));
        return parsedDateTime;
    };

    public static void main(String[] args) {
        System.out.println("Parsed Date :: " + parseDate("2019-02-27"));
        System.out.println("Parsed Date :: " + parseDate("2019-02-28"));
        System.out.println("Parsed Date :: " + parseDate("2019-02-29"));

        System.out.println("Parsed DateTime :: " + parseDateTime("2019-02-27T11:23:56.1234"));
        System.out.println("Parsed DateTime :: " + parseDateTime("2019-02-28T11:23:56.1234"));
        System.out.println("Parsed DateTime :: " + parseDateTime("2019-02-29T11:23:56.1234"));
    }
}
