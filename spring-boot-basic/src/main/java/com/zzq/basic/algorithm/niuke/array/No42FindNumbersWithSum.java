package com.zzq.basic.algorithm.niuke.array;

import java.util.ArrayList;

public class No42FindNumbersWithSum {

    public static ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length <= 1) {
            return list;
        }
        Integer multiply = null;
        int small = 0;
        int big = array.length - 1;
        while (array[small] < array[big]) {
            if (array[small] + array[big] == sum) {
                if (multiply == null || array[small] * array[big] < multiply) {
                    multiply = array[small] * array[big];
                    list.clear();
                    list.add(array[small]);
                    list.add(array[big]);
                }
                small++;
                big--;
            } else if (array[small] + array[big] < sum) {
                small++;
            } else {
                big--;
            }
        }
        return list;
    }

}
