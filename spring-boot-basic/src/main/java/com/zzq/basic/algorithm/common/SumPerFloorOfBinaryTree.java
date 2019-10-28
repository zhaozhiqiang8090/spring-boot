package com.zzq.basic.algorithm.common;

import java.util.LinkedList;
import java.util.Queue;

public class SumPerFloorOfBinaryTree {

    public static class Node {
        public Integer value;
        public Node left;
        public Node right;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public static void sum(Node head) {
        if (head == null) {
            return;
        }
        Queue<Node> queue1 = new LinkedList<>();
        Queue<Node> queue2 = new LinkedList<>();
        queue1.offer(head);

        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            sumDetail(queue1, queue2);
            sumDetail(queue2, queue1);
        }
    }

    private static void sumDetail(Queue<Node> source, Queue<Node> target) {
        if (source.isEmpty()) {
            return;
        }
        Node node;
        int sum = 0;
        while ((node = source.poll()) != null) {
            sum += node.value;
            if (node.left != null) {
                target.offer(node.left);
            }
            if (node.right != null) {
                target.offer(node.right);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        node6.right = node9;

        sum(node1);
    }
}
