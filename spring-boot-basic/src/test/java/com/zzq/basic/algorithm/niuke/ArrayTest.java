package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.array.ArrayUtil;
import org.junit.Test;

import static com.zzq.basic.algorithm.niuke.array.No13ReOrderArray.reOrderArray;
import static com.zzq.basic.algorithm.niuke.array.No6MinNumberInRotateArray.findMin;

public class ArrayTest {

    @Test
    public void no6MinNumberInRotateArray() {
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println("升序排序数组的一个旋转数组，无重复数字：" + findMin(array1));
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("升序排序数组：" + findMin(array2));
        int[] array3 = {1};
        System.out.println("只包含一个数字的数组：" + findMin(array3));
        int[] array4 = {2, 4, 2, 2, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + findMin(array4));
        int[] array41 = {2, 2, 2, 2, 1, 1, 1};
        System.out.println("包含重复元素的数组：" + findMin(array41));
        int[] array42 = {2, 2, 2, 4, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + findMin(array42));
        int[] array43 = {2, 2, 4, 1, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + findMin(array43));
        System.out.println("null数组：" + findMin(null));
    }

    @Test
    public void no13ReOrderArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        ArrayUtil.printArray(a);
        reOrderArray(a);
        ArrayUtil.printArray(a);
    }
}
