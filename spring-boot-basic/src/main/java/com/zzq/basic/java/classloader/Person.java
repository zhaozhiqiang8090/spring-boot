package com.zzq.basic.java.classloader;

public class Person {
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am a person, my name is " + name;
    }
}
