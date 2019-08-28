package com.zzq.basic.algorithm.sort.linearTimeNoncomparative;

import com.zzq.basic.algorithm.sort.SortConstant;
import com.zzq.basic.algorithm.sort.SortUtils;

import java.util.LinkedList;

public class RadixSort {

    /*
     * 对数组按照"某个位数"进行排序(桶排序)
     *
     * 参数说明：
     *     a -- 数组
     *     exp -- 指数。对数组a按照该指数进行排序。
     *
     * 例如，对于数组a={50, 3, 542, 745, 2014, 154, 63, 616}；
     *    (01) 当exp=1表示按照"个位"对数组a进行排序
     *    (02) 当exp=10表示按照"十位"对数组a进行排序
     *    (03) 当exp=100表示按照"百位"对数组a进行排序
     *    ...
     */
    private static void countSort(int[] a, int exp) {

        int minValue = SortUtils.getMostValueAtExp(a, SortConstant.MIN_VALUE, exp);
        int maxValue = SortUtils.getMostValueAtExp(a, SortConstant.MAX_VALUE, exp);

        // 桶的初始化
        int bucketCount = maxValue - minValue + 1;
        if (bucketCount <= 1) {
            return;
        }
        LinkedList<Integer>[] buckets = new LinkedList[bucketCount];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }

        // 数据入桶
        for (int i = 0; i < a.length; i++) {
            buckets[a[i] / exp % 10 - minValue].add(a[i]);
        }

        // 数据归位
        int k = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                a[k++] = buckets[i].get(j);
            }
        }
    }

    /*
     * 基数排序
     *
     * 参数说明：
     *     a -- 数组
     */
    public static void radixSort(int[] a) {
        int min = SortUtils.getMostValue(a, SortConstant.MIN_VALUE);
        int max = SortUtils.getMostValue(a, SortConstant.MAX_VALUE);    // 数组a中的最大值

        int abs;
        if (min >= 0) {
            abs = max;
        } else if (max <= 0){
            abs = -min;
        } else {
            abs = max > -min ? max : -min;
        }

        // 从个位开始，对数组a按"指数"进行排序
        for (int exp = 1; abs / exp > 0; exp *= 10) {
            countSort(a, exp);
        }
    }

}
