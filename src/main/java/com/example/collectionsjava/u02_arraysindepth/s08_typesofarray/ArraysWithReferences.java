package com.example.collectionsjava.u02_arraysindepth.s08_typesofarray;

public class ArraysWithReferences {
    public static void main(String[] args) {

        // Object type
        // Any reference type could be added into the array
        Object[] objects = new Object[5];
        objects[0] = new Object();
        objects[1] = new String();

        // Abstract class type
        // Only extending types could be added as we cannot create an object from an abstract class
        Number[] numbers = new Number[3];
        numbers[0] = new Integer(1);
        numbers[1] = new Double(2);

        // Interface type
        // Only extending types could be added as we cannot create an object from an interface
        Runnable[] r = new Runnable[5];
        r[0] = new Thread();
        System.out.println(r[1]); // Prints null as reference value are initialized as null

    }
}
