package com.zzq.basic.java.singleton;

public enum SingletonEnum {

    INSTANCE;

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingletonEnum s1= SingletonEnum.getInstance();
        SingletonEnum s2= SingletonEnum.getInstance();
        System.out.println(s1==s2);

        System.out.println("-----------------");

        System.out.println(s1.hashCode()+"\t"+s2.hashCode());

    }

}
