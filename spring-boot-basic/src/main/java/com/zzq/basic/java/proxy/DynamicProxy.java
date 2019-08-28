package com.zzq.basic.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(object, args);
        after();
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Hello hello = new HelloImpl();
        DynamicProxy dynamicProxy = new DynamicProxy(hello);
        Hello helloProxy = dynamicProxy.getProxy();
        helloProxy.say("SB");
    }

}
