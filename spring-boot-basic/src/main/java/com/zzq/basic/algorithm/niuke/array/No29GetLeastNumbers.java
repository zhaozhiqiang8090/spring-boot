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

}
