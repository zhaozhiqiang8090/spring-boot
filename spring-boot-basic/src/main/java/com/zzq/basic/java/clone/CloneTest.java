package com.zzq.basic.java.clone;

public class CloneTest {

    public static void main(String[] args) {
        try {
            User us = new Student("us", 111);
            User us1 = us.clone();
            us1.setName("us1");
            System.out.println("name:" + us.getName() + " age:" + us.getAge());
            System.out.println("name:" + us1.getName() + " age:" + us1.getAge());
            System.out.println("type:" + us.type);
            System.out.println("type1:" + us.type1);
            System.out.println("type:" + ((Student)us).type);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
