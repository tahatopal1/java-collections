package com.example.collectionsjava.u02_arraysindepth.s06_playingwithsyntax;

public class Demo {
    public static void main(String[] args) {

        int[] x1;
        int [] x2;
        int []x3;

        // int[3] x4; INVALID

        int x5[], x6[];
        //int x7[], []x8; INVALID
        int []x9, x10[]; // x9 is 1D, x10 is 2D

        int[][] x11;
        int [][]x12;
        int [][] x13;

        int []x14[];
        int x15[][];
        int[][] x16, x17;

        int[] x18[], x19; // x18 is 2D, x19 is 1D
        int[] []x20, x21; // Both are 2D
        int [] [] [] x22, x23; // Both are 3D

        // int [][] x24 = new int [][4]; INVALID

        int [][][] x25 = new int[3][4][5];
        int [][][] x26 = new int[3][4][];
        // int [][][] x27 = new int[3][][5];  INVALID
        //int [][][] x28 = new int[][4][5];   INVALID

        // As a result, JVM omits spaces
        // In terms of the syntax; int [][] x = int[][] x = int [][]x

    }
}
