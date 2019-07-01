package com.zzq.basic.algorithm.niuke.tree;

public class No26Convert {

    public static TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null)
            return null;
        TreeNode firstNodeInList = convertHelper(pRootOfTree, null);
        while (firstNodeInList.left != null) {
            firstNodeInList = firstNodeInList.left;
        }
        return firstNodeInList;
    }

    //将以node为根结点的树转化为排序链表，链表头部与lastNode链接，并返回最后一个结点
    private static TreeNode convertHelper(TreeNode node, TreeNode lastNode) {
        //处理左子树，获得最大结点
        if (node.left != null)
            lastNode = convertHelper(node.left, lastNode);
        //链接最大结点和根结点
        node.left = lastNode;
        if (lastNode != null)
            lastNode.right = node;
        //更新最后一个结点
        lastNode = node;
        //处理右子树
        if (node.right != null)
            lastNode = convertHelper(node.right, lastNode);
        return lastNode;
    }

}
