// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   UnSafeSingletonByDoubleCheck.java

package com.zzq.basic.java.singleton;


// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public class UnSafeSingletonByDoubleCheck
    implements ParentSingleton
{

    private UnSafeSingletonByDoubleCheck()
    {
    }

    public static UnSafeSingletonByDoubleCheck getInstance()
    {
        if(instance == null)
            synchronized(com/zzq/basic/java/singleton/UnSafeSingletonByDoubleCheck)
            {
                if(instance == null)
                    instance = new UnSafeSingletonByDoubleCheck();
            }
        return instance;
    }

    private static UnSafeSingletonByDoubleCheck instance = null;

}
