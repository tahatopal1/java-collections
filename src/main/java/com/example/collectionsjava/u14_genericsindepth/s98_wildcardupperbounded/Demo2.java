package com.example.collectionsjava.u14_genericsindepth.s98_wildcardupperbounded;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Demo2 {
    public static void main(String[] args) {

        // Valid example
        DataNode<Integer> node2 = new DataNode<Integer>(20, null);
        DataNode<Integer> node1 = new DataNode<Integer>(20, node2);
        System.out.println(node1);

        // Another valid example
        DataNode<Double> node22 = new DataNode<>(20.9, null);
        DataNode<Double> node11 = new DataNode<>(20.9, node22);
        System.out.println(node11);

        // Invalid example
        DataNode<Number> node111 = new DataNode<>(Double.valueOf(35.8), null);
        // node111.setNext(node22);
        // Meaning you try to do `DataNode<Number> next = new DataNode<Double>(20.9, null)`

    }
}

@Getter
@Setter
@AllArgsConstructor
@ToString
class DataNode<E> {
    private E data;
    private DataNode<E> next;
}
