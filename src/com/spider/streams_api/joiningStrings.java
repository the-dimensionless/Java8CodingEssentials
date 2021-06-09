package com.spider.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningStrings {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Greek", "Sanskrit", "Hebrew", "Sumerian", "Egyptian");

        // joining into one string which is comma separated
        String collect = names.stream()
                .collect(Collectors.joining());
        System.out.println(collect);

        String collectByComma = names.stream()
                .collect(Collectors.joining(","));
        System.out.println(collectByComma);

        String collectByDot = names.stream()
                .collect(Collectors.joining("."));
        System.out.println(collectByDot);

        String collectByPipe = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining("|"));
        System.out.println(collectByPipe);
    }
}
