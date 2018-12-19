package com.zzq.basic.java.generic.reflect;

import java.util.ArrayList;

public class ReflectInGenericTest {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.getClass().getMethod("add", Object.class).invoke(array, "asd");

        for (Object o : array) {
            System.out.println(o);
            System.out.println(o.getClass().getName());
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
            System.out.println(array.get(i).getClass().getName());
        }
    }

}
