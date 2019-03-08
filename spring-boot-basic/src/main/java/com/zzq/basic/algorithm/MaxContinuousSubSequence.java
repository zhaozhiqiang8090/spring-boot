package com.zzq.basic.algorithm;

public class MaxContinuousSubSequence {

    /**
     * 最大和
     * @param array
     * @return
     */
    public static int maxSum(int[] array) {
        int totalMax = 0;
        int currentMax = 0;
        for (int i=0; i<array.length; i++) {
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

    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(maxSum(array));
    }
}
