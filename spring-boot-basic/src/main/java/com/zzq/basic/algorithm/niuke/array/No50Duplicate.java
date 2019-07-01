package com.zzq.basic.algorithm.niuke.array;

import java.util.Arrays;
import java.util.BitSet;

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

    public static boolean duplicate2(int[] numbers, int[] duplication) {
        if (numbers == null || numbers.length < 2) {
            return false;
        }
        BitSet bitSet = new BitSet(numbers.length);
        for (int i = 0; i < numbers.length; i++) {
            if (bitSet.get(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                bitSet.set(numbers[i]);
            }
        }
        return false;
    }

}
