package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.array.ArrayUtil;
import com.zzq.basic.algorithm.niuke.queuestack.No20StackWithMin;
import com.zzq.basic.algorithm.niuke.queuestack.No5QueueWithTwoStacks;
import com.zzq.basic.algorithm.niuke.queuestack.No5StackWithTwoQueues;
import org.junit.Test;

import static com.zzq.basic.algorithm.niuke.array.ArrayUtil.printArray;
import static com.zzq.basic.algorithm.niuke.queuestack.No21IsPopOrder.isPopOrder;

public class QueueStackTest {

    @Test
    public void no5QueueWithTwoStacks() {
        No5QueueWithTwoStacks queueWithTwoStacks = new No5QueueWithTwoStacks();
        queueWithTwoStacks.push(1);
        queueWithTwoStacks.push(2);
        queueWithTwoStacks.push(3);
        queueWithTwoStacks.pop();
        queueWithTwoStacks.push(4);
        queueWithTwoStacks.pop();
        queueWithTwoStacks.pop();
    }

    @Test
    public void no5StackWithTwoQueues() {
        No5StackWithTwoQueues stackWith2Queues = new No5StackWithTwoQueues();
        stackWith2Queues.pop();
        stackWith2Queues.push(1);
        stackWith2Queues.push(2);
        stackWith2Queues.push(3);
        stackWith2Queues.pop();
        stackWith2Queues.push(4);
        stackWith2Queues.pop();
    }

    @Test
    public void no20StackWithMin() {
        No20StackWithMin no20StackWithMin = new No20StackWithMin();
        no20StackWithMin.pop();
        no20StackWithMin.push(1);
        System.out.println(no20StackWithMin.min());
        no20StackWithMin.push(2);
        System.out.println(no20StackWithMin.min());
        no20StackWithMin.push(3);
        System.out.println(no20StackWithMin.min());
        no20StackWithMin.pop();
        System.out.println(no20StackWithMin.min());
        no20StackWithMin.pop();
        System.out.println(no20StackWithMin.min());
        no20StackWithMin.pop();
        System.out.println(no20StackWithMin.min());
    }

    @Test
    public void no21IsPopOrder() {
        int[] push = {1, 2, 3, 4, 5};
        ArrayUtil.printArray(push);
        int[] pop = {4, 5, 3, 2, 1};
        ArrayUtil.printArray(pop);
        System.out.println(isPopOrder(push, pop));
    }
}
