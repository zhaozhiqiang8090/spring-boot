package com.zzq.basic.algorithm.sort.nonlinearTimeComparative;

import com.zzq.basic.algorithm.sort.SortUtils;

public class BubbleSort {

    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            // 将a[0...i]中最大的数据放在末尾
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                }
            }
        }
    }

    /**
     * 冒泡排序（改进版）
     *
     * @param array
     */
    public static void bubbleSort2(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int flag = 0;// 初始化标记为0
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtils.swap(array, j, j + 1);
                    flag = 1;// 若发生交换，则设标记为1
                }
            }

            if (flag == 0) {
                break;// 若没发生交换，则说明数列已有序。
            }
        }
    }

}
