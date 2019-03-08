package com.zzq.basic.java.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) {

        CyclicBarrier Barrier = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("双方继续前进");
            }
        });

        new Thread(()->{
            System.out.println("甲方先行");

            try {
                Barrier.await();//数量不足2，因而得在此等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("甲方继续前进");
        }).start();

        new Thread(()->{
            System.out.println("乙方开始前进");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                Barrier.await();//两秒后，线程数满足要求，继续运行
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("乙方继续前进");
        }).start();
    }

}
