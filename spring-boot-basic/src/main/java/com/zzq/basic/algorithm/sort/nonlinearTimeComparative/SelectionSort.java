package com.zzq.basic.algorithm.sort.nonlinearTimeComparative;

import com.zzq.basic.algorithm.sort.SortUtils;

public class SelectionSort {

    /**
     * 选择排序
     *
     * @param array
     */
    public static void selectionSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            // 最大值放到最后一位
            if (maxIndex != i) {
                SortUtils.swap(array, i, maxIndex);
            }
        }
    }

}
