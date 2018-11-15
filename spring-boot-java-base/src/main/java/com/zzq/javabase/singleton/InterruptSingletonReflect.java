package com.zzq.javabase.singleton;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InterruptSingletonReflect {
    private final static InterruptSingletonReflect INSTANCE  = new InterruptSingletonReflect();
//    private InterruptSingletonReflect(){
//
//    }
    public static InterruptSingletonReflect getInstance(){
        return INSTANCE;
    }

    //resolver(but it seams that some mistake has occurred)
    private static int COUNT = 0;
    private InterruptSingletonReflect() throws RuntimeException{
        COUNT ++;
        if(COUNT > 1){
            throw new RuntimeException("can not be construct more than once");
        }
    }

    public static void main(String[] args) {
        try {
            InterruptSingletonReflect s1 = InterruptSingletonReflect.getInstance();
            Constructor<InterruptSingletonReflect> c = InterruptSingletonReflect.class.getDeclaredConstructor();
            c.setAccessible(true);
            InterruptSingletonReflect s2 = c.newInstance();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
