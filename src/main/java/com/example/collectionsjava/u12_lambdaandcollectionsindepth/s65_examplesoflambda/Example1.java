package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s65_examplesoflambda;

public class Example1 {
    public static void main(String[] args) {
//        FunInterfaceExample i = new ImplFunInterfaceExample();
        FunInterfaceExample i = () ->
                System.out.println("Function without any argument and return type.");
    }
}

interface FunInterfaceExample {
    void funMethod();
}

//class ImplFunInterfaceExample implements FunInterfaceExample {
//    @Override
//    public void funMethod() {
//        System.out.println("Function without any argument and return type.");
//    }
//}
