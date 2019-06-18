package com.zzq.basic.algorithm.niuke.number;

public class No47Sum {

    public static int sum(int n) {
        int sum = n;
        boolean flag = (n > 1) && ((sum += sum(n - 1)) > 0);
        return sum;
    }

}
