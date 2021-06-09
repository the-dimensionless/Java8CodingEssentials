package com.spider.streams_api;

import java.util.Arrays;

public class SimpleStats {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5 ,6, 7, 8, 9};

        // counts based on the predicate logic
        Long count = Arrays.stream(arr)
                .filter(i -> i % 3 == 0 )
                .count();
        System.out.println("Count of 3 = " + count );

        // Min and max without comparators
        int max = Arrays.stream(arr)
                .mapToInt(Integer::valueOf)
                .max()
                .getAsInt();
        int min = Arrays.stream(arr)
                .mapToInt(Integer::valueOf)
                .min()
                .getAsInt();
        System.out.println(String.format(" Max is %d and Min is %d", max, min));
    }
}
