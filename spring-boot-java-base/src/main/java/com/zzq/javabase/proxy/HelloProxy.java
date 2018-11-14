package com.zzq.javabase.proxy;

public class HelloProxy implements Hello {

    private Hello hello;
    
    public HelloProxy() {
        hello = new HelloImpl();
    }
    
    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }

    @Override
    public void say(String name) {
        before();
        hello.say(name);
        after();
    }
    
    public static void main(String[] args) {
        Hello hello = new HelloProxy();
        hello.say("Tom");
    }
    
}
