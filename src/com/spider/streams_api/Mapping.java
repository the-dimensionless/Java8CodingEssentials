package com.spider.streams_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapping {
    public static void main(String[] args) {
        // Transform from one dataType to another using .map()
        List<CustomerEntity> list = new ArrayList<CustomerEntity>();
        list.add(new CustomerEntity("Sumit", "Singh", 24, "American"
                , "LA, California", true));
        list.add(new CustomerEntity("Anthony", "Stark", 44, "Indian"
                , "Ranchi, Jharkhand", false));

        List<CustomerDTO> listOfDTOs = list.stream()
                .map(person -> new CustomerDTO(person.getFirstName(), person.getNationality(), person.isPrimeMember()))
                .collect(Collectors.toList());
        listOfDTOs.forEach(System.out::println);
    }
}

class CustomerEntity {
    String firstName;
    String lastName;
    int age;
    String address;
    String Nationality;
    boolean isPrimeMember;

    public CustomerEntity(String firstName, String lastName, int age, String address, String nationality, boolean isPrimeMember) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        Nationality = nationality;
        this.isPrimeMember = isPrimeMember;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public boolean isPrimeMember() {
        return isPrimeMember;
    }

    public void setPrimeMember(boolean primeMember) {
        isPrimeMember = primeMember;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", isPrimeMember=" + isPrimeMember +
                '}';
    }
}

class CustomerDTO {
    String firstName;
    String Nationality;
    boolean isPrimeMember;

    public CustomerDTO(String firstName, String nationality, boolean isPrimeMember) {
        this.firstName = firstName;
        Nationality = nationality;
        this.isPrimeMember = isPrimeMember;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "firstName='" + firstName + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", isPrimeMember=" + isPrimeMember +
                '}';
    }
}