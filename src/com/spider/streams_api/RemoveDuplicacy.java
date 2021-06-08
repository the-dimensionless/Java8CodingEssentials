package com.spider.streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicacy {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,2,3,4,5,5,5,6,7,6);
        List<Integer> distinctList = list.stream()
                                            .distinct()
                                            .collect(Collectors.toList());
        System.out.println("Number of distinct elements "+ distinctList.size());
        System.out.println(distinctList.toString());

        // Conversely, we can convert them to a Set
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("Number of set elements "+ set.size());
        System.out.println(set.toString());

    }
}
