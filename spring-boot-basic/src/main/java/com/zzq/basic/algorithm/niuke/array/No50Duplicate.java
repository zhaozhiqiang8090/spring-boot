package com.zzq.basic.algorithm.niuke.array;

import java.util.Arrays;

public class No50Duplicate {

    public static boolean duplicate(int[] numbers, int[] duplication) {
        if (numbers == null || numbers.length < 2) {
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i+1]) {
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }

}
