package com.example.collectionsjava.u12_lambdaandcollectionsindepth.s78_doublecolonoperator;

public class DoubleColonMethodReference {
    public static void main(String[] args) {
        MyFunInterfaceNew funInter = () -> System.out.println("I am a Lambda");
        funInter.method1();
    }

    public static void method2() {
        System.out.println("I am not a Lambda");
    }

    public void method3() {
        System.out.println("I am not a Lambda");
    }

}

interface MyFunInterfaceNew {
    void method1();
}

class NewCallerClass {
    public static void main(String[] args) {
        MyFunInterfaceNew i = DoubleColonMethodReference :: method2;
        i.method1();

        DoubleColonMethodReference obj = new DoubleColonMethodReference();
        MyFunInterfaceNew i1 = obj::method3;
        i1.method1();

        obj.method3();

    }
}

