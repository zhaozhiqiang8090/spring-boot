package com.zzq.basic.java.singleton;

import java.lang.reflect.Constructor;

public class InterruptSingletonByReflect {

    private static int count = 0;

//    private InterruptSingletonByReflect() {
//        System.out.println("count: " + ++count);
//    }

    private InterruptSingletonByReflect() throws RuntimeException {
        try {
            System.out.println("count: " + ++count);
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (count > 1) {
            throw new RuntimeException("can not be construct more than once");
        }
    }

    private final static InterruptSingletonByReflect instance = new InterruptSingletonByReflect();

    public static InterruptSingletonByReflect getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        try {
            InterruptSingletonByReflect s1 = InterruptSingletonByReflect.getInstance();
            Constructor<InterruptSingletonByReflect> c = InterruptSingletonByReflect.class.getDeclaredConstructor();
            c.setAccessible(true);
            InterruptSingletonByReflect s2 = c.newInstance();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
