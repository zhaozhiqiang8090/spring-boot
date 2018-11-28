package com.zzq.basic.java.singleton;

public class UnSafeSingletonLazy implements ParentSingleton{

    private UnSafeSingletonLazy() {

    }

    private static UnSafeSingletonLazy instance;

    public static UnSafeSingletonLazy getInstance() {

        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            instance = new UnSafeSingletonLazy();
        }

        return instance;
    }

}
