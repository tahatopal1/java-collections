package com.example.collectionsjava.u14_genericsindepth.s93_rawtype;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Box<Integer> genBox = new Box<>(List.of(1,2,3));
        for (Integer i: genBox.getBoxList()) {
            System.out.println(i);
        }
    }
}
