package com.zzq.basic.algorithm.niuke.linkedlist;

public class No14FindKthToTail {

    public static ListNode findKthToTail(ListNode head, int k) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        if (k <= 0 || k > count) {
            return null;
        }
        int index = 0;
        node = head;
        while (index++ < count - k) {
            node = node.next;
        }

        return node;
    }

    public static ListNode findKthToTail2(ListNode head, int k) {
        if (head == null) {
            throw new RuntimeException("待查找的链表不能为空");
        }
        if (k <= 0) {
            throw new RuntimeException("输入的位置数字不合法");
        }
        ListNode aNode = head;
        ListNode bNode = head;
        int index = 1;
        while (index < k) {
            if (aNode.next == null) {
                throw new RuntimeException("链表节点个数：" + index + " 小于输入K的个数：" + k);
            }
            aNode = aNode.next;
            index++;
        }
        while (aNode.next != null) {
            aNode = aNode.next;
            bNode = bNode.next;
        }
        return bNode;
    }

}
