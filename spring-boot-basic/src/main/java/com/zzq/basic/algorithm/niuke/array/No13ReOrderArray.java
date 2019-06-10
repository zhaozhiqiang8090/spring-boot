package com.zzq.basic.algorithm.niuke.array;

import static com.zzq.basic.algorithm.niuke.array.ArrayUtil.swap;

public class No13ReOrderArray {

    public static void reOrderArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] % 2 == 1 && array[j - 1] % 2 == 0) {
                    swap(array, j - 1, j);
                }
            }
        }
    }

    public static void reOrderArray2(int[] array) {
        int[] result = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                result[j++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result[j++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
    }

}
