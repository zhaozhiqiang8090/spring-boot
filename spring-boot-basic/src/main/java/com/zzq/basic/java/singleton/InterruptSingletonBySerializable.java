package com.zzq.basic.java.singleton;

import java.io.*;

public class InterruptSingletonBySerializable implements Serializable {

    private InterruptSingletonBySerializable() {

    }

    private static final InterruptSingletonBySerializable instance = new InterruptSingletonBySerializable();

    public static InterruptSingletonBySerializable getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    public static void main(String[] args) {
        try {
            InterruptSingletonBySerializable s1 = InterruptSingletonBySerializable.getInstance();
            File objectF = new File("E:/object");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objectF));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(objectF));
            InterruptSingletonBySerializable s2 = (InterruptSingletonBySerializable) in.readObject();
            in.close();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
