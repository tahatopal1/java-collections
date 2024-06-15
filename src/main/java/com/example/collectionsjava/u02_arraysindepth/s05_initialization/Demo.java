package com.example.collectionsjava.u02_arraysindepth.s05_initialization;

public class Demo {
    public static void main(String[] args) {
        int[] x;
        // x = {1, 2, 3}; --> Not valid

        int[] y = {1, 2, 3, 4, 5}; // Has to be initialized it at a time

        System.out.println("Initialized");

        int[] z = new int[3]; // [0, 0, 0]
        System.out.println(z[0]);
        System.out.println(z[1]);
        System.out.println(z[2]);

        z[0] = 10;
        z[1] = 20;
        z[2] = 30;

        System.out.println("After changed");
        for (int elm: z) {
            System.out.println(elm);
        }

        // Gives the object reference
        System.out.println("Printing directly the array: " + z);

        // --------------------------

        int[][] a;
        int[][] b = new int[2][];

        System.out.println("Multi-dimensional examples");

        // Prints null, as it wasn't initialized yet
        System.out.println(b[0]);

        try {
            System.out.println(b[0][0]);
        } catch (Exception e) {
            System.out.println("This one gives error: " + e.getMessage());
        }

        // Now, sub-arrays are initialized
        b[0] = new int[2];
        b[1] = new int[3];
        System.out.println(b[0][0]);

        b[0][0] = 55;
        System.out.println(b[0][0]);

        System.out.println("Another way of creating multi-dimensional array");
        int[][] c = {{1, 2, 3}, {6, 7}};

        for (int[] array: c) {
            for (int elm: array) {
                System.out.println(elm);
            }
        }

    }
}
