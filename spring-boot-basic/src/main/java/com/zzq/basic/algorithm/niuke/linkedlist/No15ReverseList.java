package com.zzq.basic.algorithm.niuke.linkedlist;

public class No15ReverseList {

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            throw new RuntimeException("待翻转的链表不能为空");
        }

        ListNode newHead;
        if (head.next == null) {
            return head;
        } else {
            newHead = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        }
        return newHead;
    }

    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            throw new RuntimeException("待翻转的链表不能为空");
        }
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

}
