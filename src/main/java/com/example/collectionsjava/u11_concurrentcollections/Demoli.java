package com.example.collectionsjava.u11_concurrentcollections;

import java.util.stream.Stream;

public class Demoli {
    public static void main(String[] args) {
        Stream.iterate(0, i -> (i + 1) % 10)
                .limit(28)
                .parallel()
                .distinct()
                .forEach(System.out::println);
    }
}
