package com.zzq.javabase.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibProxy implements MethodInterceptor {

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(object, args);
        after();
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }
    
    public static void main(String[] args) {
        CGLibProxy cgLibProxy = new CGLibProxy();
        HelloImpl hello = cgLibProxy.getProxy(HelloImpl.class);
        hello.say("jack");
    }

}
