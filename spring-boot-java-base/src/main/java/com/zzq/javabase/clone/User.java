package com.zzq.javabase.clone;

public class User implements Cloneable{
    
    private static final String DW;
    
    static {
        DW = "";
    }
    
    @Override
    public User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }
}
