// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericMethod.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;

public class GenericMethod
{

    public GenericMethod()
    {
    }

    public static transient Object getMiddle(Object a[])
    {
        return a[a.length / 2];
    }

    public void sayHi1(Object t)
    {
        System.out.println((new StringBuilder()).append("Hi: ").append(t).toString());
        System.out.println(t.getClass());
    }

    public void sayHi2(Object t)
    {
        System.out.println((new StringBuilder()).append("Hi: ").append(t).toString());
        System.out.println(t.getClass());
    }

    public void sayHi3(Class c)
    {
        Object t = null;
        try
        {
            t = c.newInstance();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println((new StringBuilder()).append("Hi ").append(t.getClass()).toString());
        System.out.println((new StringBuilder()).append("Hi ").append(c).toString());
    }

    public static Object getInstance(Object t)
    {
        return null;
    }

    public static void print(Object obj)
    {
    }
}
