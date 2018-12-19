package com.zzq.basic.java.generic;

public class GenericMethod<T> {

    /**
     * 泛型方法
     * 静态方法必须自己声明类型，不可使用类中声明的类型
     * @param a
     * @param <T>
     * @return
     */
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    /**
     * 泛型方法
     * T为方法自己声明的类型，与类中声明的类型无关
     *
     * @param t
     * @param <T>
     */
    public <T> void sayHi1(T t) {
        System.out.println("Hi: " + t);
        System.out.println(t.getClass());
    }

    /**
     * 成员方法
     * T使用类中声明的类型
     *
     * @param t
     */
    public void sayHi2(T t) {
        System.out.println("Hi: " + t);
        System.out.println(t.getClass());
    }

    public void sayHi3(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hi " + t.getClass());
        System.out.println("Hi " + c);
    }

//    public static T getInstance() {
//    } //error
//
//    public static void print(T t) {
//    } //error

    public static <T> T getInstance(T t) {
        return null;
    } //ok

    public static <T> void print(T t) {
    } //ok

}
