package com.zzq.basic.java.clone;

public class User implements Cloneable {

    private String name;

    private int age;

    public static String type = "U";

    public String type1 = "U1";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        System.out.println("user clone method execute");
        return (User) super.clone();
    }
}
