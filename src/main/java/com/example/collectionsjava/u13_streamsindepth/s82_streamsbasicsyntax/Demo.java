package com.example.collectionsjava.u13_streamsindepth.s82_streamsbasicsyntax;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        // Imperative
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        List<Integer> nList = new ArrayList<>();
        for (Integer i : list) {
            if (i >= 30) {
                nList.add(i);
            }
        }

        System.out.println(nList);

        // Streams
        // Filter
        List<Integer> l1 = list.stream().filter(i -> i >= 30).collect(Collectors.toList());
        System.out.println(l1);

        // Map
        List<Integer> l2 = list.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println(l2);

        // Count
        long count = list.stream().filter(i -> i >= 30).count();
        System.out.println("Count: " + count);

        // Default Natural Sorting
        System.out.println("***** Default Natural Sorting *****");
        List<Integer> l3 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(l3);

        // Custom Sorting With Comparator
        System.out.println("***** Custom Sorting *****");
        List<Integer> l4 = list.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

        // Another way
        //List<Integer> l4 = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(l4);

        System.out.println("***** MAX And MIN *****");
        list.stream().max(Integer::compareTo).ifPresent(i -> System.out.println("Max: " + i));
        list.stream().min(Integer::compareTo).ifPresent(i -> System.out.println("Min: " + i));

        System.out.println("***** forEach() *****");
        list.stream().forEach(System.out::println);

    }
}
