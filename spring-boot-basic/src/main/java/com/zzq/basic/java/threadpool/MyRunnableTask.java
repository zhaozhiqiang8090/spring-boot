/**
 * 
 */
package com.zzq.basic.java.threadpool;

public class MyRunnableTask implements Runnable {

    public String name;

    public MyRunnableTask(String name) {
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
