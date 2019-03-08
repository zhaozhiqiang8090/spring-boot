package com.zzq.basic.algorithm.sort.linearTimeNoncomparative;

import com.zzq.basic.algorithm.sort.SortConstant;
import com.zzq.basic.algorithm.sort.SortUtils;
import com.zzq.basic.algorithm.sort.nonlinearTimeComparative.InsertionSort;

import java.util.LinkedList;

public class BucketSort {

    /**
     * 桶排序
     * @param arr
     * @param bucketRange 桶范围
     *                     考虑到数据可重复，其并不是指精确的桶大小，而是指桶所能容纳的数据值范围
     */
    public static void bucketSort(int[] arr, int bucketRange) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int minValue = SortUtils.getMostValue(arr, SortConstant.MIN_VALUE);
        int maxValue = SortUtils.getMostValue(arr, SortConstant.MAX_VALUE);

        // 桶的初始化
        int bucketCount = (maxValue - minValue) / bucketRange + 1;
        LinkedList<Integer>[] buckets = new LinkedList[bucketCount];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }

        // 利用映射函数将数据分配到各个桶中
        for (int i = 0; i < arr.length; i++) {
            buckets[(arr[i] - minValue) / bucketRange].add(arr[i]);
        }

        int k = 0;
        for (int i = 0; i < buckets.length; i++) {
            int[] a = SortUtils.list2Array(buckets[i]);
            InsertionSort.insertionSort(a);// 对每个桶进行排序，这里使用了插入排序
            for (int j = 0; j < a.length; j++) {
                arr[k++] = (a[j]);
            }
        }
    }

}
