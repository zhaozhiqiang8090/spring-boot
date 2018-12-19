// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericClass.java

package com.zzq.basic.java.generic;


public class GenericClass
{

    public GenericClass()
    {
    }

    public GenericClass(Object field)
    {
        this.field = field;
    }

    public Object getField()
    {
        return field;
    }

    public void setField(Object field)
    {
        this.field = field;
    }

    public void something()
    {
    }

    private Object field;
}
