package com.zzq.basic.java.generic;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ReflectInGeneric {
    public static void main(String[] args) throws IllegalArgumentException, SecurityException, IllegalAccessException, InvocationTargetException,
            NoSuchMethodException {
        // ArrayList<Integer> array = new ArrayList<Integer>();
        // array.add(1);// 这样调用add方法只能存储整形，因为泛型类型的实例为Integer
        // array.getClass().getMethod("add", Object.class).invoke(array, "asd");
        // for (int i = 0; i < array.size(); i++) {
        //
        // // Integer integer = array.get(i);
        // System.out.println(array.get(i));
        // System.out.println(array.get(i).getClass().getName());
        // }

        // List listOfRawTypes = new ArrayList();
        // listOfRawTypes.add("abc");
        // listOfRawTypes.add(123); //编译器允许这样 - 运行时却会出现异常
        // Object item = listOfRawTypes.get(1); //需要显式的类型转换
        // System.out.println(item);

    }

    public static void fillNumberList(List<? super Number> list) {
        list.add(new Integer(0));
        list.add(new Float(1.0));
        
        for(Object object : list) {
            System.out.println(object);
        }
    }

    public static void printIntValue(List<? extends Number> list) {
        list.add(null);
        
        for (Number number : list) {
            System.out.print(number.intValue() + " ");
        }
    }

}
