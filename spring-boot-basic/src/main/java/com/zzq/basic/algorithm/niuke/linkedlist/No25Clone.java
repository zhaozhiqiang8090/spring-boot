package com.zzq.basic.algorithm.niuke.linkedlist;

public class No25Clone {

    public RandomListNode clone(RandomListNode pHead) {
        cloneNodes(pHead);           //1.复制结点
        connectSiblingNodes(pHead);  //2.设置random
        return reconnectNodes(pHead);//3.拆分长链表
    }

    /**
     * 第一步：复制每个结点，并插入到原始节点的后面
     */
    private void cloneNodes(RandomListNode head) {
        RandomListNode pNode = head;
        while (pNode != null) {
            RandomListNode clonedNode = new RandomListNode(pNode.label);
            clonedNode.next = pNode.next;
            pNode.next = clonedNode;
            pNode = clonedNode.next;
        }
    }

    /**
     * 第二步：根据原结点的random，设置复制结点的random
     */
    private void connectSiblingNodes(RandomListNode head) {
        RandomListNode pNode = head;
        while (pNode != null) {
            if (pNode.random != null) //必须考虑到siblingNode==null的情况！
                pNode.next.random = pNode.random.next;
            pNode = pNode.next.next;
        }
    }

    /**
     * 第三步：将长链表拆分成原始链表和复制链表（根据奇偶位置）
     */
    private RandomListNode reconnectNodes(RandomListNode head) {
        RandomListNode clonedHead = null;
        RandomListNode clonedNode = null;
        RandomListNode pNode = head;
        if (head != null) {
            clonedHead = head.next;
            clonedNode = pNode.next;
            pNode.next = clonedNode.next;
            pNode = pNode.next;   //提前将pNode指向下一个结点，方便判断是否为null
        }
        while (pNode != null) {
            clonedNode.next = pNode.next;
            clonedNode = clonedNode.next;
            pNode.next = clonedNode.next;
            pNode = pNode.next;
        }
        return clonedHead;
    }

}
