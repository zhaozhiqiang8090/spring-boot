package com.zzq.javabase.singleton;

import java.io.*;

public class InterruptSingletonSerializable implements Serializable{
    private final static InterruptSingletonSerializable INSTANCE  = new InterruptSingletonSerializable();
    private InterruptSingletonSerializable(){

    }
    public static InterruptSingletonSerializable getInstance(){
        return INSTANCE;
    }

    //resolver
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InterruptSingletonSerializable s1 = InterruptSingletonSerializable.getInstance();
        File objectF = new File("E:/object");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objectF));
        out.writeObject(s1);
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(objectF));
        InterruptSingletonSerializable s2 = (InterruptSingletonSerializable) in.readObject();
        in.close();
        System.out.println("是单例么？" + (s1 == s2));
    }
}
