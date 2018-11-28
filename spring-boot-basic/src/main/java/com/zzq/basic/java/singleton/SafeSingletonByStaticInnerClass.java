package com.zzq.basic.java.singleton;

public class SafeSingletonByStaticInnerClass implements ParentSingleton{
    
    static {
        System.out.println("SafeSingletonByStaticInnerClass初始化完成");
    }

    private SafeSingletonByStaticInnerClass() {
    }

    private static class SingletonHelper {
        private static SafeSingletonByStaticInnerClass instance = new SafeSingletonByStaticInnerClass();
        static {
            System.out.println("SingletonHelper初始化完成");
        }
    }

    public static SafeSingletonByStaticInnerClass getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return SingletonHelper.instance;
    }

}
