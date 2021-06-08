package com.spider.streams_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 100, 23, 93, 99);

/*
     Integer min = numbers.stream()
             .min((number1, number2) -> number1 < number2 ? -1 : 1)
             .get();
*/
        // Conversely, use natural order
        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println("Minimum is " + min);

        Integer max = numbers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum is " + max);
    }
}
