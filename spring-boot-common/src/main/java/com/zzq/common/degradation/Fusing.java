package com.zzq.common.degradation;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Fusing implements Runnable {

    /**
     * 熔断限制
     */
    private static final int FUSING_LIMIT = 4;

    /**
     * 熔断开关状态
     * -1：关闭 0：全开 1：半开
     */
    private static final int FUSING_SWITCH_STATE_OFF = -1;
    private static final int FUSING_SWITCH_STATE_ON = 0;
    private static final int FUSING_SWITCH_STATE_HALF = 1;

    /**
     * 熔断开关，默认关闭
     * 定时变更 0 -> 1
     */
    private static AtomicInteger fusingSwitch = new AtomicInteger(-1);

    /**
     * 失败次数
     * 定时清零
     */
    private static AtomicInteger failCount = new AtomicInteger(0);

    /**
     * 访问标识，模拟成功或失败
     */
    private static AtomicBoolean accessFlag = new AtomicBoolean(false);

    /**
     * 常规任务
     */
    @Override
    public void run() {
        if (fusingSwitch.get() == FUSING_SWITCH_STATE_ON) {
            System.err.println("跳转降级页面，熔断全开");
        } else if (fusingSwitch.get() == FUSING_SWITCH_STATE_HALF) {
            if (accessFlag.get()) {
                if (fusingSwitch.compareAndSet(FUSING_SWITCH_STATE_HALF, FUSING_SWITCH_STATE_OFF)) {
                    failCount.set(0);
                    System.out.println("跳转成功页面，熔断半开->关闭");
                }
            } else if (fusingSwitch.compareAndSet(FUSING_SWITCH_STATE_HALF, FUSING_SWITCH_STATE_ON)) {
                System.err.println("跳转降级页面，熔断半开->全开");
            }
        } else {
            if (!accessFlag.get() && failCount.get() < FUSING_LIMIT) {
                failCount.incrementAndGet();
                System.err.println("跳转失败页面");
                return;
            }
            if (failCount.get() >= FUSING_LIMIT) {
                fusingSwitch.compareAndSet(FUSING_SWITCH_STATE_OFF, FUSING_SWITCH_STATE_ON);
                System.err.println("跳转降级页面，熔断关闭->全开");
                return;
            }
            System.out.println("跳转成功页面");
        }
    }

    /**
     * 定时任务，处理熔断开关和计数
     */
    private static class Timing implements Runnable {

        @Override
        public void run() {
            if (fusingSwitch.compareAndSet(FUSING_SWITCH_STATE_ON, FUSING_SWITCH_STATE_HALF)) {
                System.out.println("定时：熔断全开->半开");
            }
            failCount.set(0);
            System.out.println("定时：熔断计数清零");
        }
    }

    /**
     * 模拟访问定时任务
     */
    private static class AccessTiming implements Runnable {

        @Override
        public void run() {
            boolean flag = accessFlag.get();
            if (accessFlag.compareAndSet(flag, !flag)) {
                System.out.println("模拟访问定时：" + flag + "->" + !flag);
            }
        }
    }

    public static void main(String[] args) {

        // 0.调度线程池
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(5);

        // 1.常规任务
        Fusing fusing = new Fusing();
        scheduled.scheduleAtFixedRate(fusing, 500, 1000, TimeUnit.MILLISECONDS);

        // 2.定时任务
        Timing timing = new Timing();
        scheduled.scheduleAtFixedRate(timing, 0, 8000, TimeUnit.MILLISECONDS);

        // 3.模拟访问定时任务
        AccessTiming accessTiming = new AccessTiming();
        scheduled.scheduleAtFixedRate(accessTiming, 0, 16000, TimeUnit.MILLISECONDS);
    }

}
