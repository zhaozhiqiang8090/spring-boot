// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UnSafeSingletonLazy.java

package com.zzq.basic.java.singleton;


// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class UnSafeSingletonLazy
    implements ParentSingleton
{

    private UnSafeSingletonLazy()
    {
    }

    public static UnSafeSingletonLazy getInstance()
    {
        if(instance == null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            instance = new UnSafeSingletonLazy();
        }
        return instance;
    }

    private static UnSafeSingletonLazy instance;
}
