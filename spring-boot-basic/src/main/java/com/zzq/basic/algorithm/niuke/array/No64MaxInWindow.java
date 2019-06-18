package com.zzq.basic.algorithm.niuke.array;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class No64MaxInWindow {

    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> max = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || size > num.length)
            return max;
        ArrayDeque<Integer> indexDeque = new ArrayDeque<>();

        for (int i = 0; i < size - 1; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()])
                indexDeque.removeLast();
            indexDeque.addLast(i);
        }

        for (int i = size - 1; i < num.length; i++) {
            while (!indexDeque.isEmpty() && num[i] > num[indexDeque.getLast()])
                indexDeque.removeLast();
            if (!indexDeque.isEmpty() && (i - indexDeque.getFirst()) >= size)
                indexDeque.removeFirst();
            indexDeque.addLast(i);
            max.add(num[indexDeque.getFirst()]);
        }

        return max;
    }

}
