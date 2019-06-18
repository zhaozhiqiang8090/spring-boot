package com.zzq.basic.algorithm.niuke.tree;

public class No57GetNext {

    public static TreeLinkNode getNext(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.right != null) {
            if (pNode.right.left != null) {
                return getNextLeft((TreeLinkNode) pNode.right.left);
            }
            return (TreeLinkNode) pNode.right;
        } else if (pNode.next != null) {
            if (pNode.next.right == pNode) {
                return getNextRoot(pNode.next);
            }
            return pNode.next;
        }
        return null;
    }

    private static TreeLinkNode getNextLeft(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.left != null) {
            return getNextLeft((TreeLinkNode) pNode.left);
        }
        return pNode;
    }

    private static TreeLinkNode getNextRoot(TreeLinkNode pNode) {
        if (pNode == null) {
            return null;
        }
        if (pNode.next != null && pNode.next.right == pNode) {
            return getNextRoot(pNode.next);
        }
        return pNode.next;
    }

}
