package com.zzq.basic.algorithm.sort.nonlinearTimeComparative;

import com.zzq.basic.algorithm.sort.SortUtils;

public class HeapSort {

    /**
     * 堆调整-递归法
     *
     * @param array
     * @param parent
     * @param length
     */
    public static void heapAdjustByRecursion(int[] array, int parent, int length) {
        int left = parent * 2 + 1;
        int right = parent * 2 + 2;
        int large;

        if (left < length) {
            large = left;
            if (right < length && array[left] < array[right]) {
                large = right;
            }

            if (array[parent] < array[large]) {
                SortUtils.swap(array, parent, large);
                heapAdjustByRecursion(array, large, length);
            }
        }
    }

    /**
     * 堆排序
     *
     * @param array
     */
    public static void heapSort(int[] array) {
        // 循环建立初始堆
        // array[i]的父节点为array[(i-1)/2]，故末节点的父节点为array[(length-1-1)/2] = array[length/2 - 1]
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapAdjustByRecursion(array, i, array.length);
        }

        System.out.format("初始堆:\t\t");
        SortUtils.printPart(array);

        // 进行n-1次循环，完成排序
        for (int i = array.length - 1; i > 0; i--) {
            // 最后一个元素和第一元素进行交换
            SortUtils.swap(array, 0, i);
            // 筛选 R[0] 结点，得到i-1个结点的堆
            heapAdjustByRecursion(array, 0, i);
            System.out.format("第 %d 趟:\t", array.length - i);
            SortUtils.printPart(array);
        }
    }

}
