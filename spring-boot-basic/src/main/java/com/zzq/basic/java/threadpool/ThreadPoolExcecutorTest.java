/**
 * 
 */
package com.zzq.basic.java.threadpool;

import java.util.concurrent.*;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月27日 下午2:08:08
 */
public class ThreadPoolExcecutorTest {

    public static void main(String[] args) {
        ExecutorService eService = new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MICROSECONDS, new LinkedBlockingQueue<Runnable>(10),
                Executors.defaultThreadFactory(), new RejectedExecutionHandler() {
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                        System.out.println(r.toString() + "is discard");
                    }
                }) {
            @Override
            protected void beforeExecute(Thread thread, Runnable r) {
                System.out.println("准备执行" + ((MyTask) r).name);
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("执行完成" + ((MyTask) r).name);
            }
        };

        for (int i = 0; i < 20; i++) {
            MyTask task = new MyTask("TASK-GEYM" + i);
            eService.execute(task);
        }
        eService.shutdown();
    }

}
