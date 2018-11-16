package com.zzq.basic.java.threadpool;

import java.util.concurrent.*;

public class CallableAndRunnable {

    public static class R1 implements Runnable {

        private User user;

        public R1(User user) {
            this.user = user;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " start!");
            System.out.println("runnable running!");
            user.setName("haha");
        }

    }

    public static class C1 implements Callable<String> {

        @Override
        public String call() {
            System.out.println(Thread.currentThread().getName() + " start!");
            return "callable running!";
        }

    }

    public static class User {

        private String name;

        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

    }

    public static void testExecutorService() {
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newCachedThreadPool();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        User user = new User();
        R1 r1 = new R1(user);
        C1 c1 = new C1();
        System.out.println(user.getName());

//        executorService.execute(r1);
        Future<?> future1 = executorService.submit(c1);
//        Future<?> future2 = executorService.submit(r1);
        Future<?> future3 = executorService.submit(r1, user);

        try {
            System.out.println(future1.get());
//            System.out.println(future2.get());
            System.out.println(((User) future3.get()).getName());
            System.out.println(user.getName());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void testScheduledExecutorService() {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        // ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(4);
        User user = new User();
        R1 r1 = new R1(user);
        C1 c1 = new C1();
        ScheduledFuture<?> future1 = scheduledExecutorService.schedule(r1, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> future2 = scheduledExecutorService.schedule(c1, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> future3 = scheduledExecutorService.scheduleAtFixedRate(r1, 1000, 1000, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> future4 = scheduledExecutorService.scheduleWithFixedDelay(r1, 1000, 1000, TimeUnit.MILLISECONDS);

        try {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            System.out.println(future4.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testThreadPoolExecutor() {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 1, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        User user = new User();
        R1 r1 = new R1(user);
        C1 c1 = new C1();
        pool.execute(r1);
        Future<?> future1 = pool.submit(c1);

        try {
            System.out.println(future1.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
         testExecutorService();
//         testScheduledExecutorService();
//         testThreadPoolExecutor();
    }
}
