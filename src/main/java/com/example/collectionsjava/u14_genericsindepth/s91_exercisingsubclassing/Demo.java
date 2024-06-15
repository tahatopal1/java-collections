package com.example.collectionsjava.u14_genericsindepth.s91_exercisingsubclassing;

class BaseData<T> {}

class Data<T> extends BaseData<T> implements IData<T> {

    // Type parameter
    private T data;

    public Data(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}

interface IData<T> {
    T getData();

    void setData(T data);
}

public class Demo {
    public static void main(String[] args) {
        // Subclassing
        Data<String> d4 = new Data<String>("D4");

        // This is invalid, generic type has to be the same.
        // BaseData<Integer> b1 = d4;

        // The correct way
        BaseData<String> b1 = d4;

    }
}
