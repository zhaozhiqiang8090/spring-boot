/**
 *
 */
package com.zzq.basic.java.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

        public User(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        ThreadLocalRandom random = ThreadLocalRandom.current();
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
