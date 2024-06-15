package com.example.collectionsjava.u02_arraysindepth.s08_typesofarray;

public class ArraysWithPrimitives {
    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 'c'; // This is valid
        System.out.println(x[1]); // ASCII code: 99

        byte b = 2;
        x[2] = b; // This is also valid

        // x[1] and x[2] are examples of type promotion

        // Another example
        double[] y = new double[3];
        float z = 1.1f;

        y[0] = z; // Another type promotion

    }
}
