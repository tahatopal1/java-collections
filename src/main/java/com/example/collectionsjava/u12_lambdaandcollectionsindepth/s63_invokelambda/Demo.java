package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s63_invokelambda;

public class Demo {

    // Lambda expression provides a more concise way to implement the single abstract method of a functional interface.
    // It makes the code shorter and more maintainable.

    public static void main(String[] args) {

        // Old Way
        CallFunInterface callFunInterface = new CallFunInterface();
        callFunInterface.funMethod();

        // New Way
        // We can pass many different functionalities without creating a concrete classes.
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("FunctionalMethod");
        myFunctionalInterface.funMethod();

    }
}

interface MyFunctionalInterface {
    void funMethod();
}

class CallFunInterface implements MyFunctionalInterface {
    @Override
    public void funMethod() {
        System.out.println("FunctionalMethod");
    }
}
