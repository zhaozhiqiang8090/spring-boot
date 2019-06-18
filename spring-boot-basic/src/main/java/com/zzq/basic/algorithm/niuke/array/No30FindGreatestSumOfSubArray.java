package com.zzq.basic.algorithm.niuke.array;

public class No30FindGreatestSumOfSubArray {

    public static int findGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int currentMax = 0;
        int totalMax = array[0];
        for (int a : array) {
            currentMax += a;
            if (currentMax > totalMax) {
                totalMax = currentMax;
            }
            if (currentMax < 0) {
                currentMax = 0;
            }
        }
        return totalMax;
    }
}
