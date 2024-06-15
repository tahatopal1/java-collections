package com.example.collectionsjava.u02_arraysindepth.s04_multidimensionalarrays;

public class Demo {
    public static void main(String[] args) {

        // 2 dimensional
        int[][] x = new int[3][]; // Required to specify base size
        x[0] = new int[3];
        x[1] = new int[1];
        x[2] = new int[2];

        // 3 dimensional
        int[][][] z = new int[2][][];

        z[0] = new int[3][];
        z[1] = new int[3][];

        z[0][0] = new int[3];
        z[0][1] = new int[1];
        z[0][2] = new int[2];

        z[1][0] = new int[3];
        z[1][1] = new int[1];
        z[1][2] = new int[2];

        z[0][0][0] = 1;

    }
}
