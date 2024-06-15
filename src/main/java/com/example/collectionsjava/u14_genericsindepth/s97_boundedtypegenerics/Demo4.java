package com.example.collectionsjava.u14_genericsindepth.s97_boundedtypegenerics;

public class Demo4 {

    // Bounded Type With Multiple Interfaces

    public static void main(String[] args) {

        // This one is valid as CBound1 implements both the interfaces
        CBound1 cBound1 = new CBound1();
        getSortedData(cBound1);

        // This one is not valid as CBound2 has to implement both of them
        CBound2 cBound2 = new CBound2();
        // getSortedData(cBound2);
    }

    public static <T extends IBound1 & IBound2> void getSortedData(T t) {

    }

}

interface IBound1 {}
interface IBound2 {}

class CBound1 implements IBound1, IBound2 {}
class CBound2 implements IBound1 {}