package com.zzq.basic.java.singleton;

public class UnSafeSingletonByDoubleCheck implements ParentSingleton{

    private UnSafeSingletonByDoubleCheck() {

    }

    private static UnSafeSingletonByDoubleCheck instance = null;

    public static UnSafeSingletonByDoubleCheck getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (instance == null) {
            synchronized (UnSafeSingletonByDoubleCheck.class) {
                if (instance == null) {
                    instance = new UnSafeSingletonByDoubleCheck();
                }
            }
        }

        return instance;
    }

}
