package com.zzq.basic.java.concurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);//最大允许三个线程一起进行

        for (int i = 0; i <9 ; i++) {

            new Thread(()->{
                try {
                    try {
                        semaphore.acquire();//获得信号量
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "开始进行");
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();//释放锁
                }
            }).start();
        }
    }

}
