// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafeSingletonBySynchronized.java

package com.zzq.basic.java.singleton;


// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class SafeSingletonBySynchronized
    implements ParentSingleton
{

    private SafeSingletonBySynchronized()
    {
    }

    public static synchronized SafeSingletonBySynchronized getInstance()
    {
        try
        {
            Thread.sleep(1000L);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        if(instance == null)
            instance = new SafeSingletonBySynchronized();
        return instance;
    }

    private static SafeSingletonBySynchronized instance;
}
