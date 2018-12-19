package com.zzq.basic.java.clone;

public class Student extends User {

    public static String type = "S";

    public String type1 = "S1";

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        System.out.println("student clone method execute");
        return (Student) super.clone();
    }
}
