package com.spider.streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceAndFlatMap {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer reduce = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        //or

        Integer reduce2 = Arrays.stream(arr)
                .reduce(0, Integer::sum);
        System.out.println("reduced value is " + reduce+" or "+reduce2);

        // FlatMap
        List<List<String>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList("A", "B", "C")));
        list.add(new ArrayList<>(Arrays.asList("1", "2", "3")));
        list.add(new ArrayList<>(Arrays.asList("1A", "2B", "3C")));
        list.add(new ArrayList<>(Arrays.asList("A1", "B2", "C3")));

        System.out.println("before flatmap -> " + list);

        List<String> collect = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("after flatmap -> " + collect);
    }
}
