package com.example.collectionsjava.u02_arraysindepth.s07_traversing;

public class Demo {
    public static void main(String[] args) {

        System.out.println("----- 1D Arrays -----");

        int[] a = new int[5];

        // Foreach loop
        System.out.println("----- For Each Loop -----");
        for (int e : a) {
            System.out.println(e);
        }

        // Standard loop
        System.out.println("----- Standard Loop -----");
        int len = a.length;
        for (int i = 0; i < len; i++) {
            a[i] = i + 1;
            System.out.println("Element at index: " + i + " is: " + a[i]);
        }

        System.out.println("----- 2D Arrays -----");

        System.out.println("----- For Each Loop -----");
        int[][] b = new int[2][3];
        for(int[] arr: b) {
            for (int e: arr) {
                System.out.println(e);
            }
        }

        System.out.println("----- Standard Loop -----");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = i + j;
                System.out.println(b[i][j]);
            }
        }


    }
}
