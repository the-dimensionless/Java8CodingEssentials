package com.spider.streams_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingData {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Sumit", "India"));
        list.add(new User("Zeus", "India"));
        list.add(new User("Shweta", "India"));
        list.add(new User("Tony", "UK"));
        list.add(new User("Vladimir", "Russia"));
        list.add(new User("Eichner", "Germany"));
        list.add(new User("Puzzo", "Italian"));
        list.add(new User("Mario", "Italian"));

        Map<String, List<User>> grouping = list.stream()
                .collect(Collectors.groupingBy(User::getCountry));
        grouping.forEach((country, users) -> {
            System.out.println("------ country ------ " + country);
            users.forEach(i -> System.out.println(i.name));
        });

    }
}

class User {
    String name;
    String country;

    public User(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
