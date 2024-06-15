package com.example.collectionsjava.u14_genericsindepth.s96_genericsmethods;

import java.util.List;

public class Demo {

    // Generic Constructor
    public <T> Demo(List<T> list) {
        list.forEach(System.out::println);
    }

    // Generic method
    public static <T> String concat(T data) {
        return "Data is: " + data;
    }

    public static void main(String[] args) {
        System.out.println("***** Generic Method Example *****");
        System.out.println(concat("John"));
        System.out.println(concat(43));

        System.out.println("***** Generic Constructor Example *****");
        Demo demo = new Demo(List.of(1, 2, 3));
    }
}
