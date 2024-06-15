package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s76_consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

    // Consumer is a predefined functional interface that is used to perform on a single argument without returning
    // ... any result
    // It has a single abstract method 'accept' with a 'void' return type.

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Hello World");
    }
}
