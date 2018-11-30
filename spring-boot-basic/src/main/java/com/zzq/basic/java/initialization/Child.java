package com.zzq.basic.java.initialization;


public class Child extends Parent implements ParentInitialOrder{

    static {
        System.out.println("static block of Child initializing!");
    }

    {
        System.out.println("non static blocks in Child is initialized");
    }

    public Child() {
        System.out.println("Child constructor!");
    }

}
