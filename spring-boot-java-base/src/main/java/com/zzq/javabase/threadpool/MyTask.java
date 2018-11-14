/**
 * 
 */
package com.zzq.javabase.threadpool;

/**
 * 类的详细说明
 * 
 * @author zhaozhiqiang
 * @version V1.0
 * @Date 2018年4月27日 下午2:20:01
 */

public class MyTask implements Runnable {

    public String name;

    public MyTask(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
