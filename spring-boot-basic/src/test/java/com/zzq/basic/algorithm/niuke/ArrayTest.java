package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.array.ArrayUtil;
import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.array.No13ReOrderArray.reOrderArray;
import static com.zzq.basic.algorithm.niuke.array.No28MoreThanHalfNum.moreThanHalfNum;
import static com.zzq.basic.algorithm.niuke.array.No29GetLeastNumbers.getLeastNumbers;
import static com.zzq.basic.algorithm.niuke.array.No30FindGreatestSumOfSubArray.findGreatestSumOfSubArray;
import static com.zzq.basic.algorithm.niuke.array.No32PrintMinNumber.printMinNumber;
import static com.zzq.basic.algorithm.niuke.array.No35InversePairs.inversePairs;
import static com.zzq.basic.algorithm.niuke.array.No37GetNumberOfK.getNumberOfK;
import static com.zzq.basic.algorithm.niuke.array.No40FindNumsAppearOnce.findNumsAppearOnce;
import static com.zzq.basic.algorithm.niuke.array.No41FindContinuousSequence.findContinuousSequence;
import static com.zzq.basic.algorithm.niuke.array.No42FindNumbersWithSum.findNumbersWithSum;
import static com.zzq.basic.algorithm.niuke.array.No45IsContinuous.isContinuous;
import static com.zzq.basic.algorithm.niuke.array.No50Duplicate.duplicate;
import static com.zzq.basic.algorithm.niuke.array.No50Duplicate.duplicate2;
import static com.zzq.basic.algorithm.niuke.array.No51Multiply.multiply;
import static com.zzq.basic.algorithm.niuke.array.No6MinNumberInRotateArray.minNumberInRotateArray;

public class ArrayTest {

    @Test
    public void no6MinNumberInRotateArray() {
        int[] array1 = {3, 4, 5, 1, 2};
        System.out.println("升序排序数组的一个旋转数组，无重复数字：" + minNumberInRotateArray(array1));
        int[] array2 = {1, 2, 3, 4, 5};
        System.out.println("升序排序数组：" + minNumberInRotateArray(array2));
        int[] array3 = {1};
        System.out.println("只包含一个数字的数组：" + minNumberInRotateArray(array3));
        int[] array4 = {2, 4, 2, 2, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + minNumberInRotateArray(array4));
        int[] array41 = {2, 2, 2, 2, 1, 1, 1};
        System.out.println("包含重复元素的数组：" + minNumberInRotateArray(array41));
        int[] array42 = {2, 2, 2, 4, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + minNumberInRotateArray(array42));
        int[] array43 = {2, 2, 4, 1, 2, 2, 2};
        System.out.println("包含重复元素的数组：" + minNumberInRotateArray(array43));
        System.out.println("null数组：" + minNumberInRotateArray(null));
    }

    @Test
    public void no13ReOrderArray() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        ArrayUtil.printArray(a);
        reOrderArray(a);
        ArrayUtil.printArray(a);
    }

    @Test
    public void no28MoreThanHalfNum() {
        int[] a = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        ArrayUtil.printArray(a);
        System.out.println(moreThanHalfNum(a));
    }

    @Test
    public void no29GetLeastNumbers() {
        int[] a = {4, 5, 1, 6, 2, 7, 3, 8};
        ArrayUtil.printArray(a);
        ListUtil.printList(getLeastNumbers(a, 9));
    }

    @Test
    public void no30FindGreatestSumOfSubArray() {
        int[] a = {2, 8, 1, 5, 9};
        ArrayUtil.printArray(a);
        System.out.println(findGreatestSumOfSubArray(a));
    }

    @Test
    public void no32PrintMinNumber() {
        int[] a = {3, 32, 321};
        ArrayUtil.printArray(a);
        System.out.println(printMinNumber(a));
    }

    @Test
    public void no35InversePairs() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 0};
        ArrayUtil.printArray(a);
        System.out.println(inversePairs(a));
    }

    @Test
    public void no37GetNumberOfK() {
        int[] a = {1, 1, 2, 3, 5, 5, 5, 6, 7, 7};
        ArrayUtil.printArray(a);
        System.out.println(getNumberOfK(a, 5));
    }

    @Test
    public void no40FindNumsAppearOnce() {
        int[] a = {1, 1, 3, 5, 5, 6, 7, 7};
        ArrayUtil.printArray(a);
        int[] b = new int[1];
        int[] c = new int[1];
        findNumsAppearOnce(a, b, c);
        ArrayUtil.printArray(b);
        ArrayUtil.printArray(c);
    }

    @Test
    public void no41FindContinuousSequence() {
        ArrayList<ArrayList<Integer>> arrayLists = findContinuousSequence(100);
        for (ArrayList list : arrayLists) {
            ListUtil.printList(list);
        }
    }

    @Test
    public void no42FindNumbersWithSum() {
        int[] a = {-1, 0};
        ArrayList<Integer> list = findNumbersWithSum(a, -1);
        ListUtil.printList(list);
    }

    @Test
    public void no45IsContinuous() {
        int[] a = {-1, 3, 0, 0, 5};
        System.out.println(isContinuous(a));
    }

    @Test
    public void no50Duplicate() {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        int[] b = new int[1];
        boolean flag = duplicate2(a, b);
        System.out.println(flag);
        ArrayUtil.printArray(b);
    }

    @Test
    public void no51Multiply() {
        int[] a = {0, 1, 2, 3, 4, 5};
        ArrayUtil.printArray(a);
        ArrayUtil.printArray(multiply(a));
    }

    @Test
    public void no64MaxInWindow() {

    }

}
