package com.zzq.basic.algorithm.niuke.fibonacci;

public class No7Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int fibonacci2(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        int pre2 = 1;
        int pre1 = 1;
        int current = 0;
        int index = 3;
        while (index++ <= n) {
            current = pre1 + pre2;
            pre2 = pre1;
            pre1 = current;
        }
        return current;
    }

}
