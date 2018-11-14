package com.zzq.javabase.initialization;


public class Child extends Parent {

    static {
        System.out.println("static block of Child initializing!");
    }

    {
        System.out.println("non static blocks in Child is initialized");
    }

    public Child() {
        System.out.println("Child constructor!");
    }

    public static void main(String[] args) {
//        System.out.println(pString);
        Child child = null;
        child = new Child();
        System.out.println(child.toString());
    }
}
