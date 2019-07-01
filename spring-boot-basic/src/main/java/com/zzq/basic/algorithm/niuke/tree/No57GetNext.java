package com.zzq.basic.algorithm.niuke.tree;

public class No57GetNext {

    public static TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }

        if (pNode.right != null) {
            pNode = (TreeLinkNode)pNode.right;
            while (pNode.left != null) {
                pNode = (TreeLinkNode)pNode.left;
            }
            return pNode;
        }

        while (pNode.next != null) {
            if (pNode.next.left == pNode) {
                return pNode.next;
            }
            pNode = pNode.next;
        }

        return null;
    }

}
