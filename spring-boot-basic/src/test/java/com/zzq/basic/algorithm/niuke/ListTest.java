package com.zzq.basic.algorithm.niuke;

import com.zzq.basic.algorithm.niuke.linkedlist.ListNode;
import com.zzq.basic.algorithm.niuke.linkedlist.ListUtil;
import org.junit.Test;

import java.util.ArrayList;

import static com.zzq.basic.algorithm.niuke.linkedlist.No14FindKthToTail.findKthToTail2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No15ReverseList.reverseList2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No16Merge.merge2;
import static com.zzq.basic.algorithm.niuke.linkedlist.No36FindFirstCommonNode.findFirstCommonNode;
import static com.zzq.basic.algorithm.niuke.linkedlist.No3PrintListFromTailToHead.printListFromTailToHead;
import static com.zzq.basic.algorithm.niuke.linkedlist.No55EntryNodeOfLoop.entryNodeOfLoop;
import static com.zzq.basic.algorithm.niuke.linkedlist.No56DeleteDuplication.deleteDuplication;

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

    @Test
    public void no36FindFirstCommonNode() {
        ListNode listNode = ListUtil.init(5);
        ListUtil.printListNode(listNode);
        ListNode listNode2 = ListUtil.init(5);
        ListUtil.printListNode(listNode2);
        ListNode head = findFirstCommonNode(listNode, listNode2);
        ListUtil.printListNode(head);
    }

    @Test
    public void no55EntryNodeOfLoop() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        ListUtil.printNode(entryNodeOfLoop(listNode1));
    }

    @Test
    public void no56DeleteDuplication() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode31 = new ListNode(3);
        ListNode listNode32 = new ListNode(3);
        ListNode listNode41 = new ListNode(4);
        ListNode listNode42 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode31;
        listNode31.next = listNode32;
        listNode32.next = listNode41;
        listNode41.next = listNode42;
        listNode42.next = listNode5;
        ListUtil.printListNode(deleteDuplication(listNode1));
    }

}
