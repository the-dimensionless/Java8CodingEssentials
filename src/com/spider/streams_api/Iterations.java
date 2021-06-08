package com.spider.streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Iterations {
    public List<Person> getDummyList() {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Spock", 14));
        list.add(new Person("Arrebcer", 16));
        list.add(new Person("Ankur", 18));
        list.add(new Person("Zeus", 24));
        list.add(new Person("Assassin", 34));
        list.add(new Person("CoolGuy2", 44));
        return list;
    }
    public static void main(String[] args) {

        // imperative -> For loop from 0 to 9
        // functional ->
        IntStream.range(0, 10).forEach(index -> System.out.println(index)); // 0-9
        IntStream.rangeClosed(0, 10).forEach(System.out::println); // 0-10

        // IntStream using user defined Class
        List<Person> list = new Iterations().getDummyList();
        IntStream.range(0, list.size()).forEach(index -> System.out.println(list.get(index).toString()));

    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
