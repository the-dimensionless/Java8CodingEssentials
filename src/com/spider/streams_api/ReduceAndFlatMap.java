package com.spider.streams_api;

import java.util.Arrays;

public class ReduceAndFlatMap {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer reduce = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        //or

        Integer reduce2 = Arrays.stream(arr)
                .reduce(0, Integer::sum);
        System.out.println("reduced value is " + reduce+" or "+reduce2);
    }
}
