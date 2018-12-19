package com.zzq.basic.java.generic;

import java.util.Comparator;

public class Parent<T> implements Comparator {

    private T msg;

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Parent && o2 instanceof Parent) {
            if((Parent)o1 == (Parent) o2)
                return 0;
        }
        return 0;
    }

    public void setName(T name) {
        System.out.println("Parent:" + name);
    }

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}
