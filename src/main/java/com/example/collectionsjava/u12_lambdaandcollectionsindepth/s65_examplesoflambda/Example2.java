package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s65_examplesoflambda;

public class Example2 {
    public static void main(String[] args) {
//        MyFunInterface funInterface = new CallFunInterface();
        MyFunInterface funInterface = (a, b) -> System.out.println("The sum of a and b is: " + (a + b));
        funInterface.funMethodAdd(10, 20);
    }
}

interface MyFunInterface {
    void funMethodAdd(int a, int b); // Arguments with no return type
}

//class CallFunInterface implements MyFunInterface {
//    @Override
//    public void funMethodAdd(int a, int b) {
//        System.out.println("The sum of a and b is: " + (a + b));
//    }
//}