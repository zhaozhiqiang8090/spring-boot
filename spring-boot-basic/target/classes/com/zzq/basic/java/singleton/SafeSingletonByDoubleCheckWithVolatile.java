// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SafeSingletonByDoubleCheckWithVolatile.java

package com.zzq.basic.java.singleton;


// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class SafeSingletonByDoubleCheckWithVolatile
    implements ParentSingleton
{

    private SafeSingletonByDoubleCheckWithVolatile()
    {
    }

    public static SafeSingletonByDoubleCheckWithVolatile getInstance()
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
            synchronized(com/zzq/basic/java/singleton/SafeSingletonByDoubleCheckWithVolatile)
            {
                if(instance == null)
                    instance = new SafeSingletonByDoubleCheckWithVolatile();
            }
        return instance;
    }

    private static volatile SafeSingletonByDoubleCheckWithVolatile instance = null;

}
