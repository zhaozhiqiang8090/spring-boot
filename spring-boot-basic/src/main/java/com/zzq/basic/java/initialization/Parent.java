package com.zzq.basic.java.initialization;

public class Parent {

    static {
        System.out.println("static block of Parent initializing!");
    }

    {
        System.out.println("non static blocks in Parent is initialized");
    }

    public Parent() {
        System.out.println("Parent constructor!");
    }
}
