package com.zzq.basic.algorithm.common;

import com.zzq.basic.algorithm.sort.SortUtils;

public class MaxContinuousSubSequence {

    /**
     * 最大连续子序列求和
     *
     * @param array
     * @return
     */
    public static int maxSum(int[] array) {
        int totalMax = 0;
        int currentMax = 0;
        for (int i = 0; i < array.length; i++) {
            currentMax += array[i];
            if (currentMax > totalMax) {
                totalMax = currentMax;
            }

            if (currentMax < 0) {
                currentMax = 0;
            }
        }

        return totalMax;
    }

    /**
     * 最大连续子序列
     *
     * @param array
     * @return
     */
    public static int[] subSequence(int[] array) {
        int totalMax = 0;
        int currentMax = 0;
        int start = 0;
        int nextStart = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            currentMax += array[i];
            if (currentMax > totalMax) {
                totalMax = currentMax;
                start = nextStart;
                end = i;
            }

            if (currentMax < 0) {
                currentMax = 0;
                nextStart = i + 1;
            }
        }

        int[] result = new int[end - start + 1];
        int j = 0;
        for (int i = start; i <= end; i++) {
            result[j++] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -19, 20, 1};
        SortUtils.printPart(array);
        System.out.print("subSequence: ");
        SortUtils.printPart(subSequence(array));
        System.out.println("maxSum: " + maxSum(array));
    }
}
