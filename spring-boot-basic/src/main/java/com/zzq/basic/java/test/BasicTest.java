/**
 *
 */
package com.zzq.basic.java.test;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

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
        int[] data = {1, 2, 3, 4, 5, 6};
//        subPage(6, data, 1, 7);
        Map map = new ConcurrentHashMap();
        new LinkedBlockingQueue<>();
        new ArrayBlockingQueue<>(16);

    }

    public static void subPage(int count, int[] data, int pageNo, int pageSize) {
        if (pageNo * pageSize >= count) {
            System.out.println("超过分页范围");
        }
        for (int i = pageNo * pageSize; i < pageNo * pageSize + pageSize && i < count; i++) {
            System.out.println(data[i]);
        }
    }

}
