/**
 * 
 */
package com.zzq.javabase.threadpool;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月26日 上午9:51:04
 */
public class CalllableTest {
    private final int NUMBER = 3;

    public CalllableTest() {

        // 创建容量为NUMBER的线程池。
        ExecutorService pool = Executors.newFixedThreadPool(NUMBER);

        ArrayList<Future<String>> futures = new ArrayList<Future<String>>();

        for (int i = 0; i < 10; i++) {

            AThread t = new AThread(i);

            Future<String> f = pool.submit(t);
            futures.add(f);
        }

        System.out.println("获取结果中...");
        for (Future<String> f : futures) {
            try {
                // if(f.isDone())
                System.out.println(f.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("得到结果.");

        // 关闭线程池。
        pool.shutdown();
    }

    private class AThread implements Callable<String> {

        private int id;

        public AThread(int id) {
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

    public static void main(String[] args) {
        new CalllableTest();
    }
}
