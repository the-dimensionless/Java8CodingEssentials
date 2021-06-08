package com.spider.streams_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filtering {
    final static Predicate<String> sub = s -> s.startsWith("Sub");
    public static void main(String[] args) {
        String array[] = {"Suburb", "Subsystem", "Soaring", "Sympathetic", "Semantics", "Subcutaneous"};

        List<String> filteredArray = Arrays.stream(array)
                .filter(sub)
                .collect(Collectors.toList());
        filteredArray.forEach(System.out::println);
    }
}
