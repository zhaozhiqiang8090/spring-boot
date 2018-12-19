// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ReflectInGeneric.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

public class ReflectInGeneric
{

    public ReflectInGeneric()
    {
    }

    public static void main(String args1[])
        throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
    }

    public static void fillNumberList(List list)
    {
        list.add(new Integer(0));
        list.add(new Float(1.0D));
        Object object;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.println(object))
            object = iterator.next();

    }

    public static void printIntValue(List list)
    {
        list.add(null);
        Number number;
        for(Iterator iterator = list.iterator(); iterator.hasNext(); System.out.print((new StringBuilder()).append(number.intValue()).append(" ").toString()))
            number = (Number)iterator.next();

    }
}
