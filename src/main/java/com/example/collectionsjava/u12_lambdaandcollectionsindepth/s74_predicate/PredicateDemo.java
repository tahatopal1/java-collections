package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s74_predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    // Predicate is a predefined functional interface that checks a condition and returns a boolean value.
    // It has a single abstract method called 'test'

    public static void main(String[] args) {

        // Imperative
        int salary = 3000;
        boolean result = salaryCheck(salary);
        System.out.println("Result: " + result);

        // Declarative
        Predicate<Integer> p = i -> i >= 4000;
        result = p.test(salary);
        System.out.println("Result: " + result);

    }

    private static boolean salaryCheck(int salary) {
        if (salary >= 4000) {
            return true;
        } else {
            return false;
        }
    }

}
