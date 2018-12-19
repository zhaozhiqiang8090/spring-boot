package com.zzq.basic.java.generic;

public class GenericClass<T> {

    private T field;

//    //error
//    private static T singleton;

    public GenericClass() {

    }

    public GenericClass(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }

    public void something() {
//        T t= new T();//error
//        T.class.newInstance();//error
//        T.class;//error
    }

}
