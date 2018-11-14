/**
 * 
 */
package com.zzq.javabase.static_;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年8月22日 下午6:04:41
 */
public class TestStaticCon1 {

    public static int a = 0;
    static {
        a = 10;
        System.out.println("父类的静态代码块在执行a=" + a);
    }

    {
        a = 8;
        System.out.println("父类的非静态代码块在执行a=" + a);
    }

    public TestStaticCon1() {
//        this("a在父类带参构造方法中的值：" + a); // 调用另外一个构造方法

        System.out.println(a);
        System.out.println("父类无参构造方法在执行a=" + a);
    }

    public TestStaticCon1(String n) {
        this();
        System.out.println(n);
        System.out.println(a);
    }

    public static void main(String[] args) {
        TestStaticCon1 tsc = null;
        System.out.println("!!!!!!!!!!!!!!!!!!!!!");
//        tsc = new TestStaticCon();
        tsc = new TestStaticCon1("111");
    }
}
