package com.zzq.basic.algorithm.niuke.array;

import java.util.ArrayList;

public class No41FindContinuousSequence {

    public static ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        if (sum <= 2) {
            return arrayLists;
        }

        int small = 1;
        int big = 2;
        int curSum = small + big;
        while (small <= sum / 2) {
            if (curSum == sum) {
                ArrayList<Integer> sequence = new ArrayList<>();
                for (int i = small; i <= big; i++)
                    sequence.add(i);
                arrayLists.add(sequence);
                curSum -= small;
                small++; //这两行位置先后要注意
            }
            if (curSum < sum) {
                big++;
                curSum += big;
            }
            if (curSum > sum) {
                curSum -= small;
                small++;
            }
        }
        return arrayLists;
    }

}
