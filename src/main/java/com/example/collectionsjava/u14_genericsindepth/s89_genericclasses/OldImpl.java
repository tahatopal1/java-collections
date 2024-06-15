package com.example.collectionsjava.u14_genericsindepth.s89_genericclasses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class OldImpl {

//    private String data;
    private Object data; // When I wanted to have also integer values, converted it to Object
}
