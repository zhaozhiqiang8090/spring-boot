package com.zzq.basic.algorithm;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class OddEvenAlternate {

    private static ReentrantLock reentrantLock = new ReentrantLock();
    private static Condition oddCondition = reentrantLock.newCondition();
    private static Condition evenCondition = reentrantLock.newCondition();
    private static volatile int i = 1;
    private static boolean oddStop = false;
    private static boolean evenStop = false;

    public static class Odd implements Callable<Integer> {

        @Override
        public Integer call() {
            while (!oddStop) {
                try {
                    reentrantLock.lock();
                    if (i % 2 == 1) {
                        System.out.println("奇" + ":" + i++);
                        evenCondition.signal();
                        if (i < 100) {
                            oddCondition.await();
                        } else {
                            oddStop = true;
                        }

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
//                    System.out.println("Odd finally");
                    reentrantLock.unlock();
                }
            }

//            System.out.println("Odd return");
            return i;
        }
    }

    public static class Even implements Callable<Integer> {

        @Override
        public Integer call() {
            while (!evenStop) {
                try {
                    reentrantLock.lock();
                    if (i % 2 == 0) {
                        System.out.println("偶" + ":" + i++);
                        oddCondition.signal();
                        if (i < 101) {
                            evenCondition.await();
                        } else {
                            evenStop = true;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
//                    System.out.println("Even finally");
                    reentrantLock.unlock();
                }
            }

//            System.out.println("Even return");
            return i;
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new Even());
        executorService.submit(new Odd());
        executorService.submit(new Odd());
        executorService.submit(new Odd());
        executorService.submit(new Odd());

        executorService.submit(new Even());
        executorService.submit(new Even());
        executorService.shutdown();
    }
}
