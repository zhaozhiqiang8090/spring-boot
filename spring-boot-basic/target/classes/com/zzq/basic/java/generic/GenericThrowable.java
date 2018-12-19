// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericThrowable.java

package com.zzq.basic.java.generic;

import java.io.FileReader;

public class GenericThrowable
{

    public GenericThrowable()
    {
    }

    public void doWork(Throwable t)
        throws Throwable
    {
        FileReader filereader;
        try
        {
            filereader = new FileReader("notfound.txt");
        }
        catch(Throwable cause)
        {
            t.initCause(cause);
            throw t;
        }
    }
}
