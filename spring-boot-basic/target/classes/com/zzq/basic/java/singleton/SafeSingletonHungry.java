// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafeSingletonHungry.java

package com.zzq.basic.java.singleton;


// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class SafeSingletonHungry
    implements ParentSingleton
{

    private SafeSingletonHungry()
    {
    }

    public static SafeSingletonHungry getInstance()
    {
        try
        {
            Thread.sleep(1000L);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return instance;
    }

    private static final SafeSingletonHungry instance = new SafeSingletonHungry();

}
