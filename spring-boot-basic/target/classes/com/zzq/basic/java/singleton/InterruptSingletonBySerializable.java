// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InterruptSingletonBySerializable.java

package com.zzq.basic.java.singleton;

import java.io.*;

public class InterruptSingletonBySerializable
    implements Serializable
{

    private InterruptSingletonBySerializable()
    {
    }

    public static InterruptSingletonBySerializable getInstance()
    {
        return instance;
    }

    public static void main(String args[])
    {
        try
        {
            InterruptSingletonBySerializable s1 = getInstance();
            File objectF = new File("E:/object");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objectF));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(objectF));
            InterruptSingletonBySerializable s2 = (InterruptSingletonBySerializable)in.readObject();
            in.close();
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static final InterruptSingletonBySerializable instance = new InterruptSingletonBySerializable();

}
