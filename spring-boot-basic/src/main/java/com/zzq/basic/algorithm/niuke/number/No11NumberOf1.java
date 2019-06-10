package com.zzq.basic.algorithm.niuke.number;

public class No11NumberOf1 {

    public static int numberOf1(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        int index = 0;
        while (index < 32) {
            if ((n & 0x00000001) == 1) {
                count++;
            }
            n = n >> 1;
            index++;
        }
        return count;
    }

}
