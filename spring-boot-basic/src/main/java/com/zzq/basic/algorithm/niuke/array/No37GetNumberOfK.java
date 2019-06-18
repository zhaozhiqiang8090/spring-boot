package com.zzq.basic.algorithm.niuke.array;

public class No37GetNumberOfK {

    public static int getNumberOfK(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                count++;
            } else if (count != 0){
                return count;
            }
        }
        return count;
    }

}
