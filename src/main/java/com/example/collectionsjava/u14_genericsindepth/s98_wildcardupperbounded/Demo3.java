package com.example.collectionsjava.u14_genericsindepth.s98_wildcardupperbounded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Demo3 {
    public static void main(String[] args) {
        // Valid example
        DataNode2<Integer> node2 = new DataNode2<Integer>(20, null);
        DataNode2<Integer> node1 = new DataNode2<Integer>(20, node2);
        System.out.println(node1);

        // Another valid example
        DataNode2<Double> node22 = new DataNode2<>(20.9, null);
        DataNode2<Double> node11 = new DataNode2<>(20.9, node22);
        System.out.println(node11);

        // Now, this is also a valid example
        DataNode2<Number> node111 = new DataNode2<>(Double.valueOf(35.8), null);
        node111.setNext(node22);
    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class DataNode2<E> {
    private E data;
    private DataNode2<?> next;
}
