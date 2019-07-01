package com.zzq.basic.algorithm.niuke.array;

public class No6MinNumberInRotateArray {

    public static int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = (high + low) / 2;
            if (array[mid] > array[high]) {
                low = mid + 1;
            } else if (array[mid] == array[high]) {
                high = high - 1;
            } else {
                high = mid;
            }
        }
        return array[low];
    }

}
