package com.example.collectionsjava.u14_genericsindepth.s97_boundedtypegenerics;

public class Demo3 {

    // Bounded Type With Interface

    public static void main(String[] args) {
        IBound iBound = new CBound();
        getSortedData(iBound);
    }

    public static <T extends IBound> void getSortedData(T t) {

    }

}

interface IBound {}

class CBound implements IBound {}
