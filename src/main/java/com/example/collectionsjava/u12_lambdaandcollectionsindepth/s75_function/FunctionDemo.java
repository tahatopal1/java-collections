package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s75_function;

import java.util.function.Function;

public class FunctionDemo {

    // Function is a predefined functional interface that has a return value and an argument in specified type.
    // It has a single abstract method called 'apply'

    public static void main(String[] args) {

        // Imperative
        String s = "HelloWorld";
        int len = callLength(s);
        System.out.println("Length: " + len);

        // Declarative
        Function<String, Integer> fun = str -> str.length();
        len = fun.apply(s);
        System.out.println("Length: " + len);

    }

    private static int callLength(String s) {
        return s.length();
    }

}
