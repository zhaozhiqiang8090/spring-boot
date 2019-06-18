package com.zzq.basic.algorithm.niuke.number;

import java.util.LinkedList;

public class No46LastRemaining {

    public static int lastRemaining(int n, int m) {
        if (n < 1 || m < 1)
            return -1; //出错
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++)
            list.add(i);
        int removeIndex = 0;
        while (list.size() > 1) {
            removeIndex = (removeIndex + m - 1) % list.size();
            list.remove(removeIndex);
        }
        return list.getFirst();
    }

}
