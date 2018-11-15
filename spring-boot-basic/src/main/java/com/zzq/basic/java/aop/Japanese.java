/**
 * 
 */
package com.zzq.basic.java.aop;

import org.springframework.stereotype.Component;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月28日 上午11:43:35
 */
@Component
public class Japanese {

    @MyAnnotation
    public String sayHello(String name) {
        System.out.println("-- japanese sayHello() --");
        return name + " hello, AOP";
    }

    public void eat(String food) {
        System.out.println("我正在吃：" + food);
    }
}
