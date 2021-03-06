package com.zzq.basic.java.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    private static int i = 0;

    public static void main(String[] args) throws InterruptedException{

        ReentrantLock lock = new ReentrantLock();

//        Condition read = lock.newCondition();
//        Condition write = lock.newCondition();

        Thread s1 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                try {
                    Thread.sleep(1);
                    lock.lock();//加锁
                    Thread.sleep(1000);
                    i++;
                    System.out.println("add:" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();//解锁，放在finally语句块里目的是防止前边出现异常，解锁一定能被执行。
                }
            }
        });

        Thread s2 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                try {
                    Thread.sleep(1);
                    lock.lock();
                    i--;
                    System.out.println("sub:" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        s1.start();
//        s1.join();

        s2.start();
        s2.join();

        System.out.println("main:" + i);
    }

}
