package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s63_invokelambda;

@FunctionalInterface
public interface FunctionalInterfaceAnnoDemo {

    // Purpose of @FunctionalInterface

    // Ensures Validity: It ensures that the interface remains a functional interface by allowing only one abstract
    // ... method.

    // Compiler Check: The compiler will check and enforce the rule, ensuring no additional abstract methods are added.

    void method();

    // If you replace the comment in the method below, @FunctionalInterface will cause a compile time error.
     //void method2();
}
