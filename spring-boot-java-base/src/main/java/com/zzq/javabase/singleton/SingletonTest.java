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
public class SingletonTest {
    
    static {
        System.out.println("SingletonTest初始化完成");
    }

    private SingletonTest() {
    }

    private static class SingletonTestHelp {
        private static SingletonTest instance = new SingletonTest();
        static {
            System.out.println("SingletonTestHelp初始化完成");
        }
    }

    public static SingletonTest getInstance() {
        return SingletonTestHelp.instance;
    }
    
    public static void main(String...args) {
        SingletonTest test1 = SingletonTest.getInstance();
        SingletonTest test2 = SingletonTest.getInstance();
        System.out.println(test1 == test2);
    }
}
