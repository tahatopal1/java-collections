package com.example.collectionsjava.u14_genericsindepth.s95_subtyping;

import com.example.collectionsjava.u14_genericsindepth.s93_rawtype.Box;

import java.util.List;

public class SquareBox<T> extends Box<T> {
    public SquareBox(List<T> boxList) {
        super(boxList);
    }
}
