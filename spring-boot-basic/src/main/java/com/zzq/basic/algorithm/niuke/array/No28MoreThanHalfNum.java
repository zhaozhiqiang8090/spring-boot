package com.zzq.basic.algorithm.niuke.array;

import java.util.HashMap;
import java.util.Map;

public class No28MoreThanHalfNum {

    public static int moreThanHalfNum(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : array) {
            if (map.get(a) == null) {
                map.put(a, 1);
            } else {
                map.put(a, map.get(a) + 1);
            }
            if (map.get(a) > array.length / 2) {
                return a;
            }
        }
        return 0;
    }

    public static int moreThanHalfNum2(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        int num = array[0];
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (count == 0) {
                num = array[i];
                count++;
            } else if (array[i] == num) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }

}
