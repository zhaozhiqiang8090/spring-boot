// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericTest.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.zzq.basic.java.generic:
//            GenericClass, GenericMethod, Qualifier, GenericThrowable

public class GenericTest
{

    public GenericTest()
    {
    }

    private static void genericClassTest()
    {
        GenericClass genericClass = new GenericClass("gc1");
        System.out.println(((String)genericClass.getField()).getClass());
        System.out.println("----------");
    }

    private static void genericMethodTest()
    {
        String serial[] = {
            "abc", "123", " "
        };
        Object o1 = GenericMethod.getMiddle(serial);
        System.out.println(o1.getClass());
        Object o2 = GenericMethod.getMiddle(new Serializable[] {
            "213", Integer.valueOf(0), "12"
        });
        System.out.println(o2.getClass());
        (new GenericMethod()).sayHi1("abc");
        (new GenericMethod()).sayHi1(Integer.valueOf(123));
        (new GenericMethod()).sayHi2(Integer.valueOf(123));
        (new GenericMethod()).sayHi3(com/zzq/basic/java/generic/GenericClass);
        System.out.println("----------");
    }

    private static void limitTest()
    {
        GenericClass gc1 = new GenericClass();
        GenericClass gc2 = gc1;
        System.out.println(gc1.getClass() == gc2.getClass());
        GenericClass gc3[] = null;
        gc3 = (GenericClass[])new GenericClass[10];
    }

    private static void qualifierTest()
    {
        Qualifier qualifier = new Qualifier();
        List list = new ArrayList();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        qualifier.setField(list);
    }

    private static void genericThrowableTest()
    {
        GenericThrowable obj = new GenericThrowable();
        obj.doWork(new RuntimeException("why?"));
    }

    public static void main(String args[])
    {
        genericThrowableTest();
    }
}
