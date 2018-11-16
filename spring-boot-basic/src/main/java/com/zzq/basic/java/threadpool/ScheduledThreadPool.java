package com.zzq.basic.java.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String... args) {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        scheduledThreadPool.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 3 seconds");
            }
        }, 3, TimeUnit.SECONDS);

        scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and execute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);

        scheduledThreadPool.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("delay 1 seconds, and execute every 3 seconds");
            }
        }, 1, 3, TimeUnit.SECONDS);
    }
}
