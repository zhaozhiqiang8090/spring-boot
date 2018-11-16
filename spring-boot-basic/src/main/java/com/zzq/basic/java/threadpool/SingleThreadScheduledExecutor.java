package com.zzq.basic.java.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SingleThreadScheduledExecutor {

    public static void main(String... args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newSingleThreadScheduledExecutor();

        System.out.println("SingleThreadScheduledExecutor start...");

        //单次执行
        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        //固定频率执行，绝对时间
        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and execute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

        //固定频率执行，相对时间
        scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and execute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

        System.out.println("SingleThreadScheduledExecutor end...");
    }
}
