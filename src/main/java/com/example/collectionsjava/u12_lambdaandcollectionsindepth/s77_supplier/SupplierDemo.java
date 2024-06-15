package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s77_supplier;

import java.util.function.Supplier;

public class SupplierDemo {

    // Supplier is a predefined functional interface that is used to supply a result without consuming any input.
    // It has a single abstract method 'get' with a return type but no input type.

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
