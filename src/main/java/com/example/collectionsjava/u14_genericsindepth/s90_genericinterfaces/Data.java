package com.example.collectionsjava.u14_genericsindepth.s90_genericinterfaces;

public class Data<T> implements IData<T> {

    // T type parameter
    private T data;

    public Data(T t) {
        setData(t);
    }

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }
}
