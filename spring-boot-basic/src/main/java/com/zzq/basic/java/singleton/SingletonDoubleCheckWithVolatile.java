package com.zzq.basic.java.singleton;

public class SingletonDoubleCheckWithVolatile {

    private SingletonDoubleCheckWithVolatile() {

    }

    //volatile，保证虚拟机指令不会被重排序，防止抛出空指针异常
    private static volatile SingletonDoubleCheckWithVolatile instance = null;

    public static SingletonDoubleCheckWithVolatile getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckWithVolatile.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckWithVolatile();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        SingletonDoubleCheckWithVolatile s1 = SingletonDoubleCheckWithVolatile.getInstance();
        for (int i = 0; i < 100; i++) {
            System.out.println(s1 == SingletonDoubleCheckWithVolatile.getInstance());
        }
    }

}
