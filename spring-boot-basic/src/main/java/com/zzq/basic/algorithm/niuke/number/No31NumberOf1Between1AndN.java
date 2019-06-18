package com.zzq.basic.algorithm.niuke.number;

public class No31NumberOf1Between1AndN {

    public static int numberOf1Between1AndN(int n) {
        int number = 0;
        while (n > 0) {
            int m = n;
            while (m > 0) {
                if (m % 10 == 1) {
                    number++;
                }
                m /= 10;
            }
            n--;
        }
        return number;
    }
}
