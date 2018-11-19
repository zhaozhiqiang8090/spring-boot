package com.zzq.basic.java.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(3);

        new Thread(() -> {
            System.out.println("1开始");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1完成准备");
            latch.countDown();
        }).start();

        new Thread(() -> {
            System.out.println("2开始");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2完成准备");
            latch.countDown();
        }).start();

        new Thread(() -> {
            System.out.println("3开始");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3完成准备");
            latch.countDown();
        }).start();

        //主线程等待，直至倒计时为0
        latch.await();
        System.out.println("开始进入游戏");
    }

}
