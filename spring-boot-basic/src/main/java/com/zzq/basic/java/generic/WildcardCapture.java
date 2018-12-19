package com.zzq.basic.java.generic;

public class WildcardCapture<T> {

    private T key;

    private T value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void swap(WildcardCapture<?> p) {
//        ? k=p.getKey();//error，?不可作为具体类型限定符
        Object k = p.getKey();//好吧，换成object，ok
//        p.setKey(p.getValue());//but,通配符类型不可做入参
//        p.setValue(k);
    }

    private static <T> void swapHelper(WildcardCapture<T> p) {
        T k = p.getKey();
        p.setKey(p.getValue());
        p.setValue(k);
    }

    /**
     * 只允许捕获单个、确定的类型
     * 如：ArrayList<Pair<?>> 是无法使用 ArrayList<Pair<T>> 捕获的
     *
     * @param p
     */
    public static void swapV2(WildcardCapture<?> p) {
        swapHelper(p);
    }

    public static <T> void show(WildcardCapture<T> p) {
        System.out.println("key:" + p.getKey() + " value:" + p.getValue());
        System.out.println("----------");
    }

}
