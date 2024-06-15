package com.example.collectionsjava.u02_arraysindepth.s09_variableassignments;

public class Demo {
    public static void main(String[] args) {
        int[] x = new int[2];
        int[] y = x;

        x[0] = 1;
        System.out.println(x[0]); // 1
        System.out.println(y[0]); // 1 (Same reference)

        y[1] = 2;
        System.out.println(x[1]); // 2
        System.out.println(y[1]); // 2 (Same reference)

        // ------------------------

        int[] a = {1, 2, 3};
        int[] b = {11, 22};
        a = b;

        System.out.println("Traversing a...");
        for (int elm: a) {
            System.out.println(elm);
        }

        System.out.println("Traversing b...");
        for (int elm: b) {
            System.out.println(elm);
        }

        // ------------------------

        String[] s = new String[3];
        Object[] objArr = s; // This is valid (Upcasting)

        // Example below is not valid
        // short[] shrts = new short[2]; --> [S
        // int[] ints = shrts;           --> [I

        // [I, cannot be upcasted to [S as they have no relationship

    }
}
