/**
 * 
 */
package com.zzq.javabase.singleton;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月26日 上午10:19:19
 */
public class SingletonStaticInnerClass {
    
    static {
        System.out.println("SingletonTest初始化完成");
    }

    private SingletonStaticInnerClass() {
    }

    private static class SingletonHelper {
        private static SingletonStaticInnerClass instance = new SingletonStaticInnerClass();
        static {
            System.out.println("SingletonHelper初始化完成");
        }
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingletonHelper.instance;
    }
    
    public static void main(String...args) {
        System.out.println("-----");
        SingletonStaticInnerClass test1 = SingletonStaticInnerClass.getInstance();
        SingletonStaticInnerClass test2 = SingletonStaticInnerClass.getInstance();
        System.out.println(test1 == test2);
    }
}
