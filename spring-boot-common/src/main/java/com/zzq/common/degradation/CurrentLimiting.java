package com.zzq.common.degradation;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CurrentLimiting implements Runnable {

    private static final int CURRENT_LIMIT = 4;

    private static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        if (count.get() > CURRENT_LIMIT) {
            System.out.println("并发请求达到上限，请稍后重试");
        } else {
            count.incrementAndGet();
            process();
            count.decrementAndGet();
        }
    }

    private void process() {
        try {
            Thread.sleep(1000);
            System.out.println("成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(10);
        CurrentLimiting currentLimiting = new CurrentLimiting();
        for (int i = 0; i < 10; i++) {
            scheduled.scheduleAtFixedRate(currentLimiting, i * 100, 500, TimeUnit.MILLISECONDS);
        }
    }

}
