package com.zzq.basic.java.singleton;

public class SafeSingletonByDoubleCheckWithVolatile implements ParentSingleton{

    private SafeSingletonByDoubleCheckWithVolatile() {

    }

    //volatile，保证虚拟机指令不会被重排序，防止抛出空指针异常
    private static volatile SafeSingletonByDoubleCheckWithVolatile instance = null;

    public static SafeSingletonByDoubleCheckWithVolatile getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (instance == null) {
            synchronized (SafeSingletonByDoubleCheckWithVolatile.class) {
                if (instance == null) {
                    instance = new SafeSingletonByDoubleCheckWithVolatile();
                }
            }
        }

        return instance;
    }

}
