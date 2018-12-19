// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Qualifier.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;
import java.util.Collection;

public class Qualifier
{

    public Qualifier()
    {
    }

    public Collection getField()
    {
        return field;
    }

    public void setField(Collection field)
    {
        System.out.println(field.size());
        this.field = field;
    }

    private Collection field;
}
