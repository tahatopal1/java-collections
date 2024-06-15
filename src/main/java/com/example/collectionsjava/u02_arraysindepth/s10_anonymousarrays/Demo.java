package com.example.collectionsjava.u02_arraysindepth.s10_anonymousarrays;

public class Demo {
    public static void main(String[] args) {

        // Cannot be use alone, meant to be used right after it was created
        // new int[] {1, 2, 3} (An anonymous array)

        // Cannot specify the size, as it's unnecessary. It gives compile time error
        // new int[3] {1, 2, 3} (Invalid)

        // For instance, we can pass it as a param
        sum(new int[]{1, 2, 3});

    }

    private static void sum(int[] arr) {
        int total = 0;
        for(int elm: arr) {
            total += elm;
        }
        System.out.println(total);
    }
}
