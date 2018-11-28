// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InterruptSingletonByReflect.java

package com.zzq.basic.java.singleton;

import java.io.PrintStream;
import java.lang.reflect.Constructor;

public class InterruptSingletonByReflect
{

    private InterruptSingletonByReflect()
    {
        System.out.println((new StringBuilder()).append("count: ").append(++count).toString());
    }

    public static InterruptSingletonByReflect getInstance()
    {
        return instance;
    }

    public static void main(String args[])
    {
        try
        {
            InterruptSingletonByReflect s1 = getInstance();
            Constructor c = com/zzq/basic/java/singleton/InterruptSingletonByReflect.getDeclaredConstructor(new Class[0]);
            c.setAccessible(true);
            InterruptSingletonByReflect s2 = (InterruptSingletonByReflect)c.newInstance(new Object[0]);
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static int count = 0;
    private static final InterruptSingletonByReflect instance = new InterruptSingletonByReflect();

}
