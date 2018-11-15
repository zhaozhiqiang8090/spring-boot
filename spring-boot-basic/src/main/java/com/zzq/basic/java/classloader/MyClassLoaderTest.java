package com.zzq.basic.java.classloader;

public class MyClassLoaderTest {
    public static void main(String[] args) throws Exception {
        MyClassLoader mcl = new MyClassLoader();
        ClassLoaderUtils clUtils = new ClassLoaderUtils();
//        MyClassLoader mcl = new MyClassLoader(ClassLoader.getSystemClassLoader());
//        MyClassLoader mcl = new MyClassLoader(ClassLoader.getSystemClassLoader().getParent());
//        Class<?> c1 = Class.forName("classloader.Person", true, mcl);
        Class<?> c1 = mcl.findClass("com.oracle.net.Sdp");
//        Class<?> c1 = clUtils.findClass("com.oracle.net.Sdp");
//        System.out.println("/classloader/Person".indexOf('/'));
//        Class<?> c1 = clUtils.findClass("classloader.Person");
        System.out.println(c1.getClassLoader());
        Object obj = c1.newInstance();
//        System.out.println(obj);
//        System.out.println(obj.getClass().getClassLoader());
    }
}
