package com.zzq.basic.java.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

public enum EnumerationSingleton implements ParentSingleton, Cloneable, Serializable {

    INSTANCE;

    EnumerationSingleton() {

    }

    public static EnumerationSingleton getInstance() {
        return INSTANCE;
    }

    private static void cloneableTest() {
        try {
            EnumerationSingleton s1 = EnumerationSingleton.getInstance();
            EnumerationSingleton s2 = (EnumerationSingleton) s1.clone();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void reflectTest() {
        try {
            EnumerationSingleton s1 = EnumerationSingleton.getInstance();
            Constructor<EnumerationSingleton> c = EnumerationSingleton.class.getDeclaredConstructor();
            c.setAccessible(true);
            EnumerationSingleton s2 = c.newInstance();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serializableTest() {
        try {
            EnumerationSingleton s1 = EnumerationSingleton.getInstance();
            File objectF = new File("E:/object1");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objectF));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(objectF));
            EnumerationSingleton s2 = (EnumerationSingleton) in.readObject();
            in.close();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        cloneableTest();
//        reflectTest();
//        serializableTest();
//        new EnumerationSingleton();
    }

}
