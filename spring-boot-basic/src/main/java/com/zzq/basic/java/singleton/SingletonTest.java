package com.zzq.basic.java.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SingletonTest {

    private static CountDownLatch countDownLatch = new CountDownLatch(20);

    public static class TestSingletonCallable implements Callable<Object> {

        ParentSingleton instance;

        @Override
        public Object call() {
//            instance = SafeSingletonHungry.getInstance();
//            instance = UnSafeSingletonLazy.getInstance();
//            instance = SafeSingletonBySynchronized.getInstance();
//            instance = UnSafeSingletonByDoubleCheck.getInstance();
//            instance = SafeSingletonByDoubleCheckWithVolatile.getInstance();
            instance = SafeSingletonByStaticInnerClass.getInstance();
//            instance = EnumerationSingleton.getInstance();

            countDownLatch.countDown();
            return instance;
        }

    }

    public static void main(String[] args) throws Exception {
        List<Future<?>> futureList = new ArrayList();
        TestSingletonCallable testSingletonCallable = new TestSingletonCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            futureList.add(executorService.submit(testSingletonCallable));
        }
        countDownLatch.await();
        System.out.println("time cost: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("----------");
        for (Future<?> future : futureList) {
            Object o = future.get();
            System.out.println("object: " + o.toString() + " -> hashCode: " + o.hashCode());
        }

        executorService.shutdown();
    }

}
