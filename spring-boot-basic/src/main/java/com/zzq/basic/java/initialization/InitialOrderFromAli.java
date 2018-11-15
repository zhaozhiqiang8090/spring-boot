package com.zzq.basic.java.initialization;

public class InitialOrderFromAli {
    public static int k = 0;
    public static InitialOrderFromAli t1 = new InitialOrderFromAli("t1");
    public static InitialOrderFromAli t2 = new InitialOrderFromAli("t2");
    public static int i = print("i");
    public static int n = 99;
    public int j = print("j");
    {
        print("构造块");
    }

    static {
        print("静态块");
    }

    public InitialOrderFromAli(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "    n=" + n);
        ++i;
        ++n;
    }

    public static int print(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "    n=" + n);
        ++n;
        return ++i;
    }

    public static void main(String[] args) {
        InitialOrderFromAli t = new InitialOrderFromAli("init");
    }
}
