package com.zzq.basic.algorithm.niuke.array;

import java.util.ArrayList;
import java.util.TreeSet;

public class No29GetLeastNumbers {

    public static ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        if (input == null || input.length < k) {
            return new ArrayList<>();
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : input) {
            set.add(i);
        }
        return new ArrayList<>(set.headSet(k + 1));
    }

    public static ArrayList<Integer> getLeastNumbers2(int[] input, int k) {
        ArrayList<Integer> leastNumbers = new ArrayList<>();
        while (input == null || k <= 0 || k > input.length)
            return leastNumbers;
        int[] numbers = new int[k];  //用于放最小的k个数
        for (int i = 0; i < k; i++)
            numbers[i] = input[i];//先放入前k个数
        for (int i = k / 2 - 1; i >= 0; i--) {
            adjustHeap(numbers, i, k - 1);//将数组构造成最大堆形式
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < numbers[0]) { //存在更小的数字时
                numbers[0] = input[i];
                adjustHeap(numbers, 0, k - 1);//重新调整最大堆
            }
        }
        for (int n : numbers)
            leastNumbers.add(n);
        return leastNumbers;
    }

    //最大堆的调整方法，忘记时可以复习一下堆排序。
    private static void adjustHeap(int[] arr, int start, int end) {
        int temp = arr[start];
        int child = start * 2 + 1;
        while (child <= end) {
            if (child + 1 <= end && arr[child + 1] > arr[child])
                child++;
            if (arr[child] < temp)
                break;
            arr[start] = arr[child];
            start = child;
            child = child * 2 + 1;
        }
        arr[start] = temp;
    }

}
