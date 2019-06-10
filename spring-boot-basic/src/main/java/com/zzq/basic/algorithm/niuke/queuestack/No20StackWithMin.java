package com.zzq.basic.algorithm.niuke.queuestack;

import java.util.Stack;

public class No20StackWithMin {

    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        if (minStack.empty() || node <= minStack.peek()) {
            minStack.push(node);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (!dataStack.empty()) {
            dataStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return 0;
    }

    public int min() {
        return minStack.peek();
    }

}
