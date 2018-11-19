/**
 * 
 */
package com.zzq.basic.java.threadpool;

import java.util.concurrent.*;

public class ThreadPoolExecutorTest {

    public static void main(String[] args) {
        ExecutorService eService = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new RejectedExecutionHandler() {
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        System.out.println(((MyRunnableTask) r).name + "is discard");
                    }
                }) {

            @Override
            protected void beforeExecute(Thread thread, Runnable r) {
                System.out.println("准备执行" + ((MyRunnableTask) r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("执行完成" + ((MyRunnableTask) r).name);
            }
        };

        for (int i = 0; i < 20; i++) {
            MyRunnableTask task = new MyRunnableTask("TASK-NUM-" + i);
            eService.execute(task);
        }
        eService.shutdown();
    }

}
