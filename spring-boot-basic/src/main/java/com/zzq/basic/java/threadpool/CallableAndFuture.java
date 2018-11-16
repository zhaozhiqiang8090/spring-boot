/**
 *
 */
package com.zzq.basic.java.threadpool;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        ArrayList<Future<String>> futures = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            MyCallableTask t = new MyCallableTask(i);
            Future<String> f = pool.submit(t);
            futures.add(f);
        }
        System.out.println("结果获取中...");

        for (Future<String> f : futures) {
            try {
                // if(f.isDone())
                System.out.println(f.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("结果获取完成.");

        // 关闭线程池。
        pool.shutdown();
    }
}
