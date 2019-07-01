package com.zzq.basic.algorithm.niuke.queuestack;

import java.util.Comparator;
import java.util.PriorityQueue;

public class No29MinHeapWithPriorityQueue {

    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); //小顶堆，默认容量为11
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() { //大顶堆，容量11
        @Override
        public int compare(Integer i1, Integer i2) {
            return i2 - i1;
        }
    });

}
