package com.zzq.basic.java.string;

public class StringTest {

    public static void main(String[] args) {
        char value1[] = {'a', 'b'};
        MyString st1 = new MyString(value1);
        MyString st2 = new MyString(st1);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1 == st2);
        System.out.println("----------");

        char value2[] = {'c'};
        st2 = new MyString(value2);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st1 == st2);
    }

}
