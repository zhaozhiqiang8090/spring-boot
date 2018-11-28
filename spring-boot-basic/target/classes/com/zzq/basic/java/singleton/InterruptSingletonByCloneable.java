// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InterruptSingletonByCloneable.java

package com.zzq.basic.java.singleton;

import java.io.PrintStream;

public class InterruptSingletonByCloneable
    implements Cloneable
{

    private InterruptSingletonByCloneable()
    {
    }

    public static InterruptSingletonByCloneable getInstance()
    {
        return instance;
    }

    public static void main(String args[])
    {
        try
        {
            InterruptSingletonByCloneable s1 = getInstance();
            InterruptSingletonByCloneable s2 = (InterruptSingletonByCloneable)s1.clone();
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static final InterruptSingletonByCloneable instance = new InterruptSingletonByCloneable();

}
