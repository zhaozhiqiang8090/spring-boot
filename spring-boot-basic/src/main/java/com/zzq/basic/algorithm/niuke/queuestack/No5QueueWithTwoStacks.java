package com.zzq.basic.algorithm.niuke.queuestack;

import java.util.Stack;

public class No5QueueWithTwoStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /**
     * 入队
     *
     * @param node
     */
    public void push(int node) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        stack2.push(node);
    }

    /**
     * 出队
     *
     * @return
     */
    public int pop() {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        if (stack1.empty()) {
            return -9999;
        }
        return stack1.pop();
    }

}
