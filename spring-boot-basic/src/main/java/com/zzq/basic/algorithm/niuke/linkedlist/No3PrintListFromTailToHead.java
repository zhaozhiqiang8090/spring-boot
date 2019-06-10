package com.zzq.basic.algorithm.niuke.linkedlist;

import java.util.ArrayList;

public class No3PrintListFromTailToHead {

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list;
        if (listNode == null) {
            throw new RuntimeException("待打印的链表不能为空");
        }

        if (listNode.next == null) {
            list = new ArrayList<>();
            list.add(listNode.val);
        } else {
            list = printListFromTailToHead(listNode.next);
            list.add(listNode.val);
        }
        return list;
    }

}
