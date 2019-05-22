/**
 * 
 */
package com.zzq.basic.java.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年8月8日 下午4:27:10
 */
public class BasicTest {
    
    public static class User {
        
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Collections.synchronizedMap(map);
        Thread t = new Thread();
        ThreadLocal<String> tl = new ThreadLocal<String>();
        tl.get();
        tl.set("");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }
}
