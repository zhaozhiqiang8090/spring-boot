package com.zzq.basic.java.generic;

import java.util.Collection;

public class Identifier<T extends Collection<T>> {

    private T field;

    public T getField() {
        return field;
    }

    public void setField(T field) {
        //可以使用限定类型List的方法
        System.out.println(field.size());
        this.field = field;
    }
}
