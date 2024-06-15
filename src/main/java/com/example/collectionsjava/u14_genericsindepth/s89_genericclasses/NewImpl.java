package com.example.collectionsjava.u14_genericsindepth.s89_genericclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class NewImpl<T> {

    // T type parameter
    private T data;

}
