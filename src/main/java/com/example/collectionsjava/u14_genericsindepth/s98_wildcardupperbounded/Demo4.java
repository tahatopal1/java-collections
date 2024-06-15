package com.example.collectionsjava.u14_genericsindepth.s98_wildcardupperbounded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Demo4 {

    // With bounded example

    public static void main(String[] args) {

        // Another valid example
        DataNode3<Double> node22 = new DataNode3<>(20.9, null);
        DataNode3<Number> node11 = new DataNode3<>(20.9, node22);
        System.out.println(node11);

        // Now, this is also a valid example
        DataNode3<String> node111 = new DataNode3<>("Hello World", null);
        // node11.setNext(node111); Invalid as String is not a subtype of Number
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class DataNode3<E> {
    private E data;
    private DataNode3<? extends Number> next;
}
