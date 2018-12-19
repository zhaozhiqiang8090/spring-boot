// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Parent.java

package com.zzq.basic.java.generic;

import java.io.PrintStream;

public class Parent
{

    public Parent()
    {
    }

    public void setName(Object name)
    {
        System.out.println((new StringBuilder()).append("Parent:").append(name).toString());
    }
}
