// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EnumerationSingleton.java

package com.zzq.basic.java.singleton;

import java.io.*;
import java.lang.reflect.Constructor;

// Referenced classes of package com.zzq.basic.java.singleton:
//            ParentSingleton

public final class EnumerationSingleton extends Enum
    implements ParentSingleton, Cloneable, Serializable
{

    public static EnumerationSingleton[] values()
    {
        return (EnumerationSingleton[])$VALUES.clone();
    }

    public static EnumerationSingleton valueOf(String name)
    {
        return (EnumerationSingleton)Enum.valueOf(com/zzq/basic/java/singleton/EnumerationSingleton, name);
    }

    private EnumerationSingleton(String s, int i)
    {
        super(s, i);
    }

    public static EnumerationSingleton getInstance()
    {
        return INSTANCE;
    }

    private static void cloneableTest()
    {
        try
        {
            EnumerationSingleton s1 = getInstance();
            EnumerationSingleton s2 = (EnumerationSingleton)s1.clone();
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void reflectTest()
    {
        try
        {
            EnumerationSingleton s1 = getInstance();
            Constructor c = com/zzq/basic/java/singleton/EnumerationSingleton.getDeclaredConstructor(new Class[0]);
            c.setAccessible(true);
            EnumerationSingleton s2 = (EnumerationSingleton)c.newInstance(new Object[0]);
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void serializableTest()
    {
        try
        {
            EnumerationSingleton s1 = getInstance();
            File objectF = new File("E:/object1");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(objectF));
            out.writeObject(s1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(objectF));
            EnumerationSingleton s2 = (EnumerationSingleton)in.readObject();
            in.close();
            System.out.println((new StringBuilder()).append("\u662F\u5355\u4F8B\u4E48\uFF1F").append(s1 == s2).toString());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String args1[])
    {
    }

    public static final EnumerationSingleton INSTANCE;
    private static final EnumerationSingleton $VALUES[];

    static 
    {
        INSTANCE = new EnumerationSingleton("INSTANCE", 0);
        $VALUES = (new EnumerationSingleton[] {
            INSTANCE
        });
    }
}
