package com.zzq.basic.java.initialization;

public class InitialOrderByAli implements ParentInitialOrder{
    public static int k = 0;
    public static InitialOrderByAli t1 = new InitialOrderByAli("t1");
    public static InitialOrderByAli t2 = new InitialOrderByAli("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
    {
        print("构造块");
    }

    static {
        print("静态块");
    }

    public InitialOrderByAli(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }

}
