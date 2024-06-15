package com.example.collectionsjava.u11_concurrentcollections.s53_concurrenthashmapmethods;

import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) {

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(0, "John");
        map.put(1, "Tom");
        map.put(2, "Jack");

        System.out.println("**** PUT ****");

        // If key specified is allocated, replaces and returns the old value
        String n1 = map.put(2, "Tim");
        System.out.println("Returned value: " + n1);

        // If key specified is not allocated, returns the specified value
        String n2 = map.put(3, "Garry");
        System.out.println("Returned value: " + n2);

        System.out.println("Eventual result: " + map);

        System.out.println("**** PUT IF ABSENT ****");

        // Only puts if specified key isn't allocated

        // If key is allocated, returns the present value
        String n3 = map.putIfAbsent(3, "Mike");
        System.out.println("Returned value: " + n3);

        // If key isn't allocated, puts the new value returns null
        String n4 = map.putIfAbsent(4, "Jack");
        System.out.println("Returned value: " + n4);

        System.out.println("Eventual result: " + map);

        System.out.println("**** REMOVE ****");

        // If key is allocated, returns the removed value
        String n5 = map.remove(1);
        System.out.println("Returned value: " + n5);

        // If key isn't allocated, returns null
        String n6 = map.remove(10);
        System.out.println("Returned value: " + n6);

        System.out.println("Eventual result: " + map);

        System.out.println("**** REMOVE WITH VALUE ****");

        // If specified key is associated with specified value, removes the entry and returns true
        boolean n7 = map.remove(3, "Garry");
        System.out.println("Returned value: " + n7);

        // If specified key is not associated with specified value, removes the entry and returns true
        boolean n8 = map.remove(2, "Tom");
        System.out.println("Returned value: " + n8);

        System.out.println("Eventual result: " + map);

        System.out.println("**** REPLACE ****");

        // If key is allocated, replaces the old value with newly specified value, then returns the old one
        String n9 = map.replace(2, "Harry");
        System.out.println("Returned value: " + n9);

        // If key is not allocated, does nothing and returns null
        String n10 = map.replace(1, "Harry");
        System.out.println("Returned value: " + n10);

        System.out.println("Eventual result: " + map);

        System.out.println("**** REPLACE WITH VALUE ****");

        // If specified key is associated with specified value returns true and replaces the value with the new one
        boolean n11 = map.replace(4, "Jack", "Peter");
        System.out.println("Returned value: " + n11);


        // If specified key is not associated with specified value returns false and does nothing
        boolean n12 = map.replace(4, "Stan", "Tony");
        System.out.println("Returned value: " + n12);

        System.out.println("Eventual result: " + map);

    }
}
