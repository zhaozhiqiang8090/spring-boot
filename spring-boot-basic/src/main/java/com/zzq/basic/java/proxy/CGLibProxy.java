package com.zzq.basic.java.proxy;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.util.ResourceUtils;

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
        //代理类class文件存入本地磁盘
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\code");
        try {
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, ResourceUtils.getURL("classpath:").getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }

        CGLibProxy cgLibProxy = new CGLibProxy();
        HelloImpl hello = cgLibProxy.getProxy(HelloImpl.class);
        hello.say("jack");
    }

}
