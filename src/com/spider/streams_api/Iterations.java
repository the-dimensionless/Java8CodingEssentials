package com.spider.streams_api;

import java.util.stream.IntStream;

public class Iterations {
    public static void main(String[] args) {

        // imperative -> For loop from 0 to 9
        // functional ->
        IntStream.range(0, 10).forEach(index -> System.out.println(index)); // 0-9
        IntStream.rangeClosed(0, 10).forEach(System.out::println); // 0-10

    }
}
