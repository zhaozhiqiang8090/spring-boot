package com.zzq.basic.algorithm.niuke.linkedlist;

import java.util.List;

public class ListUtil {

    /**
     * 初始化
     *
     * @param n
     * @return
     */
    public static ListNode init(int n) {
        if (n <= 0) {
            return null;
        }
        ListNode current = null;
        for (int i = n; i > 0; i--) {
            ListNode listNode = new ListNode(i);
            listNode.next = current;
            current = listNode;
        }
        return current;
    }

    /**
     * 打印序列
     *
     * @param list
     */
    public static void printList(List list) {
        if (list != null) {
            for (Object i : list) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
    }

    /**
     * 打印节点
     *
     * @param node
     */
    public static void printNode(ListNode node) {
        System.out.println(node != null ? node.val : "");
    }

    /**
     * 打印链表
     *
     * @param node
     */
    public static void printListNode(ListNode node) {
        printListNodeDetail(node);
        System.out.println();
    }

    private static void printListNodeDetail(ListNode node) {
        if (node != null) {
            System.out.print(node.val + "\t");
            printListNodeDetail(node.next);
        }
    }

}
