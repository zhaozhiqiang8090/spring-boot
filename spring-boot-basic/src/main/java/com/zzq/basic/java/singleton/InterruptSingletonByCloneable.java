package com.zzq.basic.java.singleton;

public class InterruptSingletonByCloneable implements Cloneable{

    private InterruptSingletonByCloneable() {

    }

    private static final InterruptSingletonByCloneable instance  = new InterruptSingletonByCloneable();

    public static InterruptSingletonByCloneable getInstance(){
        return instance;
    }

    @Override
    protected Object clone() {
        return instance;
    }

    public static void main(String[] args) {
        try {
            InterruptSingletonByCloneable s1 = InterruptSingletonByCloneable.getInstance();
            InterruptSingletonByCloneable s2 = (InterruptSingletonByCloneable) s1.clone();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
