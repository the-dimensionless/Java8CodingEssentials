package com.spider.streams_api;

import java.util.Arrays;
import java.util.function.Predicate;

public class FindAnyOrFirst {
    final static Predicate<Integer> numbersLessThanTen = n -> n < 10;
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Find any returns any condition matching number
        int any = Arrays.stream(numbers)
                .filter(numbersLessThanTen)
                .findAny()
                .get();
        System.out.println("Any using Find Any is : " + any);

        int first = Arrays.stream(numbers)
                .filter(numbersLessThanTen)
                .findFirst()
                .get();
        System.out.println("Any using Find First is : " + first);

    }
}
