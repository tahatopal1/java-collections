package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s62_functionalinterfaces;

// Functional Interfaces can numerous default and static methods besides one abstract method
public interface ValidFunInterface2 {
    void method1();

    // Default method
    default void method2() {}

    // Static method
    static void method3() {}
}
