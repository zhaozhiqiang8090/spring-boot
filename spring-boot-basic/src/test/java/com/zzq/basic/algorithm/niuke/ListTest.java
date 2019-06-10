package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListNode;
import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.linkedlist.No14FindKthToTail.findKthToTail2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No15ReverseList.reverseList2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No16Merge.merge2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No3PrintListFromTailToHead.printListFromTailToHead;

public class ListTest {

    @Test
    public void no3PrintListFromTailToHead() {
        ListNode listNode = ListUtil.init(5);
        ListUtil.printListNode(listNode);
        ArrayList<Integer> list = printListFromTailToHead(listNode);
        ListUtil.printList(list);
    }

    @Test
    public void no14FindKthToTail() {
        ListNode listNode = ListUtil.init(5);
        ListUtil.printListNode(listNode);
        ListNode node = findKthToTail2(listNode, 4);
        ListUtil.printNode(node);
    }

    @Test
    public void no15ReverseList() {
        ListNode listNode = ListUtil.init(5);
        ListUtil.printListNode(listNode);
        ListNode head = reverseList2(listNode);
        ListUtil.printListNode(head);
    }

    @Test
    public void no16Merge() {
        ListNode listNode = ListUtil.init(5);
        ListUtil.printListNode(listNode);
        ListNode listNode2 = ListUtil.init(5);
        ListUtil.printListNode(listNode2);
        ListNode head = merge2(listNode, listNode2);
        ListUtil.printListNode(head);
    }

}
