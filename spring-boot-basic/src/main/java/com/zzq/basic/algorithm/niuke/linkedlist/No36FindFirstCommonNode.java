package com.zzq.basic.algorithm.niuke.linkedlist;

public class No36FindFirstCommonNode {

    /**
     * 方法1：利用长度关系
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        int lengthDif = length1 - length2;
        ListNode longList = pHead1;
        ListNode shortList = pHead2;
        if (lengthDif < 0) {
            longList = pHead2;
            shortList = pHead1;
            lengthDif = -lengthDif;
        }
        for (int i = 0; i < lengthDif; i++)
            longList = longList.next;
        while (longList != null && longList != shortList) {
            longList = longList.next;
            shortList = shortList.next;
        }
        return longList;  //没有公共结点刚好是null
    }

    private static int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    /**
     * 方法2：两个指针，p1顺序遍历list1和list2；p2顺序遍历list2和list1；最终一定会相遇
     *
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode findFirstCommonNode2(ListNode pHead1, ListNode pHead2) {
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
            if (p1 != p2) {
                //到达最后时，指针指向另一个链表
                if (p1 == null) p1 = pHead2;
                if (p2 == null) p2 = pHead1;
            }
        }
        return p1;
    }

}
