// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafeSingletonByStaticInnerClass.java

package com.zzq.basic.java.singleton;

import java.io.PrintStream;

// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class SafeSingletonByStaticInnerClass
    implements ParentSingleton
{
    private static class SingletonHelper
    {

        private static SafeSingletonByStaticInnerClass instance = new SafeSingletonByStaticInnerClass();

        static 
        {
            System.out.println("SingletonHelper\u521D\u59CB\u5316\u5B8C\u6210");
        }


        private SingletonHelper()
        {
        }
    }


    private SafeSingletonByStaticInnerClass()
    {
    }

    public static SafeSingletonByStaticInnerClass getInstance()
    {
        try
        {
            Thread.sleep(1000L);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return SingletonHelper.instance;
    }


    static 
    {
        System.out.println("SafeSingletonByStaticInnerClass\u521D\u59CB\u5316\u5B8C\u6210");
    }
}
