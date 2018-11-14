package com.zzq.javabase.singleton;

public enum SingleEnum {

    INSTANCE;

    public static SingleEnum getInstance() {
        return INSTANCE;
    }

    public static final SingleEnum s;

    static {
        s = INSTANCE;
        System.out.println("haha");
    }

}
