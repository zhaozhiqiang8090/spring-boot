// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TestSingleton.java

package com.zzq.basic.java.singleton;

import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.*;

// Referenced classes of package com.zzq.basic.java.singleton:
//            SafeSingletonHungry, ParentSingleton

public class TestSingleton
{
    public static class TestSingletonCallable
        implements Callable
    {

        public Object call()
        {
            instance = SafeSingletonHungry.getInstance();
            TestSingleton.countDownLatch.countDown();
            return instance;
        }

        ParentSingleton instance;

        public TestSingletonCallable()
        {
        }
    }


    public TestSingleton()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        List futureList = new ArrayList();
        TestSingletonCallable testSingletonCallable = new TestSingletonCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        long start = System.currentTimeMillis();
        for(int i = 0; i < 20; i++)
            futureList.add(executorService.submit(testSingletonCallable));

        countDownLatch.await();
        System.out.println((new StringBuilder()).append("time cost: ").append(System.currentTimeMillis() - start).append(" ms").toString());
        System.out.println("----------");
        Object o;
        for(Iterator iterator = futureList.iterator(); iterator.hasNext(); System.out.println((new StringBuilder()).append("object: ").append(o.toString()).append(" -> hashCode: ").append(o.hashCode()).toString()))
        {
            Future future = (Future)iterator.next();
            o = future.get();
        }

        executorService.shutdown();
    }

    private static CountDownLatch countDownLatch = new CountDownLatch(20);


}
