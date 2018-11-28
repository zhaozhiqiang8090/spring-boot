package com.zzq.basic.java.singleton;

public class SafeSingletonBySynchronized implements ParentSingleton {

    private SafeSingletonBySynchronized() {

    }

    private static SafeSingletonBySynchronized instance;

    public static synchronized SafeSingletonBySynchronized getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (instance == null) {
            instance = new SafeSingletonBySynchronized();
        }

        return instance;
    }

//    public static SafeSingletonBySynchronized getInstance() {
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        synchronized (SafeSingletonBySynchronized.class) {
//            if (instance == null) {
//                instance = new SafeSingletonBySynchronized();
//            }
//        }
//
//        return instance;
//    }

}
