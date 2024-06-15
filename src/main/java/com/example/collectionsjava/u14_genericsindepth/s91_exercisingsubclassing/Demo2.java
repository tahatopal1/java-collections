package com.example.collectionsjava.u14_genericsindepth.s91_exercisingsubclassing;

interface IInterface<T> {}

interface IInterface2 {}

interface IInterface3<T> {
    T mthd();
}


// Users have to specify the exact type if they want to a non-generic class to implement a generic interface or want
// ... a non-generic class to extend a generic class.
// public class IClass implements IInterface<T> {}

// Correct way (as you can see it can freely implement a non-generic interface
class IClass implements IInterface<Integer>, IInterface2 {}

// Another example
// This one is valid as both the class and interface have the same type
class IClass2<T> implements IInterface<T> {}

// Following one is not valid as they don't have the same type
//class IClass3<T> extends IClass2<T> implements IInterface<Integer> {}

// If you don't specify the type, it boils down to the generic type
class IClass4<T> implements IInterface3{
    @Override
    public Object mthd() {
        return null;
    }
}


public class Demo2 {
    public static void main(String[] args) {

    }
}
