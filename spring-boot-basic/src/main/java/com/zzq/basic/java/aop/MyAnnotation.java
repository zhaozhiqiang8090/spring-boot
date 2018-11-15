/**
 * 
 */
package com.zzq.basic.java.aop;

import java.lang.annotation.*;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月28日 下午1:13:32
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation {

    String value() default "";
}
