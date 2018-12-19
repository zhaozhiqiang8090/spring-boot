// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Son.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;

// Referenced classes of package com.zzq.basic.java.generic:
//            Parent

public class Son extends Parent
{

    public Son()
    {
    }

    public void setName(String name)
    {
        System.out.println((new StringBuilder()).append("son:").append(name).toString());
    }

    public void setName2(String name)
    {
        System.out.println((new StringBuilder()).append("son:").append(name).toString());
    }

    public static void main(String args[])
    {
        Son son = new Son();
        son.setName("s abc");
        son.setName2("s2 abc");
        System.out.println("----------");
        Parent p = son;
        p.setName(new Object());
        p.setName("ps abc");
        ((Son)p).setName2("ps2 abc");
        System.out.println("----------");
        Parent parent = new Parent();
        parent.setName("p abc");
        parent.setName(new Object());
    }

    public volatile void setName(Object obj)
    {
        setName((String)obj);
    }
}
