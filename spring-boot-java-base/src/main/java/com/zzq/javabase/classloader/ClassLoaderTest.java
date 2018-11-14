package com.zzq.javabase.classloader;

public class ClassLoaderTest {
    static class Cat {
        private String name;
        private int age;
        static {
            System.out.println("Cat is load");
        }
    }

    static class Dog {
        private String name;
        private int age;
        static {
            System.out.println("Dog is load");
        }
    }

    static class Const {
        static final int A = 100;
        static {
            System.out.println("Const init");
        }
    }

    static class Parent {
        static int a = 100;
        static {
            System.out.println("parent init！");
        }
    }

    static class Child extends Parent {
        static {
            System.out.println("child init！");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class c_dog = Dog.class;
        Class clazz = Class.forName("test.ClassLoaderTest$Cat", false, Cat.class.getClassLoader());
        // clazz = Class.forName("test.ClassLoaderTest$Cat");
        new ClassLoader() {
        }.loadClass("test.ClassLoaderTest$Cat");
        System.out.println(Const.A);
        System.out.println(Parent.a);
        Parent[] parents = new Parent[10];
    }
}
