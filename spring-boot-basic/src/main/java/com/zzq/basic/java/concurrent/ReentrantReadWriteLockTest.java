package com.zzq.basic.java.concurrent;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReentrantReadWriteLockTest {

    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

        Thread s1 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                try {
                    Thread.sleep(10);
//                    lock.readLock().lock();
                    lock.writeLock().lock();
                    System.out.println("add locked ----------");
                    Thread.sleep(1000);
                    i++;
                    System.out.println("add:" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("add unlocked ----------");
//                    lock.readLock().unlock();
                    lock.writeLock().unlock();
                }
            }
        });

        Thread s2 = new Thread(() -> {
            for (int j = 0; j < 1000; j++) {
                try {
                    Thread.sleep(10);
                    lock.readLock().lock();
                    System.out.println("sub locked ----------");
                    Thread.sleep(1);
                    i--;
                    System.out.println("sub:" + i);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("sub unlocked ----------");
                    lock.readLock().unlock();
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
