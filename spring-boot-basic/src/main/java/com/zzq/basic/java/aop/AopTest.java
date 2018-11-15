/**
 * 
 */
package com.zzq.basic.java.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月28日 上午11:49:49
 */
@RestController
public class AopTest {

    // 这里必须使用Person接口做注入
    @Autowired
    private Person chinese;

    @Autowired
    private Japanese japanese;

    @RequestMapping("/aop/{type}")
    public String cglib(@PathVariable String type) {
        if ("cglib".equals(type)) {
            japanese.sayHello(type);
            return japanese.getClass().toString();
        } else {
            chinese.sayHello(type);
            return chinese.getClass().toString();
        }
    }
    
    @RequestMapping("/aop/hello")
    public String hello() {
        return "hello!";
    }
    
    @RequestMapping("/aop/hello2")
    public String hello2() {
        return "hello2!";
        
    }

}
