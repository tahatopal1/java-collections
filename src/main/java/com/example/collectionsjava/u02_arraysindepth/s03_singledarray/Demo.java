package com.example.collectionsjava.u02_arraysindepth.s03_singledarray;

public class Demo {
    public static void main(String[] args) {

        // We need 3 different variables to store 3 different integers
        int a = 12;
        int b = 13;
        int c = 14;

        int[] q = new int[3];
        q[0] = 12;
        q[1] = 13;
        q[2] = 14;

        System.out.println("q[0]: " + q[0]);
        System.out.println("q[1]: " + q[1]);
        System.out.println("q[2]: " + q[2]);

        // In java, there's a class for every type of array including primitives
        // That's why we use new keyword as we create an array
        int[] x = new int[1000]; // This size always fixed, single typed
        System.out.println(x.getClass().getName()); // Name: "[I" int array, not available on programmer layer

        int[] y = new int[0]; // This is valid

        // Allowed types for size decision: byte, short, char and it (as they could be promoted to int)
        int[] z = new int['a']; // This is also valid, promotes to int (ASCII value 97)

        // Negative size passes on compile time, throws NegativeArraySizeException on run time
        // int[] p = new int[-1]

        // Biggest array that could be created
        int[] w = new int[2147483647];

    }

}

