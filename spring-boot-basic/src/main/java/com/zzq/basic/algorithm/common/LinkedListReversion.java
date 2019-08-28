package com.zzq.basic.algorithm.common;

public class LinkedListReversion {

    private static class Node {

        private Integer data;

        private Node next;

        public Integer getData() {
            return this.data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * 初始化
     *
     * @return
     */
    private static Node initNode() {
        Node linkNode1 = new Node();
        linkNode1.setData(1);
        Node linkNode2 = new Node();
        linkNode2.setData(2);
        Node linkNode3 = new Node();
        linkNode3.setData(3);
        Node linkNode4 = new Node();
        linkNode4.setData(4);
        Node linkNode5 = new Node();
        linkNode5.setData(5);
        Node linkNode6 = new Node();
        linkNode6.setData(6);

        linkNode1.setNext(linkNode2);
        linkNode2.setNext(linkNode3);
        linkNode3.setNext(linkNode4);
        linkNode4.setNext(linkNode5);
        linkNode5.setNext(linkNode6);

        return linkNode1;
    }

    /**
     * 递归法
     *
     * @param node
     * @return
     */
    private static Node reverseLinkedListByRecursion(Node node) {
        if (node == null || node.getNext() == null) {
            return node;
        } else {
            Node headNode = reverseLinkedListByRecursion(node.getNext());
            node.getNext().setNext(node);
            node.setNext(null);
            return headNode;
        }
    }

    /**
     * 遍历法
     *
     * @param node
     * @return
     */
    private static Node reverseLinkedListByTraversion(Node node) {
        Node previousNode = null;
        Node currentNode = node;
        while (currentNode != null) {
            Node nextNode = currentNode.getNext();

            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;
    }

    /**
     * 打印
     *
     * @param node
     */
    private static void printLinkedList(Node node) {
        if (node == null) {
//            return;
        } else {
            System.out.println(node.getData());
            printLinkedList(node.getNext());
        }
    }

    public static void main(String[] args) {
        Node headNode = initNode();
        printLinkedList(headNode);
        System.out.println("----------");

        headNode = reverseLinkedListByRecursion(headNode);
        printLinkedList(headNode);
        System.out.println("----------");

        headNode = reverseLinkedListByTraversion(headNode);
        printLinkedList(headNode);
        System.out.println("----------");
    }

}
