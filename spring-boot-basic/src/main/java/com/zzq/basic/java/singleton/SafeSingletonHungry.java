package com.zzq.basic.java.singleton;

public class SafeSingletonHungry implements ParentSingleton{

    private SafeSingletonHungry() {

    }

    /**
     * 1.
     */
//    private static final SafeSingletonHungry instance = new SafeSingletonHungry();

    /**
     * 2.
     */
    private static final SafeSingletonHungry instance;

    static {
        instance = new SafeSingletonHungry();
    }

    public static SafeSingletonHungry getInstance() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instance;
    }

}
