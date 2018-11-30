package com.zzq.basic.java.initialization;

/**
 * 通过 new InitialOrder2(); 实例化对象，执行顺序：
 * 1.静态域、静态代码块
 * 2.其他构造方法（若有）
 * 3.非静态域、非静态代码块
 * 4.最底层构造方法
 */
public class InitialOrder2 implements ParentInitialOrder {

    public static int a = 0;

    static {
        a = 10;
        System.out.println("父类的静态代码块在执行a=" + a);
    }

    public int b = 0;

    {
        a = 8;
        System.out.println("父类的非静态代码块在执行a=" + a);
    }

    public InitialOrder2() {
        this("a在父类带参构造方法中的值：" + a); // 调用另外一个构造方法
        System.out.println(a);
        System.out.println("父类无参构造方法在执行a=" + a);
    }

    public InitialOrder2(String n) {
//        this();
        System.out.println(n);
        System.out.println(a);
    }

}
