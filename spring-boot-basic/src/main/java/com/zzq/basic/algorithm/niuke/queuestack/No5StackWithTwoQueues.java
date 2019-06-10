package com.zzq.basic.algorithm.niuke.queuestack;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class No5StackWithTwoQueues {

    Queue<Integer> queue1 = new LinkedBlockingQueue<>();
    Queue<Integer> queue2 = new LinkedBlockingQueue<>();

    public void push(int node) {
        if (!queue1.isEmpty()) {
            queue1.add(node);
        } else {
            queue2.add(node);
        }
    }

    public int pop() {
        Queue<Integer> full;
        Queue<Integer> empty;
        if (queue1.isEmpty()) {
            empty = queue1;
            full = queue2;
        } else {
            empty = queue2;
            full = queue1;
        }
        Integer value = null;
        if (full.isEmpty()) {
            value = -999;
        } else {
            while (!full.isEmpty()) {
                value = full.remove();
                if (!full.isEmpty()) {
                    empty.add(value);
                }
            }
        }
        return value;
    }

}
