package com.zzq.basic.java.threadlocal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalHashCodeTest {

    public static void main(String[] args) {
        AtomicInteger hashCode = new AtomicInteger();
        int hash_increment = 0x61c88647;
        int size = 32;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(hashCode.getAndAdd(hash_increment) & (size - 1));
        }
        System.out.println("original:" + list);
        Collections.sort(list);
        System.out.println("sort: " + list);
    }

}
