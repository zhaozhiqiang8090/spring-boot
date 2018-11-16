package com.zzq.basic.java.threadpool;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String> {

    private int id;

    public MyCallableTask(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        System.out.println("线程:" + id + " -> 运行...");

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("线程:" + id + " -> 结束.");
        return "返回的字符串" + id;
    }
}
