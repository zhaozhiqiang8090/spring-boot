package com.zzq.javabase.singleton;

public class InterruptSingletonCloneable implements Cloneable{
    private final static InterruptSingletonCloneable INSTANCE  = new InterruptSingletonCloneable();
    private InterruptSingletonCloneable() {

    }
    public static InterruptSingletonCloneable getInstance(){
        return INSTANCE;
    }

    //resolver
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return INSTANCE;
    }

    public static void main(String[] args) {
        try {
            InterruptSingletonCloneable s1 = InterruptSingletonCloneable.getInstance();
            InterruptSingletonCloneable s2 = (InterruptSingletonCloneable) s1.clone();
            System.out.println("是单例么？" + (s1 == s2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
