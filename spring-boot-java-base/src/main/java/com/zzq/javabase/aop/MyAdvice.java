/**
 * 
 */
package com.zzq.javabase.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月28日 上午11:48:06
 */
@Aspect
@Component
public class MyAdvice {

    /**
     * 1.注解
     */
    @Pointcut("@annotation(com.zzq.javabase.aop.MyAnnotation)")
    public void pointcutAnnotation() {
    }

    @Before("pointcutAnnotation()")
    public void before() {
        System.out.println("before");
    }

    @After("pointcutAnnotation()")
    public void after() {
        System.out.println("after");
    }

    /**
     * 2.方法
     */
    @Pointcut("execution(* com.zzq.javabase.aop.*.**(..))")
    public void pointcutExcution() {
    }

    @Around(value = "pointcutExcution()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[Aspect1] around advise 1");
        Object result = pjp.proceed();
        System.out.println("[Aspect1] around advise2");
        return result;
    }

    /**
     * 3.包
     */
    @Pointcut(value = "within(com.zzq.javabase.aop.*)")
    public void pointcutWithin() {
    }

    @AfterReturning(value = "pointcutWithin()")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("[Aspect1] afterReturning advise");
    }

    @AfterThrowing(value = "pointcutWithin()")
    public void afterThrowing(JoinPoint joinPoint) {
        System.out.println("[Aspect1] afterThrowing advise");
    }

}
