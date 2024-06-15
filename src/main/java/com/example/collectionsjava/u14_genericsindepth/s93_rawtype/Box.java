package com.example.collectionsjava.u14_genericsindepth.s93_rawtype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Box<T> {
    private List<T> boxList;
}
