package com.zzq.basic.algorithm.sort;

import java.util.List;

public class SortUtils {

    /**
     * 交换元素
     *
     * @param array
     * @param sIndex
     * @param dIndex
     */
    public static void swap(int[] array, int sIndex, int dIndex) {
        int temp = array[sIndex];
        array[sIndex] = array[dIndex];
        array[dIndex] = temp;
    }

    /**
     * 打印序列
     *
     * @param array
     */
    public static void printPart(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    /**
     * 获取数组的最值
     *
     * @param a
     * @param type
     * @return
     */
    public static int getMostValue(int[] a, int type) {
        int minValue = a[0];
        int maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minValue) {
                minValue = a[i];// 输入数据的最小值
            } else if (a[i] > maxValue) {
                maxValue = a[i];// 输入数据的最大值
            }
        }

        if (type == SortConstant.MAX_VALUE) {
            return maxValue;
        } else if (type == SortConstant.MIN_VALUE) {
            return minValue;
        }

        return -1;
    }

    /**
     * list转数组
     *
     * @param l
     * @return
     */
    public static int[] list2Array(List l) {
        if (l == null) {
            return null;
        }
        int len = l.size();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = (int) l.get(i);
        }
        return a;
    }

}
