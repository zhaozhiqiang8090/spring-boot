/**
 * 
 */
package com.zzq.javabase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年5月1日 下午5:15:20
 */
@RestController
public class BootControllerTest {

    @RequestMapping("/test")
    public String home() {
        return "Hello World!";
    }
    
//    @RequestMapping("/test1")
//    String test1() {
//        return "Hello World! 1";
//    }
}
