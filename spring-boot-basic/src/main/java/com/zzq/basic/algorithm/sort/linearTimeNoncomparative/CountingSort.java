package com.zzq.basic.algorithm.sort.linearTimeNoncomparative;

import com.zzq.basic.algorithm.sort.SortConstant;
import com.zzq.basic.algorithm.sort.SortUtils;

public class CountingSort {

    /*
     * 计数排序（类似位图）
     *
     * 参数说明：
     *     a -- 待排序数组
     */
    public static void countingSort(int[] a) {
        if (a == null || a.length == 0)
            return;

        int minValue = SortUtils.getMostValue(a, SortConstant.MIN_VALUE);
        int maxValue = SortUtils.getMostValue(a, SortConstant.MAX_VALUE);

        // 创建一个容量为(maxValue - minValue + 1)的数组counter，并且将buckets中的所有数据都初始化为0。
        int[] counter = new int[maxValue - minValue + 1];

        // 1. 计数
        for (int i = 0; i < a.length; i++) {
            counter[a[i] - minValue]++;
        }

        // 2. 排序
        for (int i = 0, j = 0; i < counter.length; i++) {
            while ((counter[i]--) > 0) {
                a[j++] = i + minValue;
            }
        }
    }

}
